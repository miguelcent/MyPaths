package com.myPaths.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.myPaths.shared.PathSummaryDTO;
import com.sun.java.swing.plaf.windows.resources.windows;
//Comentario de prueba


public class PathsList extends Composite {
	
	@UiField
	HorizontalPanel searchForm;
	@UiField
	FlowPanel sortForm;
	@UiField
	FlexTable pathsTable;
	
	private final PathsServiceAsync pathsService = GWT
			.create(PathsService.class);
	
	private final SearchPathsServiceAsync searchPathsService = GWT
			.create(SearchPathsService.class);
	
	private final SearchPathsServiceAsync sortPathsService = GWT
			.create(SortPathsService.class);
	
	private static PathsListUiBinder uiBinder = GWT
			.create(PathsListUiBinder.class);

	interface PathsListUiBinder extends UiBinder<Widget, PathsList> {
	}

	public PathsList() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	/**
	   * Constructor
	   * 
	   * @param user
	   *            the current logged in user
	   */
	public PathsList(UserAccountDTO user) {
		this();
		getSearchForm();
		getSortForm();
		getPathsSummaryList();
	}
	  
	public void showPaths(UserAccountDTO user) {
		getPathsSummaryList();
	}
	  
	public void getSearchForm(){
		displaySearch();
	}
	
	public void getSortForm{
		displaySort();
	}

	public void getPathsSummaryList() {
		  
		pathsService.getPathsSummaries(new AsyncCallback<ArrayList<PathSummaryDTO>>() {
			public void onFailure(Throwable caught) {
				Window.alert("An error occurred");
			}	
	
			public void onSuccess(ArrayList<PathSummaryDTO> result) {
//			displaySeach(result);
//		    displaySort(result);
		    displayPaths(result);
			}
		});
	}
	
	private void displaySearch(){
		ListBox provinceDropDown = new ListBox();
	    provinceDropDown.addItem("Buscar...");
	    provinceDropDown.addItem("Barcelona");
	    provinceDropDown.addItem("Madrid");
	    provinceDropDown.addItem("Sevilla");
	    provinceDropDown.addItem("Valencia");
	    // Make enough room for all five items (setting this value to 1 turns it
	    // into a drop-down list).
	    provinceDropDown.setVisibleItemCount(1);
	    provinceDropDown.addChangeHandler(new ChangeHandler() {	
			@Override
			public void onChange(ChangeEvent event) {
				Window.alert("Alguien ha cambiado el valor del desplegable de Provincias");
			}
		});
	    
	    ListBox categoryDropDown = new ListBox();
	    categoryDropDown.addItem("Selecciona Categoria");
	    categoryDropDown.addItem("Mountiain Bike");
	    categoryDropDown.addItem("Gastronomica");
	    categoryDropDown.addItem("Turistica");
	    categoryDropDown.addItem("Senderismo");
	    categoryDropDown.setVisibleItemCount(1);
	    categoryDropDown.addChangeHandler(new ChangeHandler() {	
			@Override
			public void onChange(ChangeEvent event) {
				Window.alert("Alguien ha cambiado el valor del desplegable de Categorias");		
			}
		});
	    
	    final Image searchPathImage = new Image(GlobalResources.RESOURCE.searchPathButton());
		searchPathImage.setStyleName("pointer");
		searchPathImage.addClickHandler(new ClickHandler() {			
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Pulsaron el boton de Buscar Ruta");				
			}
		});
		
		searchForm.add(provinceDropDown);
		searchForm.add(categoryDropDown);
		searchForm.add(searchPathImage);
	}
	
	private void displaySort(){
		Label sortBy = new Label("Ordenar por:");
		
		// Make some radio buttons, all in one group.
	    RadioButton rb0 = new RadioButton("myRadioGroup", "Categoria");
	    RadioButton rb1 = new RadioButton("myRadioGroup", "Valoracion");
	    RadioButton rb2 = new RadioButton("myRadioGroup", "Nombre");

	    // Check 'valoracion' by default.
	    rb1.setValue(true, true);

	    // Add them to the root panel.
	    FlowPanel panel = new FlowPanel();
	    panel.add(rb0);
	    panel.add(rb1);
	    panel.add(rb2);
		
	}
	
	private void displayPaths(List<PathSummaryDTO> paths) {
//TODO
		// first sort the friends list alphabetically on name
		sortPathSummaryDTO(paths);
		pathsTable.clear();
		int i = 0;
		for (final PathSummaryDTO path : paths) {
			VerticalPanel def = new VerticalPanel();
			HorizontalPanel hp = new HorizontalPanel();
			HorizontalPanel hp2 = new HorizontalPanel();
			CheckBox checkBoxName = new CheckBox(truncateLongName(path.getDisplayName()));
			final Image propertyImg = new Image(GlobalResources.RESOURCE.propertyButton());
			propertyImg.setStyleName("pointer");
			propertyImg.addClickHandler(new ShowFriendPopupPanel(friend, propertyImg));
			hp.add(checkBoxName);
			hp2.add(propertyImg);
			def.add(hp);
			def.add(hp2);
			
			pathsTable.setWidget(i, 0, def);
			pathsTable.setWidget(i, 1, propertyImg);
			pathsTable.getCellFormatter().addStyleName(i, 0, "friendNameInList");
			i++;
		}
	}
		  
	private void sortPathSummaryDTO(List<PathSummaryDTO> pathSummaries) {
	    for (int i = 0; i < pathSummaries.size(); ++i) {
	      for (int j = 0; j < pathSummaries.size() - 1; ++j) {
	        if (pathSummaries.get(j).getDisplayName().compareToIgnoreCase(pathSummaries.get(j + 1).getDisplayName()) >= 0) {
	          PathSummaryDTO tmp = pathSummaries.get(j);
	          pathSummaries.set(j, pathSummaries.get(j + 1));
	          pathSummaries.set(j + 1, tmp);
	        }
	      }
	    }
	}

	/**
	 * Shorten long displayName to something smaller if name is too long.
	 * 
	 * @param displayName
	 * @return a possibly truncated displayNames
	 */
	private String truncateLongName(String displayName) {
	    final int MAX = 18; // truncate string if it is longer than MAX
	    final String SUFFIX = "...";
	
	    if (displayName.length() < MAX)
	      return displayName;
	
	    String shorten = displayName.substring(0, MAX - SUFFIX.length())
	        + SUFFIX;
	
	    return shorten;
	}

	@UiHandler("addNew")
	void onClick(ClickEvent e) {
		ConnectrApp.get().showAddFriend();
	}

	/**
	 * A simple popup that displays friend's info w/ edit / delete buttons.
	 */
	static class FriendPopup extends PopupPanel {
		@UiTemplate("FriendPopup.ui.xml")
		interface Binder extends UiBinder<Widget, FriendPopup> {
		}

	    private static final Binder binder = GWT.create(Binder.class);

	    @UiField
	    Element nameDiv;
	    FriendSummaryDTO friend;

	    public FriendPopup(FriendSummaryDTO friend) {
	    	// The popup's constructor's argument is a boolean specifying that
	    	// it auto-close itself when the user clicks outside of it.
	    	super(true);
	    	this.friend = friend;
	    	add(binder.createAndBindUi(this));
	    	nameDiv.setInnerText(friend.getDisplayName());

	    }

	    private final static FriendsServiceAsync friendsService = GWT.create(FriendsService.class);

	    private static void deleteFriend(FriendSummaryDTO friend) {
	    	friendsService.deleteFriend(friend.getId(), new AsyncCallback<Boolean>() {
	    		public void onFailure(Throwable caught) {
	    			Window.alert("An error occurred");
	            }

	            public void onSuccess(Boolean result) {
	            	ConnectrApp.get().showFriendList();
	            }
	    	});

	    }

	    @UiHandler("delete")
	    void onDeleteClick(ClickEvent e) {
	      if (Window.confirm("Are you sure?")) {
	        deleteFriend(friend);
	        this.hide();
	      }
	    }

	    @UiHandler("edit")
	    void onEditClick(ClickEvent e) {
	      // handle click
	      ConnectrApp.get().showEditFriend(friend.getId());
	      this.hide();
	    }
	}

	/**
	 * 
	 * ShowPopupPanel
	 * 
	 */
	final class ShowFriendPopupPanel implements ClickHandler {
		private final FriendSummaryDTO friend;
		private final Image propertyImg;

		private ShowFriendPopupPanel(FriendSummaryDTO friend, Image propertyImg) {
			this.friend = friend;
			this.propertyImg = propertyImg;
		}

	    @Override
	    public void onClick(ClickEvent event) {
	    	FriendPopup popup = new FriendPopup(friend);
	    	int left = propertyImg.getAbsoluteLeft() + 14;
	    	int top = propertyImg.getAbsoluteTop() + 14;
	    	popup.setPopupPosition(left, top);
	    	popup.show();
	    }
	}

}

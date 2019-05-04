package javaFX2menu;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class MenuController {

	@FXML
	private MenuBar mnb;

	@FXML
	private Menu menuFile;

	@FXML
	private MenuItem menuOpen;
	@FXML
	private MenuItem menuQuit;

	@FXML
	private Menu menuSelect;
	@FXML
	private Menu menuSelectCheck;
	@FXML
	private CheckMenuItem menuSelectCheck01;
	@FXML
	private CheckMenuItem menuSelectCheck02;
	@FXML
	private Menu menuSelectRadio;
	@FXML
	private ToggleGroup rdogroop;
	@FXML
	private RadioMenuItem menuSelectRadio01;
	@FXML
	private RadioMenuItem menuSelectRadio02;

	@FXML
	private ImageView imv;
	@FXML
	private ContextMenu imvCMenu;
	@FXML
	private MenuItem cMenuItemZoomIn;
	@FXML
	private MenuItem cMenuItemZoomOut;

	@FXML
	private TextField txf;

	@FXML
	void initialize() {
		assert mnb != null : "fx:id=\"mnb\" was not injected: check your FXML file 'Menu.fxml'.";

		assert menuFile != null : "fx:id=\"menuFile\" was not injected: check your FXML file 'Menu.fxml'.";
		assert menuOpen != null : "fx:id=\"menuOpen\" was not injected: check your FXML file 'Menu.fxml'.";
		assert menuQuit != null : "fx:id=\"menuQuit\" was not injected: check your FXML file 'Menu.fxml'.";

		assert menuSelect != null : "fx:id=\"menuSelect\" was not injected: check your FXML file 'Menu.fxml'.";
		assert menuSelectCheck != null : "fx:id=\"menuSelectCheck\" was not injected: check your FXML file 'Menu.fxml'.";
		assert menuSelectCheck01 != null : "fx:id=\"menuSelectCheck01\" was not injected: check your FXML file 'Menu.fxml'.";
		assert menuSelectCheck02 != null : "fx:id=\"menuSelectCheck02\" was not injected: check your FXML file 'Menu.fxml'.";
		assert menuSelectRadio != null : "fx:id=\"menuSelectRadio\" was not injected: check your FXML file 'Menu.fxml'.";
		assert rdogroop != null : "fx:id=\"rdogroop\" was not injected: check your FXML file 'Menu.fxml'.";
		assert menuSelectRadio01 != null : "fx:id=\"menuSelectRadio01\" was not injected: check your FXML file 'Menu.fxml'.";
		assert menuSelectRadio02 != null : "fx:id=\"menuSelectRadio02\" was not injected: check your FXML file 'Menu.fxml'.";

		assert imv != null : "fx:id=\"imv\" was not injected: check your FXML file 'Menu.fxml'.";
		assert imvCMenu != null : "fx:id=\"imvCMenu\" was not injected: check your FXML file 'Menu.fxml'.";
		assert cMenuItemZoomIn != null : "fx:id=\"cMenuItemZoomIn\" was not injected: check your FXML file 'Menu.fxml'.";
		assert cMenuItemZoomOut != null : "fx:id=\"cMenuItemZoomOut\" was not injected: check your FXML file 'Menu.fxml'.";

		assert txf != null : "fx:id=\"txf\" was not injected: check your FXML file 'Menu.fxml'.";

		menuSelectRadio01.setSelected(true);

		menuOpen.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("res/open.png"))));
		menuQuit.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("res/power.png"))));

		menuSelectCheck.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("res/checkbox.png"))));
		menuSelectRadio
				.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("res/radiobutton.png"))));

		imv.setImage(new Image(this.getClass().getResourceAsStream("res/image.gif")));
		cMenuItemZoomIn.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("res/zoomin.png"))));
		cMenuItemZoomOut.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("res/zoomout.png"))));

	}

	@FXML
	void menuFileOpenOnAction(ActionEvent e) {
		String s = menuOpen.getText();
		this.txf.setText("\"" + s + "\" has been selected.");
	}

	@FXML
	void menuFileQuitOnAction(ActionEvent e) {
		String s = menuQuit.getText();
		this.txf.setText("\"" + s + "\" has been selected.");
		Platform.exit();
	}

	@FXML
	void menuSelectCheck01OnAction(ActionEvent e) {
		String s = menuSelectCheck01.getText();
		if (menuSelectCheck01.isSelected()) {
			this.txf.setText("\"" + s + "\" has been selected.");
		}
		else {
			this.txf.setText("\"" + s + "\" has been unselected.");
		}
	}

	@FXML
	void menuSelectCheck02OnAction(ActionEvent e) {
		String s = menuSelectCheck02.getText();
		if (menuSelectCheck02.isSelected()) {
			this.txf.setText("\"" + s + "\" has been selected.");
		}
		else {
			this.txf.setText("\"" + s + "\" has been unselected.");
		}
	}

	@FXML
	void menuSelectRadioOnAction(ActionEvent e) {

		if (menuSelectRadio01.isSelected()) {
			String s = menuSelectRadio01.getText();
			this.txf.setText("\"" + s + "\" has been selected.");
		}

		if (menuSelectRadio02.isSelected()) {
			String s = menuSelectRadio02.getText();
			this.txf.setText("\"" + s + "\" has been selected.");
		}
	}

	@FXML
	void imageViewOnMouseClicked(MouseEvent e) {
		if (e.getButton() == MouseButton.SECONDARY) {
			imvCMenu.show(imv, e.getScreenX(), e.getScreenY());
		}
	}

	@FXML
	void cMenuItemZoomInOnAction(ActionEvent e) {
		String s = cMenuItemZoomIn.getText();
		this.txf.setText("\"" + s + "\" has been selected.");
	}

	@FXML
	void cMenuItemZoomOutOnAction(ActionEvent e) {
		String s = cMenuItemZoomOut.getText();
		this.txf.setText("\"" + s + "\" has been selected.");
	}

}

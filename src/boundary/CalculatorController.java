package boundary;

import application.Functions;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;

public class CalculatorController {
	
	String pressedNumber;
	String completeNumber = "";
	String resultString = "";
	String operation = "";
	float firstNumber;
	float secondNumber;
	float result;
	boolean isFrstNmbrInit = false;
	
	@FXML
	AnchorPane pane;
	
	@FXML
	private TextField operationField;
	@FXML
	private TextField resultField;	
	@FXML 
	private Button zero;	
	@FXML
	private Button one;	
	@FXML
	private Button two;
	@FXML
	private Button three;	
	@FXML
	private Button four;	
	@FXML
	private Button five;	
	@FXML
	private Button six;	
	@FXML
	private Button seven;	
	@FXML
	private Button eight;	
	@FXML
	private Button nine;
	
	@FXML 
	private Button plus;
	@FXML
	private Button minus;	
	@FXML
	private Button per;
	@FXML
	private Button divide;
	@FXML
	private Button equals;
	@FXML
	private Button clear;
	
	@FXML
	public void initialize() {
		
		Image sinsImage = new Image("/boundary/DeadlySins.jpg");
		BackgroundImage sfondo = new BackgroundImage(sinsImage, null, null, null, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, true));
		pane.setBackground(new Background(sfondo));
		
		zero.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				pressedNumber="0";
				completeNumber+=pressedNumber;
				operationField.setText(completeNumber);

			}
		});
		
		zero.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				pressedNumber="0";
				completeNumber+=pressedNumber;
				operationField.setText(completeNumber);
			}
		});
		
		one.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				pressedNumber="1";
				completeNumber+=pressedNumber;
				operationField.setText(completeNumber);

			}
		});
		
		two.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				pressedNumber="2";
				completeNumber+=pressedNumber;
				operationField.setText(completeNumber);
			}
		});
		
		three.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				pressedNumber="3";
				completeNumber+=pressedNumber;
				operationField.setText(completeNumber);

			}
		});
		
		four.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				pressedNumber="4";
				completeNumber+=pressedNumber;
				operationField.setText(completeNumber);

			}
		});
		
		five.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				pressedNumber="5";
				completeNumber+=pressedNumber;
				operationField.setText(completeNumber);

			}
		});
		
		six.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				pressedNumber="6";
				completeNumber+=pressedNumber;
				operationField.setText(completeNumber);

			}
		});
		
		seven.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				pressedNumber="7";
				completeNumber+=pressedNumber;
				operationField.setText(completeNumber);

			}
		});
		
		eight.setOnAction(new EventHandler<ActionEvent>() {		
			@Override
			public void handle(ActionEvent event) {
				pressedNumber="8";
				completeNumber+=pressedNumber;
				operationField.setText(completeNumber);

			}
		});
		
		nine.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {
				pressedNumber="9";
				completeNumber+=pressedNumber;
				operationField.setText(completeNumber);			
			}
		});
		
		
		/**
		 * al momento gestisce solo la pressione del bottone = dopo che è stato inserito un solo numero 
		 * (quindi nessuna operazione per ora)
		 */
		equals.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				if (!isFrstNmbrInit) {
					if (!completeNumber.isEmpty()){
						result = Float.parseFloat(completeNumber);
						resultString = Float.toString(result);
						resultField.setText(resultString);						
					}
				}else {
					switch (operation) {
					case "+":
						secondNumber = Float.parseFloat(completeNumber);
						result = Functions.sumOrSub(firstNumber, secondNumber, operation);
						//result = firstNumber + secondNumber;
						resultString = Float.toString(result);
						resultField.setText(resultString);		
						break;
					case "*":
						secondNumber = Float.parseFloat(completeNumber);
						result = firstNumber * secondNumber;
						resultString = Float.toString(result);
						resultField.setText(resultString);		
						break;
					case "-":
						secondNumber = Float.parseFloat(completeNumber);
						result = Functions.sumOrSub(firstNumber, secondNumber, operation);
						resultString = Float.toString(result);
						resultField.setText(resultString);		
						break;
					case "/":
						secondNumber = Float.parseFloat(completeNumber);
						result = firstNumber / secondNumber;
						resultString = Float.toString(result);
						resultField.setText(resultString);		
						break;
					default:
						break;
					}
				}
				isFrstNmbrInit = false;
				completeNumber = "";
				operation = "";
			}
		});	
		
		plus.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {
				if (!isFrstNmbrInit) {
					if (!completeNumber.isEmpty()){
						firstNumber = Float.parseFloat(completeNumber);
						completeNumber = "";
						isFrstNmbrInit = true; 
						operation += "+";					
					}
				}
							
			}
		});
		minus.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {
				if (!isFrstNmbrInit) {
					if (!completeNumber.isEmpty()){
						firstNumber = Float.parseFloat(completeNumber);
						completeNumber = "";
						isFrstNmbrInit = true; 
						operation += "-";						
					}
				}
							
			}
		});
		per.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {
				if (!isFrstNmbrInit) {
					if (!completeNumber.isEmpty()){
						firstNumber = Float.parseFloat(completeNumber);
						completeNumber = "";
						isFrstNmbrInit = true; 
						operation += "*";						
					}
				}
							
			}
		});
		divide.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {
				if (!isFrstNmbrInit) {
					if (!completeNumber.isEmpty()){
						firstNumber = Float.parseFloat(completeNumber);
						completeNumber = "";
						isFrstNmbrInit = true; 
						operation += "/";						
					}
				}
							
			}
		});
		clear.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {
				completeNumber = "";
				firstNumber = 0;
				secondNumber = 0;
				operation = "";
				operationField.setText("");			

			}
		});
		
	}
}

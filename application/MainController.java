package application;

import java.text.DecimalFormat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

	@FXML
	private TextField number1;

	@FXML
	private TextField number2;

	@FXML
	private Label result;

	private static final DecimalFormat decfor = new DecimalFormat("0.00");

	public void addTwoNumbers(ActionEvent event) {
		String firstNumber = number1.getText();
		double dFirstNumber = Double.parseDouble(firstNumber);

		String secondNumber = number2.getText();
		double dSecondNumber = Double.parseDouble(secondNumber);

		double addition = dFirstNumber + dSecondNumber;
		String finalResult = decfor.format(addition);
		result.setText(finalResult);

	}

	public void minusTwoNumbers(ActionEvent event) {
		String firstNumber = number1.getText();
		double dFirstNumber = Double.parseDouble(firstNumber);

		String secondNumber = number2.getText();
		double dSecondNumber = Double.parseDouble(secondNumber);

		double minus = dFirstNumber - dSecondNumber;
		String finalResult = decfor.format(minus);
		result.setText(finalResult);

	}

	public void multiplyTwoNumbers(ActionEvent event) {
		String firstNumber = number1.getText();
		double dFirstNumber = Double.parseDouble(firstNumber);

		String secondNumber = number2.getText();
		double dSecondNumber = Double.parseDouble(secondNumber);

		double multiply = dFirstNumber * dSecondNumber;
		String finalResult = decfor.format(multiply);
		result.setText(finalResult);

	}

	public void divideTwoNumbers(ActionEvent event) {
		String firstNumber = number1.getText();
		double dFirstNumber = Double.parseDouble(firstNumber);

		String secondNumber = number2.getText();
		double dSecondNumber = Double.parseDouble(secondNumber);

		double divide = dFirstNumber / dSecondNumber;
		String finalResult = decfor.format(divide);
		result.setText(finalResult);

	}

	public void modulusTwoNumbers(ActionEvent event) {
		String firstNumber = number1.getText();
		double dFirstNumber = Double.parseDouble(firstNumber);

		String secondNumber = number2.getText();
		double dSecondNumber = Double.parseDouble(secondNumber);

		double modulus = dFirstNumber % dSecondNumber;
		String finalResult = decfor.format(modulus);
		result.setText(finalResult);

	}

	public void reset() {
		number1.setText("");
		number2.setText("");
		result.setText("");

	}

}

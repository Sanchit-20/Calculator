package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private Label result;
	private double a;
	private String s="";
	private boolean start=true;
	private Modal modal = new Modal();
	
	@FXML
	public void processNumbers(ActionEvent event)
	{
		if(start)
		{
			result.setText("");
			start = false;
		}
		String value =((Button)event.getSource()).getText();
		result.setText(result.getText() + value);
		
	}
	
	@FXML
	public void processOperators(ActionEvent event)
	{
		String value =((Button)event.getSource()).getText();
		if(!value.equals("="))
		{
			if(!s.isEmpty())
				return;
			s=value;
			a = Double.parseDouble(result.getText());
			result.setText("");
		}
		else
		{
			if(s.isEmpty())
				return;
			double b;
			b= Double.parseDouble(result.getText());
			double output;
			output=modal.Calculate(a,b,s);
			result.setText(Double.toString(output));
			s="";
			start = true;
		}
	}

}

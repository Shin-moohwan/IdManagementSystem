package id;

import java.util.Scanner;

import exception.IdsiteFormException;

public interface IdInput {

	public int getIdnumber();
	
	public void setYourid(String yourid);
	
	public String getYourid();
	
	public String getIdsite();
	
	public String getPassword();
	
	public void setIdsite(String idsite) throws IdsiteFormException;
	
	public void setPassword(String password);
	
	public void setIdnumber(int idnumber);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setYourId(Scanner input);
	
	public void setIdSite(Scanner input);
	
	public void setIdPassword(Scanner input);
	
	public void setIdNumber(Scanner input);
}

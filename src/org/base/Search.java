package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search extends Base1{
	public Search(){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="location")
	private WebElement ddLoc;
	@FindBy(id="hotels")
	private WebElement ddHotel;
	@FindBy(id="room_type")
	private WebElement ddRoomtype;
	@FindBy(id="room_nos")
	private WebElement ddNoRoom;
	@FindBy(id="datepick_in")
	private WebElement txtInDate;
	@FindBy(id="datepick_out")
	private WebElement  txtOutDate;
	@FindBy(id="adult_room")
	private WebElement ddAdult;
	@FindBy(id="child_room")
	private WebElement ddChild;
	@FindBy(id="Submit")
	private WebElement clkSearch;
	@FindBy(id="radiobutton_0")
	private WebElement checkBox;
	@FindBy(id="continue")
	private WebElement btnContinue;
	@FindBy(id="first_name")
	private WebElement txtFirst;
	@FindBy(id="last_name")
	private WebElement txtLast;
	@FindBy(id="address")
	private WebElement txtAddress;
	@FindBy(id="cc_num")
	private WebElement txtCcno;
	@FindBy(id="cc_type")
	private WebElement ddCctype;
	@FindBy(id="cc_exp_month")
	private WebElement ddMonth;
	@FindBy (id="cc_exp_year")
	private WebElement ddYear;
	@FindBy(id="cc_cvv")
	private WebElement txtCvv;
	@FindBy(id="book_now")
	private WebElement clkBook;
	@FindBy(id="order_no")
	private WebElement printOrder;
	
	
	public WebElement getPrintOrder() {
		return printOrder;
	}
	public WebElement getTxtFirst() {
		return txtFirst;
	}
	public WebElement getTxtLast() {
		return txtLast;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCcno() {
		return txtCcno;
	}
	public WebElement getDdCctype() {
		return ddCctype;
	}
	public WebElement getDdMonth() {
		return ddMonth;
	}
	public WebElement getDdYear() {
		return ddYear;
	}
	public WebElement getTxtCvv() {
		return txtCvv;
	}
	public WebElement getClkBook() {
		return clkBook;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public WebElement getDdLoc() {
		return ddLoc;
	}
	public WebElement getDdHotel() {
		return ddHotel;
	}
	public WebElement getDdRoomtype() {
		return ddRoomtype;
	}
	public WebElement getDdNoRoom() {
		return ddNoRoom;
	}
	public WebElement getTxtInDate() {
		return txtInDate;
	}
	public WebElement getTxtOutDate() {
		return txtOutDate;
	}
	public WebElement getDdAdult() {
		return ddAdult;
	}
	public WebElement getDdChild() {
		return ddChild;
	}
	public WebElement getClkSearch() {
		return clkSearch;
	}
	
	
	
	

}

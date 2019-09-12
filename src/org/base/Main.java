package org.base;

public class Main extends Base1 {
	public static void main(String[] args) {
		getDriver();
		loadURL("http://www.adactin.com/HotelApp/");
		Login log=new Login();
		maximize();
		type(log.getTxtUserName(),"rubysherly");
		type(log.getTxtPass(),"Ruby@1993");
		btn(log.getBtnLogin());
		Search s=new Search();
		dropDown(s.getDdLoc(),"Sydney");
		dropDown(s.getDdHotel(),"Hotel Creek");
		dropDown(s.getDdRoomtype(), "Standard");
		dropDown(s.getDdNoRoom(), "2 - Two");
		type(s.getTxtInDate(), "15/8/2019");
		type(s.getTxtOutDate(), "17/8/2019");
		dropDown(s.getDdAdult(), "2 - Two");
		dropDown(s.getDdChild(), "2 - Two");
		btn(s.getClkSearch());
		btn(s.getCheckBox());
		btn(s.getBtnContinue());
		type(s.getTxtFirst(), "Nandhini");
		type(s.getTxtLast(), "hari");
		type(s.getTxtAddress(), "chennai");
		type(s.getTxtCcno(), "1234567890987654");
		dropDown(s.getDdCctype(), "VISA");
		dropDown(s.getDdMonth(), "January");
		dropDown(s.getDdYear(), "2020");
		type(s.getTxtCvv(), "3456");
		btn(s.getClkBook());
		btn(s.getBtnContinue());
		attriBute(s.getPrintOrder());
		
		
		
		
	}

}

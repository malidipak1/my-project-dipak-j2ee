package com.rediff.client;

public class BDProfile {
	
	public String licenceKey = null;
	public String loginID = null;
	public String versionno = null;
	
	public static BDProfile objProfile = null;
			
	private BDProfile(){
		licenceKey = "209846b3692f63395ce800235950c56d";//"eb008c3065e35ebba35955f5a15eba19";
		loginID = "BOM03102";
		versionno = "1.3";//"1.3f"
		/*try
		{
			FileInputStream fis = fis = new FileInputStream(new File("/resin/public_html/commerce/oms.properties") );
			Properties prop = new Properties();
			prop.load(fis);
			mailsmtphost = prop.getProperty("mailsmtphost");
			maildebug = prop.getProperty("maildebug");
			prop = null;
			fis = null;
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("FNFE - properties file - " + fnfe.getMessage());
		}
		catch(IOException ioe)
		{
			System.out.println("IOE - getting mail properties - " + ioe.getMessage());
		}*/
		
	}
	
	public static BDProfile getBDProfile() {
		// TODO Auto-generated method stub
		
		if(BDProfile.objProfile == null) {
			BDProfile.objProfile =  new BDProfile();
			System.out.println("Creating BD Profile Object..");
		}
		return BDProfile.objProfile;
	}

}

package org.testjava;

import org.testng.annotations.Test;

public class Samplestest extends LibGlobal {
@Test
private void fbloginusingchrome() {
	// TODO Auto-generated method stub
launchchromebrowser();
loadUrl("https://www.facebook.com/");
maxbrowser();
Loginpojo l = new Loginpojo();
fill(l.getEmail(),"9597193150");
fill(l.getPassword(),"Sql@123");
buttonclick(l.getlogin());
closebrowser();
}
@Test
private void fbloginusingfirefox() {
	// TODO Auto-generated method stub
launchfirefoxbrowser();
loadUrl("https://www.facebook.com/");
maxbrowser();
Loginpojo l = new Loginpojo();
fill(l.getEmail(),"9597193150");
fill(l.getPassword(),"Sql@123");
buttonclick(l.getlogin());
closebrowser();
}
@Test
private void fbloginusingedge() {
	// TODO Auto-generated method stub
launchEdgebrowser();
loadUrl("https://www.facebook.com/");
maxbrowser();
Loginpojo l = new Loginpojo();
fill(l.getEmail(),"9597193150");
fill(l.getPassword(),"Sql@123");
buttonclick(l.getlogin());
closebrowser();
}





}

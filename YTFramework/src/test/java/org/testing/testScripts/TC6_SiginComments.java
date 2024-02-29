package org.testing.testScripts;

import org.testng.annotations.Test;
import org.testing.Base.Base;
import org.testing.Pages.CommentsWatchLater;
import org.testing.Pages.HomePage;
import org.testing.Pages.SignOutPage;
import org.testing.Pages.SigninPage;

public class TC6_SiginComments extends Base
{
	@Test
	public void siginComments() throws InterruptedException
	{
		SigninPage signin= new SigninPage(driver,pr);
		signin.signin("Renu", "password");
		CommentsWatchLater comnt=new CommentsWatchLater(driver, pr);
		comnt.comments();
		SignOutPage signout=new SignOutPage(driver, pr);
		signout.signOut();
	}

}

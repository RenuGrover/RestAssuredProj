package org.testing.testScripts;

import org.testng.annotations.Test;
import org.testing.Base.Base;
import org.testing.Pages.CommentsWatchLater;
import org.testing.Pages.SignOutPage;
import org.testing.Pages.SigninPage;

public class TC7_SiginWatchLater extends Base
{
	@Test
	public void watchlater() throws InterruptedException
	{
		SigninPage signin= new SigninPage(driver,pr);
		signin.signin("Renu", "password");
		CommentsWatchLater wtchltr=new CommentsWatchLater(driver, pr);
		wtchltr.watchLater();
		SignOutPage signout=new SignOutPage(driver, pr);
		signout.signOut();
	}

}

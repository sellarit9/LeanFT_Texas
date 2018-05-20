package unittesting;

import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;
import com.hp.lft.verifications.Verify;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;

public class LeanFtTest extends UnitTestClassBase
{

    private static String url = "https://texas.gov/";
    private static Browser browser;

    public LeanFtTest()
    {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception
    {
        browser = BrowserFactory.launch(BrowserType.CHROME);
    }

//    @Before
//    public void setUp() throws Exception
//    {
//        browser = SrfLab.launchBrowser(BrowserType.CHROME);
//    }

    @After
    public void tearDown() throws Exception
    {
        browser.close();
    }

    @Test
    public void test() throws GeneralLeanFtException
    {
        browser.navigate(url);

        TexasAppModel appModel = new TexasAppModel(browser);

        String linkText = appModel.texasGovTheOfficialWebsiteOfTheStateOfTexasPage().infoLink().getOuterText();

        Verify.areEqual(linkText,"INFO");

        appModel.texasGovTheOfficialWebsiteOfTheStateOfTexasPage().infoLink().click();

        appModel.texasGovTheOfficialWebsiteOfTheStateOfTexasPage().texasImage().click();
    }

}
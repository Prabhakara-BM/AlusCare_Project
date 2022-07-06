package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.PracticeTestPage;

public class PracticeTestTeacher extends BaseTest{
    LoginClass LC;
    HomePage1 HP;
    PracticeTestPage PC;
  

	
	public PracticeTestTeacher () {
		super();
	}
	
	@BeforeSuite
	public void setup()throws InterruptedException{
		initilization();
		

		PC=new  PracticeTestPage();

		LC = new LoginClass();
		
		HP = LC.newLoginUsingMobile(prop.getProperty("PTDPhonenum"),prop.getProperty("OTP"));
		
		}
	@Test(priority=1)
	public void sylabus() throws InterruptedException {
		Thread.sleep(2000);
		PC. CreateTest();
	}
	@Test(priority=2)
	public void selectQuestionType() throws InterruptedException {
		Thread.sleep(2000);
		PC. selectQuestionType("Multiple Choice Questions");
	}
	@Test(priority=3)
	public void question1() throws InterruptedException {
		Thread.sleep(2000);
		PC. question1();
	}
	@Test(priority=4)
	public void optionsABCD() throws InterruptedException {
		Thread.sleep(2000);
		PC.optionsABCD();
	}
	@Test(priority=5)
	public void correctAnsAndExit() throws InterruptedException {
		Thread.sleep(2000);
		PC.correctAnsAndExit();
	}
	@Test(priority=6)
		public void SendForReview() throws InterruptedException
	{
		Thread.sleep(2000);
		PC.SendForReview();
		}
	@Test(priority=7)
	public void cloneOpearation() throws InterruptedException
{
	Thread.sleep(2000);
	PC.clickOn3Dots();
	PC.SelectoptionsIn3Dots("Clone");
	PC.afterClickOnClone();
	PC. selectQuestionType("Multiple Choice Questions");
	PC.question1();
	PC.optionsABCD();
	PC.correctAnsAndExit();
	PC. PublishNow();
	}
	@Test(priority=8)
	public void publish() throws InterruptedException {
		wait(2000);
		PC.clickOn3Dots();
		PC.SelectoptionsIn3Dots("Publish");
		PC.afterClickpublish();
		
	}
	
   @Test(priority=9)
	public void Deletebutton() throws InterruptedException {
    	 PC.clickOn3Dots();
    	 PC.selectDeleteOption();
    	 
	}
    @Test(priority=10)
     public void ViewAll() throws InterruptedException {
    	 PC.clickOn3Dots();
    	 PC.ReadyToBePublishViewAll();
    	 
     }
     @Test(priority=11)
     public void Feedback() throws InterruptedException
     {
    	 PC.clickOn3Dots();
    	 PC.FeedbackFromTeacher();
    	 PC.FiltersMethod();
    	 PC.editOption("Edit Details");
    	 PC. selectQuestionType("Multiple Choice Questions");
    	 PC.selectChapter();
    		PC.question1();
    		PC.optionsABCD();
    		PC.correctAnsAndExit();
    		PC.editquestion();
    		PC. PublishNow();
     }
     
     @Test(priority=12)
      public void TestReviewed() throws InterruptedException {
    	 PC.clickOn3Dots();
    	 PC.TestToBeReviewed();
    	 PC.FiltersMethod();
    	 PC.editOption("Edit Details");
    	 PC. selectQuestionType("Multiple Choice Questions");
    	PC.selectChapter();
    		PC.question1();
    		PC.optionsABCD();
    		PC.correctAnsAndExit();
    		PC.editquestion();
    		PC. PublishNow();
     }
     @Test(priority=13)
     public void AllClass() throws InterruptedException {
    	 PC.clickOn3Dots();
    	 PC.AllClasses();
    	 PC.CreateTest();
    	 PC. selectQuestionType("Multiple Choice Questions");
    	 PC.question1();
 		 PC.optionsABCD();
 		 PC.correctAnsAndExit();
 		 PC. PublishNow();
     }
     @Test(priority=14)
     public void RecentlyPublished() throws InterruptedException 
     {
    	 PC.clickOn3Dots();
    	 PC.AllClasses();
    	 PC.RecentlyPublished();
    	 PC.unpublish();
    	 PC.RecentlyPublished();
    	// PC.SelectoptionsIn3Dots("Clone");
 		// PC.afterClickOnClone();
 		 PC.selectDeleteOption();
    	 
     }
     @Test(priority=15)
     public void SyllabuschapterTest() throws InterruptedException {
    	 PC.clickOn3Dots();
    	 PC.AllClasses();
    	 PC.classSyllabus("Chapter Test");
    	 PC. selectQuestionType("Multiple Choice Questions");
    	 PC.question1();
 		 PC.optionsABCD();
 		 PC.correctAnsAndExit();
 		 PC. PublishNow();
    	 
     }
     @Test(priority=16)
     public void SyllabusPartTest() throws InterruptedException
     {
    	 PC.clickOn3Dots();
    	 PC.AllClasses();
    	 PC.classSyllabus("Part Test");
    	 PC. selectQuestionType("Multiple Choice Questions");
    	 PC.selectPartTestChapter();
    	 PC.question1();
 		 PC.optionsABCD();
 		 PC.correctAnsAndExit();
 		 PC. PublishNow();
     }
     @Test(priority=17)
     public void SyllabusFullTest() throws InterruptedException
     {
    	 PC.clickOn3Dots();
    	 PC.AllClasses();
    	 PC.classSyllabus("Full Test");
    	 PC. selectQuestionType("Multiple Choice Questions");
    	 PC.selectFullTestChapter();
    	 PC.question1();
 		 PC.optionsABCD();
 		 PC.correctAnsAndExit();
 		 PC. PublishNow(); 
     }
    @Test(priority=18)
    public void SyllabusPreviousYearPapers() throws InterruptedException
    {
    	PC.clickOn3Dots();
   	    PC.AllClasses();
    	PC.classSyllabus("Previous Year Papers");
   	    PC. selectQuestionType("Multiple Choice Questions");
   	    PC.selectFullTestChapter();
   	    PC.question1();
		 PC.optionsABCD();
		 PC.correctAnsAndExit();
		 PC. PublishNow(); 
    }
    @Test(priority=19)
    public void Import() throws InterruptedException {
    	
    	PC. CreateTest();
    	PC.ImportQuestions("Sample Question Papers");
    	
    }
    
    @Test(priority=20)
    public void ImportQuestions() throws InterruptedException {
    	
    	PC. CreateTest();
    	PC.ImportQuestions("Subject-wise Question Papers");
    	
    }
    
	

}

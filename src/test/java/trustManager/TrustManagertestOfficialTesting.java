package trustManager;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
//NOTE: IF YOU ARE AT CONTROL PANEL, TYPE C AT START BAR AND CHOOSE TEMPT FOLDER AND "This PC"
//Remember to close every indow

public class TrustManagertestOfficialTesting {
    @Test()
    public void downLoadTrustManager() throws FindFailed, InterruptedException {

                       Pattern yes_areYouSureToUninstallTrustmanager = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\yes_areYouSureToUninstallTrustmanager.png");
            screen.click(yes_areYouSureToUninstallTrustmanager);
//           screen.wait(Yes_allowToInstall, 5);
//           screen.click(Yes_allowToInstall);
            Pattern OKtheSetUpMustBeUpdate = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\OKtheSetUpMustBeUpdate.png");
            screen.wait(OKtheSetUpMustBeUpdate, 20);
            screen.click(OKtheSetUpMustBeUpdate);
            Pattern yes_wouldYouLikeToRemove = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\yes_wouldYouLikeToRemove.png");
        Pattern errorLog = new Pattern("C:\\Users\\Chau.Thai\\D\snipping\\errorLog.png");
        Pattern eventLog2 = new Pattern("\snipping\\eventLog2.png");
        screen.rightClick(errorLog);
            //////////////////////////////////
            //Starting a remove process for ErrorLog and EventLog
            Pattern programAndFeature = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\programAndFeature.png");
            screen.click(programAndFeature);
            screen.type("\\Logs\\trustmanager\\ImportService");
            screen.click(searchArrow);
            screen.hover(sideBar);
            for (int i = 0; i < 10; i++) {
                screen.click(arrowDown);
            }
            Pattern errorLog = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\errorLog.png");
            Pattern eventLog2 = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\eventLog2.png");
            screen.rightClick(errorLog);
            Pattern delete = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\delete.png");
            screen.click(delete);
            Thread.sleep(2000);
            screen.rightClick(eventLog2);
            screen.click(delete);
            Pattern XCwindow = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\XCwindow.png");
            screen.click(XCwindow);
            screen.hover(horizontalBar);
            screen.dragDrop(arrowRight);
            Pattern XMainWindow = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\XMainWindow.png");
            screen.click(XMainWindow);
            Pattern OK_toEnd = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\OK_toEnd.png");
            screen.click(OK_toEnd);


        }
    }

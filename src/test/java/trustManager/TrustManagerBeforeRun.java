package trustManager;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class TrustManagerBeforeRun {
    @Test
    public void downLoadTrustManager() throws FindFailed, InterruptedException {
        Screen screen = new Screen();
        Pattern window = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\window.png");
        screen.click(window);
        Thread.sleep(1000);
        screen.type("Remote Desktop");
        Pattern remoteDesktopConnection = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\remoteDesktopConnection.png");
        screen.click(remoteDesktopConnection);
        Pattern wait = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\remoteComputerLogo.png");
        screen.wait(wait, 12);
        screen.paste("tmqa225install.eng.mcu.local");
        Pattern conncect = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\connect.png");
        screen.click(conncect);

        Pattern moreChoice = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\moreChoice.png");
        screen.wait(moreChoice, 12);
        screen.click(moreChoice);
        Pattern useDifferentAccount = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\useDifferentAccount.png");
        screen.click(useDifferentAccount, 12);
        Thread.sleep(1000);
        screen.paste("eng\\trustadmin");
        Pattern password = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\password.png");
        screen.click(password);
        screen.paste("TRUST_Password");
        Pattern clickOK = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\clickOK.png");
        screen.click(clickOK);
        Thread.sleep(5000);
        Pattern sideBar = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\sideBar.png");
        screen.hover(sideBar);
        Thread.sleep(5000);
        Pattern arrowDown = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrowDown.png");
        screen.dragDrop(arrowDown);



        }
    }


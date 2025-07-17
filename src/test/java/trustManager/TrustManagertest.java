package trustManager;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
//NOTE: IF YOU ARE AT CONTROL PANEL, TYPE C AT START BAR AND CHOOSE TEMPT FOLDER AND "This PC"
//Remember to close every indow

public class TrustManagertest {
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
        Pattern sideBar = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\sideBar.png");
        screen.wait(sideBar, 30);
        screen.hover(sideBar);
        Pattern arrowDown = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrowDown.png");
        screen.dragDrop(arrowDown);
        Thread.sleep(1000);
        Pattern searchBarRemoteDesktop = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\searchBarRemoteDesktop.png");
        screen.click(searchBarRemoteDesktop);
        Thread.sleep(1000);
        screen.type("fi");
        Thread.sleep(500);
        Pattern fileExplorer = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\fileExplorer.png");
        screen.click(fileExplorer);
        Thread.sleep(2000);
        Pattern arrowUp = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrowUp.png");
/// ////////////////////////////////////
               screen.hover(sideBar);
       screen.dragDrop(arrowUp);
     /////////////////////////////////////////
//        for(int i=0;i<20;i++){
//            screen.click(arrowUp);
//        }
        Pattern fileExlorerAddressBox = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\windowAddressBox.png");
        screen.hover(fileExlorerAddressBox);
        screen.click();
        screen.paste("C:\\temp");
        screen.click();
        Pattern searchArrow = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\searchArrow.png");
        screen.click(searchArrow);
        Pattern trustmanagerNewVersion = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\trustmanagerNewVersion.png");
        screen.doubleClick(trustmanagerNewVersion);
       // screen.hover(sideBar);
//        for (int i=0;i<15;i++){
//
//            screen.click(arrowDown);
//        }
        Pattern doYouWantToAllow = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\doYouWantToAllow.png");
        screen.wait(doYouWantToAllow,60);
        screen.hover(sideBar);
        for (int i=0;i<18;i++){
        screen.click(arrowDown);
             }
        Pattern horizontalBar=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\horizontalBar.png");
        screen.hover(horizontalBar);
        Pattern arrowRight=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrowRight.png");
        for(int i=0;i<18;i++){
            screen.click(arrowRight);
        }
        Pattern Yes_allowToInstall = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\Yes_allowToInstall.png");
        screen.click(Yes_allowToInstall);
        Pattern next = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\Yes_allowToInstall.png");
        screen.wait(next,30);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        Thread.sleep(1000);
        Pattern X= new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\X.png");
        screen.doubleClick(X);
        screen.hover(sideBar);
       for(int i=0;i<15;i++){
           screen.click(arrowDown);
       }

        Pattern next2= new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\next2.png");
       //click first "next" of (Welcome to the Prerequisite of set up )
        screen.click(next2);
        Pattern selectPrerequisite= new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\selectPrerequisite.png");
        screen.wait(selectPrerequisite,30);
       //click "next" of (Select Prerequisites to be installed )
        screen.click(next2);

        Pattern cdLoge=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\cdLogo.png");
        screen.wait(cdLoge,30);
        screen.click(next2);
        Pattern testSQPconnection=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\testSQPconnection.png");
        screen.wait(testSQPconnection,30);
        screen.click(testSQPconnection);
        Pattern connectionSuccessful=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\connectionSuccessful.png");
        screen.wait(connectionSuccessful,30);
        screen.click(next2);
        //Wait for TrustManager.Database
//        Thread.sleep(500000);
//        Pattern managerAudit=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\managerAudit.png");
//        screen.wait(managerAudit,30);
        //click 'Next' after it sees Trustmanager.Database

        //Wait for Audit
        Pattern managerAudit=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\managerAudit.png");
        screen.wait(managerAudit,30);
        screen.click(next2,12);
        Pattern Password=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\passwordForTrustmanager.png");
        screen.wait(Password,30);
        Pattern browse=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\browse.png");
        screen.doubleClick(browse,30);
        Pattern signCertificate=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\signCertificate.png");
        screen.wait(signCertificate,30);
        screen.click(signCertificate);

//        screen.rightClick();
//        Pattern openAfterRightClick=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\openAfterRightClick.png");
//        screen.click(openAfterRightClick,30);
//        screen.hover();
//        screen.dragDrop(arrowDown);
        Pattern open=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\open.png");
        screen.click(open,30);
        Pattern dotdotdot=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\dotdotdot.png");
        screen.doubleClick(dotdotdot,30);
        screen.paste("TRUST_Password");
        //click Next after filling the password
        screen.click(next2,12);

        //        screen.hover(sideBar);
//        screen.dragDrop(arrowUp);
        Pattern okata=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\okata.png");
        screen.wait(okata,30);
        //click next after seeing "Okata Client ID"
        screen.click(next2,12);
        Pattern log=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\log.png");
        screen.wait(log,30);
        screen.doubleClick(log);
        screen.paste("\\Logs\\trustmanager\\ImportService");
        screen.click(next2,12);
        Pattern install=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\install.png");
        //Click Install
        screen.click(install,30);
       Thread.sleep(60000);
        screen.hover(sideBar);
        for(int i=0;i<15;i++){
            screen.click(arrowDown);
        }
        screen.hover(horizontalBar);

        for(int i=0;i<5;i++){
            screen.click(arrowRight);
        }
        Pattern closeTM=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\closeTM.png");
        screen.wait(closeTM,780);
        screen.click(closeTM);
        ///////////////////////DELETE TRUSTMANAGER
        screen.hover(sideBar);
        screen.dragDrop(arrowDown);
        //hover on horizontal bar
        Pattern arrowLeft=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrowLeft.png");
        screen.hover(horizontalBar);
        screen.dragDrop(arrowLeft);
        screen.click(searchBarRemoteDesktop);
        Thread.sleep(2000);
        screen.type("Control");
        Pattern controlPanel=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\control.png");
        screen.click(controlPanel);
        screen.hover(sideBar);
        for(int i=0;i<14;i++){
            screen.click(arrowUp);
        }
        Pattern uninstall=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\uninstall.png");
        screen.click(uninstall);
//        Pattern bigSideBar=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\bigSideBar.png");
//        screen.hover(bigSideBar);

        Pattern arrowDown2=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrowDown2.png");
        for(int i=0;i<20;i++){
            screen.click(arrowDown2);
        }
        //?????check drop or not
        Pattern trustmanager=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\trustmanager.png");
        screen.hover(trustmanager);
        screen.rightClick();
        Pattern uninstall2=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\uninstall2.png");
        screen.hover(uninstall2);
        screen.click();
        Pattern areYouSure=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\areYouSure.png");
        screen.wait(areYouSure,30);
        Pattern yes_toUninstal=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\yes_toUninstal.png");
        screen.wait(yes_toUninstal,30);
        screen.click(yes_toUninstal);

        Pattern doYouWantToAllow2=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\doYouWantToAllow2.png");
        screen.wait(doYouWantToAllow2,60);

        Pattern yes_doYouWantToAllowToMakeThisAppToMakeChangesToYourDevice=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\yes_doYouWantToAllowToMakeThisAppToMakeChangesToYourDevice.png");
        screen.wait(yes_doYouWantToAllowToMakeThisAppToMakeChangesToYourDevice,12);
        screen.click(yes_doYouWantToAllowToMakeThisAppToMakeChangesToYourDevice);
        Pattern OKtheSetUpMustBeUpdate=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\OKtheSetUpMustBeUpdate.png");
        screen.wait(OKtheSetUpMustBeUpdate,30);
        screen.click(OKtheSetUpMustBeUpdate);
        Pattern yes_wouldYouLikeToRemove=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\yes_wouldYouLikeToRemove.png");
        screen.wait(yes_wouldYouLikeToRemove,30);
        screen.click(yes_wouldYouLikeToRemove);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        Pattern closeUninstallWindow=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\closeUninstallWindow.png");
        screen.click(closeUninstallWindow);
        screen.hover(sideBar);
        screen.dragDrop(arrowDown);
        screen.hover(horizontalBar);
        for(int i=0;i<20;i++){
            screen.click(arrowLeft);
        }
        screen.click(searchBarRemoteDesktop);

//        Pattern closeVirtualMachine=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\closeVirtualMachine.png");
//        screen.click(closeVirtualMachine);



//
//        screen.click(Yes_allowToInstall);
//        Pattern OKtheSetUpMustBeUpdate=  new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\OKtheSetUpMustBeUpdate.png");
//        screen.wait(OKtheSetUpMustBeUpdate);
//        screen.click(OKtheSetUpMustBeUpdate);

        //yes_wouldYouLikeToRemove
    }

}
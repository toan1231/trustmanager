package trustManager;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
//NOTE: IF YOU ARE AT CONTROL PANEL, TYPE C AT START BAR AND CHOOSE TEMPT FOLDER AND "This PC"
//Remember to close every indow

public class TrustmanagerOfficialMain {
    @Test(invocationCount = 1)
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
        screen.paste("tmqa225autoinst.eng.mcu.local");//tm224ga.eng.mcu.local //tmqa225autoinst.eng.mcu.local
        //tmqa225install.eng.mcu.local
        Pattern conncect = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\connect.png");
        screen.click(conncect);
        Pattern moreChoice = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\moreChoice.png");
        screen.wait(moreChoice, 60);
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
        screen.wait(searchBarRemoteDesktop,30);
        screen.click(searchBarRemoteDesktop);//minh1
        Thread.sleep(1000);
        screen.type("file");
        Thread.sleep(500);
        Pattern fileExplorer = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\fileExplorer.png");
        screen.click(fileExplorer);
        // Thread.sleep(1000);
        Pattern arrowUp = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrowUp.png");
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        Pattern fileExlorerAddressBox = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\windowAddressBox.png");
        screen.wait(fileExlorerAddressBox,30);
        screen.hover(fileExlorerAddressBox);
        screen.click();
        screen.type("C:\\temp");
//        screen.click();
        Pattern searchArrow = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\searchArrow.png");
        screen.hover(searchArrow);
        screen.doubleClick();
        Pattern trustmanagerNewVersion = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\trustmanagerNewVersion.png");
        screen.doubleClick(trustmanagerNewVersion);
        Pattern doYouWantToAllow = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\doYouWantToAllow.png");
        screen.wait(doYouWantToAllow, 60);
        screen.hover(sideBar);
        for (int i = 0; i < 14; i++) {
            screen.click(arrowDown);
        }

        Pattern horizontalBar = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\horizontalBar.png");
        screen.hover(horizontalBar);
        Pattern arrowRight = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrowRight.png");
        for (int i = 0; i < 12; i++) {
            screen.click(arrowRight);
        }
        //Thread.sleep(1000);
        Pattern Yes_allowToInstall = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\Yes_allowToInstall.png");
        screen.click(Yes_allowToInstall);
        Pattern welcomeTo = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\welcomeTo.png");
        screen.wait(welcomeTo, 20);
        Pattern next = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\next.png");
        screen.click(next);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        // Thread.sleep(1000);
        Pattern X = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\X.png");
        screen.doubleClick(X);
        screen.hover(sideBar);
        for (int i = 0; i < 18; i++) {
            screen.click(arrowDown);
        }
        Pattern next2 = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\next2.png");
        //click first "next" of (Welcome to the Prerequisite of set up )
        screen.click(next2);
        Pattern selectPrerequisite = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\selectPrerequisite.png");
        screen.wait(selectPrerequisite, 30);
        screen.click(next2);
        Thread.sleep(1000);
        Pattern welcomeToTrustmanager = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\welcomeToTrustmanager.png");
        screen.wait(welcomeToTrustmanager, 60);
        screen.hover(welcomeToTrustmanager);
        screen.click(next2);
        Pattern testSQPconnection = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\testSQPconnection.png");
        screen.wait(testSQPconnection, 30);
        screen.click(testSQPconnection);
        Pattern connectionSuccessful = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\connectionSuccessful.png");
        screen.wait(connectionSuccessful, 30);
        screen.click(next2);
        //Wait for Audit
        Pattern managerAudit = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\managerAudit.png");
        screen.wait(managerAudit, 30);
        screen.click(next2, 12);
        Pattern Password = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\passwordForTrustmanager.png");
        screen.wait(Password, 30);
        Pattern browse = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\browse.png");
        screen.doubleClick(browse, 30);
        Pattern signCertificate = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\signCertificate.png");
        screen.wait(signCertificate, 30);
        screen.click(signCertificate);
        Pattern open = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\open.png");
        screen.click(open, 30);
        Pattern dotdotdot = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\dotdotdot.png");
        ///       ///////////////////////////////////////////////////
        /// ////////////////////////////////////////////////////////
        /// /////////////////////////////////////////////
        screen.doubleClick(dotdotdot, 30);
        screen.paste("TRUST_Password");
        //click Next after filling the password
        screen.click(next2, 12);
        Pattern okata = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\okata.png");
        screen.wait(okata, 30);
        //click next after seeing "Okata Client ID"
        screen.click(next2, 12);
        Pattern log = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\log.png");
        screen.wait(log, 30);
        screen.doubleClick(log);
        screen.type("\\Logs\\trustmanager\\ImportService");
        screen.click(next2, 12);
        Pattern install = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\install.png");
        //Click Install
        screen.click(install, 30);
        Pattern closeTM = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\closeTM.png");
        screen.wait(closeTM, 780);
        screen.click(closeTM);
        screen.hover(sideBar);
        screen.dragDrop(arrowDown);
        //horizontal drapDrop left
        Pattern arrowLeft = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrowLeft.png");
        screen.hover(horizontalBar);
        screen.dragDrop(arrowLeft);
        screen.click(searchBarRemoteDesktop);
        //  Thread.sleep(1000);
        screen.type("Apps & Features");
        Pattern appAndFeature = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\appAndFeature.png");
        screen.click(appAndFeature);
        Pattern  defaultApp = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\defaultApp.png");
        screen.wait(defaultApp,30);
        screen.click( defaultApp);
        Pattern  appAndFeature2 = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\appAndFeature2.png");
        screen.wait( appAndFeature2);
        screen.click( appAndFeature2);
        Pattern from= new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\from.png");
        screen.wait(from,10);
        screen.hover(from);
        Pattern sideBar_appFeature= new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\sideBar_appFeature.png");
        screen.wait(sideBar_appFeature,15);
        screen.hover(sideBar_appFeature);
        Thread.sleep(1000);
        Pattern arrow_windowAddressBar= new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrow_windowAddressBar.png");
        screen.hover(arrow_windowAddressBar);
        for(int i=0;i<22;i++){
            screen.click();
        }
        Pattern microsoft_8_0_12 = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\microsoft_8_0_12.png");
        screen.wait(microsoft_8_0_12,10);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        Pattern X_appFeature = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\X_appFeature.png");
        screen.click(X_appFeature);
        screen.hover(sideBar);
        screen.dragDrop(arrowDown);
        screen.hover(horizontalBar);
        screen.dragDrop(arrowLeft);
        screen.click(searchBarRemoteDesktop);
        screen.type("se");
        Pattern services = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\services.png");
        screen.click(services);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        Pattern localSys = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\localSys.png");
        screen.wait(localSys,12);
//        screen.hover(sideBar);
//        screen.dragDrop(arrowUp);
        Pattern arrowDown_services = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrowDown_services.png");
        for (int i = 0; i < 9; i++) {
            screen.click(arrowDown_services);
        }
        //Validate Certipath DHS TIE ImportService
        Pattern certipathDHStie = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\certipathDHStie.png");
        screen.wait(certipathDHStie, 12);
        for (int i = 0; i < 150; i++) {
            screen.click(arrowDown_services);
        }
        /// ////////////////////////////////////////////VALIDATE SQL SERVER...
        Pattern validate_SQL_fullText = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\validate_SQL_fullText.png");
        screen.wait(validate_SQL_fullText);
        Pattern validate_SQL_serverMSSQLserver = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\validate_SQL_serverMSSQLserver.png");
        screen.wait(validate_SQL_serverMSSQLserver);
        Pattern validate_SQL_serverMSSQL_execute = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\validate_SQL_serverAgentMSSQL_execute.png");
        screen.wait(validate_SQL_serverMSSQL_execute);
        Pattern validate_SQL_serverBrowser = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\validate_SQL_serverBrowser.png");
        screen.wait(validate_SQL_serverBrowser);
        Pattern validate_SQL_serverCEIP = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\validate_SQL_serverCEIP.png");
        screen.wait(validate_SQL_serverCEIP);
        Pattern validate_SQL_serverVSS = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\validate_SQL_serverVSS.png");
        screen.wait(validate_SQL_serverVSS);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        Pattern X_services = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\X_services.png");
        screen.click(X_services);
        screen.hover(sideBar);
        screen.dragDrop(arrowDown);
        screen.hover(searchBarRemoteDesktop);
        screen.click();
        Thread.sleep(2000);
        screen.type("iis");
        Pattern IIS = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\IIS.png");
        screen.click(IIS);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        Pattern arrow_iis = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrow_iis.png");
        screen.wait(arrow_iis,10);
        screen.hover(arrow_iis);
        screen.click();
        Pattern sites = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\sites.png");
        screen.wait(sites, 12);
        screen.click(sites);
        Pattern defaultWebSite = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\defaultWebSite.png");
        screen.wait(defaultWebSite, 5);
        Pattern trustmanagerAPI = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\trustmanagerAPI.png");
        screen.wait(trustmanagerAPI, 5);
        Pattern trustmanagerWorkflow = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\trustmanagerWorkflow.png");
        screen.wait(trustmanagerWorkflow, 5);
        Pattern trustmanagerAdmin = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\trustmanagerAdmin.png");
        screen.wait(trustmanagerAdmin, 5);
        Pattern applicationPool = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\applicationPool.png");
        screen.click(applicationPool);
        Pattern trustNetworkService = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\trustNetworkService.png");
        screen.wait(trustNetworkService, 5);
        Pattern trustManagerWorkFlow2 = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\trustManagerWorkFlow2.png");
        screen.click(trustManagerWorkFlow2);
        screen.hover(horizontalBar);
        screen.dragDrop(arrowRight);
        Pattern advanceSetting = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\advanceSetting.png");
        screen.click(advanceSetting);
        Thread.sleep(500);
        Pattern identity = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\identity.png");
        screen.wait(identity, 29);
        screen.click();
        Pattern dot2 = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\dot2.png");
        screen.wait(dot2, 30D);
        screen.click(dot2);
        Pattern networkServices = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\networkServices.png");
        screen.hover(networkServices);
        screen.click();
        Pattern localSystem = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\localSystem.png");
        screen.hover(localSystem);
        screen.click();
        Pattern OK_localSystem = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\OK_localSystem.png");
        screen.click(OK_localSystem);
//        screen.hover(sideBar);
//        screen.dragDrop(arrowDown);
        Pattern OK_toFinishAdvanceSetting = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\OK_toFinishAdvanceSetting.png");
        screen.click(OK_toFinishAdvanceSetting);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        screen.hover(horizontalBar);
        screen.dragDrop(arrowLeft);
        Pattern trustmanagerWorkFlow_localSystem = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\trustmanagerWorkFlow_localSystem.png");
        screen.wait(trustmanagerWorkFlow_localSystem);
        screen.hover(sideBar);
        screen.dragDrop(arrowDown);
        screen.click(searchBarRemoteDesktop);
        Thread.sleep(2000);
        screen.type("Powershell");
        Thread.sleep(1000);
        Pattern powerShell = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\powerShell.png");
        screen.rightClick(powerShell);
        Pattern runAsAdministrator = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\runAsAdministrator.png");
        screen.click(runAsAdministrator);
        Pattern showMoreDetail = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\showMoreDetail.png");
        screen.wait(showMoreDetail, 12);
        Pattern yes_iWantTo = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\yes_iWantTo.png");
        screen.click(yes_iWantTo);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        Pattern command = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\command.png");
        screen.wait(command,60);
        screen.hover(command);
        screen.click();
        screen.type("iisreset");
        screen.keyDown(Key.ENTER);
        screen.keyUp(Key.ENTER);
        Pattern successful = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\successful.png");
        screen.wait(successful, 10);
        Pattern X_powerShell = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\X_powerShell.png");
        screen.click(X_powerShell);
        screen.hover(horizontalBar);
        screen.dragDrop(arrowRight);
        Pattern X_advanceSetting = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\X_advanceSetting.png");
        screen.click(X_advanceSetting);
        screen.hover(sideBar);
        screen.dragDrop(arrowDown);
        screen.hover(horizontalBar);
        screen.dragDrop(arrowLeft);
        screen.click(searchBarRemoteDesktop);//minh1
        Thread.sleep(1000);
        screen.type("file ex");
        Thread.sleep(500);
        screen.click(fileExplorer);
        //   Thread.sleep(1000);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        screen.hover(fileExlorerAddressBox);
        screen.click();
        screen.type("C:\\Logs\\trustmanager\\WorkflowService");
        screen.hover(searchArrow);
        screen.doubleClick();
        Pattern eventLog = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\eventLog.png");
        screen.wait(eventLog,12);
        Pattern arrow_windowAddressBarSame2 = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrow_windowAddressBarSame2.png");
        screen.hover(arrow_windowAddressBarSame2);//long4
        screen.click();
        screen.keyDown(Key.DELETE);
        screen.keyUp(Key.DELETE);
        screen.type("C:\\Program Files\\CertiPath\\TrustManager\\CertiPath TrustSuite\\TrustManager\\TrustManagerWorkflow");
        screen.doubleClick(searchArrow);
        screen.hover(sideBar);
        screen.dragDrop(arrowDown);
//long7       Pattern arrowDown_Cwindow = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrowDown_Cwindow.png");
        Pattern arrowDown_CwindowSame = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrowDown_CwindowSame.png");
        for(int i=0;i<5;i++){
            screen.click(arrowDown_CwindowSame);
        }
        Thread.sleep(1000);
        Pattern apiSettingDevelopment = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\appsettingDevelopment.png");
        screen.hover(apiSettingDevelopment );
        Thread.sleep(1000);
        screen.click();
        screen.keyDown(Key.DOWN);
        screen.keyUp(Key.DOWN);
        screen.doubleClick();
        Pattern arrowDown_Cwindow = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrowDown_Cwindow.png");
        screen.click(arrowDown_Cwindow);
        screen.click(arrowDown_Cwindow);
        screen.click(arrowDown_Cwindow);
        screen.click(arrowDown_Cwindow);
        Pattern oktaDomain = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\oktaDomain.png");
        screen.wait(oktaDomain, 8);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        screen.hover(horizontalBar);
        screen.dragDrop(arrowRight);
        Pattern X_toCloseAppSetting = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\X_toCloseAppSetting.png");
        screen.click(X_toCloseAppSetting);
        screen.hover(horizontalBar);
        screen.dragDrop(arrowLeft);
      //  Pattern arrow_windowAddressBar = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrow_windowAddressBar.png");
        screen.hover(arrow_windowAddressBar);
        screen.click();
        screen.keyDown(Key.DELETE);
        screen.keyUp(Key.DELETE);
        screen.type("C:\\Program Files\\CertiPath\\TrustManager\\CertiPath TrustSuite\\TrustManager\\TrustManagerAdmin");
        screen.doubleClick(searchArrow);
        screen.hover(sideBar);
        screen.dragDrop(arrowDown);
     for(int i=0;i<14;i++){
         screen.click(arrowDown_Cwindow);
     }
        Pattern config_json_back = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\config_json_back.png");
        Thread.sleep(1000);
        screen.hover(config_json_back);
        screen.click();
        screen.keyDown(Key.UP);
        screen.keyUp(Key.UP);
        screen.doubleClick();
        screen.wait(sideBar, 3);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        Pattern showPeoplePage = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\showPeoplePage.png");
        screen.wait(showPeoplePage);
        screen.hover(horizontalBar);
        screen.dragDrop(arrowRight);
        Pattern X_closePeoplePage = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\X_closePeoplePage.png");
        screen.click(X_closePeoplePage);
        screen.hover(horizontalBar);
        screen.dragDrop(arrowLeft);
        screen.hover(arrow_windowAddressBar);
        screen.click();
        screen.keyDown(Key.DELETE);
        screen.keyUp(Key.DELETE);
        screen.type("C:\\Program Files\\CertiPath\\TrustManager\\CertiPath TrustSuite\\TrustManager\\AdminAPI");
        screen.doubleClick(searchArrow);
        screen.hover(sideBar);
        screen.dragDrop(arrowDown);
       for(int i=0;i<14;i++){
           screen.click(arrowDown_Cwindow);
       }
        Pattern appsetting_jsonBack = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\appsetting_jsonBack.png");
        Thread.sleep(1000);
        screen.hover(appsetting_jsonBack);
        screen.click(appsetting_jsonBack);//minh3
        screen.keyDown(Key.UP);
        screen.keyUp(Key.UP);
        screen.doubleClick();
        screen.hover(sideBar);
        for (int i = 0; i < 20; i++) {
            screen.click(arrowUp);
        }
        Pattern api_config = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\api_config.png");
        screen.wait(api_config, 12);
        screen.hover(horizontalBar);
        screen.dragDrop(arrowRight);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        screen.click(X_toCloseAppSetting);
        Pattern sideBar_adminAPI = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\sideBar_adminAPI.png");
        Pattern arrowDown_adminAPI = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrowDown_adminAPI.png");
        Thread.sleep(1000);
        screen.hover(sideBar_adminAPI);
        screen.dragDrop(arrowDown_adminAPI);
        Pattern webConfig = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\webConfig.png");
        screen.hover(webConfig);
        screen.doubleClick();
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        //validate:
        /*
        <appender name="RollingFileAppender_Info" type="TrustCore.Helpers.RollingDateAppender">
                <lockingModel type="log4net.Appender.FileAppender+MinimalLock" />
                <file value="c:\Logs\AdminAPI\AdminAPI_InfoLog.txt" />
                 /*
         */
        Pattern webJson = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\webJson.png");
        screen.wait(webJson);
        screen.hover(horizontalBar);
        screen.dragDrop(arrowRight);
        Pattern X_json = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\X_json.png");
        screen.click(X_json);
        screen.click();
        Pattern question = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\question.png");
        screen.hover(question);
        Pattern X_Cwindow = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\X_Cwindow.png");
        screen.click(X_Cwindow);
        screen.hover(sideBar);
        screen.dragDrop(arrowDown);
        screen.hover(horizontalBar);
        screen.dragDrop(arrowLeft);
        screen.click(searchBarRemoteDesktop);//minh1
        Thread.sleep(1000);
        screen.type("sql");
        Thread.sleep(500);
        Pattern sqlServerManagementStudio = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\sqlServerManagementStudio.png");
        screen.click(sqlServerManagementStudio);
        Pattern connectSQL = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\connectSQL.png");
        screen.wait(connectSQL,100);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        screen.click(connectSQL);
        Pattern databases = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\databases.png");
        screen.wait(databases,30);
        screen.doubleClick(databases);
        Pattern trustmanagerAudit = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\trustmanagerAudit.png");
        screen.wait(trustmanagerAudit,30);
        screen.doubleClick(trustmanagerAudit);
        Pattern table = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\table.png");
        screen.wait(table,30);
        screen.doubleClick(table);
        Pattern newQuery = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\newQuery.png");
        screen.click(newQuery);
        Pattern blueLongBar = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\blueLongBar.png");
        screen.wait(blueLongBar,30);
        Thread.sleep(4000);
        screen.click();
        screen.paste("select Top (5) [ProductVersion] from [TrustManager.Audit].[dbo].[__EFMigrationsHistory]where ProductVersion=''");
        Thread.sleep(3000);
        Pattern quotation = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\quotation.png");
        screen.click(quotation);
        screen.paste("8.0.12");
        Pattern execute = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\execute.png");
        screen.click(execute);
        Pattern productVersion = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\productVersion.png");
        screen.wait(productVersion,20);
        Pattern X_SQL = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\X_SQL.png");
        screen.click(X_SQL);
        screen.hover(sideBar);
        screen.dragDrop(arrowDown);
        Pattern no_saveChangeToFollowingItem = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\no_saveChangeToFollowingItem.png");
        screen.click(no_saveChangeToFollowingItem);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        screen.click(newQuery);
        screen.wait(blueLongBar,20);
        Thread.sleep(4000);
        screen.paste("select * from [TrustManager.Database].[dbo].[__EFMigrationsHistory]");
        screen.click(execute);
        screen.wait(productVersion,10);
        Pattern X_closeSQL = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\X_closeSQL.png");
        screen.click(X_closeSQL);
        screen.hover(sideBar);
        screen.dragDrop(arrowDown);
        screen.click(no_saveChangeToFollowingItem);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        screen.hover(horizontalBar);
        screen.dragDrop(arrowRight);
        Pattern X_closeMainSQL= new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\X_closeMainSQL.png");
        screen.click(X_closeMainSQL);
        //Starting a remove process for Trustmanager
        /// ////////////////////////////////////////////////
        screen.hover(sideBar);
        screen.dragDrop(arrowDown); //did not
        screen.hover(horizontalBar);
        screen.dragDrop(arrowLeft);
        screen.click(searchBarRemoteDesktop);
        screen.type("con");
        Pattern unintallProgam = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\unintallProgam.png");
        screen.click(unintallProgam);
        Thread.sleep(1000);
        Pattern sideBar_uninstall = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\sideBar_uninstall.png");
        screen.wait(sideBar_uninstall,20);
        screen.hover(sideBar_uninstall);
        Pattern arrowDown_uninstall = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\arrowDown_uninstall.png");
        for (int i=0;i<20;i++){

            screen.click(arrowDown_uninstall);
        }
        Pattern trustmanager = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\trustmanager.png");
        screen.hover(trustmanager);
        screen.doubleClick(trustmanager);
        Pattern yes_areYouSureToUninstallTrustmanager = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\yes_areYouSureToUninstallTrustmanager.png");
        screen.click(yes_areYouSureToUninstallTrustmanager);
        Pattern OKtheSetUpMustBeUpdate = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\OKtheSetUpMustBeUpdate.png");
        screen.wait(OKtheSetUpMustBeUpdate, 20);
        screen.click(OKtheSetUpMustBeUpdate);
        Pattern yes_wouldYouLikeToRemove = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\yes_wouldYouLikeToRemove.png");
        screen.wait(yes_wouldYouLikeToRemove, 20);
        screen.click(yes_wouldYouLikeToRemove);
        Pattern microsoftVisualC = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\microsoftVisualC.png");
        screen.wait(microsoftVisualC, 30);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        //Starting a remove process for ErrorLog and EventLog
        Pattern programAndFeature = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\programAndFeature.png");
        screen.click(programAndFeature);
       screen.type("\\Logs\\trustmanager\\ImportService");
        screen.hover(searchArrow);
        screen.doubleClick();
        screen.hover(sideBar);
        for (int i = 0; i < 12; i++) {
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
        Pattern importServiceNextToArrow = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\importServiceNextToArrow.png");
        screen.hover(importServiceNextToArrow);
        screen.click();
        screen.type("C:\\Logs\\trustmanager\\WorkflowService");
        screen.hover(searchArrow);
        screen.doubleClick();
        Pattern eventLog_toRemove = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\eventLog_toRemove.png");
        screen.hover(eventLog_toRemove);
        screen.rightClick();
        screen.click(delete);
        Thread.sleep(2000);
        Pattern errorLog_toRemove = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\errorLog_toRemove.png");
        screen.hover(errorLog_toRemove);
        screen.rightClick();
        screen.click(delete);
        Thread.sleep(2000);
        screen.hover(eventLog_toRemove);
        screen.rightClick();
        screen.click(delete);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        Thread.sleep(1000);
        Pattern X_closeCwindow = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\X_closeCwindow.png");
        screen.hover(X_closeCwindow);
        screen.click();
        screen.hover(sideBar);
        screen.dragDrop(arrowDown);
        screen.hover(searchBarRemoteDesktop);
        screen.click();
        Thread.sleep(3000);
        screen.type("Apps & Features");
        screen.click(appAndFeature);
        screen.click( defaultApp);
        screen.wait( appAndFeature2);
        screen.click( appAndFeature2);
        screen.wait(from,10);
        screen.hover(from);
        screen.wait(sideBar_appFeature,15);
        screen.hover(sideBar_appFeature);
        Thread.sleep(1000);
        screen.hover(arrow_windowAddressBar);
        for(int i=0;i<30;i++){
            screen.click();
        }
        screen.wait(microsoft_8_0_12,12);//hau1
        screen.hover(microsoft_8_0_12);
        screen.click(microsoft_8_0_12);
        Pattern uninstall_microsoft_8_0_12= new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\uninstall_microsoft_8_0_12.png");
        screen.click(uninstall_microsoft_8_0_12);
        Pattern uninstall_microsoft_8_0_12_again= new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\uninstall_microsoft_8_0_12_again.png");
        screen.click(uninstall_microsoft_8_0_12_again);
        Pattern yes_doYouWantToAllowToMakeThisAppToMakeChangesToYourDevice= new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\yes_doYouWantToAllowToMakeThisAppToMakeChangesToYourDevice.png");
        screen.wait(yes_doYouWantToAllowToMakeThisAppToMakeChangesToYourDevice);
        screen.click(yes_doYouWantToAllowToMakeThisAppToMakeChangesToYourDevice);
        Pattern uninstall_microsoft_8_0_12_again2= new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\uninstall_microsoft_8_0_12_again2.png");
        screen.wait(uninstall_microsoft_8_0_12_again2,30);
        screen.click(uninstall_microsoft_8_0_12_again2);
        Pattern uninstallSucessfullyCompleted= new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\uninstallSucessfullyCompleted.png");
        screen.wait(uninstallSucessfullyCompleted,60);
        Pattern close_microsoftNet= new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\close_microsoftNet.png");
        screen.click(close_microsoftNet);
        screen.hover(sideBar);
        screen.dragDrop(arrowUp);
        screen.hover(horizontalBar);
        screen.dragDrop(arrowRight);
        screen.click(X_Cwindow);
        Pattern XMainWindow = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\XMainWindow.png");
        screen.click(XMainWindow);
        Pattern OK_toEnd = new Pattern("C:\\Users\\Chau.Thai\\Desktop\\snipping\\OK_toEnd.png");
        screen.click(OK_toEnd);

    }

}



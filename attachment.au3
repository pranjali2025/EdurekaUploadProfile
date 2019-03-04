$strFilePath=$CmdLine[1];
ControlSetText("Open","","Edit1",$strFilePath);
Sleep(2000);
ControlClick("Open","&Open","Button1");
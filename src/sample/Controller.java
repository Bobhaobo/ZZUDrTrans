package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;


public class Controller {


    @FXML//选择文件按钮
    private Button selectFileBut;
    @FXML//发送文件按钮
    private Button sendFileBut;
    @FXML//取消发送按钮
    private Button cancelSendBut;
    @FXML//文件路径显示框
    private TextField fileDisplayText;
    //选择按钮事件
    public void selectFile(){
//        FileChooser fileChooser = new FileChooser();
        DirectoryChooser directoryChooser=new DirectoryChooser();
        Stage mainStage = null;
        directoryChooser.setTitle("选择文件");
        File file = directoryChooser.showDialog(mainStage);

//        fileChooser.setTitle("选择文件");
//        fileChooser.showOpenDialog(stage);

    }
    //发送按钮事件
    public void sendFile(){
        

    }
    //取消按钮事件
    public void cancelSend(){
        System.exit(0);
    }
    //文件显示框区域
    public void fileDisplayTextAction(){

    }
}

package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import util.DisplayArea;
import util.GetPatientInfo;

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
    @FXML//文本显示区域
    private TextArea fileDisplayArea;
    //选择按钮事件
    public void selectFile(){
        //新建一个文件选择器
        JFileChooser fd = new JFileChooser();
        fd.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        //打开界面
        fd.showOpenDialog(null);
        //获取文件路径
        File f = fd.getSelectedFile();
        if(f != null){
            fileDisplayText.setText(f.getPath());
            fileDisplayArea.setWrapText(true);
            DisplayArea.displayAreaInfo(fileDisplayArea,f);
        }else {

        }


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

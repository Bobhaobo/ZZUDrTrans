package util;

import javafx.scene.control.TextArea;
import java.io.File;

/**
 * 对文本区域的操作
 *
 * */
public class DisplayArea {
    public static void displayAreaInfo(TextArea textArea, File file){
        textArea.appendText("病人信息：");
        //获取病人信息
        String[] dcmInfo = new GetPatientInfo().readInfo(file.getAbsolutePath());
        textArea.appendText("ID:"+dcmInfo[0]);
        textArea.appendText("患者姓名："+dcmInfo[1]);
        textArea.appendText("性别："+dcmInfo[2]);
        textArea.appendText("影像类型："+dcmInfo[3]);
        textArea.appendText("日期："+dcmInfo[4]);

    }
}

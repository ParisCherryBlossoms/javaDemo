package pdfbox;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

/**
 * PdfReader 抽取pdf的文本
 *
 * @author 25852
 */
public class PdfReader {
    public static void main(String[] args) {
        File pdfFile = new File("02_04_08/simple.pdf");
        PDDocument document = null;
        try {
            document = PDDocument.load(pdfFile);
            AccessPermission ap = document.getCurrentAccessPermission();
            if (!ap.canExtractContent()) {
                throw new IOException("你没有权限抽取文本");
            }
            // 获取页码
            int pages = document.getNumberOfPages();
            // 读文本内容
            PDFTextStripper stripper = new PDFTextStripper();
            // 设置按顺序输出
            stripper.setSortByPosition(true);
            stripper.setStartPage(1);  //起始页
            stripper.setEndPage(pages);//结束页
            String content = stripper.getText(document);
            System.out.println(content);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

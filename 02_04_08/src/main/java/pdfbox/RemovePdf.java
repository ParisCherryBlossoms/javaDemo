package pdfbox;

import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;

public class RemovePdf {
    public static void main(String[] args) throws Exception {
        File file = new File("02_04_08/merge.pdf");
        PDDocument document = PDDocument.load(file);
        int noOfPages = document.getNumberOfPages();
        System.out.println("total pages: " + noOfPages);
        // 删除第1页
        document.removePage(1);  // 页码索引从0开始算
        System.out.println("page removed");
        // 另存为新文档
        document.save("02_04_08/merge2.pdf");
        document.close();
    }
}

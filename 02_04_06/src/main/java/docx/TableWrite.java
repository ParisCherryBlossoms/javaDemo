package docx;

import org.apache.poi.xwpf.usermodel.*;

import java.io.FileOutputStream;
import java.io.OutputStream;

/*
 * 本类测试写入表格
 */
public class TableWrite {
    public static void main(String[] args) throws Exception {
        try {
            createSimpleTable();
        } catch (Exception e) {
            System.out.println("Error trying to create simple table.");
            throw (e);
        }
    }

    public static void createSimpleTable() throws Exception {
        XWPFDocument doc = new XWPFDocument();
        try {
            XWPFTable table = doc.createTable(3, 3);
            table.getRow(1).getCell(1).setText("表格示例");
            XWPFParagraph p1 = table.getRow(0).getCell(0).getParagraphs().get(0);
            XWPFRun r1 = p1.createRun();
            r1.setBold(true);
            r1.setText("The quick brown fox");
            r1.setItalic(true);
            r1.setFontFamily("Courier");
            r1.setUnderline(UnderlinePatterns.DOT_DOT_DASH);
            r1.setTextPosition(100);
            table.getRow(2).getCell(2).setText("only text");
            OutputStream out = new FileOutputStream("02_04_06/simpleTable.docx");
            try {
                doc.write(out);
            } finally {
                out.close();
            }
        } finally {
            doc.close();
        }
    }
}

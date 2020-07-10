package xml.stax;

import javax.xml.stream.*;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

public class StaxReader {
    public static void main(String[] args) {
        StaxReader.readByStream();
        System.out.println("========华丽丽的分割线==========");
        StaxReader.readByEvent();
    }

    //流模式
    public static void readByStream() {
        String xmlFile = "02_04_02/books.xml";
        XMLInputFactory factory = XMLInputFactory.newFactory();
        XMLStreamReader streamReader = null;
        try {
            streamReader = factory.createXMLStreamReader(new FileReader(xmlFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        // 基于指针遍历
        try {
            while (streamReader.hasNext()) {
                int event = streamReader.next();
                // 如果是元素的开始
                if (event == XMLStreamConstants.START_ELEMENT) {
                    // 列出所有书籍名称
                    if ("title".equalsIgnoreCase(streamReader.getLocalName())) {
                        System.out.println("title:" + streamReader.getElementText());
                    }
                }
            }
            streamReader.close();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    // 事件模式
    public static void readByEvent() {
        String xmlFile = "02_04_02/books.xml";
        XMLInputFactory factory = XMLInputFactory.newInstance();
        boolean titleFlag = false;
        try {
            // 创建基于迭代器的事件读取器对象
            XMLEventReader eventReader = factory.createXMLEventReader(new FileReader(xmlFile));
            // 遍历Event迭代器
            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                // 如果事件对象是元素的开始
                if (event.isStartElement()) {
                    // 转换成开始元素事件对象
                    StartElement start = event.asStartElement();
                    // 打印元素标签的本地名称
                    String name = start.getName().getLocalPart();
                    //System.out.print(start.getName().getLocalPart());
                    if (name.equals("title")) {
                        titleFlag = true;
                        System.out.print("title:");
                    }
                    // 取得所有属性
                    Iterator attrs = start.getAttributes();
                    while (attrs.hasNext()) {
                        // 打印所有属性信息
                        Attribute attr = (Attribute) attrs.next();
                        //System.out.print(":" + attr.getName().getLocalPart() + "=" + attr.getValue());
                    }
                    //System.out.println();
                }
                //如果是正文
                if (event.isCharacters()) {
                    String s = event.asCharacters().getData();
                    if (null != s && s.trim().length() > 0 && titleFlag) {
                        System.out.println(s.trim());
                    }
                }
                //如果事件对象是元素的结束
                if (event.isEndElement()) {
                    EndElement end = event.asEndElement();
                    String name = end.getName().getLocalPart();
                    if (name.equals("title")) {
                        titleFlag = false;
                    }
                }
            }
            eventReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}

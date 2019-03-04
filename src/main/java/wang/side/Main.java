package wang.side;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import wang.side.bean.Description;
import wang.side.bean.Problem;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        readXml("fps-loj-small-pics.xml");
    }

    public static void readXml(String xmlPath) {
        SAXReader reader = new SAXReader();
        File file = new File(xmlPath);
        Document document = null;

        try {
            document = reader.read(file);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        Element root = document.getRootElement();
        List<Element> childElements = root.elements();
//        System.out.println(root.getName());
        Problem problem = null;
        for(int i = 1; i < childElements.size();i++){
            problem = new Problem();
            Element child = childElements.get(i);

            System.out.println(child.getName());//item

            problem.setTitle(child.elementText("title"));
            problem.setTimeLimit(Integer.parseInt(child.elementText("time_limit"))*1000);
            problem.setMemoryLimit(Integer.parseInt(child.elementText("memory_limit")));
            problem.setDescription(new Description("html",child.elementText("description")));
            problem.setInputDescription(new Description("html",child.elementText("input")));
            problem.setOutputDescription(new Description("html",child.elementText("output")));

            List samplesInput = child.elements("test_input");
            List samplesOunput = child.elements("test_output");

//            problem.setSamples();

//            System.out.println("title" + child.elementText("title"));
//            System.out.println("time_limit" + child.elementText("time_limit"));
//            System.out.println("memory_limit" + child.elementText("memory_limit"));
//            System.out.println("description" + child.elementText("description"));
//            System.out.println("input" + child.elementText("input"));
//            System.out.println("output" + child.elementText("output"));
//            System.out.println("sample_input" + child.elementText("sample_input"));
//            System.out.println("sample_output" + child.elementText("sample_output"));
//            System.out.println("test_input" + child.elementText("test_input"));
//            System.out.println("test_output" + child.elementText("test_output"));
//            System.out.println("hint" + child.elementText("hint"));
//            System.out.println("source" + child.elementText("source"));
            System.out.println();
            break;
        }
    }
}

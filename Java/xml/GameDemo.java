package Java.xml;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import java.io.File;

public class GameDemo {

    public static void main(String[] args) {
        
        try {
            File file = new File("C:/Users/varun/OneDrive/Desktop/ISS Assignment/Java/xml/game.xml");
            
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
            
            System.out.println("Game Demo Data (XML Version)");
            
            Element game = doc.getDocumentElement();
            
            String title = game.getElementsByTagName("title").item(0).getTextContent();
            String genre = game.getElementsByTagName("genre").item(0).getTextContent();
            String version = game.getElementsByTagName("version").item(0).getTextContent();
            String developer = game.getElementsByTagName("developer").item(0).getTextContent();
            
            System.out.println("Title: " + title);
            System.out.println("Genre: " + genre);
            System.out.println("Version: " + version);
            System.out.println("Developer: " + developer);
            
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
package com.naveen;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("D:\\Java_programs\\Javaexamples\\src\\myxml.xml");

<<<<<<< HEAD
			System.out.println("RootElement: " + doc.getDocumentElement().getNodeName());
			System.out.println("===========================================");

			NodeList list = doc.getElementsByTagName("student");

			for (int i = 0; i < list.getLength(); i++) {
				Node n = list.item(i);
				System.out.println("NodeName: " + n.getNodeName());
				System.out.println("===========================================");
				Element e = (Element) n;
				System.out.println("name:   " + e.getElementsByTagName("name").item(0).getTextContent());
				System.out.println("id:     " + e.getElementsByTagName("id").item(0).getTextContent());
				System.out.println("branch: " + e.getElementsByTagName("branch").item(0).getTextContent());
				System.out.println("cgpa:   " + e.getElementsByTagName("cgpa").item(0).getTextContent());
=======
			System.out.println(doc.getDocumentElement().getNodeName());
			System.out.println("===========================================");

			NodeList list = doc.getElementsByTagName("student");

			for (int i = 0; i < list.getLength(); i++) {
				Node n = list.item(i);
				System.out.println(n.getNodeName());
				System.out.println("===========================================");
				Element e = (Element) n;
				System.out.println("name: " + e.getElementsByTagName("name").item(0).getTextContent());
				System.out.println("id: " + e.getElementsByTagName("id").item(0).getTextContent());
				System.out.println("branch: " + e.getElementsByTagName("branch").item(0).getTextContent());
				System.out.println("cgpa: " + e.getElementsByTagName("cgpa").item(0).getTextContent());
>>>>>>> refs/remotes/origin/master
				System.out.println("===========================================");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

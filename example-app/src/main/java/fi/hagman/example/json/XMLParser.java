package fi.hagman.example.json;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import fi.hagman.example.model.Employee;
import fi.hagman.example.model.WorkOrder;

public class XMLParser {
	
	
	public static String getWorkOrderAsXML(WorkOrder wo) throws JAXBException{
		JAXBContext jaxbContext = JAXBContext.newInstance(WorkOrder.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(wo, sw);
		return sw.toString();
	}
	
}

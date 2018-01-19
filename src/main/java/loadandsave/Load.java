package loadandsave;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFLanguages;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;

public class Load {
	public static void main(String... argv) throws FileNotFoundException {
		Model m = ModelFactory.createDefaultModel();
		// read into the model.
		m.read("src/test/resources/data.ttl");
//		m.read("/Users/kien/xsystem/testdata/dbpedia/dbpedia_data.ttl");
		StmtIterator allStatemens = m.listStatements();
		Model m1 = ModelFactory.createDefaultModel();
		int i = 0;
		while (allStatemens.hasNext()) {
			i++;
			Statement st = allStatemens.next();
			Property predicate = st.getPredicate();
			if (predicate.getURI().equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")) {
			System.out.println(predicate);
			}
		}
		
	}

}

package customizedparsing;

import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.system.StreamRDF;

public class ParserExample {
	public static void main(String[] argvs) {
		String fileName = "/Users/kien/xsystem/testdata/dbpedia/dbpedia_data.ttl";
		// String fileName = "src/main/resources/test1.ttl";
		StreamRDF tripleHandler = new TripleHandler();

		// Call the parsing process.
		long start = System.currentTimeMillis();
		RDFDataMgr.parse(tripleHandler, fileName);

		long end = System.currentTimeMillis();
		long time = (end - start) / 1000;
		System.out.println("Parsing time (s): " + time);

	}
}

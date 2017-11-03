package parsing;

import org.apache.jena.riot.system.StreamRDFBase;

import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.graph.Triple;

/**
 * A RDF triple processing class based on Jena. The triple is handled in
 * {@code #triple(Triple) method}.<br>
 * 
 * See more {@link https://jena.apache.org/documentation/io/rdf-input.html } and
 * {@link https://github.com/apache/jena/blob/master/jena-arq/src-examples/arq/examples/riot/ExRIOT_4.java}
 * for further information on using this class.
 * 
 * This works for Jena2
 *
 */
public class TripleHandler extends StreamRDFBase {
	private int count;

	public TripleHandler() {
		count = 0;
	}

	@Override
	public void triple(Triple triple) {
		/*
		 * Do whatever you want with the triple in this method.
		 */
		Node subject = triple.getSubject();
		Node predicate = triple.getPredicate();
		Node object = triple.getObject();
		count++;
	}

	@Override
	public void finish() {
		System.out.println("Number of triples: " + count);
	}

}

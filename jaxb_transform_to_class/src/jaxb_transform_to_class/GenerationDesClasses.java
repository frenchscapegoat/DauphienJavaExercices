package jaxb_transform_to_class;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

import io.github.oliviercailloux.xmcda_2_2_1_jaxb.ObjectFactory;
import io.github.oliviercailloux.xmcda_2_2_1_jaxb.X2Alternative;
import io.github.oliviercailloux.xmcda_2_2_1_jaxb.X2Alternatives;
import io.github.oliviercailloux.xmcda_2_2_1_jaxb.X2Criteria;
import io.github.oliviercailloux.xmcda_2_2_1_jaxb.X2Criterion;
import io.github.oliviercailloux.xmcda_2_2_1_jaxb.XMCDA;

public class GenerationDesClasses {
	@Test
		public void marshalAndShow() throws JAXBException {
			final JAXBContext jc = JAXBContext.newInstance(XMCDA.class);
			final Marshaller marshaller = jc.createMarshaller();
			final ObjectFactory f = new ObjectFactory();

			final X2Alternatives alternatives = f.createX2Alternatives();
			final X2Alternative alt = f.createX2Alternative();
			alt.setId("a01");
			alternatives.getDescriptionOrAlternative().add(alt);

			final X2Criteria criteria = f.createX2Criteria();
			final X2Criterion crit = f.createX2Criterion();
			crit.setId("c01");
			crit.setMcdaConcept("concept");
			criteria.getCriterion().add(crit);

			final XMCDA xmcda = f.createXMCDA();
			final List<JAXBElement<?>> xmcdaSubElements = xmcda.getProjectReferenceOrMethodMessagesOrMethodParameters();
			xmcdaSubElements.add(f.createXMCDAAlternatives(alternatives));
			xmcdaSubElements.add(f.createXMCDACriteria(criteria));

			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(xmcda, System.out);

}

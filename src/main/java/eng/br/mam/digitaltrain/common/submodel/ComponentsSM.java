package eng.br.mam.digitaltrain.common.submodel;

import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.reference.Reference;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.ReferenceElement;

import eng.br.mam.digitaltrain.common.util.Enforce;
import eng.br.mam.digitaltrain.component.aas.IComponentAAS;

public class ComponentsSM extends Submodel implements IComponentsSM {
	public static final String IDSHORT = "componentsSM";
	public static final String ID(String aasId) {
		return aasId+"_"+IDSHORT;
	};
	
	public static final String COMPONENTS_IDSHORT = "componentsList";
	
	
	public ComponentsSM(String aasId, SubmodelElementCollection components) {
		super(IDSHORT, new ModelUrn(ID(aasId)));
		
		components.setIdShort(COMPONENTS_IDSHORT);
		addSubmodelElement(components);
	}
	
	public ComponentsSM(String aasId) {
		this(aasId, new SubmodelElementCollection(COMPONENTS_IDSHORT));
	}
	
	@Override
	public SubmodelElementCollection getComponents() {
		return (SubmodelElementCollection) getSubmodelElement(COMPONENTS_IDSHORT);
	}

	@Override
	public void addComponent(IComponentAAS component) {
		Enforce.nonNull(component);

		ReferenceElement ref = new ReferenceElement(component.getIdShort()+"_ref", (Reference) component.getReference());
		getComponents().addSubmodelElement(ref);
	}
	

}

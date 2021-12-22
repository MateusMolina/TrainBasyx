package eng.br.mam.digitaltrain.common.submodel;

import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;

import eng.br.mam.digitaltrain.common.util.Enforce;

public class StateSM extends Submodel implements IStateSM {
	
	public static final String IDSHORT = "stateSM";
	public static final String ID(String aasId) {
		return aasId+"_"+IDSHORT;
	};
	
	public static final String STATES_IDSHORT = "states_prop";
	
	public StateSM(String aasId, SubmodelElementCollection states) {
		super(IDSHORT, new ModelUrn(ID(aasId)));
		states.setIdShort(STATES_IDSHORT);
		this.addSubmodelElement(states);
	}
	
	public StateSM(String aasId) {
		this(aasId, new SubmodelElementCollection(STATES_IDSHORT));
	}
	
	@Override
	public SubmodelElementCollection getStates() {
		return (SubmodelElementCollection) this.getSubmodelElement(STATES_IDSHORT);
	}

	@Override
	public void addState(String stateName, Object initialValue) {
		Enforce.nonBlank(stateName);
		getStates().addSubmodelElement(new Property(stateName, initialValue));		
	}
	
	

}

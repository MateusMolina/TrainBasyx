package eng.br.mam.digitaltrain.submodel.map.car;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;

import eng.br.mam.digitaltrain.submodel.api.car.IStateSM;

public class StateSM extends Submodel implements IStateSM {
	
	private String massId;
	
	public StateSM(Property massProp) {
		super();
		this.addSubmodelElement(massProp);
		this.massId = massProp.getIdShort();
	}
	
	public IProperty getMass() {
		return (Property) this.getSubmodelElement(massId);
	}

}

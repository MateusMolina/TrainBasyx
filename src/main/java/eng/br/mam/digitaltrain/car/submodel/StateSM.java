package eng.br.mam.digitaltrain.car.submodel;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;

public class StateSM extends Submodel implements IStateSM {
	
	private String massId;
	
	public StateSM(Property massProp) {
		super();
		this.addSubmodelElement(massProp);
		this.massId = massProp.getIdShort();
	}
	
	@Override
	public IProperty getMass() {
		return (Property) this.getSubmodelElement(massId);
	}

}

package eng.br.mam.digitaltrain.submodel.map.common;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;

import eng.br.mam.digitaltrain.submodel.api.common.IStatusSM;

public class StatusSM extends Submodel implements IStatusSM {

	private String statusId;
	
	public StatusSM(Property status) {
		super();
		this.addSubmodelElement(status);
		this.statusId = status.getIdShort();
	}
	
	public IProperty getStatus() {
		return (Property) this.getSubmodelElement(statusId);
	}

}

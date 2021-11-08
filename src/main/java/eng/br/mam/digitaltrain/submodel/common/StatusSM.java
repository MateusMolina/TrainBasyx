package eng.br.mam.digitaltrain.submodel.common;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;

public class StatusSM extends Submodel implements IStatusSM {

	private String statusId;
	
	public StatusSM(Property status) {
		super();
		this.addSubmodelElement(status);
		this.statusId = status.getIdShort();
	}
	
	@Override
	public IProperty getStatus() {
		return (Property) this.getSubmodelElement(statusId);
	}

}

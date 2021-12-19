package eng.br.mam.digitaltrain.common.submodel;

import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.dataelement.property.Property;

public class StatusSM extends Submodel implements IStatusSM {

	public static final String IDSHORT = "statusSM";
	public static final String ID(String aasId) {
		return aasId+"_"+IDSHORT;
	};
	
	public static final String STATUS_IDSHORT = "status";
	
	
	public StatusSM(String aasId, Status initialStatus) {
		super(IDSHORT, new ModelUrn(ID(aasId)));
		this.addSubmodelElement(new Property(STATUS_IDSHORT));
		setStatus(initialStatus);
	}
	
	public StatusSM(String aasId) {
		this(aasId, Status.IDLE);
	}
	
	private Property getStatusProp() {
		return (Property) this.getSubmodelElement(STATUS_IDSHORT);
	}
	
	@Override
	public String getStatus() {
		return (String) getStatusProp().getValue();
	}

	@Override
	public void setStatus(Status status) {
		getStatusProp().setValue(status.toString());
	}
	
	

}

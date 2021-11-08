package eng.br.mam.digitaltrain.aas.device;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.submodel.common.IServiceSM;
import eng.br.mam.digitaltrain.submodel.common.IStatusSM;
import eng.br.mam.digitaltrain.submodel.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.common.StatusSM;

public abstract class BaseDeviceAAS extends AssetAdministrationShell implements IDeviceAAS {
	
	private IIdentifier serviceId;
	private IIdentifier statusId;

	public BaseDeviceAAS(ServiceSM serviceSM, StatusSM statusSM) {
		super();
		addSubmodel(serviceSM);
		addSubmodel(statusSM);
		this.serviceId = serviceSM.getIdentification();
		this.statusId = statusSM.getIdentification();
	}

	public IServiceSM getServiceSM() {
		return (ServiceSM) this.getSubmodel(serviceId);
	}

	public IStatusSM getStatusSM() {
		return (StatusSM) this.getSubmodel(statusId);
	}

}

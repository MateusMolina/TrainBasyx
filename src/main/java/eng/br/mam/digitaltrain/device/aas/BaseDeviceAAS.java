package eng.br.mam.digitaltrain.device.aas;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.common.submodel.IServiceSM;
import eng.br.mam.digitaltrain.common.submodel.IStatusSM;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;

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

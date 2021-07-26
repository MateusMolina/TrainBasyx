package eng.br.mam.digitaltrain.aas.map.device;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;

import eng.br.mam.digitaltrain.aas.api.device.IDeviceAAS;
import eng.br.mam.digitaltrain.submodel.api.common.IServiceSM;
import eng.br.mam.digitaltrain.submodel.api.common.IStatusSM;

public abstract class BaseDeviceAAS extends AssetAdministrationShell implements IDeviceAAS {
	
	private IServiceSM serviceSM;
	private IStatusSM statusSM;

	public BaseDeviceAAS(IServiceSM serviceSM, IStatusSM statusSM) {
		super();
		this.serviceSM = serviceSM;
		this.statusSM = statusSM;
	}

	public IServiceSM getServiceSM() {
		return serviceSM;
	}

	public IStatusSM getStatusSM() {
		return statusSM;
	}

}

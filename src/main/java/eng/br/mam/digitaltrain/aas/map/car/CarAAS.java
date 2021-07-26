package eng.br.mam.digitaltrain.aas.map.car;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;

import eng.br.mam.digitaltrain.aas.api.car.ICarAAS;
import eng.br.mam.digitaltrain.submodel.api.car.IStateSM;
import eng.br.mam.digitaltrain.submodel.api.common.IMaintenanceSM;
import eng.br.mam.digitaltrain.submodel.api.common.IServiceSM;
import eng.br.mam.digitaltrain.submodel.api.common.IStatusSM;

abstract public class CarAAS extends AssetAdministrationShell implements ICarAAS {

	protected IServiceSM serviceSM;
	protected IStatusSM statusSM;
	protected IMaintenanceSM maintenanceSM;
	protected IStateSM stateSM;
	
	public CarAAS(IServiceSM serviceSM, IStatusSM statusSM, IMaintenanceSM maintenanceSM, IStateSM stateSM) {
		super();
		this.serviceSM = serviceSM;
		this.statusSM = statusSM;
		this.maintenanceSM = maintenanceSM;
		this.stateSM = stateSM;
	}

	public IServiceSM getServiceSM() {
		return serviceSM;
	}

	public IStatusSM getStatusSM() {
		return statusSM;
	}

	public IMaintenanceSM getMaintenanceSM() {
		return maintenanceSM;
	}

	public IStateSM getStateSM() {
		return stateSM;
	}

}

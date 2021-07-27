package eng.br.mam.digitaltrain.aas.map.car;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.aas.api.car.ICarAAS;
import eng.br.mam.digitaltrain.submodel.api.car.IStateSM;
import eng.br.mam.digitaltrain.submodel.api.common.IMaintenanceSM;
import eng.br.mam.digitaltrain.submodel.api.common.IServiceSM;
import eng.br.mam.digitaltrain.submodel.api.common.IStatusSM;
import eng.br.mam.digitaltrain.submodel.map.car.StateSM;
import eng.br.mam.digitaltrain.submodel.map.common.MaintenanceSM;
import eng.br.mam.digitaltrain.submodel.map.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.map.common.StatusSM;

abstract public class CarAAS extends AssetAdministrationShell implements ICarAAS {

	private IIdentifier serviceId;
	private IIdentifier statusId;
	private IIdentifier maintenanceId;
	private IIdentifier stateId;
	
	public CarAAS(ServiceSM serviceSM, StatusSM statusSM, MaintenanceSM maintenanceSM, StateSM stateSM) {
		super();
		addSubmodel(serviceSM);
		addSubmodel(statusSM);
		addSubmodel(maintenanceSM);
		addSubmodel(stateSM);
		
		this.serviceId = serviceSM.getIdentification();
		this.statusId = statusSM.getIdentification();
		this.maintenanceId = maintenanceSM.getIdentification();
		this.stateId = stateSM.getIdentification();
	}

	public IServiceSM getServiceSM() {
		return (ServiceSM) this.getSubmodel(serviceId);
	}

	public IStatusSM getStatusSM() {
		return (StatusSM) this.getSubmodel(statusId);
	}

	public IMaintenanceSM getMaintenanceSM() {
		return (MaintenanceSM) this.getSubmodel(maintenanceId);
	}

	public IStateSM getStateSM() {
		return (StateSM) this.getSubmodel(stateId);
	}

}

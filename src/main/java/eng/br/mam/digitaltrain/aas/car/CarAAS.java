package eng.br.mam.digitaltrain.aas.car;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.submodel.car.IStateSM;
import eng.br.mam.digitaltrain.submodel.car.StateSM;
import eng.br.mam.digitaltrain.submodel.common.IMaintenanceSM;
import eng.br.mam.digitaltrain.submodel.common.IServiceSM;
import eng.br.mam.digitaltrain.submodel.common.IStatusSM;
import eng.br.mam.digitaltrain.submodel.common.MaintenanceSM;
import eng.br.mam.digitaltrain.submodel.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.common.StatusSM;

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

	@Override
	public IStateSM getStateSM() {
		return (StateSM) this.getSubmodel(stateId);
	}

}

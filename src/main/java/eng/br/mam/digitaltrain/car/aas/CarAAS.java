package eng.br.mam.digitaltrain.car.aas;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.car.submodel.IStateSM;
import eng.br.mam.digitaltrain.car.submodel.StateSM;
import eng.br.mam.digitaltrain.common.submodel.IMaintenanceSM;
import eng.br.mam.digitaltrain.common.submodel.IServiceSM;
import eng.br.mam.digitaltrain.common.submodel.IStatusSM;
import eng.br.mam.digitaltrain.common.submodel.MaintenanceSM;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;

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

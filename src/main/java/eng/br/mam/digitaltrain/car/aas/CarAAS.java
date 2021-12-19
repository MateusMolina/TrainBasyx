package eng.br.mam.digitaltrain.car.aas;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.aas.metamodel.map.parts.Asset;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.common.submodel.MaintenanceSM;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StateSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;

abstract public class CarAAS extends AssetAdministrationShell implements ICarAAS {

	
	public CarAAS(String idShort, IIdentifier id, Asset asset, ServiceSM serviceSM, StatusSM statusSM, MaintenanceSM maintenanceSM, StateSM stateSM) {
		super(idShort,id, asset);
		addSubmodel(serviceSM);
		addSubmodel(statusSM);
		addSubmodel(maintenanceSM);
		addSubmodel(stateSM);
	}

	@Override
	public ServiceSM getServiceSM() {
		throw new RuntimeException("getServiceSM can not be execcuted locally");
	}

	@Override
	public StatusSM getStatusSM() {
		throw new RuntimeException("getStatusSM can not be execcuted locally");
	}

	@Override
	public MaintenanceSM getMaintenanceSM() {
		throw new RuntimeException("getMaintenanceSM can not be execcuted locally");
	}

	@Override
	public StateSM getStateSM() {
		throw new RuntimeException("getStateSM can not be execcuted locally");
	}

}

package eng.br.mam.digitaltrain.car.aas.railcar;

import org.eclipse.basyx.aas.metamodel.map.parts.Asset;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.car.aas.CarAAS;
import eng.br.mam.digitaltrain.car.submodel.railcar.RailcarSM;
import eng.br.mam.digitaltrain.common.submodel.MaintenanceSM;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StateSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;

public class RailcarAAS extends CarAAS implements IRailcarAAS {

	
	public RailcarAAS(String idShort, IIdentifier id, Asset asset, ServiceSM serviceSM, StatusSM statusSM, MaintenanceSM maintenanceSM, StateSM stateSM, RailcarSM railcarSM) {
		super(idShort, id, asset, serviceSM, statusSM, maintenanceSM, stateSM);
		addSubmodel(railcarSM);
	}

	@Override
	public RailcarSM getRailcarSM() {
		throw new RuntimeException("getRailcarSM can not be called locally");
	}

}

package eng.br.mam.digitaltrain.aas.map.car;

import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.aas.api.car.IRailcarAAS;
import eng.br.mam.digitaltrain.submodel.api.car.IRailcarSM;
import eng.br.mam.digitaltrain.submodel.map.car.RailcarSM;
import eng.br.mam.digitaltrain.submodel.map.car.StateSM;
import eng.br.mam.digitaltrain.submodel.map.common.MaintenanceSM;
import eng.br.mam.digitaltrain.submodel.map.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.map.common.StatusSM;

public class RailcarAAS extends CarAAS implements IRailcarAAS {

	private IIdentifier railcarId;
	
	public RailcarAAS(ServiceSM serviceSM, StatusSM statusSM, MaintenanceSM maintenanceSM, StateSM stateSM, RailcarSM railcarSM) {
		super(serviceSM, statusSM, maintenanceSM, stateSM);
		addSubmodel(railcarSM);
		setIdShort("RailcarAAS");
		this.railcarId = railcarSM.getIdentification();
	}

	public IRailcarSM getRailcarSM() {
		return (RailcarSM) getSubmodel(railcarId);
	}

}

package eng.br.mam.digitaltrain.car.aas.railcar;

import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.car.aas.CarAAS;
import eng.br.mam.digitaltrain.car.submodel.StateSM;
import eng.br.mam.digitaltrain.car.submodel.railcar.IRailcarSM;
import eng.br.mam.digitaltrain.car.submodel.railcar.RailcarSM;
import eng.br.mam.digitaltrain.common.submodel.MaintenanceSM;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;

public class RailcarAAS extends CarAAS implements IRailcarAAS {

	private IIdentifier railcarId;
	
	public RailcarAAS(ServiceSM serviceSM, StatusSM statusSM, MaintenanceSM maintenanceSM, StateSM stateSM, RailcarSM railcarSM) {
		super(serviceSM, statusSM, maintenanceSM, stateSM);
		addSubmodel(railcarSM);
		setIdShort("RailcarAAS");
		this.railcarId = railcarSM.getIdentification();
	}

	@Override
	public IRailcarSM getRailcarSM() {
		return (RailcarSM) getSubmodel(railcarId);
	}

}

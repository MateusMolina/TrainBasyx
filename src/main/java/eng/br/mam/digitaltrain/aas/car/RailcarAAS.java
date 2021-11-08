package eng.br.mam.digitaltrain.aas.car;

import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.submodel.car.IRailcarSM;
import eng.br.mam.digitaltrain.submodel.car.RailcarSM;
import eng.br.mam.digitaltrain.submodel.car.StateSM;
import eng.br.mam.digitaltrain.submodel.common.MaintenanceSM;
import eng.br.mam.digitaltrain.submodel.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.common.StatusSM;

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

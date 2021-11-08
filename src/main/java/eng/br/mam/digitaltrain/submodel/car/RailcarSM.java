package eng.br.mam.digitaltrain.submodel.map.car;

import org.eclipse.basyx.submodel.metamodel.map.Submodel;

import eng.br.mam.digitaltrain.aas.api.device.IPneumaticBrakeAAS;
import eng.br.mam.digitaltrain.submodel.api.car.IRailcarSM;

public class RailcarSM extends Submodel implements IRailcarSM {

	private IPneumaticBrakeAAS pneumaticBrakeAAS;
	
	public RailcarSM(IPneumaticBrakeAAS pneumaticBrakeAAS) {
		super();
		this.pneumaticBrakeAAS = pneumaticBrakeAAS;
	}

	public IPneumaticBrakeAAS getPneumaticBrake() {
		return pneumaticBrakeAAS;
	}

}

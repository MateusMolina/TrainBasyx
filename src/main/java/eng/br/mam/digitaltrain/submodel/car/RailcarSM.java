package eng.br.mam.digitaltrain.submodel.car;

import org.eclipse.basyx.submodel.metamodel.map.Submodel;

import eng.br.mam.digitaltrain.aas.device.IPneumaticBrakeAAS;

public class RailcarSM extends Submodel implements IRailcarSM {

	private IPneumaticBrakeAAS pneumaticBrakeAAS;
	
	public RailcarSM(IPneumaticBrakeAAS pneumaticBrakeAAS) {
		super();
		this.pneumaticBrakeAAS = pneumaticBrakeAAS;
	}

	@Override
	public IPneumaticBrakeAAS getPneumaticBrake() {
		return pneumaticBrakeAAS;
	}

}

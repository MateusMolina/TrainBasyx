package eng.br.mam.digitaltrain.submodel.car.railcar;

import org.eclipse.basyx.submodel.metamodel.map.Submodel;

import eng.br.mam.digitaltrain.aas.device.pneumaticbrake.IPneumaticBrakeAAS;

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

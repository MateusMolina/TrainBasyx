package eng.br.mam.digitaltrain.car.submodel.railcar;

import org.eclipse.basyx.submodel.metamodel.map.Submodel;

import eng.br.mam.digitaltrain.component.aas.pneumaticbrake.IPneumaticBrakeAAS;

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

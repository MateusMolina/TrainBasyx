package eng.br.mam.digitaltrain.car.submodel.locomotive;

import eng.br.mam.digitaltrain.common.submodelelement.IBoundedProperty;

public interface ILocomotiveControlSM {
	
	public IBoundedProperty getCurrentTractiveNotch();
	
	public IBoundedProperty getCurrentPneumaticBrakeNotch();
	

}

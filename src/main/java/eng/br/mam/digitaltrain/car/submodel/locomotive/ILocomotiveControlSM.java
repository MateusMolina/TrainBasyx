package eng.br.mam.digitaltrain.car.submodel.locomotive;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;

public interface ILocomotiveControlSM {
	
	public IProperty getCurrentTractiveNotch();
	
	public IProperty getCurrentPneumaticBrakeNotch();
	
	public IProperty getCurrentEGPressure();	

}

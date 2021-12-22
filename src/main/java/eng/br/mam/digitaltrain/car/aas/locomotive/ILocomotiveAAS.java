package eng.br.mam.digitaltrain.car.aas.locomotive;

import eng.br.mam.digitaltrain.car.aas.ICarAAS;
import eng.br.mam.digitaltrain.car.submodel.locomotive.ILocomotiveControlSM;

public interface ILocomotiveAAS extends ICarAAS {
	
	public ILocomotiveControlSM getLocomotiveControlSM();
	
}
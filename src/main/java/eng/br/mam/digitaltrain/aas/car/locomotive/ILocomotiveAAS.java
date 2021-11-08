package eng.br.mam.digitaltrain.aas.car.locomotive;

import eng.br.mam.digitaltrain.aas.car.ICarAAS;
import eng.br.mam.digitaltrain.submodel.car.locomotive.ILocomotiveSM;

public interface ILocomotiveAAS extends ICarAAS {
	public ILocomotiveSM getLocomotiveSM();
}

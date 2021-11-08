package eng.br.mam.digitaltrain.car.aas.locomotive;

import eng.br.mam.digitaltrain.car.aas.ICarAAS;
import eng.br.mam.digitaltrain.car.submodel.locomotive.ILocomotiveSM;

public interface ILocomotiveAAS extends ICarAAS {
	public ILocomotiveSM getLocomotiveSM();
}

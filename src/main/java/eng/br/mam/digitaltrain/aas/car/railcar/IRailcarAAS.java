package eng.br.mam.digitaltrain.aas.car.railcar;

import eng.br.mam.digitaltrain.aas.car.ICarAAS;
import eng.br.mam.digitaltrain.submodel.car.railcar.IRailcarSM;

public interface IRailcarAAS extends ICarAAS{
	public IRailcarSM getRailcarSM();
}

package eng.br.mam.digitaltrain.car.aas.railcar;

import eng.br.mam.digitaltrain.car.aas.ICarAAS;
import eng.br.mam.digitaltrain.car.submodel.railcar.IRailcarSM;

public interface IRailcarAAS extends ICarAAS{
	public IRailcarSM getRailcarSM();
}

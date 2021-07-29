package eng.br.mam.digitaltrain.aas.factory.sensor;

import eng.br.mam.digitaltrain.aas.map.sensor.SensorAAS;
import eng.br.mam.digitaltrain.submodel.map.sensor.SensorSM;

public class SensorAASFactory {
	public static SensorAAS build() {
		return new SensorAAS(new SensorSM());
	}
}

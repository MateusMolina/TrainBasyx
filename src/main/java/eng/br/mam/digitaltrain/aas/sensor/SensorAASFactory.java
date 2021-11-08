package eng.br.mam.digitaltrain.aas.sensor;

import eng.br.mam.digitaltrain.submodel.sensor.SensorSM;

public class SensorAASFactory {
	public static SensorAAS build() {
		return new SensorAAS(new SensorSM());
	}
}

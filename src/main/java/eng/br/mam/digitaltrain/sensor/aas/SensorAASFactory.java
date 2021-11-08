package eng.br.mam.digitaltrain.sensor.aas;

import eng.br.mam.digitaltrain.sensor.submodel.SensorSM;

public class SensorAASFactory {
	public static SensorAAS build() {
		return new SensorAAS(new SensorSM());
	}
}

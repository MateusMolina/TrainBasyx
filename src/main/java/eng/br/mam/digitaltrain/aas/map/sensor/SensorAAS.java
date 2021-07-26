package eng.br.mam.digitaltrain.aas.map.sensor;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;

import eng.br.mam.digitaltrain.aas.api.sensor.ISensorAAS;
import eng.br.mam.digitaltrain.submodel.api.sensor.ISensorSM;

public class SensorAAS extends AssetAdministrationShell implements ISensorAAS {
	
	private ISensorSM sensorSM;
	
	public SensorAAS(ISensorSM sensorSM) {
		super();
		this.sensorSM = sensorSM;
	}

	public ISensorSM getSensorSM() {
		return sensorSM;
	}

}

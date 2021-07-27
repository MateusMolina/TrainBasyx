package eng.br.mam.digitaltrain.aas.map.sensor;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.aas.api.sensor.ISensorAAS;
import eng.br.mam.digitaltrain.submodel.api.sensor.ISensorSM;
import eng.br.mam.digitaltrain.submodel.map.sensor.SensorSM;

public class SensorAAS extends AssetAdministrationShell implements ISensorAAS {
	
	private IIdentifier sensorId;
	
	public SensorAAS(SensorSM sensorSM) {
		super();
		this.addSubmodel(sensorSM);
		this.sensorId = sensorSM.getIdentification();
	}

	public ISensorSM getSensorSM() {
		return (SensorSM) this.getSubmodel(sensorId);
	}

}

package eng.br.mam.digitaltrain.aas.sensor;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.submodel.sensor.ISensorSM;
import eng.br.mam.digitaltrain.submodel.sensor.SensorSM;

public class SensorAAS extends AssetAdministrationShell implements ISensorAAS {
	
	private IIdentifier sensorId;
	
	public SensorAAS(SensorSM sensorSM) {
		super();
		this.addSubmodel(sensorSM);
		setIdShort("Sensor");
		this.sensorId = sensorSM.getIdentification();
	}

	@Override
	public ISensorSM getSensorSM() {
		return (SensorSM) this.getSubmodel(sensorId);
	}

}

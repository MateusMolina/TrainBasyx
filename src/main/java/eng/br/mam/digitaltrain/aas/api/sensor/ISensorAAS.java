package eng.br.mam.digitaltrain.aas.api.sensor;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

import eng.br.mam.digitaltrain.submodel.api.sensor.ISensorSM;

public interface ISensorAAS extends IAssetAdministrationShell{
	public ISensorSM getSensorSM();
}

package eng.br.mam.digitaltrain.aas.sensor;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

import eng.br.mam.digitaltrain.submodel.sensor.ISensorSM;

public interface ISensorAAS extends IAssetAdministrationShell{
	public ISensorSM getSensorSM();
}

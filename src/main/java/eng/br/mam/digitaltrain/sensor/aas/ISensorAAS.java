package eng.br.mam.digitaltrain.sensor.aas;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

import eng.br.mam.digitaltrain.sensor.submodel.ISensorSM;

public interface ISensorAAS extends IAssetAdministrationShell{
	public ISensorSM getSensorSM();
}

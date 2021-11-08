package eng.br.mam.digitaltrain.aas.api.train;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

import eng.br.mam.digitaltrain.aas.api.qualifiers.ServiceProvider;
import eng.br.mam.digitaltrain.submodel.api.train.ITrainTopologySM;

public interface ITrainAAS extends IAssetAdministrationShell, ServiceProvider {
	public ITrainTopologySM getTrainTopologySM();
}

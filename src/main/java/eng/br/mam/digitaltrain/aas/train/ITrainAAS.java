package eng.br.mam.digitaltrain.aas.train;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

import eng.br.mam.digitaltrain.aas.qualifiers.ServiceProvider;
import eng.br.mam.digitaltrain.submodel.train.ITrainTopologySM;

public interface ITrainAAS extends IAssetAdministrationShell, ServiceProvider {
	public ITrainTopologySM getTrainTopologySM();
}

package eng.br.mam.digitaltrain.train.aas;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

import eng.br.mam.digitaltrain.qualifiers.ServiceProvider;
import eng.br.mam.digitaltrain.train.submodel.ITrainTopologySM;

public interface ITrainAAS extends IAssetAdministrationShell, ServiceProvider {
	public ITrainTopologySM getTrainTopologySM();
}

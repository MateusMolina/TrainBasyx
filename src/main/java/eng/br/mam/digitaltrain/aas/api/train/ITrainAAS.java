package eng.br.mam.digitaltrain.aas.api.train;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

import eng.br.mam.digitaltrain.submodel.api.train.ITrainStatus;

public interface ITrainAAS extends IAssetAdministrationShell {

	public IStatusSM getStatusSM();
	public IStateSM getStateSM();
	public ITrainControllerSM getTrainControllerSM();	
	public IServiceSM getServiceSM();
	
}

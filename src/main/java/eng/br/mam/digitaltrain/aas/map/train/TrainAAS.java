package eng.br.mam.digitaltrain.aas.map.train;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;

import eng.br.mam.digitaltrain.aas.api.train.ITrainAAS;
import eng.br.mam.digitaltrain.submodel.api.common.IServiceSM;
import eng.br.mam.digitaltrain.submodel.api.common.IStatusSM;
import eng.br.mam.digitaltrain.submodel.api.train.ITrainTopologySM;

public class TrainAAS extends AssetAdministrationShell implements ITrainAAS {
	
	private IServiceSM serviceSM;
	private IStatusSM statusSM;
	private ITrainTopologySM trainTopologySM;
	
	public TrainAAS(IServiceSM serviceSM, IStatusSM statusSM, ITrainTopologySM trainTopologySM) {
		super();
		this.serviceSM = serviceSM;
		this.statusSM = statusSM;
		this.trainTopologySM = trainTopologySM;
	}

	public IServiceSM getServiceSM() {
		return serviceSM;
	}

	public IStatusSM getStatusSM() {
		return statusSM;
	}

	public ITrainTopologySM getTrainTopologySM() {
		return trainTopologySM;
	}


}

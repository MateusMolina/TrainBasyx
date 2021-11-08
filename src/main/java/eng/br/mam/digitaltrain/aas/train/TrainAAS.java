package eng.br.mam.digitaltrain.aas.map.train;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.aas.api.train.ITrainAAS;
import eng.br.mam.digitaltrain.submodel.api.common.IServiceSM;
import eng.br.mam.digitaltrain.submodel.api.common.IStatusSM;
import eng.br.mam.digitaltrain.submodel.api.train.ITrainTopologySM;
import eng.br.mam.digitaltrain.submodel.map.common.ServiceSM;
import eng.br.mam.digitaltrain.submodel.map.common.StatusSM;
import eng.br.mam.digitaltrain.submodel.map.train.TrainTopologySM;

public class TrainAAS extends AssetAdministrationShell implements ITrainAAS {
	
	private IIdentifier serviceId;
	private IIdentifier statusId;
	private IIdentifier trainTopologyId;
	
	public TrainAAS(ServiceSM serviceSM, StatusSM statusSM, TrainTopologySM trainTopologySM) {
		super();
		this.addSubmodel(serviceSM);
		this.addSubmodel(statusSM);
		this.addSubmodel(trainTopologySM);
		setIdShort("Train");
		this.serviceId = serviceSM.getIdentification();
		this.statusId = statusSM.getIdentification();
		this.trainTopologyId = trainTopologySM.getIdentification();
	}

	public IServiceSM getServiceSM() {
		return (ServiceSM) this.getSubmodel(serviceId);
	}

	public IStatusSM getStatusSM() {
		return (StatusSM) this.getSubmodel(statusId);
	}

	public ITrainTopologySM getTrainTopologySM() {
		return (TrainTopologySM) this.getSubmodel(trainTopologyId);
	}


}

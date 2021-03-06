package eng.br.mam.digitaltrain.train.aas;

import org.eclipse.basyx.aas.metamodel.map.AssetAdministrationShell;
import org.eclipse.basyx.submodel.metamodel.api.identifier.IIdentifier;

import eng.br.mam.digitaltrain.common.submodel.IServiceSM;
import eng.br.mam.digitaltrain.common.submodel.IStatusSM;
import eng.br.mam.digitaltrain.common.submodel.ServiceSM;
import eng.br.mam.digitaltrain.common.submodel.StatusSM;
import eng.br.mam.digitaltrain.train.submodel.ITrainTopologySM;
import eng.br.mam.digitaltrain.train.submodel.TrainTopologySM;

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

	@Override
	public IServiceSM getServiceSM() {
		return (ServiceSM) this.getSubmodel(serviceId);
	}

	@Override
	public IStatusSM getStatusSM() {
		return (StatusSM) this.getSubmodel(statusId);
	}

	@Override
	public ITrainTopologySM getTrainTopologySM() {
		return (TrainTopologySM) this.getSubmodel(trainTopologyId);
	}


}

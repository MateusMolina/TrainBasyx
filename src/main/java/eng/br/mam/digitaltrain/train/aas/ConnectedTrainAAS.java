package eng.br.mam.digitaltrain.train.aas;

import org.eclipse.basyx.aas.metamodel.connected.ConnectedAssetAdministrationShell;
import org.eclipse.basyx.vab.modelprovider.VABElementProxy;

import eng.br.mam.digitaltrain.common.submodel.IServiceSM;
import eng.br.mam.digitaltrain.common.submodel.IStatusSM;
import eng.br.mam.digitaltrain.train.submodel.ITrainTopologySM;

public class ConnectedTrainAAS extends ConnectedAssetAdministrationShell implements ITrainAAS {

	public ConnectedTrainAAS(VABElementProxy proxy) {
		super(proxy);
	}

	@Override
	public IServiceSM getServiceSM() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IStatusSM getStatusSM() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITrainTopologySM getTrainTopologySM() {
		// TODO Auto-generated method stub
		return null;
	}

}

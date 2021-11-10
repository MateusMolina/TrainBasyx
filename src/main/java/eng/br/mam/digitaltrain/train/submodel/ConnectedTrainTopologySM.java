package eng.br.mam.digitaltrain.train.submodel;

import org.eclipse.basyx.submodel.metamodel.connected.ConnectedSubmodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;
import org.eclipse.basyx.vab.modelprovider.VABElementProxy;

public class ConnectedTrainTopologySM extends ConnectedSubmodel implements ITrainTopologySM {

	public ConnectedTrainTopologySM(VABElementProxy proxy) {
		super(proxy);
	}

	@Override
	public SubmodelElementCollection getTopology() {
		return (SubmodelElementCollection) getSubmodelElement(TrainTopologySM.ID_TOPOLOGY);
	}
	

}

package eng.br.mam.digitaltrain.train.submodel;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

public class TrainTopologySM extends Submodel implements ITrainTopologySM {

	private String topologyId;
	
	public TrainTopologySM(SubmodelElementCollection topology) {
		super();
		this.addSubmodelElement(topology);
		this.topologyId = topology.getIdShort();
	}
	@Override
	public ISubmodelElementCollection getTopology() {
		return (SubmodelElementCollection) this.getSubmodelElement(topologyId);
	}

}

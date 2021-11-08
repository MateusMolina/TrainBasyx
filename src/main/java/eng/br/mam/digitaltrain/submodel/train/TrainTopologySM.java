package eng.br.mam.digitaltrain.submodel.map.train;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

import eng.br.mam.digitaltrain.submodel.api.train.ITrainTopologySM;

public class TrainTopologySM extends Submodel implements ITrainTopologySM {

	private String topologyId;
	
	public TrainTopologySM(SubmodelElementCollection topology) {
		super();
		this.addSubmodelElement(topology);
		this.topologyId = topology.getIdShort();
	}
	public ISubmodelElementCollection getTopology() {
		return (SubmodelElementCollection) this.getSubmodelElement(topologyId);
	}

}

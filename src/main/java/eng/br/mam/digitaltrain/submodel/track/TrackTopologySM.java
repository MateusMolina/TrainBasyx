package eng.br.mam.digitaltrain.submodel.track;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

public class TrackTopologySM extends Submodel implements ITrackTopologySM {

	private String topologyId;
	
	public TrackTopologySM(SubmodelElementCollection topology) {
		super();
		addSubmodelElement(topology);
		this.topologyId = topology.getIdShort();
	}
	
	@Override
	public ISubmodelElementCollection getTopology() {
		return (SubmodelElementCollection) this.getSubmodelElement(topologyId);
	}

}

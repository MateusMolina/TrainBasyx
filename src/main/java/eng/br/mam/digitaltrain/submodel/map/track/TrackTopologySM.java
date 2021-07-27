package eng.br.mam.digitaltrain.submodel.map.track;

import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

import eng.br.mam.digitaltrain.submodel.api.track.ITrackTopologySM;

public class TrackTopologySM extends Submodel implements ITrackTopologySM {

	private String topologyId;
	
	public TrackTopologySM(SubmodelElementCollection topology) {
		super();
		addSubmodelElement(topology);
		this.topologyId = topology.getIdShort();
	}
	
	public ISubmodelElementCollection getTopology() {
		return (SubmodelElementCollection) this.getSubmodelElement(topologyId);
	}

}

package eng.br.mam.digitaltrain.track.submodel;

import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

public class TrackTopologySM extends Submodel implements ITrackTopologySM {

	public static final String ID = "trackTopologySM";
	public static final String ID_SHORT = "trackTopologySMIdShort";
	public static final String ID_TOPOLOGY = "topologyProp";

	
	public TrackTopologySM(SubmodelElementCollection topology) {
		super();
		setIdShort(ID_SHORT);
		setIdentification(new ModelUrn(ID));
		topology.setIdShort(ID_TOPOLOGY);
		addSubmodelElement(topology);
	}
	
	@Override
	public SubmodelElementCollection getTopology() {
		return (SubmodelElementCollection) getSubmodelElement(ID_TOPOLOGY);
	}

}

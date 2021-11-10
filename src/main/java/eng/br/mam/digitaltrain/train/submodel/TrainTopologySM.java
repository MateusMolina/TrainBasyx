package eng.br.mam.digitaltrain.train.submodel;

import org.eclipse.basyx.aas.metamodel.map.descriptor.ModelUrn;
import org.eclipse.basyx.submodel.metamodel.map.Submodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

public class TrainTopologySM extends Submodel implements ITrainTopologySM {

	public static final String ID = "trainTopologySM";
	public static final String ID_SHORT = "trainTopologySMIdShort";
	public static final String ID_TOPOLOGY = "topologyProp";

	
	public TrainTopologySM(SubmodelElementCollection topology) {
		super();
		setIdShort(ID_SHORT);
		setIdentification(new ModelUrn(ID));
		topology.setIdShort(ID_TOPOLOGY);
		this.addSubmodelElement(topology);
	}
	@Override
	public SubmodelElementCollection getTopology() {
		return (SubmodelElementCollection) getSubmodelElement(ID_TOPOLOGY);
	}

}

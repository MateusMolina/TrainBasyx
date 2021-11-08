package eng.br.mam.digitaltrain.aas.factory.track;

import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

import eng.br.mam.digitaltrain.aas.factory.common.CommonFactory;
import eng.br.mam.digitaltrain.aas.map.track.TrackAAS;
import eng.br.mam.digitaltrain.submodel.map.track.TrackTopologySM;

public class TrackAASFactory {
	public static TrackAAS build(SubmodelElementCollection topology) {
		return new TrackAAS(CommonFactory.getBlankMaintenanceSM(), 
				new TrackTopologySM(topology));
	}
}

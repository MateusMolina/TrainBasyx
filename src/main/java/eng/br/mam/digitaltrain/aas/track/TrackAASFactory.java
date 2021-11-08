package eng.br.mam.digitaltrain.aas.track;

import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

import eng.br.mam.digitaltrain.aas.common.CommonFactory;
import eng.br.mam.digitaltrain.submodel.track.TrackTopologySM;

public class TrackAASFactory {
	public static TrackAAS build(SubmodelElementCollection topology) {
		return new TrackAAS(CommonFactory.getBlankMaintenanceSM(), 
				new TrackTopologySM(topology));
	}
}

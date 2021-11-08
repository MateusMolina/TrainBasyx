package eng.br.mam.digitaltrain.track.aas;

import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

import eng.br.mam.digitaltrain.common.CommonFactory;
import eng.br.mam.digitaltrain.track.submodel.TrackTopologySM;

public class TrackAASFactory {
	public static TrackAAS build(SubmodelElementCollection topology) {
		return new TrackAAS(CommonFactory.getBlankMaintenanceSM(), 
				new TrackTopologySM(topology));
	}
}

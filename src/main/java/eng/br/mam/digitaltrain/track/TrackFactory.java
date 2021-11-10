package eng.br.mam.digitaltrain.track;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.basyx.aas.bundle.AASBundle;
import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.map.submodelelement.SubmodelElementCollection;

import eng.br.mam.digitaltrain.common.CommonFactory;
import eng.br.mam.digitaltrain.common.submodel.MaintenanceSM;
import eng.br.mam.digitaltrain.track.aas.TrackAAS;
import eng.br.mam.digitaltrain.track.submodel.TrackTopologySM;

public class TrackFactory {
	public static AASBundle build(SubmodelElementCollection topology) {
		
		TrackTopologySM trackTopologySM = new TrackTopologySM(topology);
		MaintenanceSM maintenanceSM = CommonFactory.getBlankMaintenanceSM();
		
		Set<ISubmodel> smSet = new HashSet<>();
		
		smSet.add(trackTopologySM);
		smSet.add(maintenanceSM);
		
		TrackAAS aas = new TrackAAS(maintenanceSM, trackTopologySM);

		return new AASBundle(aas, smSet);
	}
}

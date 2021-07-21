package eng.br.mam.digitaltrain.submodel.api.qualifier;

import java.util.List;

import org.eclipse.basyx.submodel.metamodel.api.qualifier.IIdentifiable;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.ISubmodelElementCollection;

import eng.br.mam.digitaltrain.aas.api.sensor.ISensorAAS;

public interface Instrumentable {
	public ISubmodelElementCollection getSensorAASList();
	
}


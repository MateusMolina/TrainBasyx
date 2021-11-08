package eng.br.mam.digitaltrain.car.submodel;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;
import org.eclipse.basyx.submodel.metamodel.api.submodelelement.dataelement.IProperty;

public interface IStateSM extends ISubmodel {
	
	public IProperty getMass();

}

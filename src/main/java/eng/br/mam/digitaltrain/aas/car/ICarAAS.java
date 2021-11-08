package eng.br.mam.digitaltrain.aas.car;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

import eng.br.mam.digitaltrain.aas.qualifiers.Maintainable;
import eng.br.mam.digitaltrain.aas.qualifiers.ServiceProvider;
import eng.br.mam.digitaltrain.submodel.car.IStateSM;
/**
 * 
 * * Status: should contain operative info about the car
 * * State: should contain general information regarding its position and velocity
 * 
 * @author mateusmolina
 *
 */

public interface ICarAAS extends IAssetAdministrationShell, ServiceProvider, Maintainable {
	public IStateSM getStateSM();
}

package eng.br.mam.digitaltrain.car.aas;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

import eng.br.mam.digitaltrain.car.submodel.IStateSM;
import eng.br.mam.digitaltrain.common.qualifiers.Maintainable;
import eng.br.mam.digitaltrain.common.qualifiers.ServiceProvider;
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

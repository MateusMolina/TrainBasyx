package eng.br.mam.digitaltrain.car.aas;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

import eng.br.mam.digitaltrain.common.aas.qualifiers.HasComponents;
import eng.br.mam.digitaltrain.common.aas.qualifiers.HasServices;
import eng.br.mam.digitaltrain.common.aas.qualifiers.HasState;
import eng.br.mam.digitaltrain.common.aas.qualifiers.Maintainable;
/**
 * 
 * * Status: should contain operative info about the car
 * * State: should contain general information regarding its position and velocity
 * 
 * @author mateusmolina
 *
 */

public interface ICarAAS extends IAssetAdministrationShell, HasServices, HasState, HasComponents, Maintainable {
}

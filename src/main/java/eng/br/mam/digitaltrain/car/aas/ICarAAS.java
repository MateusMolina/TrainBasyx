package eng.br.mam.digitaltrain.car.aas;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

import eng.br.mam.digitaltrain.common.qualifiers.Maintainable;
import eng.br.mam.digitaltrain.common.qualifiers.Server;
import eng.br.mam.digitaltrain.common.submodel.IStateSM;
/**
 * 
 * * Status: should contain operative info about the car
 * * State: should contain general information regarding its position and velocity
 * 
 * @author mateusmolina
 *
 */

public interface ICarAAS extends IAssetAdministrationShell, Server, Maintainable {
	public IStateSM getStateSM();
}

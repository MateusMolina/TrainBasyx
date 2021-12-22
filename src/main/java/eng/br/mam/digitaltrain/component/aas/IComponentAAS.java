package eng.br.mam.digitaltrain.component.aas;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

import eng.br.mam.digitaltrain.common.aas.qualifiers.HasState;
import eng.br.mam.digitaltrain.common.aas.qualifiers.Maintainable;

public interface IComponentAAS extends IAssetAdministrationShell, HasState, Maintainable {
	
}

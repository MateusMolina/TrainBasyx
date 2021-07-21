package eng.br.mam.digitaltrain.aas.api.track;

import org.eclipse.basyx.aas.metamodel.api.IAssetAdministrationShell;

public interface ISubtrackAAS extends IAssetAdministrationShell{

	public ISubtrackSM getSubtrackSM();
}

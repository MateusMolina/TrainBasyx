package eng.br.mam.digitaltrain.submodel.car;

import org.eclipse.basyx.submodel.metamodel.api.ISubmodel;

import eng.br.mam.digitaltrain.aas.device.ICompressorAAS;
import eng.br.mam.digitaltrain.aas.device.IEngineAAS;

public interface ILocomotiveSM extends ISubmodel{
	
	public ICompressorAAS getCompressor();
	public IEngineAAS getEngine();

}

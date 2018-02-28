package ch.fhnw.openci.modules.mymodulebundle;

import org.openci.core.modules.Options;
import org.openci.core.modules.optimization.Optimizer;
import org.openci.core.modules.optimization.Solution;

import ch.fhnw.openci.core.modules.annotations.ModuleInformation;

//Give the module a meaningfull name in OpenCI and group it in a comprehensible category
@ModuleInformation(name="Test", categories={"Save the hedgehogs", "Rado is the greatest", "..."})
public class Test extends Optimizer {

    public String init(long initID) {
        // TODO Auto-generated method stub
        return null;
    }

    public String check() {
        // TODO Auto-generated method stub
        return null;
    }

    public Options getDefaultOptions() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

    @Override
    public Solution getBestSolution() {
        // TODO Auto-generated method stub
        return null;
    }

}

package org.kie.workbench.common.stunner.core.service;

import javax.enterprise.context.Dependent;

import org.kie.workbench.common.stunner.core.diagram.Diagram;
import org.kie.workbench.common.stunner.core.diagram.Metadata;
import org.kie.workbench.common.stunner.core.graph.Graph;
import org.uberfire.backend.vfs.Path;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 8/27/21
 */
@Dependent
public class DiagramServiceImpl implements DiagramService {

    @Override
    public Diagram<Graph, Metadata> getDiagramByPath(Path path) {
        throw new Error(getClass().getCanonicalName()+".getDiagramByPath");
    }

    @Override
    public boolean accepts(Path path) {
        throw new Error(getClass().getCanonicalName()+".accepts");
    }

    @Override
    public Path create(Path path, String name, String defSetId) {
        throw new Error(getClass().getCanonicalName()+".create");
    }

    @Override
    public Metadata saveOrUpdate(Diagram<Graph, Metadata> diagram) {
        throw new Error(getClass().getCanonicalName()+".saveOrUpdate");
    }

    @Override
    public Path saveOrUpdateSvg(Path diagramPath, String rawDiagramSvg) {
        throw new Error(getClass().getCanonicalName()+".saveOrUpdateSvg");
    }

    @Override
    public boolean delete(Diagram<Graph, Metadata> diagram) {
        throw new Error(getClass().getCanonicalName()+".delete");
    }

    @Override
    public String getRawContent(Diagram<Graph, Metadata> diagram) {
        throw new Error(getClass().getCanonicalName()+".getRawContent");
    }
}

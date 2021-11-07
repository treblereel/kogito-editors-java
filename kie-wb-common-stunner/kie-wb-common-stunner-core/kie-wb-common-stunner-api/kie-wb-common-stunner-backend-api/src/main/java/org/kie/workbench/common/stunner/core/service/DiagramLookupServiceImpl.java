package org.kie.workbench.common.stunner.core.service;

import javax.enterprise.context.Dependent;

import org.kie.workbench.common.stunner.core.lookup.diagram.DiagramLookupRequest;
import org.kie.workbench.common.stunner.core.lookup.diagram.DiagramRepresentation;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 8/27/21
 */
@Dependent
public class DiagramLookupServiceImpl implements DiagramLookupService {

    @Override
    public LookupResponse<DiagramRepresentation> lookup(DiagramLookupRequest request) {
        throw new Error(getClass().getCanonicalName() +".lookup");
    }
}

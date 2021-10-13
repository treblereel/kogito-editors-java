package org.kie.workbench.common.stunner.shapes.def.picture;

import javax.enterprise.context.ApplicationScoped;

import org.gwtproject.safehtml.shared.SafeUri;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 10/6/21
 */
@ApplicationScoped
public class StubPictureProvider implements PictureProvider {

    @Override
    public SafeUri getThumbnailUri(Object source) {
        return null;
    }

    @Override
    public Class getSourceType() {
        return null;
    }

    @Override
    public boolean thumbFor(Object source) {
        return false;
    }
}

package org.uberfire.client.resources;

import org.gwtproject.dom.client.StyleInjector;
import org.gwtproject.i18n.shared.cldr.LocaleInfo;
import org.gwtproject.resources.client.ResourcePrototype;

public class WorkbenchResources_default_InlineClientBundleGenerator implements org.uberfire.client.resources.WorkbenchResources {
    private static WorkbenchResources_default_InlineClientBundleGenerator _instance0 = new WorkbenchResources_default_InlineClientBundleGenerator();
    private void CSSInitializer() {
        CSS = new org.uberfire.client.resources.WorkbenchCss() {
            private boolean injected;
            public boolean ensureInjected() {
                if (!injected) {
                    injected = true;
                    StyleInjector.inject(getText());
                    return true;
                }
                return false;
            }
            public String getName() {
                return "CSS";
            }
            public String getText() {
                return LocaleInfo.getCurrentLocale().isRTL() ? ((".GIYSKH5CBL{border:" + ("0")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";z-index:" + ("100000")  + ";}.uf-scroll-panel{height:" + ("100%")  + ";width:" + ("100%")  + ";}.navbar-fixed-top,.navbar-fixed-bottom{position:" + ("static")  + " !important;}.uf-no-select{-webkit-user-select:" + ("none")  + ";-moz-user-select:" + ("none")  + ";-ms-user-select:" + ("none")  + ";user-select:") + (("none")  + ";}.uf-perspective-container,.uf-perspective-row-12{height:" + ("100%")  + ";}.uf-perspective-row-11{height:" + ("91.666664%")  + ";}.uf-perspective-row-10{height:" + ("83.333336%")  + ";}.uf-perspective-row-9{height:" + ("75%")  + ";}.uf-perspective-row-8{height:" + ("66.666664%")  + ";}.uf-perspective-row-7{height:" + ("58.333332%")  + ";}.uf-perspective-row-6{height:" + ("50%")  + ";}.uf-perspective-row-5{height:" + ("41.666668%")  + ";}.uf-perspective-row-4{height:" + ("33.333332%")  + ";}.uf-perspective-row-3{height:" + ("25%") ) + (";}.uf-perspective-row-2{height:" + ("16.666666%")  + ";}.uf-perspective-row-1{height:" + ("8.333333%")  + ";}.uf-perspective-col{height:" + ("100%")  + ";}.uf-perspective-rendered-col{padding-right:" + ("0")  + ";padding-left:" + ("0")  + ";}.uf-perspective-rendered-row{margin-right:" + ("0")  + ";margin-left:" + ("0")  + ";}.uf-perspective-rendered-container{width:" + ("100%")  + ";max-width:" + ("none")  + ";padding:" + ("0")  + ";}.uf-le-overflow{overflow:") + (("auto")  + ";}")) : ((".GIYSKH5CBL{border:" + ("0")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";z-index:" + ("100000")  + ";}.uf-scroll-panel{height:" + ("100%")  + ";width:" + ("100%")  + ";}.navbar-fixed-top,.navbar-fixed-bottom{position:" + ("static")  + " !important;}.uf-no-select{-webkit-user-select:" + ("none")  + ";-moz-user-select:" + ("none")  + ";-ms-user-select:" + ("none")  + ";user-select:") + (("none")  + ";}.uf-perspective-container,.uf-perspective-row-12{height:" + ("100%")  + ";}.uf-perspective-row-11{height:" + ("91.666664%")  + ";}.uf-perspective-row-10{height:" + ("83.333336%")  + ";}.uf-perspective-row-9{height:" + ("75%")  + ";}.uf-perspective-row-8{height:" + ("66.666664%")  + ";}.uf-perspective-row-7{height:" + ("58.333332%")  + ";}.uf-perspective-row-6{height:" + ("50%")  + ";}.uf-perspective-row-5{height:" + ("41.666668%")  + ";}.uf-perspective-row-4{height:" + ("33.333332%")  + ";}.uf-perspective-row-3{height:" + ("25%") ) + (";}.uf-perspective-row-2{height:" + ("16.666666%")  + ";}.uf-perspective-row-1{height:" + ("8.333333%")  + ";}.uf-perspective-col{height:" + ("100%")  + ";}.uf-perspective-rendered-col{padding-left:" + ("0")  + ";padding-right:" + ("0")  + ";}.uf-perspective-rendered-row{margin-left:" + ("0")  + ";margin-right:" + ("0")  + ";}.uf-perspective-rendered-container{width:" + ("100%")  + ";max-width:" + ("none")  + ";padding:" + ("0")  + ";}.uf-le-overflow{overflow:") + (("auto")  + ";}"));
            }
            public java.lang.String notification() {
                return "GIYSKH5CBL";
            }
        }
        ;
    }
    private static class CSSInitializer {
        static {
            _instance0.CSSInitializer();
        }
        static org.uberfire.client.resources.WorkbenchCss get() {
            return CSS;
        }
    }
    public org.uberfire.client.resources.WorkbenchCss CSS() {
        return CSSInitializer.get();
    }
    private static java.util.HashMap<java.lang.String, ResourcePrototype> resourceMap;
    private static org.uberfire.client.resources.WorkbenchCss CSS;

    public ResourcePrototype[] getResources() {
        return new ResourcePrototype[] {
                CSS(),
        };
    }
    public ResourcePrototype getResource(String name) {
               if (resourceMap == null) {
                resourceMap = new java.util.HashMap<java.lang.String, ResourcePrototype>();
                resourceMap.put("CSS", CSS());
            }
            return resourceMap.get(name);
    }
}

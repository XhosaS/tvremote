package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum oij {
    COMPONENT_MATERIALIZATION("ComponentMaterialization"),
    TEMPLATE_FETCHING("TemplateFetching"),
    TEMPLATE_RESOLUTION("TemplateResolution"),
    PB_TO_FB("PbToFb"),
    ROOT_PREPARATION("RootPreparation"),
    FIRST_ROOT_PREPARATION("FirstRootPreparation"),
    FIRST_ROOT_MATERIALIZATION("FirstRootMaterialization"),
    FIRST_ROOT_MEASUREMENT("FirstRootMeasurement"),
    ROOT_PERFORM_LAYOUT("RootPerformLayout"),
    ROOT_ON_MEASURE("RootOnMeasure"),
    ROOT_MOUNTING("RootMounting"),
    ELEMENTS_LIFECYCLE_CREATE_DRAW("ElementsLifecycleCreateDraw"),
    ELEMENTS_LIFECYCLE_SET_DRAW("ElementsLifecycleSetDraw"),
    COMMAND_EXECUTION("CommandExecution"),
    NATIVE_LIBRARY_LOAD("NativeLibLoading"),
    NATIVE_LIBRARY_CHECK("NativeLibChecking"),
    FUT_PROCESSING("FrameworkUpdateTransportProcessing"),
    PAGE_INITIAL_RENDERING("PageInitialRendering"),
    FEED_SCROLL("FeedScroll"),
    TO_FOREGROUND("ToForeground"),
    TO_BACKGROUND("ToBackground"),
    UNKNOWN("Unknown");

    public final String w;

    oij(String str) {
        this.w = str;
    }
}

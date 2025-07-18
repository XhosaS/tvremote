package androidx.mediarouter.app;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaRouteDialogFactory {
    private static final MediaRouteDialogFactory a = new MediaRouteDialogFactory();

    public static MediaRouteDialogFactory getDefault() {
        return a;
    }

    public MediaRouteChooserDialogFragment onCreateChooserDialogFragment() {
        return new MediaRouteChooserDialogFragment();
    }

    public MediaRouteControllerDialogFragment onCreateControllerDialogFragment() {
        return new MediaRouteControllerDialogFragment();
    }
}

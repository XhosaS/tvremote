package defpackage;

import android.media.MediaRouter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvf extends MediaRouter.VolumeCallback {
    protected final fve a;

    public fvf(fve fveVar) {
        this.a = fveVar;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.l(routeInfo, i);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.m(routeInfo, i);
    }
}

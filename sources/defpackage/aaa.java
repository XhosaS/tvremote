package defpackage;

import android.media.MediaRouter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaa extends MediaRouter.VolumeCallback {
    protected final zz a;

    public aaa(zz zzVar) {
        this.a = zzVar;
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

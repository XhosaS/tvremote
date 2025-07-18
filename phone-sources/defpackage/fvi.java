package defpackage;

import android.media.MediaRouter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvi extends fun {
    private final MediaRouter.RouteInfo a;

    public fvi(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // defpackage.fun
    public final void d(int i) {
        this.a.requestSetVolume(i);
    }

    @Override // defpackage.fun
    public final void f(int i) {
        this.a.requestUpdateVolume(i);
    }
}

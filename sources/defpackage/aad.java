package defpackage;

import android.media.MediaRouter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aad extends zl {
    private final MediaRouter.RouteInfo a;

    public aad(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // defpackage.zl
    public final void b(int i) {
        this.a.requestSetVolume(i);
    }

    @Override // defpackage.zl
    public final void c(int i) {
        this.a.requestUpdateVolume(i);
    }
}

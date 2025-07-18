package defpackage;

import android.content.Context;
import android.media.MediaRouter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aac extends aaf {
    public aac(Context context, aag aagVar) {
        super(context, aagVar);
    }

    @Override // defpackage.aaf
    protected final void n(aps apsVar, ze zeVar) {
        super.n(apsVar, zeVar);
        zeVar.f(((MediaRouter.RouteInfo) apsVar.b).getDeviceType());
    }
}

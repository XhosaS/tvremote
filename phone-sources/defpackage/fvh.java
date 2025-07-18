package defpackage;

import android.content.Context;
import android.media.MediaRouter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvh extends fvk {
    public fvh(Context context, ftw ftwVar) {
        super(context, ftwVar);
    }

    @Override // defpackage.fvk
    protected final void n(ivx ivxVar, fuf fufVar) {
        super.n(ivxVar, fufVar);
        fufVar.f(((MediaRouter.RouteInfo) ivxVar.a).getDeviceType());
    }
}

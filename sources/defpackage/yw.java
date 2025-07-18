package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
final class yw extends MediaRouter2$ControllerCallback {
    final /* synthetic */ zd a;

    public yw(zd zdVar) {
        this.a = zdVar;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.f(routingController);
    }
}

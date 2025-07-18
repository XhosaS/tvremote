package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftx extends MediaRouter2$ControllerCallback {
    final /* synthetic */ fue a;

    public ftx(fue fueVar) {
        this.a = fueVar;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.g(routingController);
    }
}

package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import com.google.android.tv.remote.service.RemoteService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpe extends MediaRouter2$ControllerCallback {
    final /* synthetic */ RemoteService a;

    public bpe(RemoteService remoteService) {
        this.a = remoteService;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.d(RemoteService.i(routingController));
    }
}

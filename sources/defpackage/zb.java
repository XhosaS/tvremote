package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zb extends MediaRouter2$RouteCallback {
    final /* synthetic */ zd a;

    public zb(zd zdVar) {
        this.a = zdVar;
    }

    public final void onRoutesUpdated(List list) {
        this.a.e();
    }
}

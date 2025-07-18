package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class za extends MediaRouter2$RouteCallback {
    final /* synthetic */ zd a;

    public za(zd zdVar) {
        this.a = zdVar;
    }

    public final void onRoutesAdded(List list) {
        this.a.e();
    }

    public final void onRoutesChanged(List list) {
        this.a.e();
    }

    public final void onRoutesRemoved(List list) {
        this.a.e();
    }
}

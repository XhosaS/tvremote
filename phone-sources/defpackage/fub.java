package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fub extends MediaRouter2$RouteCallback {
    final /* synthetic */ fue a;

    public fub(fue fueVar) {
        this.a = fueVar;
    }

    public final void onRoutesAdded(List list) {
        this.a.f();
    }

    public final void onRoutesChanged(List list) {
        this.a.f();
    }

    public final void onRoutesRemoved(List list) {
        this.a.f();
    }
}

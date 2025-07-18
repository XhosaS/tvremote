package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fuc extends MediaRouter2$RouteCallback {
    final /* synthetic */ fue a;

    public fuc(fue fueVar) {
        this.a = fueVar;
    }

    public final void onRoutesUpdated(List list) {
        this.a.f();
    }
}

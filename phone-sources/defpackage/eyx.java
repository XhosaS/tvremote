package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyx implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ ezd a;

    public eyx(ezd ezdVar) {
        this.a = ezdVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.a.h();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.a.h();
    }
}

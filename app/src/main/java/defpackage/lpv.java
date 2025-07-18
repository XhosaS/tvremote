package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lpv extends lpm {
    private final kfv a;

    public lpv(kfv kfvVar) {
        this.a = kfvVar;
    }

    @Override // defpackage.lpm, defpackage.lpo
    public final void e(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        Status statusK = lpy.K(i, bundle);
        if (bundle2 != null) {
            bundle2.getBoolean("rewindable");
            bundle2.getInt("width");
            bundle2.getInt("height");
        }
        this.a.i(new lpx(statusK, parcelFileDescriptor));
    }
}

package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oky extends oks {
    private final nxs a;

    public oky(nxs nxsVar) {
        this.a = nxsVar;
    }

    @Override // defpackage.oks
    public final void b(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        Status statusQ = olb.q(i, bundle);
        if (bundle2 != null) {
            bundle2.getBoolean("rewindable");
            bundle2.getInt("width");
            bundle2.getInt("height");
        }
        this.a.c(new ola(statusQ, parcelFileDescriptor));
    }
}

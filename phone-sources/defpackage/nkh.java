package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nkh {
    final CastDevice a;
    public int b;
    public Bundle c;
    final jys d;

    public nkh(CastDevice castDevice, jys jysVar) {
        ocv.aG(castDevice, "CastDevice parameter cannot be null");
        this.a = castDevice;
        this.d = jysVar;
        this.b = 0;
    }
}

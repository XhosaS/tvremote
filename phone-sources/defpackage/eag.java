package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eag extends eaq {
    public static final String a = edt.Z(1);
    public final float b;

    public eag() {
        this.b = -1.0f;
    }

    @Override // defpackage.eaq
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, 1);
        bundle.putFloat(a, this.b);
        return bundle;
    }

    @Override // defpackage.eaq
    public final boolean b() {
        return this.b != -1.0f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof eag) && this.b == ((eag) obj).b;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public eag(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 100.0f) {
            z = true;
        }
        eci.a(z, "percent must be in the range of [0, 100]");
        this.b = f;
    }
}

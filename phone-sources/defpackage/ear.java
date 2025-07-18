package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ear extends eaq {
    public static final String a = edt.Z(1);
    public static final String b = edt.Z(2);
    public final int c;
    public final float e;

    public ear(int i) {
        eci.a(i > 0, "maxStars must be a positive integer");
        this.c = i;
        this.e = -1.0f;
    }

    @Override // defpackage.eaq
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, 2);
        bundle.putInt(a, this.c);
        bundle.putFloat(b, this.e);
        return bundle;
    }

    @Override // defpackage.eaq
    public final boolean b() {
        return this.e != -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ear)) {
            return false;
        }
        ear earVar = (ear) obj;
        return this.c == earVar.c && this.e == earVar.e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Float.valueOf(this.e));
    }

    public ear(int i, float f) {
        eci.a(i > 0, "maxStars must be a positive integer");
        eci.a(f >= 0.0f && f <= ((float) i), "starRating is out of range [0, maxStars]");
        this.c = i;
        this.e = f;
    }
}

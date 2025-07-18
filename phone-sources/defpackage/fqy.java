package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqy {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public static final String c = edt.Z(2);
    public int d;
    public String e;
    public Bundle f;

    public fqy(int i) {
        this(i, "no error message provided", Bundle.EMPTY);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(a, this.d);
        bundle.putString(b, this.e);
        if (!this.f.isEmpty()) {
            bundle.putBundle(c, this.f);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqy)) {
            return false;
        }
        fqy fqyVar = (fqy) obj;
        return this.d == fqyVar.d && Objects.equals(this.e, fqyVar.e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.d), this.e);
    }

    public fqy(int i, String str, Bundle bundle) {
        boolean z = true;
        if (i >= 0) {
            if (i == 1) {
                i = 1;
            } else {
                z = false;
            }
        }
        a.H(z);
        this.d = i;
        this.e = str;
        this.f = bundle;
    }
}

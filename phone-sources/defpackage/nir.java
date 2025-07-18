package defpackage;

import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class nir implements nwi {
    public static final nir a = new nir(new niq());
    public final String b = null;
    public final boolean c;
    public final String d;

    public nir(niq niqVar) {
        this.c = niqVar.a.booleanValue();
        this.d = niqVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nir)) {
            return false;
        }
        nir nirVar = (nir) obj;
        String str = nirVar.b;
        return a.Q(null, null) && this.c == nirVar.c && a.Q(this.d, nirVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.c), this.d});
    }
}

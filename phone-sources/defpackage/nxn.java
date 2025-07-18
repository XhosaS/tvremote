package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxn {
    private final int a;
    private final nwi b;
    private final String c;
    private final jzs d;

    public nxn(jzs jzsVar, nwi nwiVar, String str) {
        this.d = jzsVar;
        this.b = nwiVar;
        this.c = str;
        this.a = Arrays.hashCode(new Object[]{jzsVar, nwiVar, str});
    }

    public final String a() {
        return (String) this.d.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nxn)) {
            return false;
        }
        nxn nxnVar = (nxn) obj;
        return a.Q(this.d, nxnVar.d) && a.Q(this.b, nxnVar.b) && a.Q(this.c, nxnVar.c);
    }

    public final int hashCode() {
        return this.a;
    }
}

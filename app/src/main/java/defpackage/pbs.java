package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbs {
    public final abwk a;
    public final Object b;

    public pbs(abwk abwkVar, Object obj) {
        int i = ((abxc) abwkVar).d.b;
        boolean z = false;
        if (i >= 200000000 && i < 300000000) {
            z = true;
        }
        yqw.A(z);
        this.a = abwkVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pbs) {
            pbs pbsVar = (pbs) obj;
            if (this.a.equals(pbsVar.a) && this.b.equals(pbsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}

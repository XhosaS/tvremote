package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckj {
    public final cfy a;
    public final long b;
    private final chb c = null;

    public /* synthetic */ ckj(cfy cfyVar, long j) {
        this.a = cfyVar;
        this.b = ccf.P(j, cfyVar.b.length());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckj)) {
            return false;
        }
        long j = this.b;
        ckj ckjVar = (ckj) obj;
        long j2 = ckjVar.b;
        long j3 = chb.a;
        if (a.s(j, j2)) {
            chb chbVar = ckjVar.c;
            if (yks.e(null, null) && yks.e(this.a, ckjVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = chb.a;
        return (iHashCode + a.k(this.b)) * 31;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) chb.f(this.b)) + ", composition=null)";
    }
}

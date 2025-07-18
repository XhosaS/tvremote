package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssj implements ssl {
    public final int a;
    public final ssm b;
    public final ruo c;

    public ssj(int i, ssm ssmVar, ruo ruoVar) {
        ruoVar.getClass();
        this.a = i;
        this.b = ssmVar;
        this.c = ruoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssj)) {
            return false;
        }
        ssj ssjVar = (ssj) obj;
        return this.a == ssjVar.a && agvy.c(this.b, ssjVar.b) && agvy.c(this.c, ssjVar.c);
    }

    public final int hashCode() {
        int iB;
        int iHashCode = (this.a * 31) + this.b.hashCode();
        ruo ruoVar = this.c;
        if ((ruoVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(ruoVar.getClass()).b(ruoVar);
        } else {
            int iB2 = ruoVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(ruoVar.getClass()).b(ruoVar);
                ruoVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return (iHashCode * 31) + iB;
    }

    public final String toString() {
        return "PreStart(routeToken=" + this.a + ", session=" + this.b + ", sourceParams=" + this.c + ")";
    }
}

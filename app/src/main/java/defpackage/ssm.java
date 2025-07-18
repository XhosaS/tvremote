package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssm {
    public final int a;
    public final rvf b;
    public final Integer c = null;

    public ssm(int i, rvf rvfVar) {
        this.a = i;
        this.b = rvfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssm)) {
            return false;
        }
        ssm ssmVar = (ssm) obj;
        if (this.a != ssmVar.a || !agvy.c(this.b, ssmVar.b)) {
            return false;
        }
        Integer num = ssmVar.c;
        return agvy.c(null, null);
    }

    public final int hashCode() {
        int iB;
        rvf rvfVar = this.b;
        if ((rvfVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(rvfVar.getClass()).b(rvfVar);
        } else {
            int iB2 = rvfVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(rvfVar.getClass()).b(rvfVar);
                rvfVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return ((this.a * 31) + iB) * 31;
    }

    public final String toString() {
        return "AudioSourceSessionData(sessionToken=" + this.a + ", params=" + this.b + ", parentToken=null)";
    }
}

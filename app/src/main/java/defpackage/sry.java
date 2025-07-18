package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sry {
    public final int a;
    public final sgo b;

    public sry(int i, sgo sgoVar) {
        this.a = i;
        this.b = sgoVar;
    }

    public final String a() {
        return "client(token(" + this.a + "), " + szx.d(this.b) + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sry)) {
            return false;
        }
        sry sryVar = (sry) obj;
        return this.a == sryVar.a && agvy.c(this.b, sryVar.b);
    }

    public final int hashCode() {
        int iB;
        sgo sgoVar = this.b;
        if ((sgoVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(sgoVar.getClass()).b(sgoVar);
        } else {
            int iB2 = sgoVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(sgoVar.getClass()).b(sgoVar);
                sgoVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return (this.a * 31) + iB;
    }

    public final String toString() {
        return "AudioSourceClientData(clientToken=" + this.a + ", clientInfo=" + this.b + ")";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxb {
    public final int a;
    public final rvc b;
    public final boolean c;

    public sxb() {
        this(null);
    }

    public final String a() {
        sgo sgoVar = this.b.c;
        if (sgoVar == null) {
            sgoVar = sgo.a;
        }
        int i = this.a;
        sgoVar.getClass();
        return "client(token(" + i + "), " + szx.d(sgoVar) + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxb)) {
            return false;
        }
        sxb sxbVar = (sxb) obj;
        return this.a == sxbVar.a && agvy.c(this.b, sxbVar.b) && this.c == sxbVar.c;
    }

    public final int hashCode() {
        int iB;
        rvc rvcVar = this.b;
        if ((rvcVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(rvcVar.getClass()).b(rvcVar);
        } else {
            int iB2 = rvcVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(rvcVar.getClass()).b(rvcVar);
                rvcVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return (((this.a * 31) + iB) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "AudioRouteClientData(clientToken=" + this.a + ", params=" + this.b + ", isInactive=" + this.c + ")";
    }

    public sxb(int i, rvc rvcVar, boolean z) {
        this.a = i;
        this.b = rvcVar;
        this.c = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sxb(byte[] bArr) {
        this(-1, ruu.a(new rvb()), true);
        rvc rvcVar = rvc.a;
    }
}

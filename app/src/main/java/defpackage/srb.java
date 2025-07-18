package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srb implements sra {
    public final rux a;
    public final sqx b;
    public final sru c;
    public final int d;
    public final Integer e = null;
    public final ahdl f;
    private final rvf g;
    private final boolean h;

    public srb(rux ruxVar, sqx sqxVar, sru sruVar, int i, rvf rvfVar, boolean z, ahdl ahdlVar) {
        this.a = ruxVar;
        this.b = sqxVar;
        this.c = sruVar;
        this.d = i;
        this.g = rvfVar;
        this.h = z;
        this.f = ahdlVar;
    }

    @Override // defpackage.sra
    public final int a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srb)) {
            return false;
        }
        srb srbVar = (srb) obj;
        if (!agvy.c(this.a, srbVar.a) || !agvy.c(this.b, srbVar.b) || !agvy.c(this.c, srbVar.c) || this.d != srbVar.d) {
            return false;
        }
        Integer num = srbVar.e;
        return agvy.c(null, null) && agvy.c(this.g, srbVar.g) && this.h == srbVar.h && agvy.c(this.f, srbVar.f);
    }

    public final int hashCode() {
        int iB;
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        rvf rvfVar = this.g;
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
        return (((((((iHashCode * 31) + this.d) * 961) + iB) * 31) + (true != this.h ? 1237 : 1231)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "AudioSessionDataInternal(session=" + this.a + ", client=" + this.b + ", route=" + this.c + ", sessionToken=" + this.d + ", parentToken=null, params=" + this.g + ", isInactive=" + this.h + ", routeDisconnectJob=" + this.f + ")";
    }
}

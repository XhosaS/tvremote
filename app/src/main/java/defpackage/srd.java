package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srd implements sra {
    public final rux a;
    public final sqx b;
    public final sru c;
    public final int d;
    public final Integer e;
    public final rvf f;
    public final boolean g;

    public srd(rux ruxVar, sqx sqxVar, sru sruVar, int i, rvf rvfVar, boolean z) {
        sqxVar.getClass();
        sruVar.getClass();
        rvfVar.getClass();
        this.a = ruxVar;
        this.b = sqxVar;
        this.c = sruVar;
        this.d = i;
        this.e = null;
        this.f = rvfVar;
        this.g = z;
    }

    @Override // defpackage.sra
    public final int a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srd)) {
            return false;
        }
        srd srdVar = (srd) obj;
        if (!agvy.c(this.a, srdVar.a) || !agvy.c(this.b, srdVar.b) || !agvy.c(this.c, srdVar.c) || this.d != srdVar.d) {
            return false;
        }
        Integer num = srdVar.e;
        return agvy.c(null, null) && agvy.c(this.f, srdVar.f) && this.g == srdVar.g;
    }

    public final int hashCode() {
        int iB;
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        rvf rvfVar = this.f;
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
        return (((((iHashCode * 31) + this.d) * 961) + iB) * 31) + (true != this.g ? 1237 : 1231);
    }

    public final String toString() {
        return "AudioSessionDataSimple(session=" + this.a + ", client=" + this.b + ", route=" + this.c + ", sessionToken=" + this.d + ", parentToken=null, params=" + this.f + ", isInactive=" + this.g + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ srd(rux ruxVar, sqx sqxVar, sru sruVar, int i, rvf rvfVar, boolean z, int i2) {
        sqx sqxVar2 = (i2 & 2) != 0 ? new sqx(null) : sqxVar;
        sru sruVar2 = (i2 & 4) != 0 ? new sru(null) : sruVar;
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 32) != 0) {
            rvf rvfVar2 = rvf.a;
            rvfVar = rvn.a(new rve());
        }
        this(ruxVar, sqxVar2, sruVar2, i3, rvfVar, (i2 & 64) != 0 ? i3 == -1 : z);
    }
}

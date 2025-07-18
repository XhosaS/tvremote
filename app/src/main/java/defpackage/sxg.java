package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxg implements sxe {
    public final swv a;
    public final ruy b;
    public final int c;
    public final Integer d = null;
    public final sxb e;
    public final rvt f;
    public final boolean g;
    public final sjs h;
    private final boolean i;
    private final boolean j;

    public sxg(swv swvVar, ruy ruyVar, int i, sxb sxbVar, rvt rvtVar, boolean z, sjs sjsVar, boolean z2, boolean z3) {
        this.a = swvVar;
        this.b = ruyVar;
        this.c = i;
        this.e = sxbVar;
        this.f = rvtVar;
        this.g = z;
        this.h = sjsVar;
        this.i = z2;
        this.j = z3;
    }

    @Override // defpackage.sxe
    public final int a() {
        return this.c;
    }

    @Override // defpackage.sxe
    public final sjs b() {
        return this.h;
    }

    @Override // defpackage.sxe
    public final /* synthetic */ sru c() {
        return sxd.a(this);
    }

    @Override // defpackage.sxe
    public final sxb d() {
        return this.e;
    }

    @Override // defpackage.sxe
    public final boolean e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxg)) {
            return false;
        }
        sxg sxgVar = (sxg) obj;
        if (!agvy.c(this.a, sxgVar.a) || !agvy.c(this.b, sxgVar.b) || this.c != sxgVar.c) {
            return false;
        }
        Integer num = sxgVar.d;
        return agvy.c(null, null) && agvy.c(this.e, sxgVar.e) && agvy.c(this.f, sxgVar.f) && this.g == sxgVar.g && agvy.c(this.h, sxgVar.h) && this.i == sxgVar.i && this.j == sxgVar.j;
    }

    @Override // defpackage.sxe
    public final boolean f() {
        return this.j;
    }

    @Override // defpackage.sxe
    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        int iB;
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 961) + this.e.hashCode();
        rvt rvtVar = this.f;
        if ((rvtVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(rvtVar.getClass()).b(rvtVar);
        } else {
            int iB2 = rvtVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(rvtVar.getClass()).b(rvtVar);
                rvtVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return (((((((((iHashCode * 31) + iB) * 31) + sxf.a(this.g)) * 31) + this.h.hashCode()) * 31) + sxf.a(this.i)) * 31) + sxf.a(this.j);
    }

    public final String toString() {
        return "AudioRouteSessionDataInternal(audioRoute=" + this.a + ", session=" + this.b + ", routeToken=" + this.c + ", parentToken=null, client=" + this.e + ", params=" + this.f + ", isInactive=" + this.g + ", routeData=" + this.h + ", default=" + this.i + ", zeroStarts=" + this.j + ")";
    }
}

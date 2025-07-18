package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxi implements sxe {
    private final ruy a;
    private final sjs d;
    private final sxb e;
    private final rvt f;
    private final int b = -1;
    private final Integer c = null;
    private final boolean g = true;
    private final boolean h = false;
    private final boolean i = true;

    public sxi(ruy ruyVar, sjs sjsVar, sxb sxbVar, rvt rvtVar) {
        this.a = ruyVar;
        this.d = sjsVar;
        this.e = sxbVar;
        this.f = rvtVar;
    }

    public static /* synthetic */ sxi h(sxi sxiVar, sxb sxbVar) {
        return new sxi(sxiVar.a, sxiVar.d, sxbVar, sxiVar.f);
    }

    @Override // defpackage.sxe
    public final int a() {
        return -1;
    }

    @Override // defpackage.sxe
    public final sjs b() {
        return this.d;
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
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxi)) {
            return false;
        }
        sxi sxiVar = (sxi) obj;
        if (!agvy.c(this.a, sxiVar.a)) {
            return false;
        }
        int i = sxiVar.b;
        Integer num = sxiVar.c;
        if (!agvy.c(null, null) || !agvy.c(this.d, sxiVar.d) || !agvy.c(this.e, sxiVar.e) || !agvy.c(this.f, sxiVar.f)) {
            return false;
        }
        boolean z = sxiVar.g;
        boolean z2 = sxiVar.h;
        boolean z3 = sxiVar.i;
        return true;
    }

    @Override // defpackage.sxe
    public final boolean f() {
        return true;
    }

    @Override // defpackage.sxe
    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        int iB;
        int iHashCode = (((((this.a.hashCode() * 31) - 1) * 961) + this.d.hashCode()) * 31) + this.e.hashCode();
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
        return (((((((iHashCode * 31) + iB) * 31) + sxh.a(true)) * 31) + sxh.a(false)) * 31) + sxh.a(true);
    }

    public final String toString() {
        return "AudioRouteSessionDataSimple(session=" + this.a + ", routeToken=-1, parentToken=null, routeData=" + this.d + ", client=" + this.e + ", params=" + this.f + ", isInactive=true, default=false, zeroStarts=true)";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwd implements Comparable {
    public final String a;
    public final kvm b;
    public final kvn c;
    public final kwb d;
    public final boolean e;
    public final boolean f;
    public final kwc g;
    public final vwe h;
    public final vwe i;
    public final tst j;
    public final tst k;
    public final tst l;
    public final int m;
    private final boolean n;

    public kwd() {
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        kwd kwdVar = (kwd) obj;
        int iCompare = Boolean.compare(!this.f, !kwdVar.f);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.d.e, kwdVar.d.e);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        kvm kvmVar = this.b;
        int iCompare3 = Integer.compare(kvmVar.g, kwdVar.b.g);
        if (iCompare3 != 0) {
            return iCompare3;
        }
        if (kvmVar == kvm.TYPE_PURCHASE) {
            int iCompare4 = Integer.compare(this.g.g, kwdVar.g.g);
            if (iCompare4 != 0) {
                return iCompare4;
            }
        }
        int iCompare5 = Integer.compare(this.c.g, kwdVar.c.g);
        if (iCompare5 != 0) {
            return iCompare5;
        }
        if (kvmVar == kvm.TYPE_RENTAL) {
            int iA = vxf.a((vwe) this.j.c(), (vwe) kwdVar.j.c());
            if (iA != 0) {
                return iA;
            }
        }
        return vxf.a(this.h, kwdVar.h);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwd) {
            kwd kwdVar = (kwd) obj;
            if (this.a.equals(kwdVar.a) && this.b.equals(kwdVar.b) && this.c.equals(kwdVar.c) && this.d.equals(kwdVar.d) && this.e == kwdVar.e && this.f == kwdVar.f) {
                int i = this.m;
                int i2 = kwdVar.m;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.g.equals(kwdVar.g) && this.h.equals(kwdVar.h) && this.i.equals(kwdVar.i) && this.j.equals(kwdVar.j) && this.k.equals(kwdVar.k) && this.n == kwdVar.n && this.l.equals(kwdVar.l)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        int i = this.m;
        a.bl(i);
        int iHashCode2 = (((((((iHashCode * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ i) * 1000003) ^ this.g.hashCode();
        vwe vweVar = this.h;
        if (vweVar.A()) {
            iJ = vweVar.j();
        } else {
            int iJ3 = vweVar.M;
            if (iJ3 == 0) {
                iJ3 = vweVar.j();
                vweVar.M = iJ3;
            }
            iJ = iJ3;
        }
        int i2 = ((iHashCode2 * 1000003) ^ iJ) * 1000003;
        vwe vweVar2 = this.i;
        if (vweVar2.A()) {
            iJ2 = vweVar2.j();
        } else {
            int iJ4 = vweVar2.M;
            if (iJ4 == 0) {
                iJ4 = vweVar2.j();
                vweVar2.M = iJ4;
            }
            iJ2 = iJ4;
        }
        return ((((((((i2 ^ iJ2) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ (true == this.n ? 1231 : 1237)) * 1000003) ^ this.l.hashCode();
    }

    public final String toString() {
        int i = this.m;
        kwb kwbVar = this.d;
        kvn kvnVar = this.c;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(kvnVar);
        String strValueOf3 = String.valueOf(kwbVar);
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "MOVIES_ANYWHERE" : "YOUTUBE" : "PLAY" : "UNKNOWN";
        boolean z = this.f;
        boolean z2 = this.e;
        String str2 = this.a;
        kwc kwcVar = this.g;
        vwe vweVar = this.h;
        vwe vweVar2 = this.i;
        tst tstVar = this.j;
        tst tstVar2 = this.k;
        boolean z3 = this.n;
        tst tstVar3 = this.l;
        return "PurchaseDetails{purchaseId=" + str2 + ", offerType=" + strValueOf + ", quality=" + strValueOf2 + ", purchaseStatus=" + strValueOf3 + ", isBonusContent=" + z2 + ", isHidden=" + z + ", purchaseSource=" + str + ", shareType=" + String.valueOf(kwcVar) + ", purchaseTimestamp=" + String.valueOf(vweVar) + ", addedToLibraryTimestamp=" + String.valueOf(vweVar2) + ", rentalExpirationTimestamp=" + String.valueOf(tstVar) + ", rentalShortTimer=" + String.valueOf(tstVar2) + ", wasUpgraded=" + z3 + ", upgradeTimestamp=" + String.valueOf(tstVar3) + "}";
    }

    public kwd(String str, kvm kvmVar, kvn kvnVar, kwb kwbVar, boolean z, boolean z2, int i, kwc kwcVar, vwe vweVar, vwe vweVar2, tst tstVar, tst tstVar2, boolean z3, tst tstVar3) {
        this.a = str;
        this.b = kvmVar;
        this.c = kvnVar;
        this.d = kwbVar;
        this.e = z;
        this.f = z2;
        this.m = i;
        this.g = kwcVar;
        this.h = vweVar;
        this.i = vweVar2;
        this.j = tstVar;
        this.k = tstVar2;
        this.n = z3;
        this.l = tstVar3;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrf implements vre {
    public final vrg a;
    public final vrg b;
    public final int c;
    private final vro d;

    public vrf(vrg vrgVar, vrg vrgVar2, int i) {
        vrgVar.getClass();
        vrgVar2.getClass();
        this.a = vrgVar;
        this.b = vrgVar2;
        this.c = i;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrf)) {
            return false;
        }
        vrf vrfVar = (vrf) obj;
        if (!yks.e(this.a, vrfVar.a) || !yks.e(this.b, vrfVar.b) || this.c != vrfVar.c) {
            return false;
        }
        vro vroVar = vrfVar.d;
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        int i = this.c;
        a.bw(i);
        return ((iHashCode * 31) + i) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailingContentPair(first=");
        sb.append(this.a);
        sb.append(", second=");
        sb.append(this.b);
        sb.append(", spacing=");
        sb.append((Object) (this.c != 1 ? "MEDIUM_8" : "SMALL_4"));
        sb.append(", background=null)");
        return sb.toString();
    }
}

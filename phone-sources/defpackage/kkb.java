package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkb {
    public final itk a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final wfo e;

    public kkb(itk itkVar, boolean z, boolean z2, boolean z3, wfo wfoVar) {
        itkVar.getClass();
        this.a = itkVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = wfoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkb)) {
            return false;
        }
        kkb kkbVar = (kkb) obj;
        return yks.e(this.a, kkbVar.a) && this.b == kkbVar.b && this.c == kkbVar.c && this.d == kkbVar.d && yks.e(this.e, kkbVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        wfo wfoVar = this.e;
        return ((((((iHashCode + a.q(this.b)) * 31) + a.q(this.c)) * 31) + a.q(this.d)) * 31) + (wfoVar == null ? 0 : wfoVar.hashCode());
    }

    public final String toString() {
        return "Config(mediaDeviceController=" + this.a + ", is3p=" + this.b + ", isBc25EnhancementsEnabled=" + this.c + ", isEntityDetailsPageAction=" + this.d + ", dynamicScheme=" + this.e + ")";
    }

    public /* synthetic */ kkb(itk itkVar, boolean z, boolean z2, int i) {
        this(itkVar, z, ((i & 4) == 0) & z2, false, null);
    }
}

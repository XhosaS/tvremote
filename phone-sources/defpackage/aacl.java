package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aacl implements aacg {
    protected aacl() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        aacg aacgVar = (aacg) obj;
        if (this == aacgVar) {
            return 0;
        }
        long jA = aacgVar.a();
        long jA2 = a();
        if (jA2 == jA) {
            return 0;
        }
        return jA2 < jA ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aacg)) {
            return false;
        }
        aacg aacgVar = (aacg) obj;
        return a() == aacgVar.a() && vxr.aA(b(), aacgVar.b());
    }

    public final int hashCode() {
        return ((int) (a() ^ (a() >>> 32))) + b().hashCode();
    }

    public final String toString() {
        return aafe.b.a(this);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aacm implements Comparable, aach {
    protected aacm() {
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(aach aachVar) {
        throw null;
    }

    public int b(aabo aaboVar) {
        throw null;
    }

    public abstract aabm e(int i, aabk aabkVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aach)) {
            return false;
        }
        aach aachVar = (aach) obj;
        aachVar.g();
        for (int i = 0; i < 3; i++) {
            if (c(i) != aachVar.c(i) || h(i) != aachVar.h(i)) {
                return false;
            }
        }
        return vxr.aA(d(), aachVar.d());
    }

    public boolean f(aabo aaboVar) {
        throw null;
    }

    @Override // defpackage.aach
    public final aabo h(int i) {
        return e(i, d()).r();
    }

    public int hashCode() {
        int iC = 157;
        for (int i = 0; i < 3; i++) {
            iC = (((iC * 23) + c(i)) * 23) + h(i).hashCode();
        }
        return iC + d().hashCode();
    }
}

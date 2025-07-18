package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aacb extends aacp implements Serializable, aach {
    private static final Set c;
    private static final long serialVersionUID = -8775358157899L;
    public final long a;
    public final aabk b;
    private transient int d;

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add(aabw.g);
        hashSet.add(aabw.f);
        hashSet.add(aabw.e);
        hashSet.add(aabw.c);
        hashSet.add(aabw.d);
        hashSet.add(aabw.b);
        hashSet.add(aabw.a);
    }

    public aacb() {
        this(aabp.a(), aadl.P());
    }

    private Object readResolve() {
        aabk aabkVar = this.b;
        return aabkVar == null ? new aacb(this.a, aadl.o) : !aabs.b.equals(aabkVar.z()) ? new aacb(this.a, aabkVar.a()) : this;
    }

    @Override // defpackage.aacm
    /* renamed from: a */
    public final int compareTo(aach aachVar) {
        if (this == aachVar) {
            return 0;
        }
        if (aachVar instanceof aacb) {
            aacb aacbVar = (aacb) aachVar;
            if (this.b.equals(aacbVar.b)) {
                long j = this.a;
                long j2 = aacbVar.a;
                if (j < j2) {
                    return -1;
                }
                return j == j2 ? 0 : 1;
            }
        }
        if (this == aachVar) {
            return 0;
        }
        aachVar.g();
        for (int i = 0; i < 3; i++) {
            if (h(i) != aachVar.h(i)) {
                throw new ClassCastException("ReadablePartial objects must have matching field types");
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            if (c(i2) > aachVar.c(i2)) {
                return 1;
            }
            if (c(i2) < aachVar.c(i2)) {
                return -1;
            }
        }
        return 0;
    }

    @Override // defpackage.aacm, defpackage.aach
    public final int b(aabo aaboVar) {
        if (f(aaboVar)) {
            return aaboVar.a(this.b).a(this.a);
        }
        throw new IllegalArgumentException("Field '" + aaboVar.y + "' is not supported");
    }

    @Override // defpackage.aach
    public final int c(int i) {
        if (i == 0) {
            aabk aabkVar = this.b;
            return aabkVar.w().a(this.a);
        }
        if (i == 1) {
            aabk aabkVar2 = this.b;
            return aabkVar2.q().a(this.a);
        }
        if (i != 2) {
            throw new IndexOutOfBoundsException(a.cf(i, "Invalid index: "));
        }
        aabk aabkVar3 = this.b;
        return aabkVar3.f().a(this.a);
    }

    @Override // defpackage.aacm, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((aach) obj);
    }

    @Override // defpackage.aach
    public final aabk d() {
        return this.b;
    }

    @Override // defpackage.aacm
    public final aabm e(int i, aabk aabkVar) {
        if (i == 0) {
            return aabkVar.w();
        }
        if (i == 1) {
            return aabkVar.q();
        }
        if (i == 2) {
            return aabkVar.f();
        }
        throw new IndexOutOfBoundsException(a.cf(i, "Invalid index: "));
    }

    @Override // defpackage.aacm
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aacb) {
            aacb aacbVar = (aacb) obj;
            if (this.b.equals(aacbVar.b)) {
                return this.a == aacbVar.a;
            }
        }
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
        return vxr.aA(this.b, aachVar.d());
    }

    @Override // defpackage.aacm, defpackage.aach
    public final boolean f(aabo aaboVar) {
        Set set = c;
        aabw aabwVar = ((aabn) aaboVar).a;
        if (!set.contains(aabwVar)) {
            aabk aabkVar = this.b;
            if (aabwVar.a(aabkVar).e() < aabkVar.B().e()) {
                return false;
            }
        }
        return aaboVar.a(this.b).w();
    }

    @Override // defpackage.aacm
    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int iC = 157;
        for (int i2 = 0; i2 < 3; i2++) {
            iC = (((iC * 23) + c(i2)) * 23) + h(i2).hashCode();
        }
        int iHashCode = iC + this.b.hashCode();
        this.d = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        aaej aaejVar = aafe.a;
        StringBuilder sb = new StringBuilder(aaejVar.d().b());
        try {
            aaejVar.d().d(sb, this, null);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public aacb(int i, int i2, int i3) {
        aabk aabkVarA = aabp.c(aadl.o).a();
        long jM = aabkVarA.M(i, i2, i3);
        this.b = aabkVarA;
        this.a = jM;
    }

    public aacb(long j, aabk aabkVar) {
        aabk aabkVarC = aabp.c(aabkVar);
        aabs aabsVarZ = aabkVarC.z();
        aabs aabsVarN = aabs.b;
        aabsVarN = aabsVarN == null ? aabs.n() : aabsVarN;
        j = aabsVarN != aabsVarZ ? aabsVarN.p(aabsVarZ.j(j), j) : j;
        aabk aabkVarA = aabkVarC.a();
        this.a = aabkVarA.f().g(j);
        this.b = aabkVarA;
    }

    @Override // defpackage.aach
    public final void g() {
    }
}

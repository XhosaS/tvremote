package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaeg extends aabu implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final aabw b;

    private aaeg(aabw aabwVar) {
        this.b = aabwVar;
    }

    public static synchronized aaeg j(aabw aabwVar) {
        aaeg aaegVar;
        HashMap map = a;
        if (map == null) {
            a = new HashMap(7);
            aaegVar = null;
        } else {
            aaegVar = (aaeg) map.get(aabwVar);
        }
        if (aaegVar != null) {
            return aaegVar;
        }
        aaeg aaegVar2 = new aaeg(aabwVar);
        a.put(aabwVar, aaegVar2);
        return aaegVar2;
    }

    private final UnsupportedOperationException k() {
        return new UnsupportedOperationException(this.b.m.concat(" field is unsupported"));
    }

    private Object readResolve() {
        return j(this.b);
    }

    @Override // defpackage.aabu
    public final int a(long j, long j2) {
        throw k();
    }

    @Override // defpackage.aabu
    public final long b(long j, int i) {
        throw k();
    }

    @Override // defpackage.aabu
    public final long c(long j, long j2) {
        throw k();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // defpackage.aabu
    public final long d(long j, long j2) {
        throw k();
    }

    @Override // defpackage.aabu
    public final long e() {
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaeg)) {
            return false;
        }
        aaeg aaegVar = (aaeg) obj;
        aaegVar.i();
        return aaegVar.i().equals(i());
    }

    @Override // defpackage.aabu
    public final aabw f() {
        return this.b;
    }

    @Override // defpackage.aabu
    public final boolean g() {
        return true;
    }

    @Override // defpackage.aabu
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return i().hashCode();
    }

    public final String i() {
        return this.b.m;
    }

    public final String toString() {
        return "UnsupportedDurationField[" + i() + "]";
    }
}

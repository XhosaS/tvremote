package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jad {
    public final int a;
    public final long b;
    public final int c;
    private final uby d;
    private final ubt e;
    private final vsz f;

    public jad(int i, long j, int i2, uby ubyVar, ubt ubtVar, vsz vszVar) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = ubyVar;
        this.e = ubtVar;
        this.f = vszVar;
    }

    private static final boolean b(ubt ubtVar) {
        return ubtVar == null || yks.e(ubtVar, ubt.a);
    }

    private static final boolean c(uby ubyVar) {
        return ubyVar == null || yks.e(ubyVar, uby.a);
    }

    private static final boolean d(vsz vszVar) {
        return vszVar == null || yks.e(vszVar, vsz.b);
    }

    public final pjs a() {
        uby ubyVar = this.d;
        if (c(ubyVar) && b(this.e) && d(this.f)) {
            return null;
        }
        vvd vvdVar = nbu.b;
        vtw vtwVarM = nbs.a.m();
        vtwVarM.getClass();
        vsz vszVar = this.f;
        if (!d(vszVar)) {
            vszVar.getClass();
            jys.Z(vszVar, vtwVarM);
        }
        if (!c(ubyVar) || !b(this.e)) {
            vtw vtwVarM2 = ubz.a.m();
            vtwVarM2.getClass();
            ubt ubtVar = this.e;
            if (!b(ubtVar)) {
                vtw vtwVarM3 = uca.a.m();
                vtwVarM3.getClass();
                ubtVar.getClass();
                tyq.f(ubtVar, vtwVarM3);
                tyq.i(tyq.d(vtwVarM3), vtwVarM2);
            }
            if (!c(ubyVar)) {
                ubyVar.getClass();
                tyq.h(ubyVar, vtwVarM2);
            }
            jys.Y(tyq.g(vtwVarM2), vtwVarM);
        }
        return new pjs(vvdVar, jys.X(vtwVarM));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jad)) {
            return false;
        }
        jad jadVar = (jad) obj;
        return this.a == jadVar.a && this.b == jadVar.b && this.c == jadVar.c && yks.e(this.d, jadVar.d) && yks.e(this.e, jadVar.e) && yks.e(this.f, jadVar.f);
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        uby ubyVar = this.d;
        if (ubyVar == null) {
            iJ = 0;
        } else if (ubyVar.A()) {
            iJ = ubyVar.j();
        } else {
            int iJ3 = ubyVar.M;
            if (iJ3 == 0) {
                iJ3 = ubyVar.j();
                ubyVar.M = iJ3;
            }
            iJ = iJ3;
        }
        long j = this.b;
        int i = this.a;
        int i2 = this.c;
        ubt ubtVar = this.e;
        if (ubtVar == null) {
            iJ2 = 0;
        } else if (ubtVar.A()) {
            iJ2 = ubtVar.j();
        } else {
            int iJ4 = ubtVar.M;
            if (iJ4 == 0) {
                iJ4 = ubtVar.j();
                ubtVar.M = iJ4;
            }
            iJ2 = iJ4;
        }
        int iK = (((((i * 31) + a.k(j)) * 31) + i2) * 31) + iJ;
        vsz vszVar = this.f;
        return (((iK * 31) + iJ2) * 31) + (vszVar != null ? vszVar.hashCode() : 0);
    }

    public final String toString() {
        return "LoggingData(visualElementId=" + this.a + ", dedupeId=" + this.b + ", position=" + this.c + ", clientLoggingData=" + this.d + ", serverLoggingData=" + this.e + ", serverCookieData=" + this.f + ")";
    }

    public /* synthetic */ jad(int i, long j, int i2, uby ubyVar, ubt ubtVar, vsz vszVar, int i3) {
        this(i, (i3 & 2) != 0 ? -1L : j, (i3 & 4) != 0 ? -1 : i2, (i3 & 8) != 0 ? null : ubyVar, (i3 & 16) != 0 ? null : ubtVar, (i3 & 32) != 0 ? null : vszVar);
    }
}

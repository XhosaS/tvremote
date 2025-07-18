package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptc {
    public final ptd a;
    public final int b;

    public ptc() {
        throw null;
    }

    public final vjw a() {
        vtw vtwVarM = vjw.a.m();
        viu viuVarB = this.a.b();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        vjw vjwVar = (vjw) vucVar;
        viuVarB.getClass();
        vjwVar.c = viuVarB;
        int i = 1;
        vjwVar.b |= 1;
        int i2 = this.b;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 1) {
            i = 3;
        } else if (i3 == 2) {
            i = 2;
        }
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vjw vjwVar2 = (vjw) vtwVarM.b;
        vjwVar2.d = i - 1;
        vjwVar2.b |= 2;
        return (vjw) vtwVarM.r();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ptc) {
            ptc ptcVar = (ptc) obj;
            if (this.a.equals(ptcVar.a)) {
                int i = this.b;
                int i2 = ptcVar.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.b;
        a.bl(i);
        return (iHashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "PreferenceEntry{preferenceKey=" + String.valueOf(this.a) + ", preference=" + ocv.bu(this.b) + "}";
    }

    public ptc(ptd ptdVar, int i) {
        this.a = ptdVar;
        this.b = i;
    }
}

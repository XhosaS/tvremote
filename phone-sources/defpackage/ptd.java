package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptd {
    public final String a;
    private final String b;

    public ptd() {
        throw null;
    }

    public static final ptd a(viu viuVar) {
        reb rebVar = new reb((char[]) null);
        rebVar.d(viuVar.c);
        if (!viuVar.d.isEmpty()) {
            rebVar.a = viuVar.d;
        }
        return rebVar.c();
    }

    public final viu b() {
        vtw vtwVarM = viu.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        String str = this.a;
        viu viuVar = (viu) vtwVarM.b;
        str.getClass();
        viuVar.b |= 1;
        viuVar.c = str;
        String str2 = this.b;
        if (!TextUtils.isEmpty(str2)) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            viu viuVar2 = (viu) vtwVarM.b;
            str2.getClass();
            viuVar2.b |= 2;
            viuVar2.d = str2;
        }
        return (viu) vtwVarM.r();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ptd) {
            ptd ptdVar = (ptd) obj;
            if (this.a.equals(ptdVar.a)) {
                String str = this.b;
                String str2 = ptdVar.b;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PreferenceKey{key=" + this.a + ", dynamicKey=" + this.b + "}";
    }

    public ptd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}

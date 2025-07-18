package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class our {
    public final String a;
    public final ouq b;

    public our(String str, ouq ouqVar) {
        ouqVar.getClass();
        this.a = str;
        this.b = ouqVar;
    }

    public final val a() {
        vak vakVar;
        switch (this.b.ordinal()) {
            case 0:
                vakVar = vak.TYPE_UNSPECIFIED;
                break;
            case 1:
                vakVar = vak.MOVIE;
                break;
            case 2:
                vakVar = vak.SHOW;
                break;
            case 3:
                vakVar = vak.SEASON;
                break;
            case 4:
                vakVar = vak.EPISODE;
                break;
            case 5:
                vakVar = vak.TRAILER;
                break;
            case 6:
                vakVar = vak.UNRECOGNIZED;
                break;
            default:
                throw new yfu();
        }
        vtw vtwVarM = val.a.m();
        String str = this.a;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((val) vucVar).c = str;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((val) vtwVarM.b).b = vakVar.a();
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        return (val) vucVarR;
    }

    public final wni b() {
        int i;
        switch (this.b.ordinal()) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 1;
                break;
            default:
                throw new yfu();
        }
        vtw vtwVarM = wni.a.m();
        String str = this.a;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((wni) vucVar).b = str;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((wni) vtwVarM.b).c = a.aJ(i);
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        return (wni) vucVarR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof our)) {
            return false;
        }
        our ourVar = (our) obj;
        return yks.e(this.a, ourVar.a) && this.b == ourVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PlayId(id=" + this.a + ", type=" + this.b + ")";
    }
}

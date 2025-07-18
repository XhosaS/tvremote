package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class ffx implements eac {
    public final String a;
    public final String b;

    public ffx(String str, String str2) {
        this.a = sij.K(str);
        this.b = str2;
    }

    @Override // defpackage.eac
    public final /* synthetic */ dze a() {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.eac
    public final void b(eaa eaaVar) {
        Integer numAc;
        Integer numAc2;
        Integer numAc3;
        Integer numAc4;
        String str = this.a;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numAc = sfy.ac(this.b)) != null) {
                    eaaVar.o = numAc;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numAc2 = sfy.ac(this.b)) != null) {
                    eaaVar.C = numAc2;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numAc3 = sfy.ac(this.b)) != null) {
                    eaaVar.n = numAc3;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    eaaVar.c = this.b;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    eaaVar.D = this.b;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    eaaVar.a = this.b;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    eaaVar.g = this.b;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numAc4 = sfy.ac(this.b)) != null) {
                    eaaVar.B = numAc4;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    eaaVar.d = this.b;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    eaaVar.b = this.b;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.eac
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ffx ffxVar = (ffx) obj;
            if (this.a.equals(ffxVar.a) && this.b.equals(ffxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}

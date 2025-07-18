package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqc implements vpw {
    public final vqa a;
    public final String b;
    private final String c;
    private final String d;

    public /* synthetic */ vqc(vqa vqaVar, String str, int i) {
        this.a = vqaVar;
        this.b = (i & 2) != 0 ? null : str;
        this.c = null;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqc)) {
            return false;
        }
        vqc vqcVar = (vqc) obj;
        if (!yks.e(this.a, vqcVar.a) || !yks.e(this.b, vqcVar.b)) {
            return false;
        }
        String str = vqcVar.c;
        if (!yks.e(null, null)) {
            return false;
        }
        String str2 = vqcVar.d;
        return yks.e(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return (iHashCode + (str == null ? 0 : str.hashCode())) * 961;
    }

    public final String toString() {
        return "ResourceStringContent(stringId=" + this.a + ", arg1=" + this.b + ", arg2=null, arg3=null)";
    }
}

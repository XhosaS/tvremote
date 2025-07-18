package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fch {
    public final String a;
    public final String b;

    public fch(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fch)) {
            return false;
        }
        fch fchVar = (fch) obj;
        return agvy.c(this.a, fchVar.a) && agvy.c(this.b, fchVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LauncherxTokenInfo(gaiaId=" + this.a + ", token=" + this.b + ")";
    }
}

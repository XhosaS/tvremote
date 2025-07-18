package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgf extends fgi {
    public final String a;
    public final String b;
    public final String c;

    public fgf(String str, String str2, String str3) {
        super("COMM");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fgf fgfVar = (fgf) obj;
            if (Objects.equals(this.b, fgfVar.b) && Objects.equals(this.a, fgfVar.a) && Objects.equals(this.c, fgfVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
        String str = this.c;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.fgi
    public final String toString() {
        return this.f + ": language=" + this.a + ", description=" + this.b + ", text=" + this.c;
    }
}

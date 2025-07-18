package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgk extends fgi {
    public final String a;
    public final String b;
    public final String c;

    public fgk(String str, String str2, String str3) {
        super("----");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fgk fgkVar = (fgk) obj;
            if (Objects.equals(this.b, fgkVar.b) && Objects.equals(this.a, fgkVar.a) && Objects.equals(this.c, fgkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    @Override // defpackage.fgi
    public final String toString() {
        return this.f + ": domain=" + this.a + ", description=" + this.b;
    }
}

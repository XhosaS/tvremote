package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ciw extends cil {
    public final String c;
    public final cji d;
    public final int e;

    public ciw(String str, cji cjiVar, cjh cjhVar) {
        super(1, cjy.b, cjhVar);
        this.c = str;
        this.d = cjiVar;
        this.e = 0;
    }

    @Override // defpackage.cix
    public final cji b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ciw)) {
            return false;
        }
        ciw ciwVar = (ciw) obj;
        if (yks.e(this.c, ciwVar.c) && yks.e(this.d, ciwVar.d)) {
            int i = ciwVar.e;
            return a.r(0, 0) && yks.e(this.b, ciwVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.d.h) * 961) + this.b.hashCode();
    }

    public final String toString() {
        return "Font(familyName=\"" + ((Object) ("DeviceFontFamilyName(name=" + this.c + ')')) + "\", weight=" + this.d + ", style=" + ((Object) cje.a(0)) + ')';
    }

    @Override // defpackage.cix
    public final void c() {
    }
}

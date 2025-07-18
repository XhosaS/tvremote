package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjw extends cil {
    public final String c;
    public final cjv d;
    public final cji e;
    public final int f;
    private final boolean g;

    public cjw(String str, cjv cjvVar, cji cjiVar) {
        super(2, cjy.a, new cjh(new cjg[0]));
        this.c = str;
        this.d = cjvVar;
        this.e = cjiVar;
        this.f = 0;
        this.g = true;
    }

    @Override // defpackage.cix
    public final cji b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjw)) {
            return false;
        }
        cjw cjwVar = (cjw) obj;
        if (!yks.e(this.c, cjwVar.c) || !yks.e(this.d, cjwVar.d) || !yks.e(this.e, cjwVar.e)) {
            return false;
        }
        int i = cjwVar.f;
        if (!a.r(0, 0)) {
            return false;
        }
        boolean z = cjwVar.g;
        return true;
    }

    public final int hashCode() {
        return (((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.h) * 961) + 1231;
    }

    public final String toString() {
        return "Font(GoogleFont(\"" + this.c + "\", bestEffort=true), weight=" + this.e + ", style=" + ((Object) cje.a(0)) + ')';
    }

    @Override // defpackage.cix
    public final void c() {
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cka {
    public static final /* synthetic */ int g = 0;
    public final boolean a;
    public final int b;
    public final int d;
    public final int e;
    public final ckq f;
    public final boolean c = true;
    private final cki h = null;

    static {
        ckq ckqVar = ckq.a;
    }

    public /* synthetic */ cka(boolean z, int i, int i2, int i3, ckq ckqVar) {
        this.a = z;
        this.b = i;
        this.d = i2;
        this.e = i3;
        this.f = ckqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cka)) {
            return false;
        }
        cka ckaVar = (cka) obj;
        if (this.a != ckaVar.a || !a.r(this.b, ckaVar.b)) {
            return false;
        }
        boolean z = ckaVar.c;
        if (!a.r(this.d, ckaVar.d) || !a.r(this.e, ckaVar.e)) {
            return false;
        }
        cki ckiVar = ckaVar.h;
        return yks.e(null, null) && yks.e(this.f, ckaVar.f);
    }

    public final int hashCode() {
        return (((((((((a.q(this.a) * 31) + this.b) * 31) + a.q(true)) * 31) + this.d) * 31) + this.e) * 961) + this.f.hashCode();
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) ckc.a(this.b)) + ", autoCorrect=true, keyboardType=" + ((Object) ckd.a(this.d)) + ", imeAction=" + ((Object) cjz.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjr {
    public final ciy a;
    public final cji b;
    public final int c;
    public final int d = 65535;
    public final Object e = null;

    public cjr(ciy ciyVar, cji cjiVar, int i) {
        this.a = ciyVar;
        this.b = cjiVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjr)) {
            return false;
        }
        cjr cjrVar = (cjr) obj;
        if (!yks.e(this.a, cjrVar.a) || !yks.e(this.b, cjrVar.b) || !a.r(this.c, cjrVar.c)) {
            return false;
        }
        int i = cjrVar.d;
        if (!a.r(65535, 65535)) {
            return false;
        }
        Object obj2 = cjrVar.e;
        return yks.e(null, null);
    }

    public final int hashCode() {
        ciy ciyVar = this.a;
        return (((((((ciyVar == null ? 0 : ciyVar.hashCode()) * 31) + this.b.h) * 31) + this.c) * 31) + 65535) * 31;
    }

    public final String toString() {
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + ((Object) cje.a(this.c)) + ", fontSynthesis=" + ((Object) cjf.a()) + ", resourceLoaderCacheKey=null)";
    }
}

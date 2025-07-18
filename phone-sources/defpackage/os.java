package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class os implements np {
    public final float a;
    public final float b;
    public final Object c;

    public os() {
        this(null, 7);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, yjv] */
    @Override // defpackage.my
    public final /* synthetic */ pn a(bhi bhiVar) {
        Object obj = this.c;
        return new py(this.a, this.b, obj == null ? null : (ne) bhiVar.a.a(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof os)) {
            return false;
        }
        os osVar = (os) obj;
        return osVar.a == this.a && osVar.b == this.b && yks.e(osVar.c, this.c);
    }

    public final int hashCode() {
        Object obj = this.c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.b);
    }

    public os(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    public /* synthetic */ os(Object obj, int i) {
        this(1 != (i & 1) ? 0.0f : 1.0f, (i & 2) != 0 ? 1500.0f : 0.0f, (i & 4) != 0 ? null : obj);
    }
}

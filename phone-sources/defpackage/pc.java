package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pc implements pb {
    private final Object a;
    private final Object b;

    public pc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.pb
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.pb
    public final Object b() {
        return this.b;
    }

    @Override // defpackage.pb
    public final /* synthetic */ boolean c(Object obj, Object obj2) {
        return og.e(this, obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pb)) {
            return false;
        }
        pb pbVar = (pb) obj;
        return yks.e(this.a, pbVar.a()) && yks.e(this.b, pbVar.b());
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }
}

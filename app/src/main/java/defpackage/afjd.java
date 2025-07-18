package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afjd implements afje {
    private final Object a;
    private final Object b;

    public afjd(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.afje
    public final int a() {
        return 1;
    }

    @Override // defpackage.afje
    public final afje b(Object obj, Object obj2, int i, int i2) {
        Object obj3 = this.a;
        int iHashCode = obj3.hashCode();
        return iHashCode != i ? afjc.c(new afjd(obj, obj2), i, this, iHashCode, i2) : obj3 == obj ? new afjd(obj, obj2) : new afjb(new Object[]{obj3, obj}, new Object[]{this.b, obj2});
    }

    public final String toString() {
        return String.format("Leaf(key=%s value=%s)", this.a, this.b);
    }
}

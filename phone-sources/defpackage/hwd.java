package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwd<K, V> extends ir<K, V> {
    private int e;

    @Override // defpackage.ko, java.util.Map
    public final void clear() {
        this.e = 0;
        super.clear();
    }

    @Override // defpackage.ko
    public final Object e(int i) {
        this.e = 0;
        return super.e(i);
    }

    @Override // defpackage.ko
    public final Object f(int i, Object obj) {
        this.e = 0;
        return super.f(i, obj);
    }

    @Override // defpackage.ko, java.util.Map
    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode();
        this.e = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.ko
    public final void i(ko koVar) {
        this.e = 0;
        super.i(koVar);
    }

    @Override // defpackage.ko, java.util.Map
    public final V put(K k, V v) {
        this.e = 0;
        return (V) super.put(k, v);
    }
}

package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzo<T> extends ygp<T> {
    private final int a;
    private final int b;
    private final List c;

    public fzo(int i, int i2, List list) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    @Override // defpackage.ygk
    public final int a() {
        return this.a + this.c.size() + this.b;
    }

    @Override // defpackage.ygp, java.util.List
    public final T get(int i) {
        if (i >= 0 && i < this.a) {
            return null;
        }
        int i2 = this.a;
        List list = this.c;
        if (i < list.size() + i2 && i2 <= i) {
            return (T) list.get(i - i2);
        }
        int size = i2 + list.size();
        if (i < a() && size <= i) {
            return null;
        }
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + i + " in ItemSnapshotList of size " + a());
    }
}

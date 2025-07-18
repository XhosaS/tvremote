package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhj<T> extends ygp<T> {
    public final List a;

    public yhj(List list) {
        this.a = list;
    }

    @Override // defpackage.ygk
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.ygp, java.util.List
    public final T get(int i) {
        if (i >= 0 && i <= yfm.q(this)) {
            return (T) this.a.get(yfm.q(this) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new ymd(0, yfm.q(this)) + "].");
    }

    @Override // defpackage.ygp, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new yhi(this, 0);
    }

    @Override // defpackage.ygp, java.util.List
    public final ListIterator<T> listIterator() {
        return new yhi(this, 0);
    }

    @Override // defpackage.ygp, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new yhi(this, i);
    }
}

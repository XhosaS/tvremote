package defpackage;

import j$.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bgi<E> extends ygp<E> implements List<E>, bgf {
    @Override // defpackage.ygk, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.ygk, java.util.Collection, java.util.List
    public final boolean containsAll(Collection<?> collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.bgf
    public bgf d(Collection collection) {
        bgl bglVarJ = j();
        bglVarJ.addAll(collection);
        return bglVarJ.c();
    }

    @Override // defpackage.bgf
    public final bgf e(Object obj) {
        int iIndexOf = indexOf(obj);
        return iIndexOf != -1 ? h(iIndexOf) : this;
    }

    @Override // defpackage.bgf
    public final bgf f(Collection collection) {
        return g(new bap(collection, 7));
    }

    @Override // defpackage.ygp, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator();
    }

    @Override // defpackage.ygp, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.ygp, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return new bgd(this, i, i2);
    }
}

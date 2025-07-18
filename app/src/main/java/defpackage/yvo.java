package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class yvo extends AbstractCollection implements zbp {
    private transient Set a;
    private transient Set b;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        h(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (!(collection instanceof zbp)) {
            if (collection.isEmpty()) {
                return false;
            }
            return zar.j(this, collection.iterator());
        }
        zbp zbpVar = (zbp) collection;
        if (!(zbpVar instanceof yvi)) {
            if (zbpVar.isEmpty()) {
                return false;
            }
            for (zbo zboVar : zbpVar.j()) {
                h(zboVar.b(), zboVar.a());
            }
            return true;
        }
        yvi yviVar = (yvi) zbpVar;
        if (yviVar.isEmpty()) {
            return false;
        }
        for (int iA = yviVar.a.a(); iA >= 0; iA = yviVar.a.e(iA)) {
            h(yviVar.a.i(iA), yviVar.a.c(iA));
        }
        return true;
    }

    public abstract int b();

    public int c(Object obj, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.zbp
    public final boolean contains(Object obj) {
        return a(obj) > 0;
    }

    public abstract Iterator e();

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return zbu.a(this, obj);
    }

    public abstract Iterator f();

    public boolean g(Object obj, int i) {
        throw null;
    }

    public void h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return j().hashCode();
    }

    @Override // defpackage.zbp
    public final Set i() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        yvm yvmVar = new yvm(this);
        this.a = yvmVar;
        return yvmVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return j().isEmpty();
    }

    @Override // defpackage.zbp
    public final Set j() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        yvn yvnVar = new yvn(this);
        this.b = yvnVar;
        return yvnVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.zbp
    public final boolean remove(Object obj) {
        return c(obj, 1) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof zbp) {
            collection = ((zbp) collection).i();
        }
        return i().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof zbp) {
            collection = ((zbp) collection).i();
        }
        return i().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }
}

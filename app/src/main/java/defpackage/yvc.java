package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yvc extends yva implements List {
    final /* synthetic */ yve f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvc(yve yveVar, Object obj, List list, yva yvaVar) {
        super(yveVar, obj, list, yvaVar);
        this.f = yveVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean zIsEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
        this.f.b++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.b).addAll(i, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.b.size();
        this.f.b += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        a();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return ((List) this.b).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new yvb(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = ((List) this.b).remove(i);
        yve yveVar = this.f;
        yveVar.b--;
        c();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return ((List) this.b).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        List listSubList = ((List) this.b).subList(i, i2);
        yva yvaVar = this.c;
        if (yvaVar == null) {
            yvaVar = this;
        }
        return this.f.g(this.a, listSubList, yvaVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new yvb(this, i);
    }
}

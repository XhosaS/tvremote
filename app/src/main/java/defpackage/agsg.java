package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agsg extends agrt {
    private final agsf a;

    public agsg(agsf agsfVar) {
        this.a = agsfVar;
    }

    @Override // defpackage.agqg
    public final int a() {
        return this.a.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.agrt
    public final boolean b(Map.Entry entry) {
        return this.a.h(entry);
    }

    @Override // defpackage.agrt
    public final boolean c(Map.Entry entry) {
        entry.getClass();
        agsf agsfVar = this.a;
        agsfVar.e();
        int iB = agsfVar.b(entry.getKey());
        if (iB < 0) {
            return false;
        }
        Object[] objArr = agsfVar.d;
        objArr.getClass();
        if (!agvy.c(objArr[iB], entry.getValue())) {
            return false;
        }
        agsfVar.f(iB);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.a.g(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new agsa(this.a);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.a.e();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.a.e();
        return super.retainAll(collection);
    }
}

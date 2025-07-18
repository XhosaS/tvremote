package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cba extends cab {
    private final transient bzw a;
    private final transient bzs b;

    public cba(bzw bzwVar, bzs bzsVar) {
        this.a = bzwVar;
        this.b = bzsVar;
    }

    @Override // defpackage.bzl
    public final int a(Object[] objArr, int i) {
        return this.b.a(objArr, i);
    }

    @Override // defpackage.bzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // defpackage.cab, defpackage.bzl
    public final bzs d() {
        return this.b;
    }

    @Override // defpackage.cab, defpackage.bzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final cbj listIterator() {
        return this.b.iterator();
    }

    @Override // defpackage.bzl
    public final boolean f() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((cbc) this.a).c;
    }

    @Override // defpackage.cab, defpackage.bzl
    public Object writeReplace() {
        return super.writeReplace();
    }
}

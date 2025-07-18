package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzp extends bzs {
    private final transient bzs a;

    public bzp(bzs bzsVar) {
        this.a = bzsVar;
    }

    private final int u(int i) {
        return (size() - 1) - i;
    }

    private final int v(int i) {
        return size() - i;
    }

    @Override // defpackage.bzs, defpackage.bzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.bzl
    public final boolean f() {
        return this.a.f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        bdq.n(i, size());
        return this.a.get(u(i));
    }

    @Override // defpackage.bzs
    public final bzs h() {
        return this.a;
    }

    @Override // defpackage.bzs
    /* renamed from: i */
    public final bzs subList(int i, int i2) {
        bdq.i(i, i2, size());
        return this.a.subList(v(i2), v(i)).h();
    }

    @Override // defpackage.bzs, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.a.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return u(iLastIndexOf);
        }
        return -1;
    }

    @Override // defpackage.bzs, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.a.indexOf(obj);
        if (iIndexOf >= 0) {
            return u(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.bzs, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.bzs, defpackage.bzl
    public Object writeReplace() {
        return super.writeReplace();
    }
}

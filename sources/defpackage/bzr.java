package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzr extends bzs {
    final transient int a;
    final transient int b;
    final /* synthetic */ bzs c;

    public bzr(bzs bzsVar, int i, int i2) {
        this.c = bzsVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.bzl
    public final int b() {
        return this.c.c() + this.a + this.b;
    }

    @Override // defpackage.bzl
    public final int c() {
        return this.c.c() + this.a;
    }

    @Override // defpackage.bzl
    public final boolean f() {
        return true;
    }

    @Override // defpackage.bzl
    public final Object[] g() {
        return this.c.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        bdq.n(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // defpackage.bzs
    /* renamed from: i */
    public final bzs subList(int i, int i2) {
        bdq.i(i, i2, this.b);
        int i3 = this.a;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
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

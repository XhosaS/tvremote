package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yyj extends yyk {
    final transient int b;
    final transient int c;
    final /* synthetic */ yyk d;

    public yyj(yyk yykVar, int i, int i2) {
        this.d = yykVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.yyk
    /* renamed from: c */
    public final yyk subList(int i, int i2) {
        yqw.K(i, i2, this.c);
        int i3 = this.b;
        return this.d.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.yxy
    public final int d() {
        return this.d.e() + this.b + this.c;
    }

    @Override // defpackage.yxy
    public final int e() {
        return this.d.e() + this.b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yqw.al(i, this.c);
        return this.d.get(i + this.b);
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return true;
    }

    @Override // defpackage.yxy
    public final Object[] m() {
        return this.d.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.yyk, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.yyk, defpackage.yxy
    public Object writeReplace() {
        return super.writeReplace();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zcm extends yzy {
    final /* synthetic */ zco b;

    public zcm(zco zcoVar) {
        this.b = zcoVar;
    }

    @Override // defpackage.yzy
    public final Object a(int i) {
        return this.b.c.i(i);
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.contains(obj);
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.c.c;
    }

    @Override // defpackage.yzy, defpackage.yzq, defpackage.yxy
    public Object writeReplace() {
        return super.writeReplace();
    }
}

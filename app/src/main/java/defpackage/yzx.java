package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yzx extends yyk {
    final /* synthetic */ yzy b;

    public yzx(yzy yzyVar) {
        this.b = yzyVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.b.a(i);
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return this.b.l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.yyk, defpackage.yxy
    public Object writeReplace() {
        return super.writeReplace();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class yzy extends yzq {
    public abstract Object a(int i);

    @Override // defpackage.yxy
    public final int b(Object[] objArr, int i) {
        return f().b(objArr, i);
    }

    @Override // defpackage.yzq
    public final yyk h() {
        return new yzx(this);
    }

    @Override // defpackage.yzq, defpackage.yxy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public zdl iterator() {
        return f().listIterator(0);
    }

    @Override // defpackage.yzq, defpackage.yxy
    public Object writeReplace() {
        return super.writeReplace();
    }
}

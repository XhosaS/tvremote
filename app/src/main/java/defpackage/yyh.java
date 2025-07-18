package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yyh extends yyk {
    private final transient yyk b;

    public yyh(yyk yykVar) {
        this.b = yykVar;
    }

    private final int w(int i) {
        return (this.b.size() - 1) - i;
    }

    @Override // defpackage.yyk
    public final yyk a() {
        return this.b;
    }

    @Override // defpackage.yyk
    /* renamed from: c */
    public final yyk subList(int i, int i2) {
        yyk yykVar = this.b;
        yqw.K(i, i2, yykVar.size());
        return yykVar.subList(yykVar.size() - i2, yykVar.size() - i).a();
    }

    @Override // defpackage.yyk, defpackage.yxy, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        yyk yykVar = this.b;
        yqw.al(i, yykVar.size());
        return yykVar.get(w(i));
    }

    @Override // defpackage.yyk, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.b.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return w(iLastIndexOf);
        }
        return -1;
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return this.b.l();
    }

    @Override // defpackage.yyk, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.b.indexOf(obj);
        if (iIndexOf >= 0) {
            return w(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
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

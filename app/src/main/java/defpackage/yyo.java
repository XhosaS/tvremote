package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yyo extends yyt {
    final /* synthetic */ yyp b;

    public yyo(yyp yypVar) {
        this.b = yypVar;
    }

    @Override // defpackage.yyt
    public final yyr a() {
        return this.b;
    }

    @Override // defpackage.yzq, defpackage.yxy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.b.a();
    }

    @Override // defpackage.yzq, defpackage.yxy
    /* renamed from: k */
    public final zdl iterator() {
        return this.b.a();
    }

    @Override // defpackage.yyt, defpackage.yzq, defpackage.yxy
    public Object writeReplace() {
        return super.writeReplace();
    }
}

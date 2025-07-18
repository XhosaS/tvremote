package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yyv extends yzy {
    private final yyr b;

    public yyv(yyr yyrVar) {
        this.b = yyrVar;
    }

    @Override // defpackage.yzy
    public final Object a(int i) {
        return ((Map.Entry) this.b.entrySet().f().get(i)).getKey();
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // defpackage.yzy, defpackage.yzq, defpackage.yxy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.b.b();
    }

    @Override // defpackage.yzy, defpackage.yzq, defpackage.yxy
    /* renamed from: k */
    public final zdl iterator() {
        return this.b.b();
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.yzy, defpackage.yzq, defpackage.yxy
    public Object writeReplace() {
        return new yyu(this.b);
    }
}

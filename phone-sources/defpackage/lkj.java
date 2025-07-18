package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lkj implements ieh {
    final /* synthetic */ lkm a;
    private final lzh b;

    public lkj(lkm lkmVar, lzh lzhVar) {
        this.a = lkmVar;
        this.b = lzhVar;
    }

    @Override // defpackage.ieh
    public final /* bridge */ /* synthetic */ Object a() {
        lkm lkmVar = this.a;
        return this.b.a(Pair.create(lkmVar.d, Integer.valueOf(lkmVar.y)));
    }
}

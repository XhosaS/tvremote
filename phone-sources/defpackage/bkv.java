package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkv extends ykt implements ykb {
    final /* synthetic */ int a;
    final /* synthetic */ bla b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkv(bla blaVar, int i) {
        super(4);
        this.b = blaVar;
        this.a = i;
    }

    @Override // defpackage.ykb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        Rect rect = new Rect(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        bla blaVar = this.b;
        bb$$ExternalSyntheticApiModelOutline1.m69m(blaVar.i.a).notifyViewEntered(blaVar.a, this.a, rect);
        return ygi.a;
    }
}

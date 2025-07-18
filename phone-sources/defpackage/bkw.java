package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkw extends ykt implements ykb {
    final /* synthetic */ bys a;
    final /* synthetic */ bla b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkw(bla blaVar, bys bysVar) {
        super(4);
        this.b = blaVar;
        this.a = bysVar;
    }

    @Override // defpackage.ykb
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        bla blaVar = this.b;
        Rect rect = blaVar.d;
        rect.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        Object obj5 = blaVar.i.a;
        bys bysVar = this.a;
        bb$$ExternalSyntheticApiModelOutline1.m69m(obj5).requestAutofill(blaVar.a, bysVar.c, rect);
        return ygi.a;
    }
}

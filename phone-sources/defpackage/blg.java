package defpackage;

import android.view.ViewStructure;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blg extends ykt implements ykb {
    final /* synthetic */ ViewStructure a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blg(ViewStructure viewStructure) {
        super(4);
        this.a = viewStructure;
    }

    @Override // defpackage.ykb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.a.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return ygi.a;
    }
}

package defpackage;

import androidx.leanback.widget.HorizontalGridView;

/* compiled from: PG */
/* loaded from: classes.dex */
class hqr extends azl {
    final /* synthetic */ hqw a;

    public hqr(hqw hqwVar) {
        this.a = hqwVar;
    }

    @Override // defpackage.azl
    public final void a(azk azkVar) {
        HorizontalGridView horizontalGridViewBi;
        int i;
        hqw hqwVar = this.a;
        if (!hqwVar.bH(azkVar) || (horizontalGridViewBi = hqwVar.bi(azkVar)) == null || (i = hqwVar.au) < 0 || i >= horizontalGridViewBi.getAdapter().a()) {
            return;
        }
        horizontalGridViewBi.setSelectedPosition(hqwVar.au);
    }
}

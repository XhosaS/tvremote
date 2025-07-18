package defpackage;

import androidx.leanback.widget.HorizontalGridView;

/* compiled from: PG */
/* loaded from: classes.dex */
class hrm extends azl {
    final /* synthetic */ hrw a;

    public hrm(hrw hrwVar) {
        this.a = hrwVar;
    }

    @Override // defpackage.azl
    public final void a(azk azkVar) {
        HorizontalGridView horizontalGridViewBi;
        hrw hrwVar = this.a;
        if (!hrwVar.bH(azkVar) || (horizontalGridViewBi = hrwVar.bi(azkVar)) == null) {
            return;
        }
        horizontalGridViewBi.setSelectedPositionSmooth(0);
    }
}

package defpackage;

import androidx.leanback.widget.HorizontalGridView;

/* compiled from: PG */
/* loaded from: classes.dex */
class hrp extends azl {
    final /* synthetic */ xoa a;
    final /* synthetic */ hrw b;

    public hrp(hrw hrwVar, xoa xoaVar) {
        this.a = xoaVar;
        this.b = hrwVar;
    }

    @Override // defpackage.azl
    public final void a(azk azkVar) {
        HorizontalGridView horizontalGridViewBi;
        int iBf;
        hrw hrwVar = this.b;
        if (!hrwVar.bH(azkVar) || (horizontalGridViewBi = hrwVar.bi(azkVar)) == null || horizontalGridViewBi.getChildCount() <= 0) {
            return;
        }
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 5) {
            iBf = hrwVar.bf(horizontalGridViewBi) + 1;
        } else {
            if (iOrdinal != 6) {
                if (iOrdinal != 7) {
                    if (iOrdinal != 8) {
                        return;
                    }
                }
                iBf = hrwVar.bf(horizontalGridViewBi) + 1;
            }
            iBf = hrwVar.be(horizontalGridViewBi) - 1;
        }
        if (iBf < 0 || iBf >= horizontalGridViewBi.getAdapter().a()) {
            return;
        }
        horizontalGridViewBi.setSelectedPositionSmooth(iBf);
    }
}

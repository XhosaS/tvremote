package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sfr extends spz {
    final /* synthetic */ sfs a;

    public sfr(sfs sfsVar) {
        this.a = sfsVar;
    }

    @Override // defpackage.spz
    public final void a(View view, float f) {
        if (true == Float.isNaN(f)) {
            f = 0.0f;
        }
        sfs sfsVar = this.a;
        int iA = sfsVar.a(f);
        sfsVar.b(iA);
        sfsVar.c(f, iA);
        if (sfsVar.i) {
            return;
        }
        sfsVar.d(f);
    }

    @Override // defpackage.spz
    public final void b(View view, int i) {
        if (i == 5) {
            this.a.cancel();
            return;
        }
        if (i == 3 || i == 4 || i == 6) {
            sfs sfsVar = this.a;
            int i2 = sfsVar.j;
            int i3 = sfsVar.k;
            if (i2 != i3) {
                sfsVar.j = i3;
                sfsVar.e();
                view.requestLayout();
            }
        }
    }
}

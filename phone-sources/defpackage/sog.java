package defpackage;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sog implements soe {
    final /* synthetic */ CollapsingToolbarLayout a;

    public sog(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    @Override // defpackage.sob
    public final void b(int i) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.a;
        collapsingToolbarLayout.e = i;
        cyh cyhVar = collapsingToolbarLayout.f;
        int iD = cyhVar != null ? cyhVar.d() : 0;
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = collapsingToolbarLayout.getChildAt(i2);
            sof sofVar = (sof) childAt.getLayoutParams();
            som somVarC = CollapsingToolbarLayout.c(childAt);
            int i3 = sofVar.a;
            if (i3 == 1) {
                somVarC.c(cmq.l(-i, 0, collapsingToolbarLayout.a(childAt)));
            } else if (i3 == 2) {
                somVarC.c(Math.round((-i) * sofVar.b));
            }
        }
        collapsingToolbarLayout.h();
        if (collapsingToolbarLayout.d != null && iD > 0) {
            collapsingToolbarLayout.postInvalidateOnAnimation();
        }
        int height = collapsingToolbarLayout.getHeight();
        int minimumHeight = height - collapsingToolbarLayout.getMinimumHeight();
        int iB = height - collapsingToolbarLayout.b();
        int i4 = minimumHeight - iD;
        int i5 = collapsingToolbarLayout.e + i4;
        float fAbs = Math.abs(i);
        sub subVar = collapsingToolbarLayout.a;
        float f = i4;
        float f2 = iB / f;
        subVar.C(Math.min(1.0f, f2));
        subVar.d = i5;
        float f3 = fAbs / f;
        subVar.B(f3);
        sub subVar2 = collapsingToolbarLayout.b;
        subVar2.C(Math.min(1.0f, f2));
        subVar2.d = i5;
        subVar2.B(f3);
    }
}

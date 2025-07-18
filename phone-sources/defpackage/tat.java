package defpackage;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tat implements cvq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public tat(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cvq
    public final cyh onApplyWindowInsets(View view, cyh cyhVar) {
        if (this.b != 0) {
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.a;
            cyh cyhVar2 = true != collapsingToolbarLayout.getFitsSystemWindows() ? null : cyhVar;
            if (!Objects.equals(collapsingToolbarLayout.f, cyhVar2)) {
                collapsingToolbarLayout.f = cyhVar2;
                collapsingToolbarLayout.requestLayout();
            }
            return cyhVar.m();
        }
        int iA = cyhVar.a();
        taz tazVar = (taz) this.a;
        tazVar.n = iA;
        tazVar.o = cyhVar.b();
        tazVar.p = cyhVar.c();
        tazVar.j();
        return cyhVar;
    }
}

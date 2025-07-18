package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.facebook.litho.ComponentTree;

/* compiled from: PG */
/* loaded from: classes.dex */
class ekh extends qi {
    public ejt a;
    public qd b;
    private final egg c;
    private View d;
    private int e = -1;

    public ekh(egg eggVar) {
        this.c = eggVar;
    }

    @Override // defpackage.qi
    public final void d(RecyclerView recyclerView, int i, int i2) {
        egg eggVar = this.c;
        int iC = eggVar.c();
        if (iC != -1) {
            int i3 = iC;
            while (true) {
                if (i3 < 0) {
                    i3 = -1;
                    break;
                } else if (eggVar.n(i3)) {
                    break;
                } else {
                    i3--;
                }
            }
            ComponentTree componentTreeA = eggVar.a(iC);
            View view = this.d;
            if (view != null && componentTreeA != null && view != componentTreeA.getLithoView()) {
                view.setTranslationY(0.0f);
                this.d = null;
            }
            if (i3 == -1 || componentTreeA == null) {
                this.a.n();
                this.e = -1;
                return;
            }
            if (iC == i3) {
                dvz lithoView = componentTreeA.getLithoView();
                if (lithoView == null) {
                    dsr.b(2, "First visible sticky header item is null, RV.hasPendingAdapterUpdates: " + this.a.getRecyclerView().as() + ", first visible component: " + componentTreeA.g() + ", hasMounted: " + componentTreeA.u + ", isReleased: " + componentTreeA.A());
                } else {
                    int i4 = i3 + 1;
                    if (!eggVar.o(i4) || !eggVar.n(i4)) {
                        lithoView.setTranslationY(-lithoView.getTop());
                    }
                }
                this.d = lithoView;
                this.a.n();
                this.e = -1;
                return;
            }
            int iMin = 0;
            if (this.a.m.getVisibility() == 8 || i3 != this.e) {
                ComponentTree componentTreeA2 = eggVar.a(i3);
                ejt ejtVar = this.a;
                if (componentTreeA2.getLithoView() != null) {
                    dvz lithoView2 = componentTreeA2.getLithoView();
                    lithoView2.r = lithoView2.m;
                }
                ejtVar.m.v(componentTreeA2, true);
                ejtVar.o(ejtVar.getWidth());
                dvz dvzVar = this.a.m;
                dvzVar.setVisibility(0);
                boolean z = dvzVar.l;
                dvzVar.s();
            } else if (this.a.getStickyHeader().getComponentTree() == null && i == 0 && i2 == 0) {
                boolean z2 = ebc.a;
            }
            int iE = eggVar.e();
            while (true) {
                if (iC > iE) {
                    break;
                }
                if (eggVar.n(iC)) {
                    iMin = Math.min((this.b.T(iC).getTop() - this.a.getStickyHeader().getBottom()) + this.a.getPaddingTop(), 0);
                    break;
                }
                iC++;
            }
            this.a.setStickyHeaderVerticalOffset(iMin);
            this.e = i3;
        }
    }
}

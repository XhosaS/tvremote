package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.leanback.app.GuidedStepRootLayout;
import androidx.leanback.transition.FadeAndShortSlide;
import androidx.leanback.widget.NonOverlappingLinearLayout;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ats extends bq {
    public axe a;
    private axp ah;
    private axp ai;
    private axq aj;
    public ayc b;
    private ContextThemeWrapper d;
    private ayc e;
    private axp f;
    public List c = new ArrayList();
    private List ak = new ArrayList();

    public ats() {
        aL();
    }

    public static void aI(dp dpVar, View view, String str) {
        if (view != null) {
            dy dyVar = dq.a;
            int[] iArr = ahj.a;
            String strF = ahc.f(view);
            if (strF == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (dpVar.q == null) {
                dpVar.q = new ArrayList();
                dpVar.r = new ArrayList();
            } else {
                if (dpVar.r.contains(str)) {
                    throw new IllegalArgumentException(a.e(str, "A shared element with the target name '", "' has already been added to the transaction."));
                }
                if (dpVar.q.contains(strF)) {
                    throw new IllegalArgumentException(a.e(strF, "A shared element with the source name '", "' has already been added to the transaction."));
                }
            }
            dpVar.q.add(strF);
            dpVar.r.add(str);
        }
    }

    private static boolean aS(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.guidedStepThemeFlag, typedValue, true) && typedValue.type == 18 && typedValue.data != 0;
    }

    static boolean dv(axh axhVar) {
        return (axhVar.d & 64) == 64 && axhVar.a != -1;
    }

    @Override // defpackage.bq
    public View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextS = s();
        int iAB = aB();
        if (iAB == -1 && !aS(contextS)) {
            TypedValue typedValue = new TypedValue();
            if (contextS.getTheme().resolveAttribute(R.attr.guidedStepTheme, typedValue, true)) {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(contextS, typedValue.resourceId);
                if (aS(contextThemeWrapper)) {
                    this.d = contextThemeWrapper;
                } else {
                    this.d = null;
                    Log.e("GuidedStepF", "GuidedStepSupportFragment does not have an appropriate theme set.");
                }
            } else {
                Log.e("GuidedStepF", "GuidedStepSupportFragment does not have an appropriate theme set.");
            }
        } else if (iAB != -1) {
            this.d = new ContextThemeWrapper(contextS, iAB);
        }
        ContextThemeWrapper contextThemeWrapper2 = this.d;
        if (contextThemeWrapper2 != null) {
            layoutInflater = layoutInflater.cloneInContext(contextThemeWrapper2);
        }
        GuidedStepRootLayout guidedStepRootLayout = (GuidedStepRootLayout) layoutInflater.inflate(R.layout.lb_guidedstep_fragment, viewGroup, false);
        guidedStepRootLayout.a = false;
        guidedStepRootLayout.b = false;
        ViewGroup viewGroup2 = (ViewGroup) guidedStepRootLayout.findViewById(R.id.content_fragment);
        ViewGroup viewGroup3 = (ViewGroup) guidedStepRootLayout.findViewById(R.id.action_fragment);
        ((NonOverlappingLinearLayout) viewGroup3).a = true;
        viewGroup2.addView(this.a.b(layoutInflater, viewGroup2, aP()));
        viewGroup3.addView(this.b.c(layoutInflater, viewGroup3));
        View viewC = this.e.c(layoutInflater, viewGroup3);
        viewGroup3.addView(viewC);
        ato atoVar = new ato(this);
        this.f = new axp(this.c, new atp(this), this.b, false);
        this.ai = new axp(this.ak, new atq(this), this.e, false);
        this.ah = new axp(null, new atr(this), this.b, true);
        axq axqVar = new axq();
        this.aj = axqVar;
        axqVar.a(this.f, this.ai);
        this.aj.a(this.ah, null);
        this.aj.b = atoVar;
        ayc aycVar = this.b;
        aycVar.i = atoVar;
        aycVar.c.ag(this.f);
        VerticalGridView verticalGridView = this.b.d;
        if (verticalGridView != null) {
            verticalGridView.ag(this.ah);
        }
        this.e.c.ag(this.ai);
        if (this.ak.size() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewC.getLayoutParams();
            layoutParams.weight = 0.0f;
            viewC.setLayoutParams(layoutParams);
        } else {
            Context contextS2 = this.d;
            if (contextS2 == null) {
                contextS2 = s();
            }
            TypedValue typedValue2 = new TypedValue();
            if (contextS2.getTheme().resolveAttribute(R.attr.guidedActionContentWidthWeightTwoPanels, typedValue2, true)) {
                View viewFindViewById = guidedStepRootLayout.findViewById(R.id.action_fragment_root);
                float f = typedValue2.getFloat();
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) viewFindViewById.getLayoutParams();
                layoutParams2.weight = f;
                viewFindViewById.setLayoutParams(layoutParams2);
            }
        }
        View viewInflate = layoutInflater.inflate(R.layout.lb_guidedstep_background, (ViewGroup) guidedStepRootLayout, false);
        if (viewInflate != null) {
            ((FrameLayout) guidedStepRootLayout.findViewById(R.id.guidedstep_background_view_root)).addView(viewInflate, 0);
        }
        return guidedStepRootLayout;
    }

    @Override // defpackage.bq
    public void Z() {
        this.P = true;
        this.R.findViewById(R.id.action_fragment).requestFocus();
    }

    public int aB() {
        return -1;
    }

    public long aC(axh axhVar) {
        return -2L;
    }

    public axe aD() {
        return new axe();
    }

    public final axh aE(long j) {
        int iL = l(j);
        if (iL >= 0) {
            return (axh) this.c.get(iL);
        }
        return null;
    }

    public ayc aF() {
        return new ayc();
    }

    final String aG(axh axhVar) {
        return "action_" + axhVar.a;
    }

    final String aH(axh axhVar) {
        return "buttonaction_" + axhVar.a;
    }

    public final void aJ(int i) {
        axp axpVar = this.f;
        if (axpVar != null) {
            axpVar.a.c(i, 1, null);
        }
    }

    public void aL() {
        int iM = m();
        if (iM == 0) {
            FadeAndShortSlide fadeAndShortSlide = new FadeAndShortSlide(8388613);
            fadeAndShortSlide.excludeTarget(R.id.guidedstep_background, true);
            fadeAndShortSlide.excludeTarget(R.id.guidedactions_sub_list_background, true);
            af(fadeAndShortSlide);
            Fade fade = new Fade(3);
            fade.addTarget(R.id.guidedactions_sub_list_background);
            Object objA = avl.a();
            Object objB = avl.b();
            TransitionSet transitionSet = (TransitionSet) objB;
            transitionSet.addTransition(fade);
            transitionSet.addTransition((Transition) objA);
            al(objB);
        } else if (iM == 1) {
            Fade fade2 = new Fade(3);
            fade2.addTarget(R.id.guidedstep_background);
            FadeAndShortSlide fadeAndShortSlide2 = new FadeAndShortSlide(8388615);
            fadeAndShortSlide2.addTarget(R.id.content_fragment);
            fadeAndShortSlide2.addTarget(R.id.action_fragment_root);
            Object objB2 = avl.b();
            TransitionSet transitionSet2 = (TransitionSet) objB2;
            transitionSet2.addTransition(fade2);
            transitionSet2.addTransition(fadeAndShortSlide2);
            af(objB2);
            al(null);
        } else if (iM == 2) {
            af(null);
            al(null);
        }
        FadeAndShortSlide fadeAndShortSlide3 = new FadeAndShortSlide(8388611);
        fadeAndShortSlide3.excludeTarget(R.id.guidedstep_background, true);
        fadeAndShortSlide3.excludeTarget(R.id.guidedactions_sub_list_background, true);
        ag(fadeAndShortSlide3);
    }

    public axd aP() {
        return new axd("", "", "", null);
    }

    public final void aQ() {
        ArrayList arrayList = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }

    public final void du(int i) {
        this.b.c.setSelectedPosition(i);
    }

    public final void dw() {
        ayc aycVar = this.b;
        if (aycVar == null || aycVar.c == null) {
            return;
        }
        aycVar.d(true);
    }

    @Override // defpackage.bq
    public void e() {
        axe axeVar = this.a;
        axeVar.c = null;
        axeVar.b = null;
        axeVar.d = null;
        axeVar.a = null;
        axeVar.e = null;
        this.b.f();
        this.e.f();
        this.f = null;
        this.ah = null;
        this.ai = null;
        this.aj = null;
        this.P = true;
    }

    @Override // defpackage.bq
    public void ey(Bundle bundle) {
        super.ey(bundle);
        this.a = aD();
        this.b = aF();
        ayc aycVar = new ayc();
        if (aycVar.b != null) {
            throw new IllegalStateException("setAsButtonActions() must be called before creating views");
        }
        aycVar.e = true;
        this.e = aycVar;
        aL();
        ArrayList arrayList = new ArrayList();
        aR(arrayList);
        if (bundle != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                axh axhVar = (axh) arrayList.get(i);
                if (dv(axhVar)) {
                    axhVar.a(bundle, aG(axhVar));
                }
            }
        }
        this.c = arrayList;
        axp axpVar = this.f;
        if (axpVar != null) {
            axpVar.q(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        if (bundle != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                axh axhVar2 = (axh) arrayList2.get(i2);
                if (dv(axhVar2)) {
                    axhVar2.a(bundle, aH(axhVar2));
                }
            }
        }
        this.ak = arrayList2;
        axp axpVar2 = this.ai;
        if (axpVar2 != null) {
            axpVar2.q(arrayList2);
        }
    }

    @Override // defpackage.bq
    public void g(Bundle bundle) {
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            axh axhVar = (axh) list.get(i);
            if (dv(axhVar)) {
                axhVar.b(bundle, aG(axhVar));
            }
        }
        List list2 = this.ak;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            axh axhVar2 = (axh) list2.get(i2);
            if (dv(axhVar2)) {
                axhVar2.b(bundle, aH(axhVar2));
            }
        }
    }

    public final int l(long j) {
        if (this.c == null) {
            return -1;
        }
        for (int i = 0; i < this.c.size(); i++) {
            if (((axh) this.c.get(i)).a == j) {
                return i;
            }
        }
        return -1;
    }

    public final int m() {
        Bundle bundle = this.n;
        if (bundle == null) {
            return 1;
        }
        return bundle.getInt("uiStyle", 1);
    }

    public void aR(List list) {
    }

    public void dt(axh axhVar) {
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.katniss.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hqw extends hqy implements hmu {
    public static final zdy ar = zdy.h("com/google/android/apps/tvsearch/results/searchrows/FullScreenSearchRowsFragment");
    public int as;
    public Interpolator at;
    int au;
    int av;
    int aw;
    boolean ax;

    static Pair aW(Pair pair, Animator animator) {
        if (animator == null) {
            return pair;
        }
        if (pair == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            return new Pair(animatorSet, animatorSet.play(animator));
        }
        ((AnimatorSet.Builder) pair.second).with(animator);
        return pair;
    }

    private final Animator bI(View view, int i) throws Resources.NotFoundException {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(s(), i);
        animatorLoadAnimator.setTarget(view);
        animatorLoadAnimator.addListener(new hqs(view));
        return animatorLoadAnimator;
    }

    private final Animator bJ(ViewGroup viewGroup, int i) {
        Pair pairAW = null;
        while (i < viewGroup.getChildCount()) {
            pairAW = aW(pairAW, bI(viewGroup.getChildAt(i), R.animator.expansion_row_n));
            i++;
        }
        if (pairAW != null) {
            return (Animator) pairAW.first;
        }
        return null;
    }

    @Override // defpackage.hmc
    public final boolean A() {
        return this.ax;
    }

    @Override // defpackage.hmc
    public final boolean B() {
        return true;
    }

    @Override // defpackage.hmc
    public final boolean C() {
        return false;
    }

    @Override // defpackage.hmu
    public final void a() throws Resources.NotFoundException {
        this.ax = false;
        hkx hkxVar = this.bq;
        if (hkxVar == null || ((hky) hkxVar).o == null || this.aK.e() <= 0) {
            return;
        }
        Object objJ = this.aK.j(0);
        if (objJ instanceof hoh) {
            azw azwVarDO = dO(0);
            if (azwVarDO instanceof hns) {
                hns hnsVar = (hns) azwVarDO;
                if (hnsVar.L) {
                    hnsVar.L = false;
                    hnsVar.t(hnsVar.b);
                }
            }
        }
    }

    @Override // defpackage.hrw, defpackage.atx, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        if (this.aQ == gph.a) {
            VerticalGridView verticalGridView = this.b;
            verticalGridView.setWindowAlignment(0);
            verticalGridView.setWindowAlignmentOffset(0);
            verticalGridView.setWindowAlignmentOffsetPercent(50.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04bc  */
    @Override // defpackage.hmu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqw.b():void");
    }

    @Override // defpackage.hmu
    public final void c() {
        this.as = dZ().getResources().getInteger(R.integer.search_enter_duration_ms);
        this.at = AnimationUtils.loadInterpolator(s(), R.anim.enter_curve);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hmu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.bq r3) {
        /*
            r2 = this;
            r0 = 1
            r2.ax = r0
            boolean r0 = r3 instanceof defpackage.hrw
            if (r0 == 0) goto L4e
            hrw r3 = (defpackage.hrw) r3
            int r0 = r3.d
            azw r0 = r3.dO(r0)
            boolean r1 = r0 instanceof defpackage.hox
            if (r1 != 0) goto L1c
            boolean r1 = r0 instanceof defpackage.ayx
            if (r1 == 0) goto L28
            ayx r0 = (defpackage.ayx) r0
            androidx.leanback.widget.HorizontalGridView r0 = r0.a
            goto L20
        L1c:
            hox r0 = (defpackage.hox) r0
            androidx.leanback.widget.HorizontalGridView r0 = r0.b
        L20:
            if (r0 == 0) goto L28
            int r0 = r0.getSelectedPosition()
            r2.au = r0
        L28:
            androidx.leanback.widget.VerticalGridView r3 = r3.b
            r0 = 0
            android.view.View r3 = r3.getChildAt(r0)
            if (r3 == 0) goto L4e
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L3f
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.topMargin
            r2.av = r0
        L3f:
            r0 = 2131427966(0x7f0b027e, float:1.8477563E38)
            android.view.View r3 = r3.findViewById(r0)
            if (r3 == 0) goto L4e
            int r3 = r3.getMeasuredHeight()
            r2.aw = r3
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqw.d(bq):void");
    }

    @Override // defpackage.hrw
    public final void dL() {
        hkx hkxVar = this.bq;
        if (hkxVar == null) {
            return;
        }
        this.aK.s(new hsy(((hky) hkxVar).m));
    }

    @Override // defpackage.hrw
    protected final boolean es() {
        return false;
    }

    @Override // defpackage.hrw
    public final void et(List list) {
        super.et(list);
        if (this.ax || !this.aK.x() || this.d != 0 || this.aK.e() <= 0) {
            return;
        }
        dS(1);
    }

    @Override // defpackage.hmc
    public final boolean z() {
        return false;
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class stg extends ssv {
    final /* synthetic */ stk c;
    private final stj d;
    private final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stg(stk stkVar, xzg xzgVar, stj stjVar, boolean z) {
        super(stkVar, xzgVar);
        this.c = stkVar;
        this.d = stjVar;
        this.e = z;
    }

    @Override // defpackage.ssv, defpackage.stt
    public final AnimatorSet a() {
        snw snwVarC = c();
        if (snwVarC.f("width")) {
            PropertyValuesHolder[] propertyValuesHolderArrG = snwVarC.g("width");
            propertyValuesHolderArrG[0].setFloatValues(this.c.getWidth(), this.d.d());
            snwVarC.e("width", propertyValuesHolderArrG);
        }
        if (snwVarC.f("height")) {
            PropertyValuesHolder[] propertyValuesHolderArrG2 = snwVarC.g("height");
            propertyValuesHolderArrG2[0].setFloatValues(this.c.getHeight(), this.d.a());
            snwVarC.e("height", propertyValuesHolderArrG2);
        }
        if (snwVarC.f("paddingStart")) {
            PropertyValuesHolder[] propertyValuesHolderArrG3 = snwVarC.g("paddingStart");
            propertyValuesHolderArrG3[0].setFloatValues(this.c.getPaddingStart(), this.d.c());
            snwVarC.e("paddingStart", propertyValuesHolderArrG3);
        }
        if (snwVarC.f("paddingEnd")) {
            PropertyValuesHolder[] propertyValuesHolderArrG4 = snwVarC.g("paddingEnd");
            propertyValuesHolderArrG4[0].setFloatValues(this.c.getPaddingEnd(), this.d.b());
            snwVarC.e("paddingEnd", propertyValuesHolderArrG4);
        }
        if (snwVarC.f("labelOpacity")) {
            PropertyValuesHolder[] propertyValuesHolderArrG5 = snwVarC.g("labelOpacity");
            boolean z = this.e;
            propertyValuesHolderArrG5[0].setFloatValues(true != z ? 1.0f : 0.0f, true != z ? 0.0f : 1.0f);
            snwVarC.e("labelOpacity", propertyValuesHolderArrG5);
        }
        return super.b(snwVarC);
    }

    @Override // defpackage.ssv, defpackage.stt
    public final void f() {
        super.f();
        stk stkVar = this.c;
        stkVar.D = false;
        stkVar.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = stkVar.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        stj stjVar = this.d;
        layoutParams.width = stjVar.e().width;
        layoutParams.height = stjVar.e().height;
    }

    @Override // defpackage.ssv, defpackage.stt
    public final void g(Animator animator) {
        super.g(animator);
        stk stkVar = this.c;
        stkVar.C = this.e;
        stkVar.D = true;
        stkVar.setHorizontallyScrolling(true);
    }

    @Override // defpackage.stt
    public final int h() {
        return this.e ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // defpackage.stt
    public final void i() {
        stk stkVar = this.c;
        boolean z = this.e;
        stkVar.C = z;
        ViewGroup.LayoutParams layoutParams = stkVar.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z) {
            stkVar.F = layoutParams.width;
            stkVar.G = layoutParams.height;
        }
        stj stjVar = this.d;
        layoutParams.width = stjVar.e().width;
        layoutParams.height = stjVar.e().height;
        if (z) {
            stkVar.z(stkVar.E);
        } else if (stkVar.getText() != null && stkVar.getText() != "") {
            stkVar.z(ColorStateList.valueOf(0));
        }
        stkVar.setPaddingRelative(stjVar.c(), stkVar.getPaddingTop(), stjVar.b(), stkVar.getPaddingBottom());
        stkVar.requestLayout();
    }

    @Override // defpackage.stt
    public final boolean j() {
        boolean z = this.e;
        stk stkVar = this.c;
        return z == stkVar.C || stkVar.f == null || TextUtils.isEmpty(stkVar.getText());
    }

    @Override // defpackage.stt
    public final void k() {
    }
}

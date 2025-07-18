package defpackage;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dzu implements dva {
    public final eoe d;
    boolean e;

    public dzu(eoe eoeVar) {
        this.d = eoeVar;
    }

    @Override // defpackage.dva
    public final void A(int i, float f) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(((YogaNodeJNIBase) this.d).c, i - 1, f);
    }

    @Override // defpackage.dva
    public final void B(int i, int i2) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(((YogaNodeJNIBase) this.d).c, i - 1, i2);
    }

    @Override // defpackage.dva
    public final void C() {
        YogaNative.jni_YGNodeStyleSetFlexJNI(((YogaNodeJNIBase) this.d).c, 0.0f);
    }

    public void a(int i, float f) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) this.d).c, i - 1, f);
    }

    @Override // defpackage.dva
    public final void b(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(((YogaNodeJNIBase) this.d).c, f);
    }

    @Override // defpackage.dva
    public final void c(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(((YogaNodeJNIBase) this.d).c, f);
    }

    @Override // defpackage.dva
    public final void d(int i) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(((YogaNodeJNIBase) this.d).c, i);
    }

    @Override // defpackage.dva
    public final void e(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(((YogaNodeJNIBase) this.d).c, f);
    }

    @Override // defpackage.dva
    public final void f(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(((YogaNodeJNIBase) this.d).c, f);
    }

    @Override // defpackage.dva
    public final void g(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(((YogaNodeJNIBase) this.d).c, f);
    }

    @Override // defpackage.dva
    public final void h(int i) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(((YogaNodeJNIBase) this.d).c, i);
    }

    @Override // defpackage.dva
    public final void i(eny enyVar) {
        this.d.g(enyVar);
    }

    @Override // defpackage.dva
    public final void j(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(((YogaNodeJNIBase) this.d).c, f);
    }

    @Override // defpackage.dva
    public final void k(int i) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(((YogaNodeJNIBase) this.d).c, i);
    }

    @Override // defpackage.dva
    public final void l(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(((YogaNodeJNIBase) this.d).c, f);
    }

    @Override // defpackage.dva
    public final void m(int i) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(((YogaNodeJNIBase) this.d).c, i);
    }

    @Override // defpackage.dva
    public final void n(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(((YogaNodeJNIBase) this.d).c, f);
    }

    @Override // defpackage.dva
    public final void o(int i) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(((YogaNodeJNIBase) this.d).c, i);
    }

    @Override // defpackage.dva
    public final void p(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(((YogaNodeJNIBase) this.d).c, f);
    }

    @Override // defpackage.dva
    public final void q(int i) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(((YogaNodeJNIBase) this.d).c, i);
    }

    @Override // defpackage.dva
    public final void r(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(((YogaNodeJNIBase) this.d).c, f);
    }

    @Override // defpackage.dva
    public final void s(int i) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(((YogaNodeJNIBase) this.d).c, i);
    }

    @Override // defpackage.dva
    public final void t(int i) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(((YogaNodeJNIBase) this.d).c, i - 1);
    }

    @Override // defpackage.dva
    public final void u(int i) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(((YogaNodeJNIBase) this.d).c, i - 1);
    }

    @Override // defpackage.dva
    public final void v(int i, float f) {
        YogaNative.jni_YGNodeStyleSetGapJNI(((YogaNodeJNIBase) this.d).c, i - 1, f);
    }

    @Override // defpackage.dva
    public final void w(int i, float f) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(((YogaNodeJNIBase) this.d).c, i - 1, f);
    }

    @Override // defpackage.dva
    public final void x(int i, int i2) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(((YogaNodeJNIBase) this.d).c, i - 1, i2);
    }

    @Override // defpackage.dva
    public void y(int i, float f) {
        this.e = true;
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(((YogaNodeJNIBase) this.d).c, i - 1, f);
    }

    @Override // defpackage.dva
    public void z(int i, int i2) {
        this.e = true;
        YogaNative.jni_YGNodeStyleSetPaddingJNI(((YogaNodeJNIBase) this.d).c, i - 1, i2);
    }
}

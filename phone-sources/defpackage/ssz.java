package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ssz implements stj {
    final /* synthetic */ stj a;
    final /* synthetic */ stk b;

    public ssz(stk stkVar, stj stjVar) {
        this.a = stjVar;
        this.b = stkVar;
    }

    @Override // defpackage.stj
    public final int a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        stk stkVar = this.b;
        int i = stkVar.G;
        if (i != -1) {
            return (i == 0 || i == -2) ? this.a.a() : i;
        }
        if (!(stkVar.getParent() instanceof View)) {
            return this.a.a();
        }
        View view = (View) stkVar.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.height == -2) {
            return this.a.a();
        }
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        int i2 = 0;
        if ((stkVar.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) stkVar.getLayoutParams()) != null) {
            i2 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return (view.getHeight() - i2) - paddingTop;
    }

    @Override // defpackage.stj
    public final int b() {
        return this.b.B;
    }

    @Override // defpackage.stj
    public final int c() {
        return this.b.A;
    }

    @Override // defpackage.stj
    public final int d() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        stk stkVar = this.b;
        if (!(stkVar.getParent() instanceof View)) {
            return this.a.d();
        }
        View view = (View) stkVar.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width == -2) {
            return this.a.d();
        }
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        int i = 0;
        if ((stkVar.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) stkVar.getLayoutParams()) != null) {
            i = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return (view.getWidth() - i) - paddingLeft;
    }

    @Override // defpackage.stj
    public final ViewGroup.LayoutParams e() {
        int i = this.b.G;
        if (i == 0) {
            i = -2;
        }
        return new ViewGroup.LayoutParams(-1, i);
    }
}

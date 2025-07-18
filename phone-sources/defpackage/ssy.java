package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ssy implements stj {
    final /* synthetic */ stk a;
    private final /* synthetic */ int b;

    public ssy(stk stkVar, int i) {
        this.b = i;
        this.a = stkVar;
    }

    @Override // defpackage.stj
    public final int a() {
        return this.b != 0 ? this.a.x() : this.a.getMeasuredHeight();
    }

    @Override // defpackage.stj
    public final int b() {
        return this.b != 0 ? this.a.w() : this.a.B;
    }

    @Override // defpackage.stj
    public final int c() {
        return this.b != 0 ? this.a.w() : this.a.A;
    }

    @Override // defpackage.stj
    public final int d() {
        if (this.b != 0) {
            return this.a.x();
        }
        stk stkVar = this.a;
        return ((stkVar.getMeasuredWidth() - stkVar.getPaddingStart()) - stkVar.getPaddingEnd()) + stkVar.A + stkVar.B;
    }

    @Override // defpackage.stj
    public final ViewGroup.LayoutParams e() {
        return this.b != 0 ? new ViewGroup.LayoutParams(d(), a()) : new ViewGroup.LayoutParams(-2, -2);
    }
}

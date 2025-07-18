package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sta implements stj {
    final /* synthetic */ stj a;
    final /* synthetic */ stj b;
    final /* synthetic */ stk c;

    public sta(stk stkVar, stj stjVar, stj stjVar2) {
        this.a = stjVar;
        this.b = stjVar2;
        this.c = stkVar;
    }

    @Override // defpackage.stj
    public final int a() {
        int i = this.c.G;
        return i == -1 ? this.a.a() : (i == 0 || i == -2) ? this.b.a() : i;
    }

    @Override // defpackage.stj
    public final int b() {
        return this.c.B;
    }

    @Override // defpackage.stj
    public final int c() {
        return this.c.A;
    }

    @Override // defpackage.stj
    public final int d() {
        int i = this.c.F;
        return i == -1 ? this.a.d() : (i == 0 || i == -2) ? this.b.d() : i;
    }

    @Override // defpackage.stj
    public final ViewGroup.LayoutParams e() {
        stk stkVar = this.c;
        int i = stkVar.F;
        if (i == 0) {
            i = -2;
        }
        int i2 = stkVar.G;
        return new ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }
}

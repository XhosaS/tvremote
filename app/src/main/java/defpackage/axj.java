package defpackage;

import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class axj extends hz {
    final /* synthetic */ List a;
    final /* synthetic */ axp b;

    public axj(axp axpVar, List list) {
        this.b = axpVar;
        this.a = list;
    }

    @Override // defpackage.hz
    public final int a() {
        return this.b.e.size();
    }

    @Override // defpackage.hz
    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.hz
    public final boolean c(int i, int i2) {
        axh axhVar = (axh) this.a.get(i);
        axh axhVar2 = (axh) this.b.e.get(i2);
        return axhVar == null ? axhVar2 == null : axhVar2 != null && axhVar.d == axhVar2.d && TextUtils.equals(axhVar.b, axhVar2.b) && TextUtils.equals(axhVar.c, axhVar2.c) && axhVar.h == axhVar2.h && TextUtils.equals(axhVar.e, axhVar2.e) && TextUtils.equals(axhVar.f, axhVar2.f) && axhVar.j == axhVar2.j && axhVar.k == axhVar2.k;
    }

    @Override // defpackage.hz
    public final boolean d(int i, int i2) {
        axh axhVar = (axh) this.a.get(i);
        axh axhVar2 = (axh) this.b.e.get(i2);
        return axhVar == null ? axhVar2 == null : axhVar2 != null && axhVar.a == axhVar2.a;
    }

    @Override // defpackage.hz
    public final void e(int i, int i2) {
    }
}

package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class avk implements yjv {
    final /* synthetic */ boolean a;
    final /* synthetic */ yjv b;
    final /* synthetic */ boolean c;
    final /* synthetic */ float d;
    final /* synthetic */ ylz e;

    public avk(boolean z, yjv yjvVar, ylz ylzVar, boolean z2, float f) {
        this.a = z;
        this.b = yjvVar;
        this.e = ylzVar;
        this.c = z2;
        this.d = f;
    }

    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        yjv yjvVar;
        KeyEvent keyEvent = ((brw) obj).a;
        boolean z = false;
        if (!this.a || (yjvVar = this.b) == null) {
            return false;
        }
        int iA = brx.a(keyEvent);
        if (a.r(iA, 2)) {
            ylz ylzVar = this.e;
            float fAbs = Math.abs(((Number) ylzVar.a()).floatValue() - ((Number) ylzVar.b()).floatValue()) / 100.0f;
            int i = true != this.c ? 1 : -1;
            long jB = brx.b(keyEvent);
            if (a.s(jB, brv.d)) {
                yjvVar.a(ykn.s(Float.valueOf(this.d + (i * fAbs)), ylzVar));
            } else if (a.s(jB, brv.e)) {
                yjvVar.a(ykn.s(Float.valueOf(this.d - (i * fAbs)), ylzVar));
            } else if (a.s(jB, brv.g)) {
                yjvVar.a(ykn.s(Float.valueOf(this.d + (i * fAbs)), ylzVar));
            } else if (a.s(jB, brv.f)) {
                yjvVar.a(ykn.s(Float.valueOf(this.d - (i * fAbs)), ylzVar));
            } else if (a.s(jB, brv.m)) {
                yjvVar.a(ylzVar.b());
            } else if (a.s(jB, brv.n)) {
                yjvVar.a(ylzVar.a());
            } else if (a.s(jB, brv.o)) {
                yjvVar.a(ykn.s(Float.valueOf(this.d - (ykn.l(10, 1, 10) * fAbs)), ylzVar));
            } else if (a.s(jB, brv.p)) {
                yjvVar.a(ykn.s(Float.valueOf(this.d + (ykn.l(10, 1, 10) * fAbs)), ylzVar));
            }
            z = true;
        } else if (a.r(iA, 1)) {
            long jB2 = brx.b(keyEvent);
            if (a.s(jB2, brv.d) || a.s(jB2, brv.e) || a.s(jB2, brv.g) || a.s(jB2, brv.f) || a.s(jB2, brv.m) || a.s(jB2, brv.n) || a.s(jB2, brv.o) || a.s(jB2, brv.p)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rkv extends rkr {
    public static final tsl a = new rkv();

    @Override // defpackage.rkr
    public final void a(oaj oajVar, rjm rjmVar) {
        if (!oajVar.h() || "null".equals(oajVar.f())) {
            return;
        }
        rjmVar.c = oajVar.f();
    }

    @Override // defpackage.rkr
    public final void b(oaj oajVar, rjm rjmVar) {
        if (!oajVar.i() || "null".equals(oajVar.g())) {
            return;
        }
        rjmVar.b = oajVar.g();
    }

    @Override // defpackage.rkr
    public final void c(oaj oajVar, rjm rjmVar) {
        DataHolder dataHolder = oajVar.a;
        int i = oajVar.b;
        int i2 = oajVar.c;
        dataHolder.a("is_dasher", i);
        int i3 = dataHolder.d[i2].getInt(i, dataHolder.c.getInt("is_dasher"));
        int i4 = 1;
        if (i3 == 1) {
            i4 = 3;
        } else if (i3 == 2) {
            i4 = 2;
        }
        rjmVar.e(i4);
    }
}

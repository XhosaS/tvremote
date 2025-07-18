package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qoc extends qnu {
    static final yqi a = new qoc();

    @Override // defpackage.qnu
    public final void b(lpr lprVar, qlt qltVar) {
        if (!lprVar.f() || "null".equals(lprVar.d())) {
            return;
        }
        ((qll) qltVar).c = lprVar.d();
    }

    @Override // defpackage.qnu
    public final void c(lpr lprVar, qlt qltVar) {
        if (!lprVar.g() || "null".equals(lprVar.e())) {
            return;
        }
        ((qll) qltVar).b = lprVar.e();
    }

    @Override // defpackage.qnu
    public final void d(lpr lprVar, qlt qltVar) {
        DataHolder dataHolder = lprVar.a;
        int i = lprVar.b;
        int i2 = lprVar.c;
        dataHolder.a("is_dasher", i);
        int i3 = dataHolder.d[i2].getInt(i, dataHolder.c.getInt("is_dasher"));
        int i4 = 1;
        if (i3 == 1) {
            i4 = 3;
        } else if (i3 == 2) {
            i4 = 2;
        }
        ((qll) qltVar).g = i4;
    }
}

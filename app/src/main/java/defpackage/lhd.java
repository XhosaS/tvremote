package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
class lhd extends kuj {
    final /* synthetic */ lhe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhd(lhe lheVar, lco lcoVar) {
        super(lcoVar);
        this.b = lheVar;
    }

    @Override // defpackage.kuj
    public final void b() {
        lhe lheVar = this.b;
        lhg lhgVar = lheVar.d;
        lhgVar.g();
        klk klkVar = lhgVar.y.B;
        lheVar.b(false, false, SystemClock.elapsedRealtime());
        lbk lbkVar = lhgVar.y;
        kst kstVar = lbkVar.m;
        lbkVar.l(kstVar);
        kstVar.e(SystemClock.elapsedRealtime());
    }
}

package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class owq extends xtc {
    final /* synthetic */ owt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owq(wbb wbbVar, owt owtVar) {
        super(wbbVar);
        this.a = owtVar;
    }

    @Override // defpackage.wbb
    public final void a(xtk xtkVar, xsm xsmVar) {
        owt owtVar = this.a;
        synchronized (owtVar.a) {
            if (!owtVar.c) {
                owtVar.c = true;
                ows owsVar = owtVar.b;
                if (owsVar == null) {
                    rtg rtgVar = owtVar.d;
                    rtgVar.s = xtkVar.n.r;
                    rmr.a().e(rtgVar);
                } else {
                    synchronized (owsVar.a) {
                        rtg rtgVar2 = owsVar.b;
                        int i = owsVar.d;
                        int i2 = owsVar.e;
                        rtgVar2.c = SystemClock.elapsedRealtime() - rtgVar2.a;
                        rtgVar2.d = i;
                        rtgVar2.e = i2;
                        rtgVar2.s = xtkVar.n.r;
                        rmr.a().e(rtgVar2);
                        owsVar.c = true;
                    }
                }
            }
        }
        this.f.a(xtkVar, xsmVar);
    }
}

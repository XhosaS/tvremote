package defpackage;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rnu implements rnr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public rnu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, xbw] */
    @Override // defpackage.rnr
    public final boolean a(vtw vtwVar) throws PackageManager.NameNotFoundException {
        int i = this.b;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            vtw vtwVarM = rnj.a.m();
            vtw vtwVarM2 = rnk.a.m();
            vwe vweVarE = vxf.e(Instant.now().toEpochMilli() - (SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime()));
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            rnk rnkVar = (rnk) vtwVarM2.b;
            vweVarE.getClass();
            rnkVar.c = vweVarE;
            rnkVar.b |= 1;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            Object obj = this.a;
            rnj rnjVar = (rnj) vtwVarM.b;
            rnk rnkVar2 = (rnk) vtwVarM2.r();
            rnkVar2.getClass();
            rnjVar.c = rnkVar2;
            rnjVar.b = 2;
            vtwVar.bu(vtwVarM);
            if (!((Boolean) ((rnv) obj).a.b()).booleanValue()) {
                long jMyPid = Process.myPid();
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                rnn rnnVar = (rnn) vtwVar.b;
                rnn rnnVar2 = rnn.a;
                rnnVar.b |= 1;
                rnnVar.c = jMyPid;
                vwe vweVarE2 = vxf.e(Instant.now().toEpochMilli());
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                rnn rnnVar3 = (rnn) vtwVar.b;
                vweVarE2.getClass();
                rnnVar3.d = vweVarE2;
                rnnVar3.b |= 2;
            }
            return true;
        }
        rnx rnxVar = (rnx) this.a;
        if (!((Boolean) rnxVar.d.b()).booleanValue()) {
            return false;
        }
        vtw vtwVarM3 = rnm.a.m();
        ldb ldbVar = (ldb) rnxVar.a;
        if (ldbVar.a() != null) {
            String strA = ldbVar.a();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            rnm rnmVar = (rnm) vtwVarM3.b;
            strA.getClass();
            rnmVar.b |= 1;
            rnmVar.c = strA;
        }
        rqh rqhVar = (rqh) rnxVar.b;
        if (rqhVar.b().intValue() > 0) {
            int iIntValue = rqhVar.b().intValue();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            rnm rnmVar2 = (rnm) vtwVarM3.b;
            rnmVar2.b = 2 | rnmVar2.b;
            rnmVar2.d = iIntValue;
        }
        yfo yfoVar = rnxVar.c;
        if (((Integer) yfoVar.b()).intValue() > 0) {
            int iIntValue2 = ((Integer) yfoVar.b()).intValue();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            rnm rnmVar3 = (rnm) vtwVarM3.b;
            rnmVar3.b |= 4;
            rnmVar3.e = iIntValue2;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        rnm rnmVar4 = (rnm) vtwVarM3.b;
        rnmVar4.b |= 8;
        rnmVar4.f = i2;
        vtw vtwVarM4 = rnj.a.m();
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        rnj rnjVar2 = (rnj) vtwVarM4.b;
        rnm rnmVar5 = (rnm) vtwVarM3.r();
        rnmVar5.getClass();
        rnjVar2.c = rnmVar5;
        rnjVar2.b = 4;
        rnj rnjVar3 = (rnj) vtwVarM4.r();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        rnn rnnVar4 = (rnn) vtwVar.b;
        rnn rnnVar5 = rnn.a;
        rnjVar3.getClass();
        rnnVar4.b();
        rnnVar4.e.add(rnjVar3);
        return true;
    }
}

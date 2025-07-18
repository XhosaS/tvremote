package defpackage;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ark implements arc {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ark(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.arc
    public final boolean a(clo cloVar) {
        if (this.b != 0) {
            clo cloVarO = aqu.a.o();
            clo cloVarO2 = aqv.a.o();
            cnv cnvVarA = con.a(Instant.now().toEpochMilli() - (SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime()));
            if (!cloVarO2.b.A()) {
                cloVarO2.l();
            }
            aqv aqvVar = (aqv) cloVarO2.b;
            cnvVarA.getClass();
            aqvVar.c = cnvVarA;
            aqvVar.b |= 1;
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            Object obj = this.a;
            aqu aquVar = (aqu) cloVarO.b;
            aqv aqvVar2 = (aqv) cloVarO2.i();
            aqvVar2.getClass();
            aquVar.c = aqvVar2;
            aquVar.b = 2;
            cloVar.T(cloVarO);
            if (!((Boolean) ((arf) obj).a.a()).booleanValue()) {
                long jMyPid = Process.myPid();
                if (!cloVar.b.A()) {
                    cloVar.l();
                }
                aqy aqyVar = (aqy) cloVar.b;
                aqy aqyVar2 = aqy.a;
                aqyVar.b |= 1;
                aqyVar.c = jMyPid;
                cnv cnvVarA2 = con.a(Instant.now().toEpochMilli());
                if (!cloVar.b.A()) {
                    cloVar.l();
                }
                aqy aqyVar3 = (aqy) cloVar.b;
                cnvVarA2.getClass();
                aqyVar3.d = cnvVarA2;
                aqyVar3.b |= 2;
            }
            return true;
        }
        arl arlVar = (arl) this.a;
        if (!((Boolean) arlVar.d.a()).booleanValue()) {
            return false;
        }
        clo cloVarO3 = aqx.a.o();
        aul aulVar = (aul) arlVar.a;
        if (aulVar.a() != null) {
            String strA = aulVar.a();
            if (!cloVarO3.b.A()) {
                cloVarO3.l();
            }
            aqx aqxVar = (aqx) cloVarO3.b;
            strA.getClass();
            aqxVar.b |= 1;
            aqxVar.c = strA;
        }
        auk aukVar = (auk) arlVar.b;
        if (aukVar.a().intValue() > 0) {
            int iIntValue = aukVar.a().intValue();
            if (!cloVarO3.b.A()) {
                cloVarO3.l();
            }
            aqx aqxVar2 = (aqx) cloVarO3.b;
            aqxVar2.b = 2 | aqxVar2.b;
            aqxVar2.d = iIntValue;
        }
        crv crvVar = arlVar.c;
        if (((Integer) crvVar.a()).intValue() > 0) {
            int iIntValue2 = ((Integer) crvVar.a()).intValue();
            if (!cloVarO3.b.A()) {
                cloVarO3.l();
            }
            aqx aqxVar3 = (aqx) cloVarO3.b;
            aqxVar3.b |= 4;
            aqxVar3.e = iIntValue2;
        }
        int i = Build.VERSION.SDK_INT;
        if (!cloVarO3.b.A()) {
            cloVarO3.l();
        }
        aqx aqxVar4 = (aqx) cloVarO3.b;
        aqxVar4.b |= 8;
        aqxVar4.f = i;
        clo cloVarO4 = aqu.a.o();
        if (!cloVarO4.b.A()) {
            cloVarO4.l();
        }
        aqu aquVar2 = (aqu) cloVarO4.b;
        aqx aqxVar5 = (aqx) cloVarO3.i();
        aqxVar5.getClass();
        aquVar2.c = aqxVar5;
        aquVar2.b = 4;
        aqu aquVar3 = (aqu) cloVarO4.i();
        if (!cloVar.b.A()) {
            cloVar.l();
        }
        aqy aqyVar4 = (aqy) cloVar.b;
        aqy aqyVar5 = aqy.a;
        aquVar3.getClass();
        aqyVar4.b();
        aqyVar4.e.add(aquVar3);
        return true;
    }
}

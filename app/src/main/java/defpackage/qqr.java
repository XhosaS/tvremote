package defpackage;

import android.os.Process;
import android.os.SystemClock;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qqr implements qql {
    final /* synthetic */ qqs a;

    public qqr(qqs qqsVar) {
        this.a = qqsVar;
    }

    @Override // defpackage.qql
    public final boolean a(qpw qpwVar) {
        qpy qpyVar = qpy.a;
        qpx qpxVar = new qpx();
        qqa qqaVar = qqa.a;
        qpz qpzVar = new qpz();
        abzy abzyVarC = acbj.c(Instant.now().toEpochMilli() - (SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime()));
        if ((qpzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            qpzVar.y();
        }
        qqa qqaVar2 = (qqa) qpzVar.b;
        abzyVarC.getClass();
        qqaVar2.c = abzyVarC;
        qqaVar2.b |= 1;
        if ((qpxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            qpxVar.y();
        }
        qqs qqsVar = this.a;
        qpy qpyVar2 = (qpy) qpxVar.b;
        qqa qqaVar3 = (qqa) qpzVar.v();
        qqaVar3.getClass();
        qpyVar2.c = qqaVar3;
        qpyVar2.b = 2;
        qpwVar.a(qpxVar);
        if (!((Boolean) qqsVar.a.a()).booleanValue()) {
            long jMyPid = Process.myPid();
            if ((qpwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                qpwVar.y();
            }
            qqh qqhVar = (qqh) qpwVar.b;
            qqh qqhVar2 = qqh.a;
            qqhVar.b |= 1;
            qqhVar.c = jMyPid;
            abzy abzyVarC2 = acbj.c(Instant.now().toEpochMilli());
            if ((qpwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                qpwVar.y();
            }
            qqh qqhVar3 = (qqh) qpwVar.b;
            abzyVarC2.getClass();
            qqhVar3.d = abzyVarC2;
            qqhVar3.b |= 2;
        }
        return true;
    }
}

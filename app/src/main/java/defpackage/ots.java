package defpackage;

import android.os.SystemClock;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
class ots extends afgc {
    final /* synthetic */ otw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ots(afep afepVar, otw otwVar) {
        super(afepVar);
        this.a = otwVar;
    }

    @Override // defpackage.afep
    public final void a(Status status, afih afihVar) {
        otw otwVar = this.a;
        synchronized (otwVar.a) {
            if (!otwVar.c) {
                otwVar.c = true;
                otu otuVar = otwVar.b;
                if (otuVar == null) {
                    qzv qzvVar = otwVar.d;
                    qzvVar.r = status.getCode().value();
                    qpk.a().f(qzvVar);
                } else {
                    synchronized (otuVar.a) {
                        qzv qzvVar2 = otuVar.b;
                        int i = otuVar.d;
                        int i2 = otuVar.e;
                        qzvVar2.c = SystemClock.elapsedRealtime() - qzvVar2.a;
                        qzvVar2.d = i;
                        qzvVar2.e = i2;
                        qzvVar2.r = status.getCode().value();
                        qpk.a().f(qzvVar2);
                        otuVar.c = true;
                    }
                }
            }
        }
        i().a(status, afihVar);
    }
}

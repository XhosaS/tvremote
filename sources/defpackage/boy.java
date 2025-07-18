package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class boy extends Handler {
    final /* synthetic */ boz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boy(boz bozVar, Looper looper) {
        super(looper);
        this.a = bozVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            boz bozVar = this.a;
            int i2 = bozVar.f + 1;
            bozVar.f = i2;
            cbs cbsVar = (cbs) ((cbs) bpa.a.c().g(btt.a)).j("com/google/android/tv/remote/service/PingFeature$ClientMessageHandler$1", "handleMessage", 103, "PingFeature.java");
            bug bugVar = bozVar.a;
            cbsVar.y("%s ping is late (missed %d ping(s))", bugVar, i2);
            if (i2 < 3) {
                bozVar.g();
                return;
            }
            bugVar.b();
            bozVar.k.c.a(1012, true != bozVar.b ? 0L : 1L);
            return;
        }
        removeMessages(2);
        boz bozVar2 = this.a;
        bozVar2.c++;
        bozVar2.g = SystemClock.uptimeMillis();
        clo cloVarO = bvw.a.o();
        clo cloVarO2 = bvq.a.o();
        int i3 = bozVar2.c;
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        clt cltVar = cloVarO2.b;
        bvq bvqVar = (bvq) cltVar;
        bvqVar.b |= 1;
        bvqVar.c = i3;
        long j = bozVar2.g;
        if (!cltVar.A()) {
            cloVarO2.l();
        }
        bvq bvqVar2 = (bvq) cloVarO2.b;
        bvqVar2.b |= 2;
        bvqVar2.d = j;
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bug bugVar2 = bozVar2.a;
        bvw bvwVar = (bvw) cloVarO.b;
        bvq bvqVar3 = (bvq) cloVarO2.i();
        bvqVar3.getClass();
        bvwVar.c = bvqVar3;
        bvwVar.b = 8;
        bugVar2.d((bvw) cloVarO.i());
        sendMessageDelayed(obtainMessage(2), true != bozVar2.b ? 5000 : 1500);
    }
}

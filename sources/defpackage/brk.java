package defpackage;

import android.os.SystemClock;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class brk implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ brk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            int iIntValue = ((Integer) obj).intValue();
            brf brfVar = (brf) this.a;
            if (brfVar.k) {
                return;
            }
            ((cbs) brf.a.b().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection", "requestMTU", 143, "BleDeviceConnection.java")).x("Requesting new MTU %d for %s", iIntValue, brfVar.i.getDevice());
            brfVar.i.requestMtu(iIntValue);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                brf brfVar2 = (brf) this.a;
                AtomicReference atomicReference = brfVar2.h;
                byte[] bArr = (byte[]) obj;
                if (atomicReference.get() == bre.DISCONNECTED) {
                    return;
                }
                brfVar2.l.add(bArr);
                if (sd.g(atomicReference, bre.READY, bre.CHARACTERISTIC_WRITE)) {
                    brfVar2.c(brfVar2.i);
                    return;
                } else {
                    ((cbs) brf.a.c().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection", "sendCommand", 191, "BleDeviceConnection.java")).u("Queueing command 0x%02X to %s", bArr[0], brfVar2.i.getDevice());
                    return;
                }
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            cbt cbtVar = bsi.a;
            ((cbs) cbtVar.c().j("com/google/android/tv/remote/service/clearcut/EnabledClearcutLogger", "handleUsageReportingOptIn", 48, "EnabledClearcutLogger.java")).t("Usage reporting is %s", true != zBooleanValue ? "disabled" : "enabled");
            Object obj2 = this.a;
            bsi bsiVar = (bsi) obj2;
            bsiVar.e = zBooleanValue;
            if (bsiVar.f != null) {
                synchronized (obj2) {
                    if (((bsi) obj2).f != null) {
                        if (zBooleanValue) {
                            ((cbs) ((cbs) cbtVar.c().g(btt.a)).j("com/google/android/tv/remote/service/clearcut/EnabledClearcutLogger", "handleUsageReportingOptIn", 58, "EnabledClearcutLogger.java")).r("Logging %d pending clearcut messages", ((bsi) obj2).f.size());
                            Iterator it = ((bsi) obj2).f.iterator();
                            while (it.hasNext()) {
                                ((bsi) obj2).b.e((bse) it.next(), apm.a(((bsi) obj2).d, ((bsi) obj2).g)).b();
                            }
                        } else {
                            ((cbs) ((cbs) cbtVar.c().g(btt.a)).j("com/google/android/tv/remote/service/clearcut/EnabledClearcutLogger", "handleUsageReportingOptIn", 68, "EnabledClearcutLogger.java")).r("Dropping %d pending clearcut messages", ((bsi) obj2).f.size());
                        }
                    }
                    ((bsi) obj2).f = null;
                }
                return;
            }
            return;
        }
        bqb bqbVar = (bqb) this.a;
        clo cloVar = (clo) obj;
        int iE = bqbVar.b.e();
        clo cloVarO = bsh.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bsh bshVar = (bsh) cloVarO.b;
        long j = bqbVar.a;
        bshVar.d = iE - 1;
        bshVar.b = 2 | bshVar.b;
        long jUptimeMillis = SystemClock.uptimeMillis() - j;
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bqc bqcVar = bqbVar.e;
        bsh bshVar2 = (bsh) cloVarO.b;
        bshVar2.b = 1 | bshVar2.b;
        bshVar2.c = jUptimeMillis;
        bsi bsiVar2 = bqcVar.g;
        clo cloVarC = bsiVar2.c(303);
        if (!cloVarC.b.A()) {
            cloVarC.l();
        }
        bse bseVar = (bse) cloVarC.b;
        bsh bshVar3 = (bsh) cloVarO.i();
        bse bseVar2 = bse.a;
        bshVar3.getClass();
        bseVar.e = bshVar3;
        bseVar.b |= 8;
        if (!cloVarC.b.A()) {
            cloVarC.l();
        }
        bse bseVar3 = (bse) cloVarC.b;
        bst bstVar = (bst) cloVar.i();
        bstVar.getClass();
        bseVar3.g = bstVar;
        bseVar3.b |= 32;
        bsiVar2.b(cloVarC);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}

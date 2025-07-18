package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ata implements byb {
    private final /* synthetic */ int a;

    public /* synthetic */ ata(int i) {
        this.a = i;
    }

    @Override // defpackage.byb
    public final Object a(Object obj) {
        String strB;
        String strB2;
        String strB3;
        switch (this.a) {
            case 0:
                return byg.g(((ActivityManager.RunningAppProcessInfo) obj).importanceReasonComponent);
            case 1:
                return ((aot) obj).b;
            case 2:
                cyt cytVar = (cyt) obj;
                clo cloVarO = cyq.a.o();
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cyq cyqVar = (cyq) cloVarO.b;
                cytVar.getClass();
                cyqVar.d = cytVar;
                cyqVar.c = 3;
                clo cloVarO2 = cyp.a.o();
                if (!cloVarO2.b.A()) {
                    cloVarO2.l();
                }
                cyp.h((cyp) cloVarO2.b);
                cyp cypVar = (cyp) cloVarO2.i();
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cyq cyqVar2 = (cyq) cloVarO.b;
                cypVar.getClass();
                cyqVar2.e = cypVar;
                cyqVar2.b |= 1;
                return (cyq) cloVarO.i();
            case 3:
                cxl cxlVar = (cxl) obj;
                clo cloVarO3 = cyq.a.o();
                if (!cloVarO3.b.A()) {
                    cloVarO3.l();
                }
                cyq cyqVar3 = (cyq) cloVarO3.b;
                cxlVar.getClass();
                cyqVar3.d = cxlVar;
                cyqVar3.c = 1;
                clo cloVarO4 = cyp.a.o();
                if (!cloVarO4.b.A()) {
                    cloVarO4.l();
                }
                cyp.h((cyp) cloVarO4.b);
                cyp cypVar2 = (cyp) cloVarO4.i();
                if (!cloVarO3.b.A()) {
                    cloVarO3.l();
                }
                cyq cyqVar4 = (cyq) cloVarO3.b;
                cypVar2.getClass();
                cyqVar4.e = cypVar2;
                cyqVar4.b |= 1;
                return (cyq) cloVarO3.i();
            case 4:
                return bzs.o((List) obj);
            case 5:
                ((cbs) ((cbs) aqn.a.g().i((RuntimeException) obj)).j("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "record", 419, "MemoryMetricServiceImpl.java")).p("Metric extension provider failed.");
                return null;
            case 6:
                return Integer.valueOf(Integer.parseInt((String) obj));
            case 7:
                Log.e("CheckboxChecker", "fetching usage reporting opt-in failed", (Throwable) obj);
                return true;
            case 8:
                return cju.a((String) obj);
            case 9:
                return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
            case 10:
                bbh bbhVar = (bbh) obj;
                if (bbhVar.a != 29514) {
                    throw bbhVar;
                }
                clo cloVarO5 = bbv.a.o();
                clo cloVarO6 = bbr.b.o();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!cloVarO6.b.A()) {
                    cloVarO6.l();
                }
                bbr bbrVar = (bbr) cloVarO6.b;
                bbrVar.c |= 8;
                bbrVar.g = jCurrentTimeMillis;
                if (!cloVarO5.b.A()) {
                    cloVarO5.l();
                }
                bbv bbvVar = (bbv) cloVarO5.b;
                bbr bbrVar2 = (bbr) cloVarO6.i();
                bbrVar2.getClass();
                bbvVar.c = bbrVar2;
                bbvVar.b |= 1;
                return (bbv) cloVarO5.i();
            case 11:
                Context context = (Context) obj;
                String str = cpq.a;
                if (str != null) {
                    return str;
                }
                synchronized (cpq.class) {
                    strB = cpq.a;
                    if (strB == null) {
                        strB = bar.b(context, "com.google.android.gms.clearcut_client");
                        cpq.a = strB;
                    }
                }
                return strB;
            case 12:
                Context context2 = (Context) obj;
                String str2 = cpx.a;
                if (str2 != null) {
                    return str2;
                }
                synchronized (cpx.class) {
                    strB2 = cpx.a;
                    if (strB2 == null) {
                        strB2 = bar.b(context2, "com.google.android.libraries.consentverifier");
                        cpx.a = strB2;
                    }
                }
                return strB2;
            default:
                Context context3 = (Context) obj;
                String str3 = cqc.a;
                if (str3 != null) {
                    return str3;
                }
                synchronized (cqc.class) {
                    strB3 = cqc.a;
                    if (strB3 == null) {
                        strB3 = bar.b(context3, "com.google.android.libraries.performance.primes");
                        cqc.a = strB3;
                    }
                }
                return strB3;
        }
    }
}

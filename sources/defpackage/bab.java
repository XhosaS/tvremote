package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.libraries.performance.primes.transmitter.LifeboatReceiver;
import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bab implements byb {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bab(bck bckVar, adh adhVar, int i) {
        this.c = i;
        this.b = bckVar;
        this.a = adhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.byb
    public final Object a(Object obj) {
        int i = this.c;
        if (i == 0) {
            azo azoVar = (azo) obj;
            clo cloVar = (clo) azoVar.a(5, null);
            cloVar.n(azoVar);
            clq clqVar = (clq) cloVar;
            if (!clqVar.b.A()) {
                clqVar.l();
            }
            Object obj2 = this.b;
            Object obj3 = this.a;
            azo azoVar2 = (azo) clqVar.b;
            azo azoVar3 = azo.a;
            obj2.getClass();
            azoVar2.c = (cym) obj2;
            azoVar2.b |= 1;
            azo azoVar4 = (azo) clqVar.i();
            bdl bdlVar = (bdl) obj3;
            String[] strArr = {bdlVar.e.getClass().getName()};
            Intent intent = new Intent();
            Context context = (Context) bdlVar.c;
            intent.setComponent(new ComponentName(context, (Class<?>) LifeboatReceiver.class));
            intent.setPackage(context.getPackageName());
            intent.putExtra("Transmitters", strArr);
            intent.putExtra("MetricSnapshot", azoVar4.g());
            context.sendBroadcast(intent);
            return null;
        }
        if (i == 1) {
            int i2 = 0;
            cwg cwgVar = (cwg) ((bzs) this.b).get(0);
            while (true) {
                Object obj4 = this.a;
                if (((SharedPreferences) ((avu) obj4).d.a()).edit().putString("lastExitProcessName", cwgVar.c).putLong("lastExitTimestamp", cwgVar.g).commit()) {
                    break;
                }
                i2++;
                if (i2 >= 3) {
                    ((cbs) aqn.a.g().j("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl", "updateLastRecordedAppExit", 220, "ApplicationExitMetricServiceImpl.java")).p("Failed to persist most recent App Exit");
                    break;
                }
            }
            return null;
        }
        if (i == 2) {
            return (bcj) ((bck) this.b).a.a.get(new byh((String) obj, ((adh) this.a).g));
        }
        bbz bbzVar = (bbz) obj;
        int i3 = bcw.a;
        Object obj5 = this.a;
        bbx bbxVar = bbx.a;
        obj5.getClass();
        cmu cmuVar = bbzVar.b;
        if (cmuVar.containsKey(obj5)) {
            bbxVar = (bbx) cmuVar.get(obj5);
        }
        Object obj6 = this.b;
        clo cloVar2 = (clo) bbxVar.a(5, null);
        cloVar2.n(bbxVar);
        if (!DesugarCollections.unmodifiableList(((bbx) cloVar2.b).c).contains(obj6)) {
            cloVar2.p((String) obj6);
        }
        clo cloVar3 = (clo) bbzVar.a(5, null);
        cloVar3.n(bbzVar);
        if (!cloVar2.b.A()) {
            cloVar2.l();
        }
        bbx bbxVar2 = (bbx) cloVar2.b;
        bbxVar2.b = 1 | bbxVar2.b;
        bbxVar2.d = (String) obj6;
        cloVar3.q((String) obj5, (bbx) cloVar2.i());
        return (bbz) cloVar3.i();
    }

    public /* synthetic */ bab(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ bab(String str, int i) {
        this.c = i;
        this.a = str;
        this.b = "";
    }
}

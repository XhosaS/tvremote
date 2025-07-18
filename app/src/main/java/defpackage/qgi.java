package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qgi implements pks {
    private final ujk a;
    private final vtm b;
    private final yqt c;

    public qgi(ujk ujkVar, vtm vtmVar, yqt yqtVar) {
        this.a = ujkVar;
        this.b = vtmVar;
        this.c = yqtVar;
    }

    @Override // defpackage.pks
    public final void a(String str, long j, int i, yqt yqtVar) {
        StringBuilder sb = new StringBuilder("Scheduling periodic tasks for MDD lib ");
        String strA = vth.a(str, this.c);
        sb.append(strA);
        sb.append(" ");
        sb.append(j);
        Log.d("MDDTikTokTaskScheduler", sb.toString());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("MDD_TASK_TAG_KEY", str);
        linkedHashMap.put("MDD_TASK_PERIOD_HOURS_KEY", Long.valueOf(j / 3600));
        linkedHashMap.put("MDD_TASK_NETWORK_STATE_KEY", pkr.a(i));
        boolean z = false;
        Boolean bool = (Boolean) yqtVar.b(new yqi() { // from class: qfx
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return Boolean.valueOf(((pkq) obj).a());
            }
        }).e(false);
        bool.booleanValue();
        linkedHashMap.put("MDD_TASK_REQUIRES_BATTERY_NOT_LOW_KEY", bool);
        int i2 = 1;
        Boolean bool2 = (Boolean) yqtVar.b(new yqi() { // from class: qfy
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return Boolean.valueOf(((pkq) obj).b());
            }
        }).e(true);
        bool2.booleanValue();
        linkedHashMap.put("MDD_TASK_REQUIRES_CHARGING_KEY", bool2);
        Boolean bool3 = (Boolean) yqtVar.b(new yqi() { // from class: qfz
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return Boolean.valueOf(((pkq) obj).c());
            }
        }).e(true);
        bool3.booleanValue();
        linkedHashMap.put("MDD_TASK_REQUIRES_DEVICE_IDLE_KEY", bool3);
        caz cazVarA = cav.a(linkedHashMap);
        vto vtoVarN = vts.n(qgd.class);
        cao caoVar = new cao();
        caoVar.b = yqtVar.g() ? ((pkq) yqtVar.c()).c() : true;
        caoVar.a = yqtVar.g() ? ((pkq) yqtVar.c()).b() : true;
        if (yqtVar.g() && ((pkq) yqtVar.c()).a()) {
            z = true;
        }
        caoVar.c = z;
        int i3 = i - 1;
        if (i3 == 0) {
            i2 = 2;
        } else if (i3 != 2) {
            i2 = 3;
        }
        caoVar.b(i2);
        vtb vtbVar = (vtb) vtoVarN;
        vtbVar.b = caoVar.a();
        vtbVar.g = yqt.i(new vtf(strA, 3));
        vtbVar.f = yqt.i(new vtd(new vte(j, TimeUnit.SECONDS), ypv.a));
        vtbVar.e = cazVarA;
        zyd zydVarC = this.b.c(vtoVarN.b());
        qgh qghVar = new qgh(strA, j);
        zwk zwkVar = zwk.a;
        zxn.p(zydVarC, wyo.f(qghVar), zwkVar);
        this.a.a(new yqi() { // from class: qgg
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return qfw.a;
            }
        }, zwkVar);
    }
}

package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsl implements Runnable {
    final /* synthetic */ gso a;

    public gsl(gso gsoVar) {
        this.a = gsoVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        gso gsoVar;
        hx hxVar;
        List<cb> listA;
        gso gsoVar2 = this.a;
        List list = gsoVar2.g;
        synchronized (list) {
            gsoVar2.h = (Intent) list.get(0);
        }
        gso gsoVar3 = this.a;
        Intent intent = gsoVar3.h;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = gsoVar3.h.getIntExtra("KEY_START_ID", 0);
            gpn.b();
            Objects.toString(gsoVar3.h);
            PowerManager.WakeLock wakeLockA = gvs.a(gsoVar3.b, action + " (" + intExtra + ")");
            try {
                gpn.b();
                Objects.toString(wakeLockA);
                wakeLockA.acquire();
                gsh gshVar = gsoVar3.f;
                Intent intent2 = gsoVar3.h;
                String action2 = intent2.getAction();
                if ("ACTION_CONSTRAINTS_CHANGED".equals(action2)) {
                    gpn.b();
                    Objects.toString(intent2);
                    int i2 = gsj.a;
                    Context context = gshVar.b;
                    grs grsVar = gsoVar3.e;
                    cb cbVar = new cb(grsVar.i);
                    List<guw> listH = grsVar.c.D().h();
                    int i3 = gsi.a;
                    Iterator it = listH.iterator();
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    while (it.hasNext()) {
                        gou gouVar = ((guw) it.next()).k;
                        z |= gouVar.e;
                        z2 |= gouVar.c;
                        z3 |= gouVar.f;
                        z4 |= gouVar.j != 1;
                        if (z && z2 && z3 && z4) {
                            break;
                        }
                    }
                    int i4 = ConstraintProxyUpdateReceiver.a;
                    Intent intent3 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
                    intent3.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
                    intent3.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
                    context.sendBroadcast(intent3);
                    ArrayList arrayList = new ArrayList(listH.size());
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (guw guwVar : listH) {
                        if (jCurrentTimeMillis >= guwVar.a() && (!guwVar.c() || cbVar.l(guwVar))) {
                            arrayList.add(guwVar);
                        }
                    }
                    int size = arrayList.size();
                    for (i = 0; i < size; i++) {
                        guw guwVar2 = (guw) arrayList.get(i);
                        String str = guwVar2.b;
                        Intent intentC = gsh.c(context, fki.aM(guwVar2));
                        gpn.b();
                        gsoVar3.k.a.execute(new gsm(gsoVar3, intentC, intExtra));
                    }
                } else if ("ACTION_RESCHEDULE".equals(action2)) {
                    gpn.b();
                    Objects.toString(intent2);
                    gsoVar3.e.j();
                } else {
                    Bundle extras = intent2.getExtras();
                    String[] strArr = {"KEY_WORKSPEC_ID"};
                    if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
                        gpn.b();
                        Log.e(gsh.a, "Invalid request for " + action2 + " , requires KEY_WORKSPEC_ID .");
                    } else if ("ACTION_SCHEDULE_WORK".equals(action2)) {
                        gun gunVarE = gsh.e(intent2);
                        gpn.b();
                        Objects.toString(gunVarE);
                        gunVarE.toString();
                        WorkDatabase workDatabase = gsoVar3.e.c;
                        workDatabase.o();
                        try {
                            guw guwVarC = workDatabase.D().c(gunVarE.a);
                            if (guwVarC == null) {
                                gpn.b();
                                Log.w(gsh.a, a.cj(gunVarE, "Skipping scheduling ", " because it's no longer in the DB"));
                            } else if (guwVarC.c.a()) {
                                gpn.b();
                                Log.w(gsh.a, a.cj(gunVarE, "Skipping scheduling ", "because it is finished."));
                            } else {
                                long jA = guwVarC.a();
                                if (guwVarC.c()) {
                                    gpn.b();
                                    Objects.toString(gunVarE);
                                    Context context2 = gshVar.b;
                                    gsg.b(context2, workDatabase, gunVarE, jA);
                                    gsoVar3.k.a.execute(new gsm(gsoVar3, gsh.b(context2), intExtra));
                                } else {
                                    gpn.b();
                                    Objects.toString(gunVarE);
                                    gsg.b(gshVar.b, workDatabase, gunVarE, jA);
                                }
                                workDatabase.r();
                            }
                            workDatabase.p();
                        } catch (Throwable th) {
                            workDatabase.p();
                            throw th;
                        }
                    } else if ("ACTION_DELAY_MET".equals(action2)) {
                        synchronized (gshVar.d) {
                            gun gunVarE2 = gsh.e(intent2);
                            gpn.b();
                            Objects.toString(gunVarE2);
                            Map map = gshVar.c;
                            if (map.containsKey(gunVarE2)) {
                                gpn.b();
                                Objects.toString(gunVarE2);
                            } else {
                                gsk gskVar = new gsk(gshVar.b, intExtra, gsoVar3, gshVar.e.d(gunVarE2));
                                map.put(gunVarE2, gskVar);
                                String str2 = gskVar.c.a;
                                gskVar.h = gvs.a(gskVar.a, str2 + " (" + gskVar.b + ")");
                                gpn.b();
                                Objects.toString(gskVar.h);
                                gskVar.h.acquire();
                                guw guwVarC2 = gskVar.d.e.c.D().c(str2);
                                if (guwVarC2 == null) {
                                    gskVar.f.execute(new gfe(gskVar, 9));
                                } else {
                                    boolean zC = guwVarC2.c();
                                    gskVar.i = zC;
                                    if (zC) {
                                        gskVar.k = gta.a(gskVar.l, guwVarC2, gskVar.j, gskVar);
                                    } else {
                                        gpn.b();
                                        gskVar.f.execute(new gfe(gskVar, 10));
                                    }
                                }
                            }
                        }
                    } else if ("ACTION_STOP_WORK".equals(action2)) {
                        Bundle extras2 = intent2.getExtras();
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                            int i5 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                            listA = new ArrayList(1);
                            cb cbVarC = gshVar.e.c(new gun(string, i5));
                            if (cbVarC != null) {
                                listA.add(cbVarC);
                            }
                        } else {
                            listA = gshVar.e.a(string);
                        }
                        for (cb cbVar2 : listA) {
                            gpn.b();
                            fki.bc(gsoVar3.j, cbVar2);
                            Context context3 = gshVar.b;
                            WorkDatabase workDatabase2 = gsoVar3.e.c;
                            Object obj = cbVar2.a;
                            int i6 = gsg.a;
                            guk gukVarA = workDatabase2.A();
                            guj gujVarA = gukVarA.a((gun) obj);
                            if (gujVarA != null) {
                                gsg.a(context3, (gun) obj, gujVarA.c);
                                gpn.b();
                                Objects.toString(obj);
                                gukVarA.d((gun) obj);
                            }
                            gsoVar3.a((gun) obj, false);
                        }
                    } else if ("ACTION_EXECUTION_COMPLETED".equals(action2)) {
                        gun gunVarE3 = gsh.e(intent2);
                        boolean z5 = intent2.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                        gpn.b();
                        Objects.toString(intent2);
                        gshVar.a(gunVarE3, z5);
                    } else {
                        gpn.b();
                        String str3 = gsh.a;
                        Objects.toString(intent2);
                        Log.w(str3, "Ignoring intent ".concat(String.valueOf(intent2)));
                    }
                }
                gpn.b();
                Objects.toString(wakeLockA);
                wakeLockA.release();
                gsoVar = this.a;
                hxVar = new hx(gsoVar, 4);
            } catch (Throwable th2) {
                try {
                    gpn.b();
                    Log.e(gso.a, "Unexpected error in onHandleIntent", th2);
                    gpn.b();
                    Objects.toString(wakeLockA);
                    wakeLockA.release();
                    gsoVar = this.a;
                    hxVar = new hx(gsoVar, 4);
                } catch (Throwable th3) {
                    gpn.b();
                    Objects.toString(wakeLockA);
                    wakeLockA.release();
                    gso gsoVar4 = this.a;
                    gsoVar4.k.a.execute(new hx(gsoVar4, 4));
                    throw th3;
                }
            }
            gsoVar.k.a.execute(hxVar);
        }
    }
}

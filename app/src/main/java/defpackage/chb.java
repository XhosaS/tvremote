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
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class chb implements Runnable {
    final /* synthetic */ chf a;

    public chb(chf chfVar) {
        this.a = chfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        che cheVar;
        boolean z;
        cgu cguVar;
        Intent intent;
        String action;
        List<cee> listD;
        chb chbVar = this;
        chf chfVar = chbVar.a;
        List list = chfVar.g;
        synchronized (list) {
            chfVar.h = (Intent) list.get(0);
        }
        chf chfVar2 = chbVar.a;
        Intent intent2 = chfVar2.h;
        if (intent2 != null) {
            String action2 = intent2.getAction();
            int intExtra = chfVar2.h.getIntExtra("KEY_START_ID", 0);
            cbx cbxVarC = cbx.c();
            String str = chf.a;
            cbxVarC.a(str, "Processing command " + chfVar2.h + ", " + intExtra);
            PowerManager.WakeLock wakeLockA = cnt.a(chfVar2.b, action2 + " (" + intExtra + ")");
            try {
                z = false;
                cbx.c().a(str, a.h(wakeLockA, action2, "Acquiring operation wake lock (", ") "));
                wakeLockA.acquire();
                cguVar = chfVar2.f;
                intent = chfVar2.h;
                action = intent.getAction();
            } catch (Throwable th) {
                th = th;
            }
            try {
                if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
                    cbx cbxVarC2 = cbx.c();
                    String str2 = cgu.a;
                    Objects.toString(intent);
                    cbxVarC2.a(str2, "Handling constraints changed ".concat(String.valueOf(intent)));
                    String str3 = cgx.a;
                    Context context = cguVar.b;
                    cfq cfqVar = chfVar2.e;
                    cic cicVar = new cic(cfqVar.l);
                    List<cld> listH = cfqVar.e.D().h();
                    int i = cgv.a;
                    Iterator it = listH.iterator();
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    boolean z5 = false;
                    while (it.hasNext()) {
                        caq caqVar = ((cld) it.next()).l;
                        z2 |= caqVar.e;
                        z3 |= caqVar.c;
                        z4 |= caqVar.f;
                        z5 |= caqVar.j != 1;
                        if (z2 && z3 && z4 && z5) {
                            break;
                        }
                    }
                    int i2 = ConstraintProxyUpdateReceiver.b;
                    Intent intent3 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
                    intent3.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
                    intent3.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
                    context.sendBroadcast(intent3);
                    ArrayList arrayList = new ArrayList(listH.size());
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (cld cldVar : listH) {
                        if (jCurrentTimeMillis >= cldVar.a() && (!cldVar.c() || cicVar.b(cldVar))) {
                            arrayList.add(cldVar);
                        }
                    }
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        cld cldVar2 = (cld) arrayList.get(i3);
                        String str4 = cldVar2.c;
                        Intent intentC = cgu.c(context, cmk.a(cldVar2));
                        cbx.c().a(cgx.a, a.e(str4, "Creating a delay_met command for workSpec with id (", ")"));
                        chfVar2.j.d.execute(new chc(chfVar2, intentC, intExtra));
                    }
                } else if ("ACTION_RESCHEDULE".equals(action)) {
                    cbx.c().a(cgu.a, "Handling reschedule " + intent + ", " + intExtra);
                    chfVar2.e.n();
                } else {
                    Bundle extras = intent.getExtras();
                    String[] strArr = {"KEY_WORKSPEC_ID"};
                    if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
                        cbx.c();
                        Log.e(cgu.a, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
                    } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                        ckp ckpVarE = cgu.e(intent);
                        cbx cbxVarC3 = cbx.c();
                        String str5 = cgu.a;
                        Objects.toString(ckpVarE);
                        cbxVarC3.a(str5, "Handling schedule work for ".concat(ckpVarE.toString()));
                        WorkDatabase workDatabase = chfVar2.e.e;
                        workDatabase.m();
                        workDatabase.n();
                        try {
                            cld cldVarC = workDatabase.D().c(ckpVarE.a);
                            if (cldVarC == null) {
                                cbx.c();
                                Log.w(str5, a.c(ckpVarE, "Skipping scheduling ", " because it's no longer in the DB"));
                            } else if (cldVarC.d.a()) {
                                cbx.c();
                                Log.w(str5, a.c(ckpVarE, "Skipping scheduling ", "because it is finished."));
                            } else {
                                long jA = cldVarC.a();
                                if (cldVarC.c()) {
                                    cbx.c().a(str5, "Opportunistically setting an alarm for " + ckpVarE + "at " + jA);
                                    Context context2 = cguVar.b;
                                    cgt.b(context2, workDatabase, ckpVarE, jA);
                                    chfVar2.j.d.execute(new chc(chfVar2, cgu.b(context2), intExtra));
                                } else {
                                    cbx.c().a(str5, "Setting up Alarms for " + ckpVarE + "at " + jA);
                                    cgt.b(cguVar.b, workDatabase, ckpVarE, jA);
                                }
                                workDatabase.q();
                            }
                            workDatabase.o();
                        } catch (Throwable th2) {
                            workDatabase.o();
                            throw th2;
                        }
                    } else if ("ACTION_DELAY_MET".equals(action)) {
                        synchronized (cguVar.d) {
                            ckp ckpVarE2 = cgu.e(intent);
                            cbx cbxVarC4 = cbx.c();
                            String str6 = cgu.a;
                            cbxVarC4.a(str6, "Handing delay met for " + ckpVarE2);
                            Map map = cguVar.c;
                            if (map.containsKey(ckpVarE2)) {
                                cbx.c().a(str6, a.c(ckpVarE2, "WorkSpec ", " is is already being handled for ACTION_DELAY_MET"));
                            } else {
                                cha chaVar = new cha(cguVar.b, intExtra, chfVar2, cguVar.e.b(ckpVarE2));
                                map.put(ckpVarE2, chaVar);
                                String str7 = chaVar.d.a;
                                chaVar.j = cnt.a(chaVar.b, str7 + " (" + chaVar.c + ")");
                                cbx cbxVarC5 = cbx.c();
                                String str8 = cha.a;
                                cbxVarC5.a(str8, "Acquiring wakelock " + chaVar.j + "for WorkSpec " + str7);
                                chaVar.j.acquire();
                                cld cldVarC2 = chaVar.e.e.e.D().c(str7);
                                if (cldVarC2 == null) {
                                    chaVar.h.execute(new cgy(chaVar));
                                } else {
                                    boolean zC = cldVarC2.c();
                                    chaVar.k = zC;
                                    if (zC) {
                                        chaVar.n = cif.a(chaVar.f, cldVarC2, chaVar.m, chaVar);
                                    } else {
                                        cbx.c().a(str8, "No constraints for ".concat(str7));
                                        chaVar.h.execute(new cgz(chaVar));
                                    }
                                }
                            }
                        }
                    } else if ("ACTION_STOP_WORK".equals(action)) {
                        Bundle extras2 = intent.getExtras();
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                            int i4 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                            listD = new ArrayList(1);
                            cee ceeVarA = cguVar.e.a(new ckp(string, i4));
                            if (ceeVarA != null) {
                                listD.add(ceeVarA);
                            }
                        } else {
                            listD = cguVar.e.d(string);
                        }
                        for (cee ceeVar : listD) {
                            cbx.c().a(cgu.a, "Handing stopWork work for ".concat(String.valueOf(string)));
                            cfm.a(chfVar2.k, ceeVar);
                            Context context3 = cguVar.b;
                            WorkDatabase workDatabase2 = chfVar2.e.e;
                            ckp ckpVar = ceeVar.a;
                            String str9 = cgt.a;
                            ckg ckgVarA = workDatabase2.A();
                            ckf ckfVarA = ckgVarA.a(ckpVar);
                            if (ckfVarA != null) {
                                cgt.a(context3, ckpVar, ckfVarA.c);
                                cbx.c().a(cgt.a, "Removing SystemIdInfo for workSpecId (" + ckpVar + ")");
                                ckgVarA.d(ckpVar);
                            }
                            boolean z6 = z;
                            chfVar2.a(ckpVar, z6);
                            z = z6;
                        }
                    } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                        ckp ckpVarE3 = cgu.e(intent);
                        boolean z7 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                        cbx.c().a(cgu.a, "Handling onExecutionCompleted " + intent + ", " + intExtra);
                        cguVar.a(ckpVarE3, z7);
                    } else {
                        cbx.c();
                        String str10 = cgu.a;
                        Objects.toString(intent);
                        Log.w(str10, "Ignoring intent ".concat(String.valueOf(intent)));
                    }
                }
                cbx.c().a(chf.a, a.h(wakeLockA, action2, "Releasing operation wake lock (", ") "));
                wakeLockA.release();
                chf chfVar3 = this.a;
                executor = chfVar3.j.d;
                cheVar = new che(chfVar3);
            } catch (Throwable th3) {
                th = th3;
                chbVar = this;
                try {
                    cbx.c();
                    Log.e(chf.a, "Unexpected error in onHandleIntent", th);
                    cbx.c().a(chf.a, a.h(wakeLockA, action2, "Releasing operation wake lock (", ") "));
                    wakeLockA.release();
                    chf chfVar4 = chbVar.a;
                    executor = chfVar4.j.d;
                    cheVar = new che(chfVar4);
                    executor.execute(cheVar);
                } catch (Throwable th4) {
                    cbx.c().a(chf.a, a.h(wakeLockA, action2, "Releasing operation wake lock (", ") "));
                    wakeLockA.release();
                    chf chfVar5 = chbVar.a;
                    chfVar5.j.d.execute(new che(chfVar5));
                    throw th4;
                }
            }
            executor.execute(cheVar);
        }
    }
}

package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class chi implements cea {
    public static final String a = cbx.d("SystemJobScheduler");
    private final Context b;
    private final JobScheduler c;
    private final chh d;
    private final WorkDatabase e;
    private final cak f;

    public chi(Context context, WorkDatabase workDatabase, cak cakVar) {
        JobScheduler jobSchedulerA = chg.a(context);
        chh chhVar = new chh(context);
        this.b = context;
        this.c = jobSchedulerA;
        this.d = chhVar;
        this.e = workDatabase;
        this.f = cakVar;
    }

    public static ckp a(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new ckp(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static List e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listB = chg.b(jobScheduler);
        if (listB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listB) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void f(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            cbx.c();
            Log.e(a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // defpackage.cea
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.b;
        JobScheduler jobScheduler = this.c;
        List<JobInfo> listE = e(context, jobScheduler);
        if (listE == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : listE) {
                ckp ckpVarA = a(jobInfo);
                if (ckpVarA != null && str.equals(ckpVarA.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.e.A().e(str);
    }

    @Override // defpackage.cea
    public final void c(cld... cldVarArr) {
        int iIntValue;
        WorkDatabase workDatabase = this.e;
        final cnf cnfVar = new cnf(workDatabase);
        for (cld cldVar : cldVarArr) {
            workDatabase.m();
            workDatabase.n();
            try {
                cle cleVarD = workDatabase.D();
                String str = cldVar.c;
                cld cldVarC = cleVarD.c(str);
                if (cldVarC == null) {
                    cbx.c();
                    Log.w(a, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.q();
                } else if (cldVarC.d != ccq.a) {
                    cbx.c();
                    Log.w(a, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.q();
                } else {
                    ckp ckpVarA = cmk.a(cldVar);
                    ckf ckfVarA = workDatabase.A().a(ckpVarA);
                    if (ckfVarA != null) {
                        iIntValue = ckfVarA.c;
                    } else {
                        Object objE = cnfVar.a.e(new Callable() { // from class: cne
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = cnfVar.a;
                                int iA = cng.a(workDatabase2, "next_job_scheduler_id");
                                if (iA < 0) {
                                    cng.b(workDatabase2, "next_job_scheduler_id", 1);
                                    iA = 0;
                                }
                                return Integer.valueOf(iA);
                            }
                        });
                        objE.getClass();
                        iIntValue = ((Number) objE).intValue();
                    }
                    if (ckfVarA == null) {
                        workDatabase.A().c(cko.a(ckpVarA, iIntValue));
                    }
                    g(cldVar, iIntValue);
                    workDatabase.q();
                }
                workDatabase.o();
            } catch (Throwable th) {
                this.e.o();
                throw th;
            }
        }
    }

    @Override // defpackage.cea
    public final boolean d() {
        return true;
    }

    public final void g(cld cldVar, int i) {
        int i2;
        String str;
        caq caqVar = cldVar.l;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = cldVar.c;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", cldVar.u);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", cldVar.e());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, this.d.b).setRequiresCharging(caqVar.c);
        boolean z = caqVar.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        Object obj = caqVar.b.b;
        if (obj != null) {
            extras.getClass();
            extras.setRequiredNetwork((NetworkRequest) obj);
        } else {
            int i3 = caqVar.j;
            if (Build.VERSION.SDK_INT < 30 || i3 != 6) {
                int i4 = i3 - 1;
                if (i4 == 0) {
                    i2 = 0;
                } else if (i4 != 1) {
                    i2 = 2;
                    if (i4 != 2) {
                        i2 = 3;
                        if (i4 != 3) {
                            i2 = 4;
                            if (i4 != 4) {
                                cbx cbxVarC = cbx.c();
                                String str3 = chh.a;
                                Objects.toString(cby.a(i3));
                                cbxVarC.a(str3, "API version too low. Cannot convert network type value ".concat(cby.a(i3)));
                                i2 = 1;
                            }
                        }
                    }
                } else {
                    i2 = 1;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        }
        if (!z) {
            extras.setBackoffCriteria(cldVar.o, cldVar.n == cah.b ? 0 : 1);
        }
        long jMax = Math.max(cldVar.a() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!cldVar.s) {
            extras.setImportantWhileForeground(true);
        }
        if (caqVar.a()) {
            for (cap capVar : caqVar.i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(capVar.a, capVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(caqVar.g);
            extras.setTriggerContentMaxDelay(caqVar.h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(caqVar.e);
        extras.setRequiresStorageNotLow(caqVar.f);
        int i5 = cldVar.m;
        if (Build.VERSION.SDK_INT >= 31 && cldVar.s && i5 <= 0 && jMax <= 0) {
            extras.setExpedited(true);
        }
        if (Build.VERSION.SDK_INT >= 35 && (str = cldVar.y) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        cbx cbxVarC2 = cbx.c();
        String str4 = a;
        cbxVarC2.a(str4, "Scheduling work ID " + str2 + "Job ID " + i);
        try {
            if (this.c.schedule(jobInfoBuild) == 0) {
                cbx.c();
                Log.w(str4, "Unable to schedule work ID " + str2);
                if (cldVar.s && cldVar.A == 1) {
                    cldVar.s = false;
                    cbx.c().a(str4, String.format("Scheduling a non-expedited job (work ID %s)", str2));
                    g(cldVar, i);
                }
            }
        } catch (IllegalStateException e) {
            Context context = this.b;
            WorkDatabase workDatabase = this.e;
            int i6 = chg.a;
            int size = workDatabase.D().h().size();
            String strG = "<faulty JobScheduler failed to getPendingJobs>";
            if (Build.VERSION.SDK_INT >= 34) {
                JobScheduler jobSchedulerA = chg.a(context);
                List listB = chg.b(jobSchedulerA);
                if (listB != null) {
                    List listE = e(context, jobSchedulerA);
                    int size2 = listE != null ? listB.size() - listE.size() : 0;
                    String str5 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    List listE2 = e(context, (JobScheduler) systemService);
                    int size3 = listE2 != null ? listE2.size() : 0;
                    strG = agqq.G(agqj.m(new String[]{listB.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str5, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
                }
            } else {
                List listE3 = e(context, chg.a(context));
                if (listE3 != null) {
                    strG = listE3.size() + " jobs from WorkManager";
                }
            }
            String str6 = "JobScheduler " + (Build.VERSION.SDK_INT >= 31 ? 150 : 100) + " job limit exceeded.\nIn JobScheduler there are " + strG + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.";
            cbx.c();
            Log.e(a, str6);
            throw new IllegalStateException(str6, e);
        } catch (Throwable th) {
            cbx.c();
            String str7 = a;
            Objects.toString(cldVar);
            Log.e(str7, "Unable to schedule ".concat(String.valueOf(cldVar)), th);
        }
    }
}

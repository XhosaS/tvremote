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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsr implements gqt {
    public static final /* synthetic */ int a = 0;
    private static final String b = gpn.a("SystemJobScheduler");
    private final Context c;
    private final JobScheduler d;
    private final gsq e;
    private final WorkDatabase f;

    public gsr(Context context, WorkDatabase workDatabase) {
        JobScheduler jobSchedulerA = gsp.a(context);
        gsq gsqVar = new gsq(context);
        this.c = context;
        this.d = jobSchedulerA;
        this.e = gsqVar;
        this.f = workDatabase;
    }

    public static gun a(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new gun(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static List e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listB = gsp.b(jobScheduler);
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
            gpn.b();
            Log.e(b, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // defpackage.gqt
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.c;
        JobScheduler jobScheduler = this.d;
        List<JobInfo> listE = e(context, jobScheduler);
        if (listE == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : listE) {
                gun gunVarA = a(jobInfo);
                if (gunVarA != null && str.equals(gunVarA.a)) {
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
        this.f.A().e(str);
    }

    @Override // defpackage.gqt
    public final void c(guw... guwVarArr) {
        int iIntValue;
        WorkDatabase workDatabase = this.f;
        cb cbVar = new cb(workDatabase, (byte[]) null);
        for (guw guwVar : guwVarArr) {
            workDatabase.o();
            try {
                gux guxVarD = workDatabase.D();
                String str = guwVar.b;
                guw guwVarC = guxVarD.c(str);
                if (guwVarC == null) {
                    gpn.b();
                    Log.w(b, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.r();
                } else if (guwVarC.c != gpx.a) {
                    gpn.b();
                    Log.w(b, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.r();
                } else {
                    gun gunVarAM = fki.aM(guwVar);
                    guj gujVarA = workDatabase.A().a(gunVarAM);
                    if (gujVarA != null) {
                        iIntValue = gujVarA.c;
                    } else {
                        Object objE = ((gex) cbVar.a).e(new eet(cbVar, 5));
                        objE.getClass();
                        iIntValue = ((Number) objE).intValue();
                    }
                    if (gujVarA == null) {
                        workDatabase.A().c(fki.aP(gunVarAM, iIntValue));
                    }
                    g(guwVar, iIntValue);
                    workDatabase.r();
                }
                workDatabase.p();
            } catch (Throwable th) {
                this.f.p();
                throw th;
            }
        }
    }

    @Override // defpackage.gqt
    public final boolean d() {
        return true;
    }

    public final void g(guw guwVar, int i) throws IOException {
        int i2;
        long j;
        String str;
        gou gouVar = guwVar.k;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = guwVar.b;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", guwVar.s);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", guwVar.e());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, this.e.a).setRequiresCharging(gouVar.c);
        boolean z = gouVar.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        NetworkRequest networkRequestA = gouVar.a();
        if (Build.VERSION.SDK_INT < 28 || networkRequestA == null) {
            int i3 = gouVar.j;
            if (Build.VERSION.SDK_INT < 30 || i3 != 6) {
                int i4 = i3 - 1;
                if (i4 == 0) {
                    i2 = 0;
                } else if (i4 == 1) {
                    i2 = 1;
                } else if (i4 != 2) {
                    i2 = 3;
                    if (i4 != 3) {
                        i2 = 4;
                        if (i4 != 4 || Build.VERSION.SDK_INT < 26) {
                            gpn.b();
                            Objects.toString(fki.aW(i3));
                            i2 = 1;
                        }
                    }
                } else {
                    i2 = 2;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        }
        if (!z) {
            extras.setBackoffCriteria(guwVar.m, guwVar.y == 2 ? 0 : 1);
        }
        long j2 = 0;
        long jMax = Math.max(guwVar.a() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!guwVar.q) {
            extras.setImportantWhileForeground(true);
        }
        if (gouVar.b()) {
            for (got gotVar : gouVar.i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(gotVar.a, gotVar.b ? 1 : 0));
                j2 = j2;
            }
            j = j2;
            extras.setTriggerContentUpdateDelay(gouVar.g);
            extras.setTriggerContentMaxDelay(gouVar.h);
        } else {
            j = 0;
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(gouVar.e);
            extras.setRequiresStorageNotLow(gouVar.f);
        }
        int i5 = guwVar.l;
        if (Build.VERSION.SDK_INT >= 31 && guwVar.q && i5 <= 0 && jMax <= j) {
            extras.setExpedited(true);
        }
        if (Build.VERSION.SDK_INT >= 35 && (str = guwVar.w) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        gpn.b();
        try {
            if (this.d.schedule(jobInfoBuild) == 0) {
                gpn.b();
                Log.w(b, "Unable to schedule work ID " + str2);
                if (guwVar.q && guwVar.z == 1) {
                    guwVar.q = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", str2);
                    gpn.b();
                    g(guwVar, i);
                }
            }
        } catch (IllegalStateException e) {
            Context context = this.c;
            WorkDatabase workDatabase = this.f;
            int i6 = gsp.a;
            int size = workDatabase.D().h().size();
            String strAx = "<faulty JobScheduler failed to getPendingJobs>";
            if (Build.VERSION.SDK_INT >= 34) {
                JobScheduler jobSchedulerA = gsp.a(context);
                List listB = gsp.b(jobSchedulerA);
                if (listB != null) {
                    List listE = e(context, jobSchedulerA);
                    int size2 = listE != null ? listB.size() - listE.size() : 0;
                    String str3 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    List listE2 = e(context, (JobScheduler) systemService);
                    int size3 = listE2 != null ? listE2.size() : 0;
                    strAx = yfm.ax(yfm.aW(new String[]{listB.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str3, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
                }
            } else {
                List listE3 = e(context, gsp.a(context));
                if (listE3 != null) {
                    strAx = listE3.size() + " jobs from WorkManager";
                }
            }
            String str4 = "JobScheduler " + (Build.VERSION.SDK_INT >= 31 ? 150 : 100) + " job limit exceeded.\nIn JobScheduler there are " + strAx + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.";
            gpn.b();
            Log.e(b, str4);
            throw new IllegalStateException(str4, e);
        } catch (Throwable th) {
            gpn.b();
            String str5 = b;
            Objects.toString(guwVar);
            Log.e(str5, "Unable to schedule ".concat(String.valueOf(guwVar)), th);
        }
    }
}

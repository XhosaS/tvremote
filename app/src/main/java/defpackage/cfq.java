package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cfq extends ccs {
    public Context c;
    public cak d;
    public WorkDatabase e;
    public List f;
    public cdy g;
    public cnk h;
    public boolean i = false;
    public BroadcastReceiver.PendingResult j;
    public volatile cot k;
    public final cjh l;
    public coe m;
    private final ahbt p;
    public static final String a = cbx.d("WorkManagerImpl");
    private static cfq n = null;
    private static cfq o = null;
    public static final Object b = new Object();

    public cfq(Context context, final cak cakVar, coe coeVar, WorkDatabase workDatabase, final List list, cdy cdyVar, cjh cjhVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        cbw cbwVar = new cbw(4);
        synchronized (cbx.b) {
            if (cbx.c == null) {
                cbx.c = cbwVar;
            }
        }
        this.c = applicationContext;
        this.m = coeVar;
        this.e = workDatabase;
        this.g = cdyVar;
        this.l = cjhVar;
        this.d = cakVar;
        this.f = list;
        coeVar.getClass();
        ahbm ahbmVar = coeVar.b;
        ahbmVar.getClass();
        ahbt ahbtVarB = ahbu.b(ahbmVar);
        this.p = ahbtVarB;
        final WorkDatabase workDatabase2 = this.e;
        this.h = new cnk(workDatabase2);
        cdy cdyVar2 = this.g;
        final cnp cnpVar = coeVar.a;
        String str = ced.a;
        cdyVar2.c(new cdk() { // from class: ceb
            @Override // defpackage.cdk
            public final void a(final ckp ckpVar, boolean z) {
                String str2 = ced.a;
                final cak cakVar2 = cakVar;
                final List list2 = list;
                final WorkDatabase workDatabase3 = workDatabase2;
                cnpVar.execute(new Runnable() { // from class: cec
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = ced.a;
                        List list3 = list2;
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            ((cea) it.next()).b(ckpVar.a);
                        }
                        ced.a(cakVar2, workDatabase3, list3);
                    }
                });
            }
        });
        coe coeVar2 = this.m;
        coeVar2.a.execute(new cnc(applicationContext, this));
        Context context2 = this.c;
        String str2 = cen.a;
        context2.getClass();
        if (cnl.a(context2, cakVar)) {
            ahal.e(ahbtVarB, null, 0, new ahgx(new ahil(ahhb.a(ahgy.a(new ahhp(workDatabase.D().l(), new cel(null)))), new cem(context2, null)), null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static cfq j(Context context) {
        cfq cfqVarJ;
        Object obj = b;
        synchronized (obj) {
            synchronized (obj) {
                cfqVarJ = n;
                if (cfqVarJ == null) {
                    cfqVarJ = o;
                }
            }
            return cfqVarJ;
        }
        if (cfqVarJ == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof caj)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            l(applicationContext, ((caj) applicationContext).a());
            cfqVarJ = j(applicationContext);
        }
        return cfqVarJ;
    }

    public static void l(Context context, cak cakVar) {
        bmi bmiVarA;
        synchronized (b) {
            cfq cfqVar = n;
            if (cfqVar != null && o != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (cfqVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (o == null) {
                    applicationContext.getClass();
                    cakVar.getClass();
                    coe coeVar = new coe(cakVar.c);
                    final Context applicationContext2 = applicationContext.getApplicationContext();
                    applicationContext2.getClass();
                    cnp cnpVar = coeVar.a;
                    cnpVar.getClass();
                    if (applicationContext.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
                        bmiVarA = new bmi(applicationContext2, WorkDatabase.class, null);
                        bmiVarA.f = true;
                    } else {
                        bmiVarA = bly.a(applicationContext2, WorkDatabase.class, "androidx.work.workdb");
                        bmiVarA.e = new brq() { // from class: ceq
                            @Override // defpackage.brq
                            public final brr a(brp brpVar) {
                                return new bsh().a(bro.a(applicationContext2, brpVar.b, brpVar.c, true, true));
                            }
                        };
                    }
                    bmiVarA.d = cnpVar;
                    bmiVarA.c.add(new cdi());
                    bmiVarA.b(cdp.c);
                    bmiVarA.b(new cdz(applicationContext2, 2, 3));
                    bmiVarA.b(cdq.c);
                    bmiVarA.b(cdr.c);
                    bmiVarA.b(new cdz(applicationContext2, 5, 6));
                    bmiVarA.b(cds.c);
                    bmiVarA.b(cdt.c);
                    bmiVarA.b(cdu.c);
                    bmiVarA.b(new cfr(applicationContext2));
                    bmiVarA.b(new cdz(applicationContext2, 10, 11));
                    bmiVarA.b(cdl.c);
                    bmiVarA.b(cdm.c);
                    bmiVarA.b(cdn.c);
                    bmiVarA.b(cdo.c);
                    bmiVarA.b(new cdz(applicationContext2, 21, 22));
                    bmiVarA.h = false;
                    bmiVarA.i = true;
                    bmiVarA.j = true;
                    WorkDatabase workDatabase = (WorkDatabase) bmiVarA.a();
                    Context applicationContext3 = applicationContext.getApplicationContext();
                    applicationContext3.getClass();
                    Context applicationContext4 = applicationContext3.getApplicationContext();
                    applicationContext4.getClass();
                    cis cisVar = new cis(applicationContext4, coeVar);
                    Context applicationContext5 = applicationContext3.getApplicationContext();
                    applicationContext5.getClass();
                    ciu ciuVar = new ciu(applicationContext5, coeVar);
                    Context applicationContext6 = applicationContext3.getApplicationContext();
                    applicationContext6.getClass();
                    String str = cje.a;
                    cjd cjdVar = new cjd(applicationContext6, coeVar);
                    Context applicationContext7 = applicationContext3.getApplicationContext();
                    applicationContext7.getClass();
                    cjh cjhVar = new cjh(applicationContext3, cisVar, ciuVar, cjdVar, new cjf(applicationContext7, coeVar));
                    cdy cdyVar = new cdy(applicationContext.getApplicationContext(), cakVar, coeVar, workDatabase);
                    workDatabase.getClass();
                    String str2 = ced.a;
                    chi chiVar = new chi(applicationContext, workDatabase, cakVar);
                    cnj.a(applicationContext, SystemJobService.class, true);
                    cbx.c().a(ced.a, "Created SystemJobScheduler and enabled SystemJobService");
                    o = new cfq(applicationContext.getApplicationContext(), cakVar, coeVar, workDatabase, agqq.d(chiVar, new cgq(applicationContext, cakVar, cjhVar, cdyVar, new cfo(cdyVar, coeVar), coeVar)), cdyVar, cjhVar);
                }
                n = o;
            }
        }
    }

    @Override // defpackage.ccs
    public final ccf a(final String str) {
        str.getClass();
        cam camVar = this.d.j;
        cnp cnpVar = this.m.a;
        cnpVar.getClass();
        return ccj.a(camVar, "CancelWorkByTag_".concat(str), cnpVar, new agum() { // from class: cmv
            @Override // defpackage.agum
            public final Object a() {
                final cfq cfqVar = this.a;
                final WorkDatabase workDatabase = cfqVar.e;
                workDatabase.getClass();
                final String str2 = str;
                workDatabase.p(new Runnable() { // from class: cmu
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it = workDatabase.D().j(str2).iterator();
                        while (it.hasNext()) {
                            cmz.b(cfqVar, (String) it.next());
                        }
                    }
                });
                cmz.d(cfqVar);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.ccs
    public final ccf b(final String str) {
        cam camVar = this.d.j;
        cnp cnpVar = this.m.a;
        cnpVar.getClass();
        return ccj.a(camVar, "CancelWorkByName_".concat(str), cnpVar, new agum() { // from class: cmw
            @Override // defpackage.agum
            public final Object a() {
                String str2 = str;
                cfq cfqVar = this;
                cmz.c(str2, cfqVar);
                cmz.d(cfqVar);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.ccs
    public final ccf c(UUID uuid) {
        return cmz.a(uuid, this);
    }

    @Override // defpackage.ccs
    public final ccf e(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new cep(this, null, 2, list).a();
    }

    @Override // defpackage.ccs
    public final ccf f() {
        final WorkDatabase workDatabase = this.e;
        cak cakVar = this.d;
        coe coeVar = this.m;
        workDatabase.getClass();
        cakVar.getClass();
        coeVar.getClass();
        cnp cnpVar = coeVar.a;
        cnpVar.getClass();
        return ccj.a(cakVar.j, "PruneWork", cnpVar, new agum() { // from class: cnm
            @Override // defpackage.agum
            public final Object a() {
                workDatabase.D().p();
                return agpu.a;
            }
        });
    }

    @Override // defpackage.ccs
    public final zyd g(final ccu ccuVar) {
        final WorkDatabase workDatabase = this.e;
        coe coeVar = this.m;
        workDatabase.getClass();
        coeVar.getClass();
        final agux aguxVar = new agux() { // from class: cnr
            @Override // defpackage.agux
            public final Object a(Object obj) {
                String str;
                ArrayList arrayList;
                long j;
                ccp ccpVar;
                Iterator it;
                caq caqVar;
                long jA;
                boolean z;
                WorkDatabase workDatabase2 = (WorkDatabase) obj;
                workDatabase2.getClass();
                cla claVar = cld.a;
                cka ckaVarZ = workDatabase2.z();
                ArrayList arrayList2 = new ArrayList();
                StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
                ccu ccuVar2 = ccuVar;
                List list = ccuVar2.b;
                if (list.isEmpty()) {
                    str = " WHERE";
                } else {
                    ArrayList arrayList3 = new ArrayList(agqq.i(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((UUID) it2.next()).toString());
                    }
                    sb.append(" WHERE id IN (");
                    cnn.a(sb, list.size());
                    sb.append(")");
                    arrayList2.addAll(arrayList3);
                    str = " AND";
                }
                List list2 = ccuVar2.c;
                if (!list2.isEmpty()) {
                    sb.append(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
                    cnn.a(sb, list2.size());
                    sb.append("))");
                    arrayList2.addAll(list2);
                }
                sb.append(";");
                int i = 0;
                List listA = ckaVarZ.a(new brl(sb.toString(), arrayList2.toArray(new Object[0])));
                if (listA != null) {
                    ArrayList arrayList4 = new ArrayList(agqq.i(listA, 10));
                    Iterator it3 = listA.iterator();
                    while (it3.hasNext()) {
                        clc clcVar = (clc) it3.next();
                        List list3 = clcVar.q;
                        caz cazVar = !list3.isEmpty() ? (caz) list3.get(i) : caz.b;
                        UUID uuidFromString = UUID.fromString(clcVar.a);
                        uuidFromString.getClass();
                        ccq ccqVar = clcVar.b;
                        HashSet hashSet = new HashSet(clcVar.p);
                        caz cazVar2 = clcVar.c;
                        int i2 = clcVar.h;
                        int i3 = clcVar.m;
                        caq caqVar2 = clcVar.g;
                        long j2 = clcVar.d;
                        ArrayList arrayList5 = arrayList4;
                        long j3 = clcVar.e;
                        boolean z2 = j3 == 0;
                        if (j3 != 0) {
                            j = j2;
                            ccpVar = new ccp(j3, clcVar.f);
                        } else {
                            j = j2;
                            ccpVar = null;
                        }
                        ccq ccqVar2 = ccq.a;
                        if (ccqVar == ccqVar2) {
                            cla claVar2 = cld.a;
                            if (ccqVar != ccqVar2 || i2 <= 0) {
                                it = it3;
                                caqVar = caqVar2;
                                z = false;
                            } else {
                                it = it3;
                                caqVar = caqVar2;
                                z = true;
                            }
                            jA = claVar2.a(z, i2, clcVar.i, clcVar.j, clcVar.k, clcVar.l, !z2, j, clcVar.f, j3, clcVar.n);
                        } else {
                            it = it3;
                            caqVar = caqVar2;
                            jA = Long.MAX_VALUE;
                        }
                        arrayList5.add(new ccr(uuidFromString, ccqVar, hashSet, cazVar2, cazVar, i2, i3, caqVar, j, ccpVar, jA, clcVar.o));
                        arrayList4 = arrayList5;
                        it3 = it;
                        i = 0;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                arrayList.getClass();
                return arrayList;
            }
        };
        cnp cnpVar = coeVar.a;
        cnpVar.getClass();
        return cbp.a(cnpVar, "loadStatusFuture", new agum() { // from class: cnq
            @Override // defpackage.agum
            public final Object a() {
                return aguxVar.a(workDatabase);
            }
        });
    }

    @Override // defpackage.ccs
    public final ccf h(final String str, int i, final ccl cclVar) {
        if (i != 3) {
            return new cep(this, str, i != 2 ? 1 : 2, Collections.singletonList(cclVar)).a();
        }
        cam camVar = this.d.j;
        cnp cnpVar = this.m.a;
        cnpVar.getClass();
        return ccj.a(camVar, "enqueueUniquePeriodic_".concat(str), cnpVar, new agum() { // from class: cfv
            @Override // defpackage.agum
            public final Object a() throws Throwable {
                final ccw ccwVar = cclVar;
                final cfq cfqVar = this.a;
                final String str2 = str;
                agum agumVar = new agum() { // from class: cfu
                    @Override // defpackage.agum
                    public final Object a() throws Throwable {
                        List listSingletonList = Collections.singletonList(ccwVar);
                        listSingletonList.getClass();
                        cna.a(new cep(cfqVar, str2, 2, listSingletonList));
                        return agpu.a;
                    }
                };
                cle cleVarD = cfqVar.e.D();
                List listK = cleVarD.k(str2);
                if (listK.size() > 1) {
                    throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
                }
                clb clbVar = (clb) agqq.o(listK);
                if (clbVar == null) {
                    agumVar.a();
                    return agpu.a;
                }
                String str3 = clbVar.a;
                cld cldVarC = cleVarD.c(str3);
                if (cldVarC == null) {
                    throw new IllegalStateException(a.n(str2, str3, "WorkSpec with ", ", that matches a name \"", "\", wasn't found"));
                }
                if (!cldVarC.e()) {
                    throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                }
                if (clbVar.b == ccq.f) {
                    cleVarD.m(str3);
                    agumVar.a();
                    return agpu.a;
                }
                final cld cldVarF = cld.f(ccwVar.b, str3, null, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                cdy cdyVar = cfqVar.g;
                cdyVar.getClass();
                final WorkDatabase workDatabase = cfqVar.e;
                workDatabase.getClass();
                cak cakVar = cfqVar.d;
                cakVar.getClass();
                final List list = cfqVar.f;
                list.getClass();
                final Set set = ccwVar.c;
                final String str4 = cldVarF.c;
                final cld cldVarC2 = workDatabase.D().c(str4);
                if (cldVarC2 == null) {
                    throw new IllegalArgumentException(a.e(str4, "Worker with ", " doesn't exist"));
                }
                if (!cldVarC2.d.a()) {
                    if (cldVarC2.e() ^ cldVarF.e()) {
                        throw new UnsupportedOperationException("Can't update " + cfw.a(cldVarC2) + " Worker to " + cfw.a(cldVarF) + " Worker. Update operation must preserve worker's type.");
                    }
                    final boolean zG = cdyVar.g(str4);
                    if (!zG) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((cea) it.next()).b(str4);
                        }
                    }
                    workDatabase.p(new Runnable() { // from class: cft
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            cld cldVar = cldVarF;
                            cld cldVar2 = cldVarC2;
                            int i2 = cldVar2.u;
                            WorkDatabase workDatabase2 = workDatabase;
                            cle cleVarD2 = workDatabase2.D();
                            cmm cmmVarE = workDatabase2.E();
                            cld cldVarF2 = cld.f(cldVar, null, cldVar2.d, null, null, cldVar2.m, cldVar2.p, cldVar2.t, i2 + 1, cldVar2.v, cldVar2.w, 29613053);
                            if (cldVar.w == 1) {
                                cldVarF2.v = cldVar.v;
                                cldVarF2.w++;
                            }
                            boolean z = zG;
                            Set set2 = set;
                            String str5 = str4;
                            cleVarD2.u(cnb.a(list, cldVarF2));
                            cmmVarE.b(str5);
                            cmmVarE.c(str5, set2);
                            if (z) {
                                return;
                            }
                            cleVarD2.x(str5, -1L);
                            workDatabase2.C().a(str5);
                        }
                    });
                    if (!zG) {
                        ced.a(cakVar, workDatabase, list);
                    }
                }
                return agpu.a;
            }
        });
    }

    @Override // defpackage.ccs
    public final ccf i(String str, int i, List list) {
        return new cep(this, str, i, list).a();
    }

    public final /* synthetic */ agpu k() {
        Context context = this.c;
        String str = chi.a;
        if (Build.VERSION.SDK_INT >= 34) {
            chg.a(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List listE = chi.e(context, jobScheduler);
        if (listE != null && !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                chi.f(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        this.e.D().y();
        ced.a(this.d, this.e, this.f);
        return agpu.a;
    }

    public final void m() {
        synchronized (b) {
            this.i = true;
            BroadcastReceiver.PendingResult pendingResult = this.j;
            if (pendingResult != null) {
                pendingResult.finish();
                this.j = null;
            }
        }
    }

    public final void n() {
        cam camVar = this.d.j;
        cfp cfpVar = new cfp(this);
        boolean zE = btt.e();
        if (zE) {
            try {
                btt.b("ReschedulingWork");
            } catch (Throwable th) {
                if (zE) {
                    Trace.endSection();
                }
                throw th;
            }
        }
        cfpVar.a.k();
        if (zE) {
            Trace.endSection();
        }
    }

    public final void o(ckp ckpVar, int i) {
        coe coeVar = this.m;
        coeVar.a.execute(new cns(this.g, new cee(ckpVar), true, i));
    }
}

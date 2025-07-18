package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.videos.R;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grs extends gpz {
    public static final Object a;
    private static grs l;
    private static grs m;
    public Context b;
    public WorkDatabase c;
    public List d;
    public gqr e;
    public boolean f = false;
    public BroadcastReceiver.PendingResult g;
    public tae h;
    public final gag i;
    public cb j;
    public isy k;
    private final yow n;

    static {
        gpn.a("WorkManagerImpl");
        l = null;
        m = null;
        a = new Object();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public grs(Context context, final tae taeVar, isy isyVar, WorkDatabase workDatabase, final List list, gqr gqrVar, gag gagVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        gpn gpnVar = new gpn();
        synchronized (gpn.a) {
            if (gpn.b == null) {
                gpn.b = gpnVar;
            }
        }
        this.b = applicationContext;
        this.k = isyVar;
        this.c = workDatabase;
        this.e = gqrVar;
        this.i = gagVar;
        this.h = taeVar;
        this.d = list;
        isyVar.getClass();
        ?? r10 = isyVar.d;
        r10.getClass();
        yow yowVarL = yoz.l(r10);
        this.n = yowVarL;
        final WorkDatabase workDatabase2 = this.c;
        this.j = new cb(workDatabase2);
        gqr gqrVar2 = this.e;
        final ?? r7 = isyVar.c;
        int i = gqv.a;
        gqrVar2.c(new gqg() { // from class: gqu
            @Override // defpackage.gqg
            public final void a(gun gunVar, boolean z) {
                int i2 = gqv.a;
                r7.execute(new ejr(list, gunVar, taeVar, workDatabase2, 10));
            }
        });
        this.k.q(new gvl(applicationContext, this));
        Context context2 = this.b;
        String str = grc.a;
        context2.getClass();
        if (gvp.a(context2, taeVar)) {
            ykr.q(yowVarL, null, 0, new sbl(new ipi(ytb.a(vyf.G(new ipi(workDatabase.D().m(), new gra(null), 15))), new grb(context2, null), 19), (yih) null, 2), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static grs h(Context context) {
        grs grsVarH;
        Object obj = a;
        synchronized (obj) {
            synchronized (obj) {
                grsVarH = l;
                if (grsVarH == null) {
                    grsVarH = m;
                }
            }
            return grsVarH;
        }
        if (grsVarH == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof goq)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            l(applicationContext, ((goq) applicationContext).a());
            grsVarH = h(applicationContext);
        }
        return grsVarH;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    public static void l(Context context, tae taeVar) {
        gev gevVarD;
        synchronized (a) {
            grs grsVar = l;
            if (grsVar != null && m != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (grsVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (m == null) {
                    applicationContext.getClass();
                    taeVar.getClass();
                    isy isyVar = new isy((Executor) taeVar.b);
                    final Context applicationContext2 = applicationContext.getApplicationContext();
                    applicationContext2.getClass();
                    ?? r4 = isyVar.c;
                    r4.getClass();
                    if (applicationContext.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
                        gevVarD = new gev(applicationContext2, WorkDatabase.class, null);
                        gevVarD.c();
                    } else {
                        gevVarD = gez.d(applicationContext2, WorkDatabase.class, "androidx.work.workdb");
                        gevVarD.d = new ghn() { // from class: gre
                            @Override // defpackage.ghn
                            public final gho a(ghm ghmVar) {
                                return new ghz().a(gli.t(applicationContext2, ghmVar.b, ghmVar.c, true, true));
                            }
                        };
                    }
                    if (gevVarD.i != null) {
                        throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
                    }
                    gevVarD.b = r4;
                    gevVarD.a.add(new gqf());
                    gevVarD.b(gql.c);
                    gevVarD.b(new gqs(applicationContext2, 2, 3));
                    gevVarD.b(gqm.c);
                    gevVarD.b(gqn.c);
                    gevVarD.b(new gqs(applicationContext2, 5, 6));
                    gevVarD.b(gqo.c);
                    gevVarD.b(gqp.c);
                    gevVarD.b(gqq.c);
                    gevVarD.b(new grt(applicationContext2));
                    gevVarD.b(new gqs(applicationContext2, 10, 11));
                    gevVarD.b(gqh.c);
                    gevVarD.b(gqi.c);
                    gevVarD.b(gqj.c);
                    gevVarD.b(gqk.c);
                    gevVarD.b(new gqs(applicationContext2, 21, 22));
                    gevVarD.f = false;
                    gevVarD.g = true;
                    gevVarD.h = true;
                    WorkDatabase workDatabase = (WorkDatabase) gevVarD.a();
                    Context applicationContext3 = applicationContext.getApplicationContext();
                    applicationContext3.getClass();
                    Context applicationContext4 = applicationContext3.getApplicationContext();
                    applicationContext4.getClass();
                    gtk gtkVar = new gtk(applicationContext4, isyVar);
                    Context applicationContext5 = applicationContext3.getApplicationContext();
                    applicationContext5.getClass();
                    gtm gtmVar = new gtm(applicationContext5, isyVar);
                    Context applicationContext6 = applicationContext3.getApplicationContext();
                    applicationContext6.getClass();
                    String str = gtv.a;
                    gtu gtuVar = new gtu(applicationContext6, isyVar);
                    Context applicationContext7 = applicationContext3.getApplicationContext();
                    applicationContext7.getClass();
                    gag gagVar = new gag(applicationContext3, gtkVar, gtmVar, gtuVar, new gtw(applicationContext7, isyVar));
                    gqr gqrVar = new gqr(applicationContext.getApplicationContext(), taeVar, isyVar, workDatabase);
                    workDatabase.getClass();
                    int i = gqv.a;
                    gsr gsrVar = new gsr(applicationContext, workDatabase);
                    gvo.a(applicationContext, SystemJobService.class, true);
                    gpn.b();
                    m = new grs(applicationContext.getApplicationContext(), taeVar, isyVar, workDatabase, yfm.s(gsrVar, new gse(applicationContext, taeVar, gagVar, gqrVar, new fse(gqrVar, isyVar), isyVar)), gqrVar, gagVar);
                }
                l = m;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.gpz
    public final gps a(String str) {
        str.getClass();
        Object obj = this.h.d;
        ?? r1 = this.k.c;
        r1.getClass();
        return fki.bb((gli) obj, "CancelWorkByName_".concat(str), r1, new aye(str, this, 19));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.gpz
    public final uhp b(String str) {
        WorkDatabase workDatabase = this.c;
        isy isyVar = this.k;
        workDatabase.getClass();
        isyVar.getClass();
        str.getClass();
        int i = 1;
        gxb gxbVar = new gxb(str, i);
        ?? r6 = isyVar.c;
        r6.getClass();
        return gli.u(r6, "loadStatusFuture", new isg(gxbVar, workDatabase, i, null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.gpz
    public final void c(String str) {
        Object obj = this.h.d;
        ?? r1 = this.k.c;
        r1.getClass();
        fki.bb((gli) obj, "CancelWorkByTag_".concat(str), r1, new aye(this, str, 18, null));
    }

    @Override // defpackage.gpz
    public final gps d(String str, int i, List list) {
        return new grd(this, str, i, list).be();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.gpz
    public final gps f(String str, int i, cvi cviVar) {
        if (i != 3) {
            return new grd(this, str, i != 2 ? 1 : 2, Collections.singletonList(cviVar)).be();
        }
        str.getClass();
        Object obj = this.h.d;
        ?? r0 = this.k.c;
        r0.getClass();
        return fki.bb((gli) obj, "enqueueUniquePeriodic_".concat(str), r0, new bg(this, str, cviVar, 14, (char[]) null));
    }

    public final void i() {
        synchronized (a) {
            this.f = true;
            BroadcastReceiver.PendingResult pendingResult = this.g;
            if (pendingResult != null) {
                pendingResult.finish();
                this.g = null;
            }
        }
    }

    public final void j() throws Throwable {
        Object obj = this.h.d;
        grq grqVar = new grq(this, 5);
        boolean zO = gli.o();
        if (zO) {
            try {
                gli.n("ReschedulingWork");
            } catch (Throwable th) {
                if (zO) {
                    Trace.endSection();
                }
                throw th;
            }
        }
        grqVar.a();
        if (zO) {
            Trace.endSection();
        }
    }

    public final void k(gun gunVar, int i) {
        this.k.q(new gvr(this.e, new cb(gunVar), true, i));
    }
}

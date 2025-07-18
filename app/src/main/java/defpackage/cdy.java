package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cdy implements cji {
    public static final String a = cbx.d("Processor");
    public final WorkDatabase b;
    private final Context i;
    private final cak j;
    private final coe l;
    private final Map k = new HashMap();
    public final Map c = new HashMap();
    public final Set e = new HashSet();
    public final List f = new ArrayList();
    private PowerManager.WakeLock h = null;
    public final Object g = new Object();
    public final Map d = new HashMap();

    public cdy(Context context, cak cakVar, coe coeVar, WorkDatabase workDatabase) {
        this.i = context;
        this.j = cakVar;
        this.l = coeVar;
        this.b = workDatabase;
    }

    public static boolean f(String str, cgk cgkVar, int i) {
        if (cgkVar == null) {
            cbx.c().a(a, "WorkerWrapper could not be found for ".concat(String.valueOf(str)));
            return false;
        }
        cgkVar.j.s(new cfs(i));
        cbx.c().a(a, "WorkerWrapper interrupted for ".concat(String.valueOf(str)));
        return true;
    }

    private final void i(final ckp ckpVar) {
        this.l.d.execute(new Runnable() { // from class: cdv
            @Override // java.lang.Runnable
            public final void run() {
                cdy cdyVar = this.a;
                Object obj = cdyVar.g;
                ckp ckpVar2 = ckpVar;
                synchronized (obj) {
                    Iterator it = cdyVar.f.iterator();
                    while (it.hasNext()) {
                        ((cdk) it.next()).a(ckpVar2, false);
                    }
                }
            }
        });
    }

    public final cgk a(String str) {
        Map map = this.c;
        cgk cgkVar = (cgk) map.remove(str);
        boolean z = cgkVar != null;
        if (!z) {
            cgkVar = (cgk) this.k.remove(str);
        }
        this.d.remove(str);
        if (z) {
            synchronized (this.g) {
                if (map.isEmpty()) {
                    Context context = this.i;
                    int i = cjl.k;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        context.startService(intent);
                    } catch (Throwable th) {
                        cbx.c();
                        Log.e(a, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.h;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.h = null;
                    }
                }
            }
        }
        return cgkVar;
    }

    public final cgk b(String str) {
        cgk cgkVar = (cgk) this.c.get(str);
        return cgkVar == null ? (cgk) this.k.get(str) : cgkVar;
    }

    public final void c(cdk cdkVar) {
        synchronized (this.g) {
            this.f.add(cdkVar);
        }
    }

    public final void d(cdk cdkVar) {
        synchronized (this.g) {
            this.f.remove(cdkVar);
        }
    }

    @Override // defpackage.cji
    public final void e(String str, cbf cbfVar) {
        synchronized (this.g) {
            cbx.c();
            Log.i(a, a.e(str, "Moving WorkSpec (", ") to the foreground"));
            cgk cgkVar = (cgk) this.k.remove(str);
            if (cgkVar != null) {
                if (this.h == null) {
                    PowerManager.WakeLock wakeLockA = cnt.a(this.i, "ProcessorForegroundLck");
                    this.h = wakeLockA;
                    wakeLockA.acquire();
                }
                this.c.put(str, cgkVar);
                Context context = this.i;
                ckp ckpVarA = cmk.a(cgkVar.a);
                int i = cjl.k;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_START_FOREGROUND");
                intent.putExtra("KEY_WORKSPEC_ID", ckpVarA.a);
                intent.putExtra("KEY_GENERATION", ckpVarA.b);
                intent.putExtra("KEY_NOTIFICATION_ID", cbfVar.a);
                intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", cbfVar.b);
                intent.putExtra("KEY_NOTIFICATION", cbfVar.c);
                context.startForegroundService(intent);
            }
        }
    }

    public final boolean g(String str) {
        boolean z;
        synchronized (this.g) {
            z = b(str) != null;
        }
        return z;
    }

    public final boolean h(cee ceeVar) throws Throwable {
        Throwable th;
        final ArrayList arrayList = new ArrayList();
        ckp ckpVar = ceeVar.a;
        final String str = ckpVar.a;
        Callable callable = new Callable() { // from class: cdw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = this.a.b;
                cmm cmmVarE = workDatabase.E();
                String str2 = str;
                arrayList.addAll(cmmVarE.a(str2));
                return workDatabase.D().c(str2);
            }
        };
        WorkDatabase workDatabase = this.b;
        cld cldVar = (cld) workDatabase.e(callable);
        if (cldVar == null) {
            cbx.c();
            String str2 = a;
            Objects.toString(ckpVar);
            Log.w(str2, "Didn't find WorkSpec for id ".concat(ckpVar.toString()));
            i(ckpVar);
            return false;
        }
        synchronized (this.g) {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
            try {
                if (g(str)) {
                    Set set = (Set) this.d.get(str);
                    if (((cee) set.iterator().next()).a.b == ckpVar.b) {
                        set.add(ceeVar);
                        cbx.c().a(a, a.c(ckpVar, "Work ", " is already enqueued for processing"));
                    } else {
                        i(ckpVar);
                    }
                } else {
                    if (cldVar.u == ckpVar.b) {
                        Context context = this.i;
                        cak cakVar = this.j;
                        coe coeVar = this.l;
                        final cgk cgkVar = new cgk(new cga(context, cakVar, coeVar, this, workDatabase, cldVar, arrayList));
                        final zyd zydVarB = cbp.b(cgkVar.i.b.plus(new ahdn(null)), new cgh(cgkVar, null));
                        ((xs) zydVarB).b.d(new Runnable() { // from class: cdx
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zBooleanValue;
                                cgk cgkVar2 = cgkVar;
                                try {
                                    zBooleanValue = ((Boolean) ((xs) zydVarB).b.get()).booleanValue();
                                } catch (InterruptedException | ExecutionException unused) {
                                    zBooleanValue = true;
                                }
                                cdy cdyVar = this.a;
                                synchronized (cdyVar.g) {
                                    ckp ckpVarA = cmk.a(cgkVar2.a);
                                    String str3 = ckpVarA.a;
                                    if (cdyVar.b(str3) == cgkVar2) {
                                        cdyVar.a(str3);
                                    }
                                    cbx.c().a(cdy.a, cdyVar.getClass().getSimpleName() + " " + str3 + " executed; reschedule = " + zBooleanValue);
                                    Iterator it = cdyVar.f.iterator();
                                    while (it.hasNext()) {
                                        ((cdk) it.next()).a(ckpVarA, zBooleanValue);
                                    }
                                }
                            }
                        }, coeVar.d);
                        this.k.put(str, cgkVar);
                        HashSet hashSet = new HashSet();
                        hashSet.add(ceeVar);
                        this.d.put(str, hashSet);
                        cbx.c().a(a, getClass().getSimpleName() + ": processing " + ckpVar);
                        return true;
                    }
                    i(ckpVar);
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }
}

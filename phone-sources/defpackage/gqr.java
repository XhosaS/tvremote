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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqr implements gty {
    private static final String j = gpn.a("Processor");
    public final Context b;
    public final WorkDatabase c;
    private final tae k;
    private final isy l;
    public final Map e = new HashMap();
    public final Map d = new HashMap();
    public final Set g = new HashSet();
    public final List h = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object i = new Object();
    public final Map f = new HashMap();

    public gqr(Context context, tae taeVar, isy isyVar, WorkDatabase workDatabase) {
        this.b = context;
        this.k = taeVar;
        this.l = isyVar;
        this.c = workDatabase;
    }

    public static void f(gsb gsbVar, int i) {
        if (gsbVar == null) {
            gpn.b();
            return;
        }
        gsbVar.h.t(new gru(i));
        gpn.b();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final void h(gun gunVar) {
        this.l.a.execute(new foa(this, gunVar, 17, null));
    }

    public final gsb a(String str) {
        Map map = this.d;
        gsb gsbVar = (gsb) map.remove(str);
        boolean z = gsbVar != null;
        if (!z) {
            gsbVar = (gsb) this.e.remove(str);
        }
        this.f.remove(str);
        if (z) {
            synchronized (this.i) {
                if (map.isEmpty()) {
                    Context context = this.b;
                    int i = gua.k;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        context.startService(intent);
                    } catch (Throwable th) {
                        gpn.b();
                        Log.e(j, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            }
        }
        return gsbVar;
    }

    public final gsb b(String str) {
        gsb gsbVar = (gsb) this.d.get(str);
        return gsbVar == null ? (gsb) this.e.get(str) : gsbVar;
    }

    public final void c(gqg gqgVar) {
        synchronized (this.i) {
            this.h.add(gqgVar);
        }
    }

    public final void d(gqg gqgVar) {
        synchronized (this.i) {
            this.h.remove(gqgVar);
        }
    }

    public final boolean e(String str) {
        boolean z;
        synchronized (this.i) {
            z = b(str) != null;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final boolean g(cb cbVar) {
        ArrayList arrayList = new ArrayList();
        Object obj = cbVar.a;
        gun gunVar = (gun) obj;
        String str = gunVar.a;
        hbn hbnVar = new hbn((Object) this, (Object) arrayList, (Object) str, 1, (byte[]) null);
        WorkDatabase workDatabase = this.c;
        guw guwVar = (guw) workDatabase.e(hbnVar);
        if (guwVar == null) {
            gpn.b();
            String str2 = j;
            Objects.toString(obj);
            Log.w(str2, "Didn't find WorkSpec for id ".concat(obj.toString()));
            h(gunVar);
            return false;
        }
        synchronized (this.i) {
            if (e(str)) {
                Set set = (Set) this.f.get(str);
                if (((gun) ((cb) set.iterator().next()).a).b == ((gun) obj).b) {
                    set.add(cbVar);
                    gpn.b();
                    Objects.toString(obj);
                } else {
                    h((gun) obj);
                }
            } else {
                if (guwVar.s == ((gun) obj).b) {
                    Context context = this.b;
                    tae taeVar = this.k;
                    isy isyVar = this.l;
                    gsb gsbVar = new gsb(new lhr(context, taeVar, isyVar, this, workDatabase, guwVar, arrayList));
                    uhp uhpVarV = gli.v(((yid) gsbVar.j.d).plus(new yqg(null)), new gow(gsbVar, (yih) null, 4, (byte[]) null));
                    uhpVarV.c(new bd((Object) this, (Object) uhpVarV, (Object) gsbVar, 12, (char[]) null), isyVar.a);
                    this.e.put(str, gsbVar);
                    HashSet hashSet = new HashSet();
                    hashSet.add(cbVar);
                    this.f.put(str, hashSet);
                    gpn.b();
                    getClass().getSimpleName();
                    Objects.toString(obj);
                    return true;
                }
                h((gun) obj);
            }
            return false;
        }
    }
}

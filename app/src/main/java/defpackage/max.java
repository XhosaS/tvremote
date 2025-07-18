package defpackage;

import android.content.Context;
import com.google.android.libraries.assistant.soda.Soda;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class max {
    public static final zdy a = zdy.h("com/google/android/libraries/assistant/soda/ConcurrentSodaManager");
    public final Context b;
    public final zyg c;
    public final zyg d;
    public final zyh e;
    public final Optional f;
    public final Optional g;
    public final int h;
    public final boolean i;
    long n;
    zyf o;
    mbg q;
    final Optional r;
    public final Object j = new Object();
    final Map k = new HashMap();
    public final Map l = new ConcurrentHashMap();
    public final Map m = new ConcurrentHashMap();
    String p = "";

    public max(Context context, zyg zygVar, zyg zygVar2, zyh zyhVar, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        mbu.a(context);
        this.b = context;
        this.c = zygVar;
        this.d = zygVar2;
        this.e = zyhVar;
        this.f = optional2;
        this.g = optional3;
        this.o = null;
        optional.isPresent();
        this.h = ((tru) optional.get()).a();
        this.r = optional4;
        this.i = ((Boolean) optional.map(new Function() { // from class: mau
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((tru) obj).i);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }

    public final long a() {
        zyf zyfVar = this.o;
        if (zyfVar != null) {
            return 3600000 - zyfVar.getDelay(TimeUnit.MILLISECONDS);
        }
        return -1L;
    }

    public final mbt b(String str, mbg mbgVar) {
        Map map = this.k;
        if (!map.containsKey(str)) {
            return null;
        }
        Map map2 = (Map) map.get(str);
        if (map2.containsKey(mbgVar)) {
            return (mbt) map2.get(mbgVar);
        }
        return null;
    }

    public final void c() {
        zyf zyfVar = this.o;
        if (zyfVar != null) {
            zyfVar.cancel(false);
            this.o = null;
        }
    }

    public final void d(mbt mbtVar, boolean z) {
        mbtVar.j();
        long jA = mbtVar.a();
        if (jA != 0) {
            this.n = jA;
            abwf abwfVar = abwf.a;
            abwe abweVar = new abwe();
            if ((abweVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abweVar.y();
            }
            ((abwf) abweVar.b).b = 3600L;
            final abwf abwfVar2 = (abwf) abweVar.v();
            final long j = this.n;
            if (j != 0) {
                zyf zyfVar = this.o;
                if (zyfVar != null) {
                    zyfVar.cancel(false);
                }
                this.o = this.e.schedule(new Runnable() { // from class: mas
                    @Override // java.lang.Runnable
                    public final void run() {
                        zdy zdyVar = max.a;
                        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "scheduleSharedResourcesTimeout", 284, "ConcurrentSodaManager.java")).w("TTL (%d seconds) reached - delete shared resources", abwfVar2.b);
                        max maxVar = this.a;
                        long j2 = maxVar.n;
                        long j3 = j;
                        if (j2 != j3) {
                            ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "scheduleSharedResourcesTimeout", 289, "ConcurrentSodaManager.java")).C("Attempted to delete shared resources %d but was %d.", j3, maxVar.n);
                            return;
                        }
                        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "clearDiarizationCache", 667, "ConcurrentSodaManager.java")).x("#clearDiarizationCache: %s", adsh.STOP_TYPE_TIMEOUT);
                        if (maxVar.n == 0) {
                            mbg mbgVar = maxVar.q;
                            if (maxVar.p.isEmpty() || mbgVar == null) {
                                ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "clearDiarizationCache", 677, "ConcurrentSodaManager.java")).u("No cache available to delete.");
                                return;
                            }
                            maxVar.e(maxVar.p, mbgVar);
                        }
                        maxVar.a();
                        maxVar.c();
                        boolean zNativeDeleteSharedResources = Soda.nativeDeleteSharedResources(maxVar, maxVar.n);
                        maxVar.n = 0L;
                        maxVar.p = "";
                        maxVar.q = null;
                        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "clearDiarizationCache", 689, "ConcurrentSodaManager.java")).x("Shared resources deleted. DiarizationProcessor present: %b", Boolean.valueOf(zNativeDeleteSharedResources));
                        maxVar.f.isPresent();
                    }
                }, abwfVar2.b, TimeUnit.SECONDS);
            }
            if (z) {
                this.f.isPresent();
            }
        }
    }

    public final void e(String str, mbg mbgVar) {
        zdy zdyVar = a;
        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "disconnect", 208, "ConcurrentSodaManager.java")).u("#disconnect");
        synchronized (this.j) {
            mbt mbtVarB = b(str, mbgVar);
            if (mbtVarB != null && mbtVarB.o()) {
                ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "disconnect", 213, "ConcurrentSodaManager.java")).u("Deleting SODA");
                d(mbtVarB, true);
            }
            Map map = this.k;
            if (map.containsKey(str)) {
                Map map2 = (Map) map.get(str);
                map2.remove(mbgVar);
                if (map2.isEmpty()) {
                    map.remove(str);
                }
            } else {
                ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/assistant/soda/ConcurrentSodaManager", "disconnect", 225, "ConcurrentSodaManager.java")).u("SODA not found");
            }
            if (mbgVar == this.q) {
                this.q = null;
                this.p = "";
            }
        }
    }
}

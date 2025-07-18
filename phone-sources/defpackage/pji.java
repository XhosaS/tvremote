package defpackage;

import android.os.StrictMode;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pji {
    public final uhs a;
    public final pjg b;
    private final yfo c;
    private final Set d;
    private final Executor e;
    private volatile ImmutableMap f;

    public pji(uhs uhsVar, yfo yfoVar, Set set, pjg pjgVar) {
        this.a = uhsVar;
        this.c = yfoVar;
        this.d = set;
        this.b = pjgVar;
        this.e = new uib(uhsVar);
        sij.x(!set.isEmpty(), "No logging result handlers provided.");
    }

    public static uhp c(pkg pkgVar, pjj pjjVar) {
        try {
            return pjjVar.b(pkgVar);
        } catch (Throwable th) {
            return sfy.B(th);
        }
    }

    private final void d(uhp uhpVar) {
        for (qtl qtlVar : this.d) {
            sfy.K(uhpVar, new pjm(0), ugk.a);
        }
    }

    public final List a(Class cls) {
        ImmutableMap immutableMapCopyOf = this.f;
        if (immutableMapCopyOf == null) {
            synchronized (this) {
                immutableMapCopyOf = this.f;
                if (immutableMapCopyOf == null) {
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (pjj pjjVar : ((xcs) this.c).b()) {
                        if (pjjVar.a().isEmpty()) {
                            arrayList.add(pjjVar);
                        } else {
                            for (Class cls2 : pjjVar.a()) {
                                List arrayList2 = (List) map.get(cls2);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    map.put(cls2, arrayList2);
                                }
                                arrayList2.add(pjjVar);
                            }
                        }
                    }
                    map.put(pjk.class, arrayList);
                    immutableMapCopyOf = ImmutableMap.copyOf((Map) map);
                    this.f = immutableMapCopyOf;
                }
            }
        }
        return (List) immutableMapCopyOf.getOrDefault(cls, ImmutableList.of());
    }

    public final void b(pjh pjhVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).detectAll().build());
        try {
            try {
                List listA = pjhVar.a();
                if (listA != null) {
                    if (!listA.isEmpty()) {
                        int i = 6;
                        Callable callableG = trc.g(new grz(this, listA, i, null));
                        Executor executor = this.e;
                        d(ufn.j(sfy.F(callableG, executor), trc.c(new pbb(this, i)), executor));
                    }
                }
            } catch (Throwable th) {
                uhp uhpVarB = sfy.B(th);
                sfy.B(th);
                d(uhpVarB);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}

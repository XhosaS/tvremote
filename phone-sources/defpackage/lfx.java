package defpackage;

import android.content.SharedPreferences;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfx {
    private static final tui b = tui.l("com/google/android/apps/play/movies/common/service/config/VideosExperiments");
    public final ieh a;
    private final Map c = new HashMap();
    private final idf d;
    private final SharedPreferences e;
    private final ieh f;
    private final xkh g;
    private List h;

    public lfx(ieh iehVar, idf idfVar, SharedPreferences sharedPreferences, ieh iehVar2, List list, xkh xkhVar) {
        this.a = iehVar;
        this.d = idfVar;
        this.e = sharedPreferences;
        this.f = iehVar2;
        this.h = list;
        this.g = xkhVar;
    }

    public final /* synthetic */ lfq a(ieg iegVar) {
        return iegVar.k() ? lfq.a : b((ksn) iegVar.g());
    }

    public final synchronized lfq b(ksn ksnVar) {
        Set<Long> setOf;
        String string;
        lfq lfqVar = (lfq) this.c.get(ksnVar);
        if (lfqVar != null) {
            return lfqVar;
        }
        if (this.d.b(ieg.f(ksnVar)) == null) {
            return lfq.a;
        }
        try {
            setOf = ImmutableSet.copyOf((Collection) ((vxi) xki.a.et(((xki) this.g).b)).b);
            ((tug) ((tug) b.b()).j("com/google/android/apps/play/movies/common/service/config/VideosExperiments", "getExperimentsFromMendelOverride", 137, "VideosExperiments.java")).v("experiments=%s", setOf);
        } catch (Exception e) {
            ((tug) ((tug) ((tug) ((tug) b.f()).g(1, TimeUnit.DAYS)).i(e)).j("com/google/android/apps/play/movies/common/service/config/VideosExperiments", "getExperimentsFromMendelOverride", 140, "VideosExperiments.java")).s("Failed to read legacyExperimentsFeatureFlags. Returning empty experiment set");
            setOf = ImmutableSet.of();
        }
        long j = 0;
        if (!this.h.isEmpty()) {
            Set hashSet = new HashSet(setOf);
            for (Long l : this.h) {
                long jLongValue = l.longValue();
                if (jLongValue >= 0) {
                    hashSet.add(l);
                } else {
                    hashSet.remove(Long.valueOf(-jLongValue));
                }
            }
            setOf = hashSet;
        }
        lfq lfqVar2 = lfq.a;
        HashSet hashSet2 = new HashSet();
        for (Long l2 : setOf) {
            if (l2.longValue() >= 0) {
                hashSet2.add(l2);
            }
        }
        long[] jArrA = lfq.a(hashSet2);
        int length = jArrA.length;
        char[] cArr = lfp.a;
        if (length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < length) {
                long j2 = jArrA[i];
                if (j2 >= j) {
                    if (j2 == j) {
                        sb.append(lfp.a[0]);
                    }
                    while (j2 > j) {
                        char[] cArr2 = lfp.a;
                        long length2 = cArr2.length;
                        sb.append(cArr2[(int) (j2 % length2)]);
                        j2 /= length2;
                        j = 0;
                    }
                    sb.append(':');
                }
                i++;
                j = 0;
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            string = sb.toString();
        }
        lfq lfqVar3 = new lfq(hashSet2, string, jArrA);
        this.c.put(ksnVar, lfqVar3);
        return lfqVar3;
    }

    public final synchronized void c(long... jArr) {
        ArrayList arrayList = new ArrayList(this.h);
        arrayList.add(Long.valueOf(jArr[0]));
        this.h = arrayList;
    }

    public final void d(ksn ksnVar, String str) {
        if (((Boolean) this.f.a()).booleanValue()) {
            this.c.remove(ksnVar);
        }
        this.e.edit().putString(krh.EXPERIMENTS_PREFIX.concat(String.valueOf(String.valueOf(ksnVar))), str).apply();
    }

    public final synchronized void e(ieg iegVar, Runnable runnable) {
        f(iegVar);
    }

    public final synchronized void f(ieg iegVar) {
        gvj gvjVar = new gvj(this, iegVar, 19, null);
        if (iegVar.k()) {
            gvjVar.run();
            return;
        }
        ksn ksnVar = (ksn) iegVar.g();
        d(ksnVar, b(ksnVar).c);
        gvjVar.run();
    }
}

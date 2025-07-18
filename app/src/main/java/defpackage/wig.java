package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wig {
    public static final uqe a;
    public final Context b;
    public final rnw c;
    public final ExecutorService d;
    public final zyh e;
    public final int f;
    public final Map g;
    public final zdy h;
    public final boolean i;
    public final Map j;
    private final Map k;
    private final aehf l;

    static {
        upz upzVar = new upz();
        upzVar.b("CREATE TABLE ListenerSuccessfulRuns (listener_key, version_code INTEGER NOT NULL);");
        upzVar.b("CREATE TABLE AllListenersSucceededVersionTable (version_code INTEGER PRIMARY KEY ON CONFLICT REPLACE);");
        a = upzVar.a();
    }

    public wig(Context context, rnw rnwVar, ExecutorService executorService, zyh zyhVar, int i, Map map, Map map2, aehf aehfVar) {
        context.getClass();
        executorService.getClass();
        zyhVar.getClass();
        aehfVar.getClass();
        this.b = context;
        this.c = rnwVar;
        this.d = executorService;
        this.e = zyhVar;
        this.f = i;
        this.k = map;
        this.g = map2;
        this.l = aehfVar;
        if (!agqq.y(((yyr) map).keySet(), ((yyr) map2).keySet()).isEmpty()) {
            Set setY = agqq.y(((yyr) map).keySet(), ((yyr) map2).keySet());
            Objects.toString(setY);
            throw new IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(setY.toString()));
        }
        this.h = zdy.h("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner");
        Boolean bool = false;
        bool.getClass();
        this.i = false;
        this.j = rnwVar.a() ? agrj.e(map, map2) : map2;
    }

    public final uot a() {
        Object objA = this.l.a();
        objA.getClass();
        return (uot) objA;
    }
}

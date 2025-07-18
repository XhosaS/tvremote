package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyo {
    public static final wyo a = new wyo();
    public static long b = Math.abs(new Random().nextInt()) << 30;
    public static final HashMap c = new HashMap();
    public static final Object d = new Object();
    public static wwt e;

    private wyo() {
    }

    public static final yqi a(yqi yqiVar) {
        yqiVar.getClass();
        return new wyk(wum.e(), yqiVar);
    }

    public static final zvh b(zvh zvhVar) {
        zvhVar.getClass();
        return new wyd(wum.e(), zvhVar);
    }

    public static final zvi c(zvi zviVar) {
        return new wye(wum.e(), zviVar);
    }

    public static final zvv d(final zvv zvvVar) {
        final wwq wwqVarE = wum.e();
        return new zvv() { // from class: wxz
            @Override // defpackage.zvv
            public final zwc a(zvz zvzVar, Object obj) {
                wyo wyoVar = wyo.a;
                zvzVar.getClass();
                wwq wwqVarG = wum.g(wum.c(), wwqVarE);
                try {
                    return zvvVar.a(zvzVar, obj);
                } finally {
                }
            }
        };
    }

    public static final zvy e(final zvy zvyVar) {
        final wwq wwqVarE = wum.e();
        return new zvy() { // from class: wxy
            @Override // defpackage.zvy
            public final Object a(zvz zvzVar, Object obj) {
                wyo wyoVar = wyo.a;
                zvzVar.getClass();
                wwq wwqVarG = wum.g(wum.c(), wwqVarE);
                try {
                    return zvyVar.a(zvzVar, obj);
                } finally {
                }
            }
        };
    }

    public static final zxe f(zxe zxeVar) {
        return new wyl(wum.e(), zxeVar);
    }

    public static final Runnable g(Runnable runnable) {
        return new wyg(a.p(), runnable);
    }

    public static final Runnable h(Runnable runnable) {
        runnable.getClass();
        wwq wwqVarE = wum.e();
        agwh agwhVar = new agwh();
        if (wtu.a == 1) {
            int i = wzs.a;
        }
        return new wym(agwhVar, wwqVarE, runnable);
    }

    public static final Callable i(Callable callable) {
        return new wyf(wum.e(), callable);
    }

    public static final Callable j(Callable callable) {
        return new wyh(a.p(), callable);
    }

    public static final void k(Intent intent) {
        intent.getClass();
        if (wwe.a != 1 && !intent.hasExtra("tracing_intent_id")) {
            throw new IllegalStateException("Was supposed to propagate trace for startActivity - did you forget to propagate it? See http://go/tiktok-conformance-violations/TRACE_PROPAGATION_FOR_START_ACTIVITY for more details.");
        }
    }

    public static final void l(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Intent intent2 = new Intent(intent);
        wyb wybVarO = o(intent2);
        try {
            context.startActivity(intent2);
            aguc.a(wybVarO, null);
        } finally {
        }
    }

    public static final wyb o(Intent intent) {
        long j;
        wwq wwqVarE = wum.e();
        wwq wwqVar = wum.c().c;
        if (wwqVar != null) {
            wwc wwcVar = wto.a;
            wvz wvzVar = wto.b;
            if (!wwqVar.j(wvzVar).b()) {
                synchronized (wwqVar) {
                    if (!wwqVar.j(wvzVar).b()) {
                        wwqVar.o(wvzVar, true);
                    }
                }
            }
        }
        HashMap map = c;
        synchronized (map) {
            j = b;
            b = 1 + j;
        }
        intent.putExtra("tracing_intent_id", j);
        return new wyb(j);
    }

    private final wwq p() {
        wwl wwlVarC = wum.c();
        wwq wwqVar = wwlVarC.c;
        if (wwqVar != null && !agvy.c(wwqVar, wvs.a)) {
            wwq wwqVar2 = wwlVarC.c;
            wwqVar2.getClass();
            return wwqVar2;
        }
        wwq wwqVar3 = wwlVarC.d;
        if (wwqVar3 != null) {
            return wwqVar3;
        }
        throw new IllegalStateException("This is not reachable if guarded by shouldPropagateExecutorTrace.");
    }

    public final boolean m() {
        wwl wwlVarC = wum.c();
        wwq wwqVar = wwlVarC.c;
        return ((wwqVar == null || agvy.c(wwqVar, wvs.a)) && wwlVarC.d == null) ? false : true;
    }

    public final wwq n(Intent intent, boolean z) {
        wwq wwqVar;
        try {
            if (!intent.hasExtra("tracing_intent_id")) {
                return null;
            }
            long longExtra = intent.getLongExtra("tracing_intent_id", -1L);
            HashMap map = c;
            synchronized (map) {
                wwqVar = (wwq) (z ? map.remove(Long.valueOf(longExtra)) : map.get(Long.valueOf(longExtra)));
            }
            return wwqVar;
        } catch (BadParcelableException unused) {
            return null;
        }
    }
}

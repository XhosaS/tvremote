package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwv {
    public static Context a;
    private static volatile rwv j;
    private static volatile rwv k;
    public final Context c;
    public final ttm d;
    public final rzk e;
    public final ttm f;
    public final ryz g;
    public final unc h = new unc();
    private final ttm l;
    private final ttm m;
    private final ttm n;
    private static final Object i = new Object();
    public static final ttm b = sij.l(new eik(12));

    public rwv(Context context, ttm ttmVar, ttm ttmVar2, ttm ttmVar3, ttm ttmVar4, ttm ttmVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ttmVar.getClass();
        ttmVar2.getClass();
        ttmVar3.getClass();
        ttmVar4.getClass();
        ttmVar5.getClass();
        ttm ttmVarL = sij.l(ttmVar);
        ttm ttmVarL2 = sij.l(ttmVar2);
        ttm ttmVarL3 = sij.l(new rtb(ttmVar3, 6));
        ttm ttmVarL4 = sij.l(ttmVar4);
        ttm ttmVarL5 = sij.l(ttmVar5);
        this.c = applicationContext;
        this.l = ttmVarL;
        this.m = ttmVarL2;
        this.d = ttmVarL3;
        this.n = ttmVarL4;
        this.e = new rzk(applicationContext, ttmVarL, ttmVarL4, ttmVarL2);
        this.f = ttmVarL5;
        this.g = new ryz(applicationContext, ttmVarL, ttmVarL3, ttmVarL2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rwv a(Context context) {
        boolean z;
        rwv rwvVar = j;
        if (rwvVar != null) {
            return rwvVar;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            tst tstVarA = ((rwu) sis.e(applicationContext, rwu.class)).a();
            z = true;
            try {
                if (tstVarA.g()) {
                    return (rwv) tstVarA.c();
                }
            } catch (IllegalStateException unused) {
            }
        } catch (IllegalStateException unused2) {
            z = false;
        }
        synchronized (i) {
            if (j != null) {
                return j;
            }
            tst tstVarA2 = trk.a;
            boolean z2 = applicationContext instanceof rwu;
            if (z2) {
                tstVarA2 = ((rwu) applicationContext).a();
            }
            rwv rwvVar2 = (rwv) tstVarA2.d(new rtb(applicationContext, 3));
            j = rwvVar2;
            if (!z && !z2) {
                rrx.L(Level.CONFIG, rwvVar2.b(), "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
            }
            return rwvVar2;
        }
    }

    public static void c(Context context) {
        synchronized (i) {
            if (a != null) {
                return;
            }
            try {
                a = context.getApplicationContext();
            } catch (NullPointerException unused) {
                d();
                rrx.L(Level.WARNING, (Executor) b.get(), "context.getApplicationContext() yielded NullPointerException", new Object[0]);
            }
        }
    }

    public static void d() {
        rwx.a();
        if (a == null && rwx.a == null) {
            rwx.a = new rww();
        }
    }

    public final uht b() {
        return (uht) this.l.get();
    }

    public final aafi e() {
        return (aafi) this.n.get();
    }

    public final ulp f() {
        return (ulp) this.m.get();
    }
}

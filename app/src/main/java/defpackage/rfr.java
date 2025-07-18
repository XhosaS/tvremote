package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfr {
    public final rjo c = new rjw();
    public final Context d;
    public final yrp e;
    public final rni f;
    public final yrp g;
    public final rlx h;
    private final yrp m;
    private final yrp n;
    private final yrp o;
    private static final Object i = new Object();
    private static final rgl j = new rgl();
    public static Context a = null;
    private static volatile rfr k = null;
    private static volatile rfr l = null;
    public static final yrp b = yru.a(new yrp() { // from class: rfg
        @Override // defpackage.yrp
        public final Object eV() {
            Context context = rfr.a;
            return zyn.b(Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: rfk
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Context context2 = rfr.a;
                    return new Thread(runnable, "ProcessStablePhenotypeFlag");
                }
            }));
        }
    });

    public rfr(Context context, yrp yrpVar, yrp yrpVar2, final yrp yrpVar3, yrp yrpVar4, yrp yrpVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        yrpVar.getClass();
        yrpVar2.getClass();
        yrpVar3.getClass();
        yrpVar4.getClass();
        yrpVar5.getClass();
        yrp yrpVarA = yru.a(yrpVar);
        yrp yrpVarA2 = yru.a(yrpVar2);
        yrp yrpVarA3 = yru.a(new yrp() { // from class: rfl
            @Override // defpackage.yrp
            public final Object eV() {
                Context context2 = rfr.a;
                return (rmj) ((yqt) yrpVar3.eV()).f();
            }
        });
        yrp yrpVarA4 = yru.a(yrpVar4);
        yrp yrpVarA5 = yru.a(yrpVar5);
        this.d = applicationContext;
        this.m = yrpVarA;
        this.n = yrpVarA2;
        this.e = yrpVarA3;
        this.o = yrpVarA4;
        this.f = new rni(applicationContext, yrpVarA, yrpVarA4, yrpVarA2);
        this.g = yrpVarA5;
        this.h = new rlx(applicationContext, yrpVarA, yrpVarA3, yrpVarA2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rfr a(Context context) {
        boolean z;
        rfr rfrVar = k;
        if (rfrVar != null) {
            return rfrVar;
        }
        final Context applicationContext = context.getApplicationContext();
        try {
            try {
                return (rfr) ((yqz) ((rfq) wgw.a(applicationContext, rfq.class)).eI()).a;
            } catch (IllegalStateException unused) {
                z = true;
                synchronized (i) {
                    if (k != null) {
                        return k;
                    }
                    yqt yqtVarEI = ypv.a;
                    boolean z2 = applicationContext instanceof rfq;
                    if (z2) {
                        yqtVarEI = ((rfq) applicationContext).eI();
                    }
                    rfr rfrVar2 = (rfr) yqtVarEI.d(new yrp() { // from class: rfh
                        @Override // defpackage.yrp
                        public final Object eV() {
                            Context context2 = rfr.a;
                            rfp rfpVar = new rfp();
                            rfpVar.a = applicationContext;
                            return rfpVar.a();
                        }
                    });
                    k = rfrVar2;
                    if (!z && !z2) {
                        j.a(Level.CONFIG, rfrVar2.e(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                    }
                    return rfrVar2;
                }
            }
        } catch (IllegalStateException unused2) {
            z = false;
        }
    }

    public static yrp d(final Context context) {
        return yru.a(new yrp() { // from class: rfi
            @Override // defpackage.yrp
            public final Object eV() {
                Context context2 = rfr.a;
                return new rhc(new lsd(context));
            }
        });
    }

    public static void f(Context context) {
        synchronized (i) {
            if (a != null) {
                return;
            }
            try {
                a = context.getApplicationContext();
            } catch (NullPointerException unused) {
                g();
                j.a(Level.WARNING, (Executor) b.eV(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
            }
        }
    }

    public static void g() {
        synchronized (rft.a) {
        }
        if (a == null && rft.b == null) {
            rft.b = new rfs();
        }
    }

    public final rgy b() {
        return (rgy) this.n.eV();
    }

    public final ueg c() {
        return (ueg) this.o.eV();
    }

    public final zyh e() {
        return (zyh) this.m.eV();
    }
}

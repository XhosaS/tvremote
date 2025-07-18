package defpackage;

import android.content.Context;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bav {
    public static Context b;
    private static volatile bav j;
    private static volatile bav k;
    public final Context d;
    public final byo e;
    public final bdp f;
    public final byo g;
    public final bcy h;
    public final auf i = new auf(null, null);
    private final byo l;
    private final byo m;
    private final byo n;
    public static final Object a = new Object();
    public static final byo c = bit.k(new azz(3));

    public bav(Context context, byo byoVar, byo byoVar2, byo byoVar3, byo byoVar4, byo byoVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        byoVar.getClass();
        byoVar2.getClass();
        byoVar3.getClass();
        byoVar4.getClass();
        byoVar5.getClass();
        byo byoVarK = bit.k(byoVar);
        byo byoVarK2 = bit.k(byoVar2);
        byo byoVarK3 = bit.k(new asf(byoVar3, 16));
        byo byoVarK4 = bit.k(byoVar4);
        byo byoVarK5 = bit.k(byoVar5);
        this.d = applicationContext;
        this.l = byoVarK;
        this.m = byoVarK2;
        this.e = byoVarK3;
        this.n = byoVarK4;
        this.f = new bdp(applicationContext, byoVarK, byoVarK4, byoVarK2);
        this.g = byoVarK5;
        this.h = new bcy(applicationContext, byoVarK, byoVarK3, byoVarK2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static bav a(Context context) {
        boolean z;
        Object applicationContext;
        bav bavVar = j;
        if (bavVar != null) {
            return bavVar;
        }
        Context applicationContext2 = context.getApplicationContext();
        try {
            applicationContext = applicationContext2.getApplicationContext();
        } catch (IllegalStateException unused) {
            z = false;
        }
        if (!(applicationContext instanceof cpe)) {
            throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(String.valueOf(applicationContext.getClass()))));
        }
        try {
            byg bygVarA = ((bau) bau.class.cast(((cpe) applicationContext).a())).a();
            z = true;
            try {
                if (bygVarA.f()) {
                    return (bav) bygVarA.b();
                }
            } catch (IllegalStateException unused2) {
            }
            synchronized (a) {
                if (j != null) {
                    return j;
                }
                byg bygVarA2 = bxw.a;
                boolean z2 = applicationContext2 instanceof bau;
                if (z2) {
                    bygVarA2 = ((bau) applicationContext2).a();
                }
                bav bavVar2 = (bav) bygVarA2.c(new asf(applicationContext2, 13));
                j = bavVar2;
                if (!z && !z2) {
                    awo.c(Level.CONFIG, bavVar2.b(), "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                }
                return bavVar2;
            }
        } catch (ClassCastException e) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
        }
    }

    public static void c() {
        bax.a();
        if (b == null && bax.a == null) {
            bax.a = new baw();
        }
    }

    public final cjd b() {
        return (cjd) this.l.aL();
    }

    public final asv d() {
        return (asv) this.m.aL();
    }

    public final bzt e() {
        return (bzt) this.n.aL();
    }
}

package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbe implements xcm {
    private final xcq a;
    private final xcq b;
    private final /* synthetic */ int c;

    public rbe(xcq xcqVar, xcq xcqVar2, int i) {
        this.c = i;
        this.a = xcqVar;
        this.b = xcqVar2;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, ose] */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.c) {
            case 0:
                return new rbd(puz.d(), ((rbc) this.a).b(), new rbk(), ((mii) this.b).b());
            case 1:
                qte qteVar = (qte) this.b.b();
                ((qib) this.a).a();
                qteVar.getClass();
                return new qtl();
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) ((ttm) ((tst) ((xcn) this.a).a).e(new riu((Context) ((xcn) this.b).a, 10))).get();
                sharedPreferences.getClass();
                return sharedPreferences;
            case 3:
                if (!sjl.g()) {
                    rqb rqbVar = (rqb) this.b.b();
                    if (!rqb.b()) {
                        tug tugVar = (tug) ((tug) rnb.a.g()).j("com/google/android/libraries/performance/primes/CrashOnBadPrimesConfiguration", "observedBackgroundInitialization", 29, "CrashOnBadPrimesConfiguration.java");
                        Object obj = rqbVar.a;
                        tugVar.v("Primes init triggered from background in package: %s", obj);
                        if (!rqbVar.a()) {
                            throw new IllegalStateException(String.format("Primes init triggered from background in package: %s", obj));
                        }
                    }
                }
                return new rmr(((rmu) this.a).b());
            case 4:
                rnd rndVar = (rnd) this.a.b();
                int i = rndVar.b;
                int i2 = rndVar.a;
                kwy kwyVarA = ((osd) this.b).b();
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, new rna(i2, 0), new rmy());
                scheduledThreadPoolExecutor.setMaximumPoolSize(i);
                uht uhtVarW = sfy.w(scheduledThreadPoolExecutor);
                ?? r1 = kwyVarA.a;
                if (r1 != 0) {
                    uhtVarW = r1.a();
                }
                uhtVarW.getClass();
                return uhtVarW;
            case 5:
                return new rnv(this.a, 1);
            case 6:
                return new cb((Context) ((xcn) this.b).a, (ulp) this.a.b());
            case 7:
                return new rzy((Object) ((ror) this.a).b(), ((xcn) this.b).a, (byte[]) null);
            case 8:
                ImmutableSet immutableSetOf = ((tst) ((xcn) this.a).a).g() ? ImmutableSet.of((rqf) this.b.b()) : ImmutableSet.of();
                immutableSetOf.getClass();
                return immutableSetOf;
            case 9:
                ImmutableSet immutableSetOf2 = !((tst) ((xcn) this.a).a).g() ? ImmutableSet.of() : ImmutableSet.of((rqf) this.b.b());
                immutableSetOf2.getClass();
                return immutableSetOf2;
            case 10:
                Set setAJ = qtl.aJ((tst) ((xcn) this.a).a, this.b);
                setAJ.getClass();
                return setAJ;
            case 11:
                Set setAJ2 = qtl.aJ((tst) ((xcn) this.a).a, this.b);
                setAJ2.getClass();
                return setAJ2;
            case 12:
                ImmutableSet immutableSetOf3 = ((tst) ((xcn) this.a).a).g() ? ImmutableSet.of((rqf) this.b.b()) : ImmutableSet.of();
                immutableSetOf3.getClass();
                return immutableSetOf3;
            case 13:
                Set setAJ3 = qtl.aJ((tst) ((xcn) this.a).a, this.b);
                setAJ3.getClass();
                return setAJ3;
            case 14:
                return new rup((ruo) this.b.b(), ((rur) this.a).b());
            case 15:
                return new rvd((Random) ((tst) ((xcn) this.a).a).e((Random) this.b.b()));
            case 16:
                return new teo(((rgq) this.a).a(), (ulp) this.b.b());
            case 17:
                return new vvd((uqh) this.b.b(), ImmutableList.copyOf((Collection) ((xcn) this.a).a));
            default:
                xcq xcqVar = this.b;
                Context contextA = ((rgq) this.a).a();
                return new upq(contextA.getApplicationContext(), (byte[]) null);
        }
    }

    public rbe(xcq xcqVar, xcq xcqVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = xcqVar;
        this.a = xcqVar2;
    }
}

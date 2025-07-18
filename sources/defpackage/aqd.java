package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.tv.remote.service.RemoteService;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqd implements cpi {
    private final cpm a;
    private final cpm b;
    private final /* synthetic */ int c;

    public aqd(cpm cpmVar, cpm cpmVar2, int i) {
        this.c = i;
        this.a = cpmVar;
        this.b = cpmVar2;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [aox, java.lang.Object] */
    @Override // defpackage.crv, defpackage.cru
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                if (!bej.c()) {
                    auc aucVar = (auc) this.b.a();
                    if (!auc.b()) {
                        cbs cbsVar = (cbs) aqn.a.g().j("com/google/android/libraries/performance/primes/CrashOnBadPrimesConfiguration", "observedBackgroundInitialization", 29, "CrashOnBadPrimesConfiguration.java");
                        Object obj = aucVar.a;
                        cbsVar.t("Primes init triggered from background in package: %s", obj);
                        if (!aucVar.a()) {
                            throw new IllegalStateException(String.format("Primes init triggered from background in package: %s", obj));
                        }
                    }
                }
                return new aqg(((aqj) this.a).a());
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) ((byo) ((ays) this.a).a().d(new asf((Context) ((cpj) this.b).a, 1))).aL();
                sharedPreferences.getClass();
                return sharedPreferences;
            case 2:
                aqo aqoVar = (aqo) this.a.a();
                int i = aqoVar.b;
                int i2 = aqoVar.a;
                asv asvVarA = ((aow) this.b).a();
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, new aqm(i2), new aql());
                scheduledThreadPoolExecutor.setMaximumPoolSize(i);
                cjd cjdVarD = qm.D(scheduledThreadPoolExecutor);
                ?? r1 = asvVarA.a;
                if (r1 != 0) {
                    cjdVarD = r1.a();
                }
                cjdVarD.getClass();
                return cjdVarD;
            case 3:
                return new arf(this.a);
            case 4:
                return new arx((awy) this.a.a(), (byg) ((cpj) this.b).a);
            case 5:
                return new asv((Context) ((cpj) this.b).a, (att) this.a.a());
            case 6:
                return new awy(((asn) this.a).a(), (Context) ((cpj) this.b).a, (byte[]) null);
            case 7:
                Object cbfVar = ((byg) ((cpj) this.a).a).f() ? new cbf((auh) this.b.a()) : cbd.a;
                cbfVar.getClass();
                return cbfVar;
            case 8:
                Object cbfVar2 = !((byg) ((cpj) this.a).a).f() ? cbd.a : new cbf((auh) this.b.a());
                cbfVar2.getClass();
                return cbfVar2;
            case 9:
                Set setF = sd.f(((bnl) this.a).b(), this.b);
                setF.getClass();
                return setF;
            case 10:
                Set setF2 = sd.f((byg) ((cpj) this.a).a, this.b);
                setF2.getClass();
                return setF2;
            case 11:
                Object cbfVar3 = ((byg) ((cpj) this.a).a).f() ? new cbf((auh) this.b.a()) : cbd.a;
                cbfVar3.getClass();
                return cbfVar3;
            case 12:
                Set setF3 = sd.f((byg) ((cpj) this.a).a, this.b);
                setF3.getClass();
                return setF3;
            case 13:
                return new axz((asq) this.b.a(), cph.b(this.a));
            case 14:
                cpm cpmVar = this.a;
                return new ayi(((aym) cpmVar).a());
            case 15:
                return new ayu((Random) ((byg) ((cpj) this.a).a).d((Random) this.b.a()));
            case 16:
                return new bdv((byg) ((cpj) this.b).a, ((cpk) this.a).a());
            case 17:
                return new bea(this.a);
            case 18:
                return new bou((RemoteService) ((cpj) this.a).a, this.b);
            case 19:
                return new bpa((bsi) this.a.a(), ((bpk) this.b).a());
            default:
                return new bpd((Context) ((cpj) this.b).a, ((bpi) this.a).a());
        }
    }

    public aqd(cpm cpmVar, cpm cpmVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = cpmVar;
        this.a = cpmVar2;
    }
}

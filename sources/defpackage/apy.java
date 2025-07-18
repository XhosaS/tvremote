package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apy implements cpi {
    private final cpm a;
    private final /* synthetic */ int b;

    public apy(cpm cpmVar, int i) {
        this.b = i;
        this.a = cpmVar;
    }

    @Override // defpackage.crv, defpackage.cru
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                auo auoVar = (auo) apd.b((byg) ((cpj) this.a).a, new apw(1));
                auoVar.getClass();
                return auoVar;
            case 1:
                avo avoVar = (avo) apd.b((byg) ((cpj) this.a).a, new apw(2));
                avoVar.getClass();
                return avoVar;
            case 2:
                aut autVar = (aut) apd.b(((bnl) this.a).b(), new apw(9));
                autVar.getClass();
                return autVar;
            case 3:
                avw avwVar = (avw) apd.b((byg) ((cpj) this.a).a, new apw(0));
                avwVar.getClass();
                return avwVar;
            case 4:
                byg bygVar = (byg) ((cpj) this.a).a;
                return bygVar.f() ? byg.g((atw) ((crv) bygVar.b()).a()) : bxw.a;
            case 5:
                awm awmVar = (awm) apd.b((byg) ((cpj) this.a).a, new apw(3));
                awmVar.getClass();
                return awmVar;
            case 6:
                ayd aydVar = (ayd) apd.b(((bnl) this.a).b(), new apw(4));
                aydVar.getClass();
                return aydVar;
            case 7:
                byg bygVar2 = (byg) ((cpj) this.a).a;
                aqo aqoVar = new aqo(null);
                bdq.l(aqoVar.b > 0, "Thread pool size must be less than or equal to %s", 2);
                return (aqo) bygVar2.d(aqoVar);
            case 8:
                ayn aynVar = (ayn) apd.b((byg) ((cpj) this.a).a, new apw(10));
                aynVar.getClass();
                return aynVar;
            case 9:
                ayh ayhVar = (ayh) apd.b(((bnl) this.a).b(), new apw(6));
                ayhVar.getClass();
                return ayhVar;
            case 10:
                ayp aypVar = (ayp) apd.b((byg) ((cpj) this.a).a, new apw(8));
                aypVar.getClass();
                return aypVar;
            case 11:
                return new auc((Context) ((cpj) this.a).a);
            case 12:
                return new Random(SystemClock.elapsedRealtime());
            case 13:
                aqg aqgVar = (aqg) this.a.a();
                aqg.a(aqgVar);
                aqgVar.getClass();
                return aqgVar;
            case 14:
                return (sd) ((bnl) this.a).b().d(new sd());
            case 15:
                return new aqk();
            case 16:
                axb axbVar = (axb) ((crv) ((bnl) this.a).b().d(new apw(11))).a();
                axbVar.getClass();
                return axbVar;
            case 17:
                return Boolean.valueOf(cqd.a.aL().f((Context) ((cpj) this.a).a));
            case 18:
                return cqd.a.aL().e((Context) ((cpj) this.a).a);
            case 19:
                return Boolean.valueOf(crc.a.aL().a((Context) ((cpj) this.a).a));
            default:
                return Boolean.valueOf(crc.a.aL().b((Context) ((cpj) this.a).a));
        }
    }
}

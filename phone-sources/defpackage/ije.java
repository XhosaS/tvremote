package defpackage;

import android.content.Context;
import com.google.android.apps.googletv.app.data.room.GoogleTvCacheDatabase;
import com.google.android.apps.googletv.app.data.room.GoogleTvDatabase;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ije implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public ije(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, yfo] */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                Context contextA = ((rgq) this.a).a();
                ggi[] ggiVarArr = GoogleTvDatabase.l;
                gev gevVarD = gez.d(contextA, GoogleTvDatabase.class, "google_tv_db");
                gevVarD.b((ggi[]) Arrays.copyOf(GoogleTvDatabase.l, 27));
                GoogleTvDatabase googleTvDatabase = (GoogleTvDatabase) gevVarD.a();
                googleTvDatabase.getClass();
                return googleTvDatabase;
            case 1:
                Context contextA2 = ((rgq) this.a).a();
                gev gevVarD2 = gez.d(contextA2, GoogleTvCacheDatabase.class, String.valueOf(contextA2.getCacheDir().getAbsolutePath()).concat("/google_tv_cache_db"));
                gevVarD2.f = false;
                gevVarD2.g = true;
                GoogleTvCacheDatabase googleTvCacheDatabase = (GoogleTvCacheDatabase) gevVarD2.a();
                googleTvCacheDatabase.getClass();
                return googleTvCacheDatabase;
            case 2:
                GoogleTvDatabase googleTvDatabase2 = (GoogleTvDatabase) this.a.b();
                googleTvDatabase2.getClass();
                ikt iktVarF = googleTvDatabase2.F();
                iktVarF.getClass();
                return iktVarF;
            case 3:
                GoogleTvDatabase googleTvDatabase3 = (GoogleTvDatabase) this.a.b();
                googleTvDatabase3.getClass();
                ikx ikxVarG = googleTvDatabase3.G();
                ikxVarG.getClass();
                return ikxVarG;
            case 4:
                GoogleTvDatabase googleTvDatabase4 = (GoogleTvDatabase) this.a.b();
                googleTvDatabase4.getClass();
                ilk ilkVarI = googleTvDatabase4.I();
                ilkVarI.getClass();
                return ilkVarI;
            case 5:
                GoogleTvDatabase googleTvDatabase5 = (GoogleTvDatabase) this.a.b();
                googleTvDatabase5.getClass();
                ilo iloVarJ = googleTvDatabase5.J();
                iloVarJ.getClass();
                return iloVarJ;
            case 6:
                GoogleTvDatabase googleTvDatabase6 = (GoogleTvDatabase) this.a.b();
                googleTvDatabase6.getClass();
                ilu iluVarK = googleTvDatabase6.K();
                iluVarK.getClass();
                return iluVarK;
            case 7:
                GoogleTvDatabase googleTvDatabase7 = (GoogleTvDatabase) this.a.b();
                googleTvDatabase7.getClass();
                ikq ikqVarE = googleTvDatabase7.E();
                ikqVarE.getClass();
                return ikqVarE;
            case 8:
                GoogleTvDatabase googleTvDatabase8 = (GoogleTvDatabase) this.a.b();
                googleTvDatabase8.getClass();
                ijq ijqVarY = googleTvDatabase8.y();
                ijqVarY.getClass();
                return ijqVarY;
            case 9:
                GoogleTvDatabase googleTvDatabase9 = (GoogleTvDatabase) this.a.b();
                googleTvDatabase9.getClass();
                ijy ijyVarZ = googleTvDatabase9.z();
                ijyVarZ.getClass();
                return ijyVarZ;
            case 10:
                GoogleTvDatabase googleTvDatabase10 = (GoogleTvDatabase) this.a.b();
                googleTvDatabase10.getClass();
                ikf ikfVarA = googleTvDatabase10.A();
                ikfVarA.getClass();
                return ikfVarA;
            case 11:
                GoogleTvDatabase googleTvDatabase11 = (GoogleTvDatabase) this.a.b();
                googleTvDatabase11.getClass();
                ikh ikhVarB = googleTvDatabase11.B();
                ikhVarB.getClass();
                return ikhVarB;
            case 12:
                GoogleTvDatabase googleTvDatabase12 = (GoogleTvDatabase) this.a.b();
                googleTvDatabase12.getClass();
                ikj ikjVarC = googleTvDatabase12.C();
                ikjVarC.getClass();
                return ikjVarC;
            case 13:
                GoogleTvDatabase googleTvDatabase13 = (GoogleTvDatabase) this.a.b();
                googleTvDatabase13.getClass();
                ikm ikmVarD = googleTvDatabase13.D();
                ikmVarD.getClass();
                return ikmVarD;
            case 14:
                return new hfx((ldv) this.a.b());
            case 15:
                return new inj((iyz) this.a.b());
            case 16:
                irc ircVarB = ((ioj) this.a).b();
                yow yowVarL = yoz.l(ypk.a);
                kdj kdjVar = (kdj) ircVarB.b.b();
                kdjVar.getClass();
                return new ioi(kdjVar, ((kqg) ircVarB.a).b(), yowVarL);
            case 17:
                lkt lktVarB = ((ioq) this.a).b();
                yot yotVar = ypk.a;
                yow yowVarL2 = yoz.l(yya.a);
                Object obj = lktVarB.b;
                ?? r2 = lktVarB.d;
                Context contextA3 = ((rgq) obj).a();
                kdj kdjVar2 = (kdj) r2.b();
                kdjVar2.getClass();
                return new iop(contextA3, kdjVar2, ((kqg) lktVarB.e).b(), ((ihj) lktVarB.a).b(), ((xjv) lktVarB.f).b(), ((ite) lktVarB.c).b(), yowVarL2);
            case 18:
                yow yowVar = (yow) this.a.b();
                yowVar.getClass();
                return new ioy(yowVar, new gew((Object) kpt.a, 7, (byte[][]) null));
            case 19:
                mdw mdwVarB = ((iow) this.a).b();
                yow yowVarL3 = yoz.l(ypk.a);
                kdj kdjVar3 = (kdj) mdwVarB.g.b();
                kdjVar3.getClass();
                ilf ilfVar = (ilf) mdwVarB.b.b();
                ilfVar.getClass();
                ilk ilkVar = (ilk) mdwVarB.i.b();
                ilkVar.getClass();
                Object obj2 = mdwVarB.c;
                ?? r6 = mdwVarB.f;
                iea ieaVarB = ((kqg) obj2).b();
                lie lieVar = (lie) r6.b();
                lieVar.getClass();
                ino inoVar = (ino) mdwVarB.a.b();
                inoVar.getClass();
                izo izoVar = (izo) mdwVarB.h.b();
                izoVar.getClass();
                return new iov(kdjVar3, ilfVar, ilkVar, ieaVarB, lieVar, inoVar, izoVar, ((ihj) mdwVarB.d).b(), yowVarL3);
            default:
                irc ircVarB2 = ((ipb) this.a).b();
                kdj kdjVar4 = (kdj) ircVarB2.b.b();
                kdjVar4.getClass();
                return new ipa(kdjVar4, ((kpw) ircVarB2.a).b());
        }
    }
}

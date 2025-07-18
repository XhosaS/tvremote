package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ins implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final xcq e;
    private final /* synthetic */ int f;

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i) {
        this.f = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.e = xcqVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, yfo] */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() throws PackageManager.NameNotFoundException {
        ArrayList arrayList;
        switch (this.f) {
            case 0:
                lkt lktVarB = ((irk) this.a).b();
                lgf lgfVarB = ((lgg) this.b).b();
                iea ieaVar = (iea) this.c.b();
                mem memVar = (mem) this.d.b();
                lxp lxpVar = (lxp) this.e.b();
                ieaVar.getClass();
                memVar.getClass();
                lxpVar.getClass();
                yow yowVarL = yoz.l(ypk.a);
                Object obj = lktVarB.e;
                ?? r2 = lktVarB.f;
                iea ieaVarB = ((kqg) obj).b();
                ikt iktVar = (ikt) r2.b();
                iktVar.getClass();
                isf isfVar = (isf) lktVarB.c.b();
                isfVar.getClass();
                ino inoVar = (ino) lktVarB.d.b();
                inoVar.getClass();
                return new mta(ieaVarB, iktVar, isfVar, inoVar, ((ihj) lktVarB.a).b(), lgfVarB, ieaVar, memVar, lxpVar, yowVarL);
            case 1:
                xcq xcqVar = this.b;
                Context contextA = ((rgq) this.c).a();
                isi isiVar = (isi) xcqVar.b();
                ((kpw) this.a).b();
                return new igv(contextA, isiVar, (lie) this.e.b(), ((xkb) this.d).b());
            case 2:
                xcq xcqVar2 = this.b;
                Context contextA2 = ((rgq) this.a).a();
                kmy kmyVar = (kmy) xcqVar2.b();
                jah jahVar = (jah) this.d.b();
                lfn lfnVar = (lfn) this.c.b();
                lie lieVar = (lie) this.e.b();
                kmyVar.getClass();
                jahVar.getClass();
                lfnVar.getClass();
                lieVar.getClass();
                tmb tmbVar = new tmb(contextA2);
                return new itv(contextA2, tmbVar, kmyVar, jahVar, lfnVar, Executors.newCachedThreadPool(), new xa(tmbVar, 18), dwa.a.f, lieVar);
            case 3:
                return new jag((pkg) this.b.b(), (pke) this.d.b(), ((plb) this.a).b(), (nqq) this.e.b(), ((kqg) this.c).b());
            case 4:
                xcq xcqVar3 = this.e;
                return new gag((yfo) this.a, (yfo) this.d, (yfo) this.c, (yfo) this.b, (yfo) xcqVar3, (byte[]) null);
            case 5:
                xcq xcqVar4 = this.c;
                return new juf(((jwl) this.a).b(), ((jwl) this.d).b(), ((jwl) this.b).b(), ((jwl) this.e).b(), ((jwl) xcqVar4).b());
            case 6:
                xcq xcqVar5 = this.c;
                return new jun(((jwl) this.a).b(), ((jwl) this.d).b(), ((jwl) this.b).b(), ((jwl) this.e).b(), ((jwl) xcqVar5).b());
            case 7:
                xcq xcqVar6 = this.c;
                return new gag(this.e, this.d, this.a, this.b, xcqVar6);
            case 8:
                xcq xcqVar7 = this.e;
                return new gag(this.a, this.d, this.c, this.b, xcqVar7, null, null, null, null);
            case 9:
                xcq xcqVar8 = this.e;
                return new gag(this.a, this.d, this.c, this.b, xcqVar8, (byte[]) null, (byte[]) null, (char[]) null);
            case 10:
                ldv ldvVar = (ldv) this.c.b();
                SharedPreferences sharedPreferences = (SharedPreferences) this.b.b();
                kwy kwyVar = (kwy) this.e.b();
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.a.b();
                xkh xkhVarB = ((kql) this.d).b();
                String string = sharedPreferences2.getString(krh.DEBUG_EXPERIMENTS, "");
                ieh iehVarH = ldvVar.h();
                ldvVar.getClass();
                jxt jxtVar = new jxt(ldvVar, 2);
                opc.b((ContentResolver) kwyVar.a, "videos:experiments_update_timeout_o", 1000L);
                kwyVar.getClass();
                kqd kqdVar = new kqd(kwyVar, 0);
                if (TextUtils.isEmpty(string)) {
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    List<String> listD = uof.g(',').i().f().d(string);
                    ArrayList arrayList2 = new ArrayList(listD.size());
                    for (String str : listD) {
                        try {
                            arrayList2.add(Long.valueOf(str));
                        } catch (NumberFormatException unused) {
                            krd.c("Failed to parse long from: ".concat(String.valueOf(str)));
                        }
                    }
                    arrayList = arrayList2;
                }
                return new lfx(iehVarH, jxtVar, sharedPreferences, kqdVar, arrayList, xkhVarB);
            case 11:
                xcq xcqVar9 = this.d;
                Context contextA3 = ((rgq) this.c).a();
                saw sawVar = (saw) xcqVar9.b();
                xcq xcqVar10 = this.a;
                xkw xkwVarB = ((xkx) this.b).b();
                lfn lfnVar2 = (lfn) xcqVar10.b();
                Context context = xkwVarB.b;
                String strA = ((ldb) this.e).a();
                if (!((Boolean) xkw.a.et(context)).booleanValue()) {
                    return new sao(new sba(new rzx()));
                }
                sbd sbdVar = new sbd(sawVar, strA, lfnVar2.af());
                Object systemService = contextA3.getSystemService("connectivity");
                ulp ulpVar = new ulp(systemService == null ? sas.a : new sau((ConnectivityManager) systemService));
                ImmutableList.Builder builder = ImmutableList.builder();
                builder.add((ImmutableList.Builder) new aafi((rzu) sbdVar, new sew(0, null), new rrx()));
                ImmutableList immutableListBuild = builder.build();
                immutableListBuild.getClass();
                return new sao(new sba(new sab(immutableListBuild, ulpVar)));
            case 12:
                return new gag((lql) this.a.b(), (lql) this.d.b(), (lxm) this.c.b(), (moz) this.b.b(), (lie) this.e.b());
            case 13:
                return new lus(((kqg) this.c).b(), (lyz) this.e.b(), (ExecutorService) this.d.b(), (SharedPreferences) this.b.b(), (lfn) this.a.b());
            case 14:
                xcq xcqVar11 = this.b;
                return new gag(this.d, this.e, this.a, this.c, xcqVar11, (char[]) null, (byte[]) null);
            case 15:
                xcq xcqVar12 = this.b;
                return new gag(this.c, this.a, this.d, this.e, xcqVar12, (byte[]) null, (char[]) null);
            case 16:
                return new mda((ExecutorService) this.e.b(), (Executor) this.b.b(), ((mco) this.d).b(), (lyz) this.c.b(), (lie) this.a.b());
            case 17:
                return new mdd((kuw) this.b.b(), (ldv) this.c.b(), (ltt) this.a.b(), ((kqt) this.d).a(), (kwy) this.e.b());
            case 18:
                ntp ntpVarB = ((mkd) this.b).b();
                Context contextA4 = ((rgq) this.a).a();
                ldv ldvVar2 = (ldv) this.c.b();
                mjl mjlVar = (mjl) this.d.b();
                lfn lfnVar3 = (lfn) this.e.b();
                mkc mkcVar = mih.b;
                if (mkcVar == null) {
                    Object objB = ntpVarB.a.b();
                    kfm.c();
                    ldvVar2.getClass();
                    mjlVar.getClass();
                    lfnVar3.getClass();
                    mih.b = new mkc((lhr) objB, contextA4, ldvVar2, mjlVar, lfnVar3);
                    mkcVar = mih.b;
                }
                mkcVar.getClass();
                return mkcVar;
            case 19:
                return new kuw(((rgq) this.a).a(), (iea) this.b.b(), (iea) this.e.b(), ((kqj) this.d).b(), (lfn) this.c.b());
            default:
                return new ouy(((ova) this.b).b(), new qtl(), (yft) this.e.b(), (yft) this.a.b(), (tst) ((xcn) this.d).a, ((rgq) this.c).a());
        }
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, byte[] bArr) {
        this.f = i;
        this.c = xcqVar;
        this.b = xcqVar2;
        this.a = xcqVar3;
        this.e = xcqVar4;
        this.d = xcqVar5;
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, byte[] bArr, byte[] bArr2) {
        this.f = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.e = xcqVar3;
        this.d = xcqVar4;
        this.c = xcqVar5;
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, char[] cArr) {
        this.f = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.d = xcqVar3;
        this.c = xcqVar4;
        this.e = xcqVar5;
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, char[] cArr, byte[] bArr) {
        this.f = i;
        this.b = xcqVar;
        this.e = xcqVar2;
        this.a = xcqVar3;
        this.d = xcqVar4;
        this.c = xcqVar5;
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, float[] fArr) {
        this.f = i;
        this.a = xcqVar;
        this.d = xcqVar2;
        this.b = xcqVar3;
        this.e = xcqVar4;
        this.c = xcqVar5;
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, int[] iArr) {
        this.f = i;
        this.a = xcqVar;
        this.d = xcqVar2;
        this.c = xcqVar3;
        this.b = xcqVar4;
        this.e = xcqVar5;
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, short[] sArr) {
        this.f = i;
        this.b = xcqVar;
        this.d = xcqVar2;
        this.a = xcqVar3;
        this.e = xcqVar4;
        this.c = xcqVar5;
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, byte[][] bArr) {
        this.f = i;
        this.e = xcqVar;
        this.d = xcqVar2;
        this.a = xcqVar3;
        this.b = xcqVar4;
        this.c = xcqVar5;
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, int[][] iArr) {
        this.f = i;
        this.c = xcqVar;
        this.b = xcqVar2;
        this.e = xcqVar3;
        this.a = xcqVar4;
        this.d = xcqVar5;
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.c = xcqVar;
        this.d = xcqVar2;
        this.b = xcqVar3;
        this.a = xcqVar4;
        this.e = xcqVar5;
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, byte[][][] bArr) {
        this.f = i;
        this.c = xcqVar;
        this.e = xcqVar2;
        this.d = xcqVar3;
        this.b = xcqVar4;
        this.a = xcqVar5;
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, char[][][] cArr) {
        this.f = i;
        this.d = xcqVar;
        this.e = xcqVar2;
        this.a = xcqVar3;
        this.c = xcqVar4;
        this.b = xcqVar5;
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, float[][][] fArr) {
        this.f = i;
        this.b = xcqVar;
        this.a = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
        this.e = xcqVar5;
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, int[][][] iArr) {
        this.f = i;
        this.e = xcqVar;
        this.b = xcqVar2;
        this.d = xcqVar3;
        this.c = xcqVar4;
        this.a = xcqVar5;
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, short[][][] sArr) {
        this.f = i;
        this.c = xcqVar;
        this.a = xcqVar2;
        this.d = xcqVar3;
        this.e = xcqVar4;
        this.b = xcqVar5;
    }

    public ins(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, xcq xcqVar5, int i, boolean[][][] zArr) {
        this.f = i;
        this.b = xcqVar;
        this.c = xcqVar2;
        this.a = xcqVar3;
        this.d = xcqVar4;
        this.e = xcqVar5;
    }
}

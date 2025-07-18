package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.WindowManager;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import com.google.android.apps.play.movies.common.view.subtitles.Subtitles;
import com.google.android.exoplayer2.ext.widevine.WVMediaDrmFactory;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmi extends Handler {
    private static ezm V;
    public static final tui a = tui.l("com/google/android/apps/play/movies/common/service/player/exov2/ExoVideosPlayerV2");
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public lmd E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public tst Q;
    public xlr R;
    public boolean S;
    public final lkp T;
    public final kwy U;
    private final idy W;
    private final boolean X;
    private final Context Y;
    private final krl Z;
    private ieg aa;
    private int ab;
    private boolean ac;
    private boolean ad;
    private long ae;
    private final wfn af;
    public final lfn b;
    public final mem c;
    public final llk d;
    public final boolean e;
    public final ExoPlayer f;
    public final lnu g;
    public final lnr h;
    public final boolean i;
    public final meo j;
    public final lmh k = new lmh();
    public final ezd l;
    public final lml m;
    public final lme n;
    public final lha o;
    public final iej p;
    public final krl q;
    public final krl r;
    public final lie s;
    public mfy t;
    public fbt u;
    public volatile mff v;
    public mfc w;
    public volatile eox x;
    public ekc[] y;
    public kzo[] z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, yfo] */
    public lmi(lfn lfnVar, kwy kwyVar, mem memVar, kwy kwyVar2, nuh nuhVar, lme lmeVar, final Context context, xlr xlrVar, lie lieVar, lkp lkpVar, lnu lnuVar, lnr lnrVar, idy idyVar, wfn wfnVar, boolean z, boolean z2, boolean z3, llk llkVar) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        ezm ezqVar;
        int i5;
        long j;
        int i6;
        Object fasVar;
        fap fapVar;
        fau fauVar;
        fad famVar;
        lll lllVar = new lll(this, 2);
        this.p = lllVar;
        krl krlVar = new krl(true);
        this.q = krlVar;
        krl krlVar2 = new krl(false);
        this.Z = krlVar2;
        this.r = new krl(false);
        this.w = new mfc(new lgx(this, 5));
        this.aa = ieg.a;
        trk trkVar = trk.a;
        this.M = -1;
        this.N = -1;
        this.O = false;
        this.P = false;
        this.Q = trkVar;
        this.ae = -9223372036854775807L;
        this.b = lfnVar;
        this.c = memVar;
        this.e = z;
        this.T = lkpVar;
        this.g = lnuVar;
        this.h = lnrVar;
        this.U = kwyVar;
        this.W = idyVar;
        this.i = z2;
        this.af = wfnVar;
        this.n = lmeVar;
        this.X = z3;
        this.Y = context;
        this.d = llkVar;
        this.R = xlrVar;
        this.s = lieVar;
        memVar.ea(lllVar);
        lllVar.dM();
        this.j = new meo();
        boolean zCu = lfnVar.cu();
        mdw mdwVar = (mdw) kwyVar2.a;
        lfn lfnVar2 = (lfn) mdwVar.c.b();
        lfnVar2.getClass();
        ExecutorService executorService = (ExecutorService) mdwVar.a.b();
        executorService.getClass();
        lyz lyzVar = (lyz) mdwVar.d.b();
        lyzVar.getClass();
        lrq lrqVar = (lrq) mdwVar.i.b();
        lrqVar.getClass();
        idf idfVar = (idf) mdwVar.f.b();
        idfVar.getClass();
        mem memVar2 = (mem) mdwVar.h.b();
        memVar2.getClass();
        lgw lgwVar = (lgw) mdwVar.e.b();
        lgwVar.getClass();
        Executor executor = (Executor) mdwVar.g.b();
        executor.getClass();
        int i7 = 0;
        this.o = new lha(lfnVar2, executorService, lyzVar, lrqVar, idfVar, memVar2, lgwVar, executor, ((rgq) mdwVar.b).a(), this, this, lnuVar, z2, zCu);
        ezp ezpVarW = w();
        a.ab(true);
        int iF = lfnVar.F();
        int iC = lfnVar.C();
        int iAi = (int) lfnVar.ai();
        int iAm = (int) lfnVar.am();
        a.ab(true);
        ehz.b(iAi, 0, "bufferForPlaybackMs", "0");
        ehz.b(iAm, 0, "bufferForPlaybackAfterRebufferMs", "0");
        ehz.b(iF, iAi, "minBufferMs", "bufferForPlaybackMs");
        ehz.b(iF, iAm, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        ehz.b(iC, iF, "maxBufferMs", "minBufferMs");
        boolean zCv = lfnVar.cv();
        a.ab(true);
        int iQ = lfnVar.q() * lfnVar.p();
        a.ab(true);
        a.ab(true);
        ehz ehzVar = new ehz(ezpVarW, iF, iC, iAi, iAm, iQ, zCv);
        ezd ezdVar = new ezd(context, new lmt(krlVar2, krlVar, lfnVar));
        if (lfnVar.cr()) {
            eyu eyuVarE = ezdVar.e();
            i = 1;
            eyuVarE.I = true;
            ezdVar.l(eyuVarE);
        } else {
            i = 1;
            eyu eyuVarE2 = ezdVar.e();
            eyuVarE2.r();
            ezdVar.l(eyuVarE2);
        }
        Pair pairCreate = Pair.create(ezdVar, ehzVar);
        this.l = (ezd) pairCreate.first;
        ehz ehzVar2 = (ehz) pairCreate.second;
        if (V == null) {
            if (lfnVar.ct()) {
                int iB = lfnVar.B();
                if (iB != i) {
                    i5 = 3;
                    i4 = 2;
                    if (iB != 2) {
                        int iA = lfnVar.A();
                        iA = iA <= 0 ? 10 : iA;
                        double dC = lfnVar.c();
                        j = 1000000;
                        i6 = 10;
                        fasVar = new fao(iA, (dC <= 0.0d || dC > 1.0d) ? 0.5d : dC);
                    } else {
                        j = 1000000;
                        i6 = 10;
                        double d = lfnVar.d();
                        fasVar = new fai((d <= 0.0d || d > 1.0d) ? 0.9999d : d);
                    }
                    i2 = 9;
                    i3 = 4;
                } else {
                    i5 = 3;
                    j = 1000000;
                    i6 = 10;
                    i4 = 2;
                    if (lfnVar.u() == i) {
                        long jS = lfnVar.s();
                        fapVar = new fap(jS < 0 ? 60000L : jS, i);
                        i2 = 9;
                        i3 = 4;
                    } else {
                        i2 = 9;
                        i3 = 4;
                        fapVar = new fap(lfnVar.t() <= 0 ? 10 : r1, i7);
                    }
                    fasVar = new fas(fapVar);
                }
                int iZ = lfnVar.z();
                int iX = lfnVar.x();
                int iY = lfnVar.y();
                if (iZ == i) {
                    fat fatVar = new fat(null);
                    fatVar.c = fasVar;
                    long jMax = Math.max(iX, 0);
                    a.H(jMax >= 0 ? i : 0);
                    fatVar.b = jMax;
                    int iMax = Math.max(iY, 0);
                    a.H(iMax >= 0 ? i : 0);
                    fatVar.a = iMax;
                    fauVar = new fau(fatVar, i, null);
                } else {
                    fat fatVar2 = new fat();
                    fatVar2.c = fasVar;
                    long jMax2 = Math.max(iX, 0);
                    a.H(jMax2 >= 0 ? i : 0);
                    fatVar2.b = jMax2;
                    int iMax2 = Math.max(iY, 0);
                    a.H(iMax2 >= 0 ? i : 0);
                    fatVar2.a = iMax2;
                    fauVar = new fau(fatVar2, 0);
                }
                if (lfnVar.w() == i) {
                    double dB = lfnVar.b();
                    famVar = new fak((dB <= 0.0d || dB > 1.0d) ? 0.85d : dB);
                } else {
                    int iV = lfnVar.v();
                    iV = iV <= 0 ? i6 : iV;
                    double dA = lfnVar.a();
                    famVar = new fam(iV, (float) ((dA <= 0.0d || dA > 1.0d) ? 0.5d : dA));
                }
                Context applicationContext = context.getApplicationContext();
                new fam(20, 0.5f);
                new fau(new fat(), 0);
                HashMap map = new HashMap(8);
                map.put(0, Long.valueOf(j));
                map.put(2, -9223372036854775807L);
                map.put(Integer.valueOf(i5), -9223372036854775807L);
                map.put(Integer.valueOf(i3), -9223372036854775807L);
                map.put(5, -9223372036854775807L);
                map.put(Integer.valueOf(i6), -9223372036854775807L);
                map.put(Integer.valueOf(i2), -9223372036854775807L);
                map.put(7, -9223372036854775807L);
                int iD = lfnVar.D();
                if (iD != i4) {
                    long jV = v(iD);
                    for (Integer num : map.keySet()) {
                        num.intValue();
                        map.put(num, Long.valueOf(jV));
                    }
                }
                ezqVar = new fah(applicationContext, map, famVar, fauVar);
            } else {
                i2 = 9;
                i3 = 4;
                i4 = 2;
                Context applicationContext2 = context != null ? context.getApplicationContext() : null;
                HashMap map2 = new HashMap(8);
                map2.put(0, 1000000L);
                map2.put(2, -9223372036854775807L);
                map2.put(3, -9223372036854775807L);
                map2.put(4, -9223372036854775807L);
                map2.put(5, -9223372036854775807L);
                map2.put(10, -9223372036854775807L);
                map2.put(9, -9223372036854775807L);
                map2.put(7, -9223372036854775807L);
                int iD2 = lfnVar.D();
                if (iD2 != 2) {
                    long jV2 = v(iD2);
                    for (Integer num2 : map2.keySet()) {
                        num2.intValue();
                        map2.put(num2, Long.valueOf(jV2));
                    }
                }
                ezqVar = new ezq(applicationContext2, map2);
            }
            V = ezqVar;
        } else {
            i2 = 9;
            i3 = 4;
            i4 = 2;
        }
        eil eilVar = new eil(context, new eij(new ekh() { // from class: lmf
            /* JADX WARN: Removed duplicated region for block: B:34:0x00d3 A[PHI: r12
  0x00d3: PHI (r12v5 char) = (r12v4 char), (r12v4 char), (r12v4 char), (r12v7 char) binds: [B:10:0x0068, B:12:0x006e, B:16:0x0082, B:45:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // defpackage.ekh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.ekc[] a(android.os.Handler r18, defpackage.fcf r19, defpackage.els r20, defpackage.eyf r21, defpackage.etj r22) {
                /*
                    Method dump skipped, instructions count: 324
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lmf.a(android.os.Handler, fcf, els, eyf, etj):ekc[]");
            }

            @Override // defpackage.ekh
            public final /* synthetic */ void b(ekc ekcVar) {
            }
        }, i3), new eij(context, 5));
        ezd ezdVar2 = this.l;
        a.ab((eilVar.w ? 1 : 0) ^ i);
        ezdVar2.getClass();
        eilVar.e = new eij(ezdVar2, i2);
        a.ab((eilVar.w ? 1 : 0) ^ i);
        ehzVar2.getClass();
        eilVar.f = new eij(ehzVar2, i7);
        ezm ezmVar = V;
        a.ab((eilVar.w ? 1 : 0) ^ i);
        ezmVar.getClass();
        eilVar.g = new eij(ezmVar, 6);
        a.ab((eilVar.w ? 1 : 0) ^ i);
        eilVar.h = new ldl(lnrVar, i);
        a.ab((eilVar.w ? 1 : 0) ^ i);
        eilVar.z = nuhVar;
        ExoPlayer exoPlayerA = eilVar.a();
        this.f = exoPlayerA;
        lmh lmhVar = this.k;
        eiz eizVar = (eiz) exoPlayerA;
        eizVar.aG();
        eka ekaVarAx = eizVar.ax(eizVar.j);
        ekaVarAx.e(7);
        ekaVarAx.d(lmhVar);
        ekaVarAx.c();
        this.m = new lml(exoPlayerA);
        lnrVar.L(new lmg(this));
        n(i4);
    }

    public static final Throwable t(eah eahVar) {
        Throwable cause = eahVar.getCause();
        return cause instanceof eow ? cause.getCause() : cause;
    }

    public static final int u(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 5 : 4;
        }
        return 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long v(int r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmi.v(int):long");
    }

    private final ezp w() {
        lfn lfnVar = this.b;
        if (!lfnVar.cx()) {
            return new ezp(this.b.q());
        }
        try {
            return new ezp(lfnVar.q(), lfnVar.p());
        } catch (OutOfMemoryError unused) {
            krd.c("Failed to allocate block buffer. Falling back to chunked mode");
            return new ezp(this.b.q());
        }
    }

    private static String x(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        StringBuilder sb = new StringBuilder();
        if (windowManager != null) {
            try {
                int[] supportedHdrTypes = windowManager.getDefaultDisplay().getHdrCapabilities().getSupportedHdrTypes();
                if (supportedHdrTypes.length != 0) {
                    sb.append("\nHDR Capabilities : ");
                    for (int i : supportedHdrTypes) {
                        if (i == 1) {
                            sb.append("\n Dolby Vision");
                        } else if (i == 2) {
                            sb.append("\n HDR10");
                        } else if (i == 3) {
                            sb.append("\n HDR HLG");
                        } else if (i == 4) {
                            sb.append("\n HDR10+");
                        }
                    }
                }
            } catch (NoSuchMethodError unused) {
                return "";
            }
        }
        return sb.toString();
    }

    private static void y(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lvd lvdVar = (lvd) it.next();
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(lvdVar.b.c);
            sb.append(" (");
            kuy kuyVar = lvdVar.c;
            sb.append(kuyVar.b);
            sb.append("|");
            sb.append(kuyVar.c);
            sb.append("|");
            sb.append(kuyVar.h);
            sb.append(")");
        }
    }

    public final int a() {
        return (int) this.f.D();
    }

    public final int b() {
        return u(this.f.bf());
    }

    public final synchronized void c() {
        if (this.x == null) {
            if (this.v != null) {
                this.w.a();
                this.v.a();
                this.v = null;
                return;
            }
            return;
        }
        lha lhaVar = this.o;
        ExoPlayer exoPlayer = this.f;
        eox eoxVar = this.x;
        eka ekaVarAp = exoPlayer.ap(lhaVar);
        ekaVarAp.e(1);
        ekaVarAp.d(new lgz(eoxVar));
        ekaVarAp.c();
        this.x = null;
    }

    public final void d(int i, long j, long j2) {
        krd.f(a.cv(j2, j, "Decoder initialized at timestamp ", " with duration "));
        this.g.b(i, j - j2, j);
    }

    public final synchronized void e(eox eoxVar) {
        this.x = eoxVar;
        this.v = null;
    }

    public final void f(ieg iegVar, String str, ksy ksyVar, String str2, boolean z, boolean z2, int i, byte[] bArr, String str3) throws lmb, lly {
        int iAc = z ? i : this.b.ac();
        boolean z3 = this.X;
        if (!z3 && iAc > 0 && iAc != 3) {
            throw new lly();
        }
        int i2 = true != z3 ? 3 : iAc;
        ((tug) ((tug) a.g()).j("com/google/android/apps/play/movies/common/service/player/exov2/ExoVideosPlayerV2", "prepareDrmSessionManager", 955, "ExoVideosPlayerV2.java")).w("[Playback] ExoVideosPlayerV2.prepareDrmSessionManager: forcedMediaDrmSecurityLevel=%d, cencSecurityLevel=%d", i2, i);
        lgv lgvVar = new lgv(iegVar, str, ksyVar, str2, i2, z2, bArr, str3);
        lha lhaVar = this.o;
        lgx lgxVar = new lgx(this, 6);
        lhaVar.j = lgvVar;
        boolean z4 = lhaVar.h;
        ((tug) ((tug) lgw.a.g()).j("com/google/android/apps/play/movies/common/service/drm/exov2/ExoMediaDrmFactoryV2", "getMediaDrm", 43, "ExoMediaDrmFactoryV2.java")).v("[Playback] ExoMediaDrmFactoryV2.getMediaDrm: forceFrameworkDrm=%b", Boolean.valueOf(!z4));
        ExoMediaDrm exoMediaDrmB = !z4 ? epr.b(dys.d) : new WVMediaDrmFactory().create(lhaVar.e.b);
        byte[] bArr2 = lgvVar.f;
        int i3 = bArr2 != null ? 2 : 1;
        ksn ksnVar = (ksn) lgvVar.a.g();
        String str4 = lgvVar.b;
        ksy ksyVar2 = lgvVar.c;
        int i4 = lgvVar.g;
        lhaVar.n = new lhe(ksnVar, str4, ksyVar2, i3, bArr2, i4, lhaVar, tst.i(lgxVar), lhaVar.d, lhaVar.m, lhaVar.c, lhaVar.g, lhaVar.b, exoMediaDrmB, lhaVar.f, lgvVar.h);
        ((tug) ((tug) lha.a.g()).j("com/google/android/apps/play/movies/common/service/drm/exov2/WidevineDrmSessionManagerV2", "prepare", 162, "WidevineDrmSessionManagerV2.java")).E("[Playback] widevineMediaDrmWrapperV2 prepare: cencKeySetId=%s, forcedSecurityLevel=%d,useInAppDrm=%s", bArr2, Integer.valueOf(i4), Boolean.valueOf(z4));
        int iB = lhaVar.b();
        if (i2 > 0 && iB != i2) {
            throw new lmb(iB, i2, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02e4 A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f2 A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0318 A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0336 A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03e1 A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0406 A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0457 A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0465 A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04a3 A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04be A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0509 A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0570 A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0576 A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x059d A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05c5 A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x061b A[Catch: all -> 0x0621, eqc | lly | lmb | lve -> 0x0623, lly -> 0x0625, lmb -> 0x0627, eqc -> 0x0629, TRY_ENTER, TryCatch #0 {all -> 0x0621, blocks: (B:7:0x001d, B:9:0x002a, B:11:0x002e, B:13:0x003b, B:15:0x0047, B:18:0x004e, B:21:0x0055, B:23:0x0062, B:25:0x0074, B:27:0x0082, B:31:0x00b7, B:16:0x004a, B:12:0x0035, B:41:0x00c4, B:43:0x00ca, B:53:0x015e, B:56:0x0172, B:58:0x017a, B:68:0x0195, B:70:0x0239, B:72:0x0241, B:76:0x027f, B:215:0x05dc, B:75:0x0273, B:77:0x0289, B:78:0x028e, B:79:0x028f, B:81:0x02a8, B:87:0x02b7, B:89:0x02bd, B:91:0x02c3, B:102:0x02e4, B:104:0x02ec, B:106:0x02f2, B:107:0x02fe, B:109:0x0318, B:110:0x031e, B:112:0x0336, B:114:0x033c, B:116:0x034d, B:118:0x0353, B:122:0x035f, B:124:0x0375, B:126:0x0393, B:128:0x039b, B:130:0x03a1, B:132:0x03aa, B:134:0x03c5, B:136:0x03e1, B:137:0x03f7, B:141:0x0400, B:143:0x0406, B:147:0x0427, B:149:0x0457, B:151:0x045d, B:162:0x049b, B:165:0x04a3, B:170:0x04ad, B:172:0x04be, B:174:0x04d1, B:180:0x04ef, B:181:0x04f4, B:183:0x0509, B:185:0x0520, B:187:0x0524, B:190:0x052b, B:191:0x0530, B:192:0x0531, B:194:0x0537, B:197:0x054f, B:198:0x0554, B:199:0x0555, B:200:0x055a, B:201:0x055b, B:203:0x0570, B:206:0x057c, B:208:0x059d, B:210:0x05a5, B:214:0x05d1, B:213:0x05c5, B:205:0x0576, B:176:0x04d7, B:178:0x04dd, B:218:0x061b, B:219:0x0620, B:153:0x0465, B:154:0x046a, B:156:0x0470, B:157:0x047f, B:158:0x0484, B:160:0x048a, B:93:0x02c9, B:95:0x02cf, B:97:0x02d9, B:45:0x00ce, B:46:0x012c, B:48:0x0132, B:50:0x0151, B:52:0x0159, B:230:0x062b), top: B:235:0x001d }] */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r11v15, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, lux] */
    /* JADX WARN: Type inference failed for: r4v18, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, lfn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r28) {
        /*
            Method dump skipped, instructions count: 1594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmi.g(int):void");
    }

    public final void h() {
        fbt fbtVar;
        mfy mfyVar = this.t;
        if (mfyVar == null || !mfyVar.j()) {
            return;
        }
        if (!this.i || (fbtVar = this.u) == null) {
            this.f.ag(mfyVar.a());
        } else {
            this.f.ah(fbtVar);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        llt lltVar;
        ko koVar;
        int i = message.what;
        if (i == 0) {
            lkp lkpVar = this.T;
            lmi lmiVar = lkpVar.V;
            kzo[] kzoVarArr = lmiVar.z;
            int i2 = lmiVar.A;
            llr llrVar = lkpVar.N;
            ImmutableList immutableList = llrVar.h.b;
            boolean z = llrVar.k;
            lkpVar.D = null;
            lkpVar.E = immutableList != null ? immutableList : Collections.EMPTY_LIST;
            if (kzoVarArr != null) {
                lkpVar.n.f(i2);
                kzo kzoVar = kzoVarArr[i2];
                int i3 = 0;
                while (true) {
                    if (i3 >= kzoVarArr.length) {
                        z = false;
                        break;
                    }
                    if (ksg.a(Locale.getDefault().toString(), kzoVarArr[i3].c) > 0) {
                        z = true;
                        break;
                    }
                    i3++;
                }
                lkpVar.D = kzoVar.c;
                lkpVar.o.Q(lkpVar.V.a(), kzoVar, false);
            }
            if (immutableList != null) {
                kwx kwxVarL = lkpVar.Y.l(immutableList, z, lkpVar.n);
                if (kwxVarL == null) {
                    kwxVarL = kdh.m(immutableList, lkpVar.D);
                }
                lkpVar.k(kwxVarL, true);
                lkpVar.W.n(kwxVarL);
            }
            llh llhVar = lkpVar.U;
            List listA = lkpVar.a();
            lmi lmiVar2 = lkpVar.V;
            llhVar.z(listA, lmiVar2 != null ? lmiVar2.A : 0);
            llhVar.C(lkpVar.E, lkpVar.F);
            return;
        }
        if (i == 1) {
            Exception exc = (Exception) message.obj;
            a.ab(this.E != null);
            ((tug) ((tug) ((tug) a.g()).i(exc)).j("com/google/android/apps/play/movies/common/service/player/exov2/ExoVideosPlayerV2", "onExoInitializationError", (char) 1190, "ExoVideosPlayerV2.java")).s("[Playback] ExoVideoPlayerV2 onExoInitializationError");
            boolean z2 = (this.i || this.E.d) ? false : true;
            if (exc instanceof lve) {
                this.h.T(2, 0, exc, a());
                lltVar = new llt(7, -1, exc, false, false, trk.a);
            } else if (exc instanceof eqc) {
                this.h.T(1, ((eqc) exc).a, exc, a());
                lltVar = new llt(41, -1, exc, z2, false, trk.a);
            } else if (exc instanceof lly) {
                this.h.T(13, 0, exc, a());
                lltVar = new llt(53, -1, exc, false, false, trk.a);
            } else {
                this.h.T(15, 0, exc, a());
                lltVar = new llt(51, -1, exc, z2, false, trk.a);
            }
            this.T.g(lltVar);
            return;
        }
        if (i != 2) {
            return;
        }
        lkp lkpVar2 = this.T;
        int i4 = message.arg1;
        lnr lnrVar = lkpVar2.o;
        if (lnrVar.q) {
            a.ab(true);
            int iO = lnrVar.O();
            lnf lnfVar = lnrVar.l;
            lnfVar.k = false;
            lnfVar.l = 1;
            if (lnfVar.o) {
                lnfVar.e(iO);
                lnfVar.d(iO, true);
                lnfVar.o = false;
            }
            lnfVar.c(iO);
            lne lneVar = lnfVar.b;
            Iterator it = lnrVar.o.iterator();
            while (it.hasNext()) {
                ((lnn) it.next()).q(iO, lneVar);
            }
            lnrVar.f.g(lnrVar.p);
            nex nexVar = lnrVar.p;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i5 = 0;
            while (true) {
                koVar = nexVar.b;
                if (i5 >= koVar.d) {
                    break;
                }
                jzs jzsVar = (jzs) koVar.g(i5);
                for (nez nezVar : (nez[]) jzsVar.a) {
                    nezVar.h(jElapsedRealtime, false);
                }
                nexVar.ay(jzsVar, true);
                i5++;
            }
            koVar.clear();
            nexVar.a.removeCallbacksAndMessages(null);
            nexVar.d = true;
            lnrVar.p = null;
            lnrVar.q = false;
            lnrVar.o = Collections.EMPTY_LIST;
        }
        lkpVar2.w.c(false);
        if (lkpVar2.S) {
            lkpVar2.x.run();
        }
    }

    public final void i(int i) {
        long j = i;
        if (this.ad) {
            this.ae = j;
            return;
        }
        this.ae = -9223372036854775807L;
        this.ad = this.Z.a;
        this.h.M();
        ((dyq) this.f).w(j);
    }

    public final void j(boolean z) {
        ezd ezdVar = this.l;
        eyu eyuVarE = ezdVar.e();
        eyuVarE.x(1, !z);
        ezdVar.k(new eyv(eyuVarE));
    }

    public final void k(boolean z) {
        this.f.ab(z);
    }

    public final void l(Subtitles subtitles) {
        eka ekaVarAp = this.f.ap(this.y[2]);
        ekaVarAp.e(10001);
        ekaVarAp.d(subtitles);
        ekaVarAp.c();
    }

    public final void m(boolean z) {
        krl krlVar = this.Z;
        if (krlVar.a != z) {
            krlVar.c(Boolean.valueOf(z));
            ezd ezdVar = this.l;
            eyu eyuVarE = ezdVar.e();
            eyuVarE.x(1, z);
            eyuVarE.x(2, z);
            ezdVar.k(new eyv(eyuVarE));
            if (z) {
                return;
            }
            p();
        }
    }

    public final void n(int i) {
        this.f.at(i);
    }

    public final void o(float f) {
        this.f.aj(f);
    }

    public final void p() {
        if (this.ad) {
            this.ad = false;
            long j = this.ae;
            if (j != -9223372036854775807L) {
                i((int) j);
            }
        }
    }

    public final void q() {
        this.t.b();
        this.f.U();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(ieg iegVar) {
        if (!this.b.dc()) {
            this.W.c(ieg.a);
            return;
        }
        StringBuilder sb = new StringBuilder("ExoV2 ");
        if (this.F != -1) {
            sb.append("Video Itag: ");
            sb.append(this.F);
            sb.append(" ");
            int i = this.H;
            if (i > 0) {
                sb.append(i);
                sb.append("p ");
            }
        }
        if (this.G != -1) {
            sb.append("Audio Itag: ");
            sb.append(this.G);
        }
        if (iegVar.m()) {
            evv evvVar = (evv) iegVar.g();
            StringBuilder sb2 = new StringBuilder();
            dze dzeVar = evvVar.c;
            String str = dzeVar.N;
            if (str != null) {
                sb2.append("\n Selected Language = ");
                sb2.append(str);
            }
            int i2 = dzeVar.aq;
            if (i2 > 0) {
                sb2.append("\n Number Of Audio Channels = ");
                sb2.append(i2);
            }
            sb2.append("\n Available audio languages : ");
            UnmodifiableIterator it = this.f.P().c.iterator();
            while (it.hasNext()) {
                ebg ebgVar = (ebg) it.next();
                for (int i3 = 0; i3 < ebgVar.e; i3++) {
                    dze dzeVarB = ebgVar.b(i3);
                    if (dzeVarB.Y.contains("audio")) {
                        sb2.append("\n");
                        sb2.append(dzeVarB.N);
                    }
                }
            }
            sb.append(sb2.toString());
        }
        sb.append("\nFilter HD content: ");
        sb.append(this.ac);
        sb.append("\nMax Video Height: ");
        sb.append(this.ab);
        if (this.I) {
            sb.append("\nTunneling: ");
            sb.append(this.I);
        }
        if (this.E != null) {
            sb.append("\nServer itags:\n");
            lmd lmdVar = this.E;
            y(sb, lmdVar.d ? lmdVar.f : lmdVar.g);
        }
        if (this.aa.m()) {
            sb.append("\nSelected itags:\n");
            y(sb, (List) this.aa.g());
        }
        sb.append(x(this.Y));
        this.W.c(ieg.f(sb.toString()));
    }

    public final boolean s() {
        return this.f.al();
    }
}

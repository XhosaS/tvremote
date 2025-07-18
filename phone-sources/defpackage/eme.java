package defpackage;

import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eme extends ehv implements ejj {
    private long A;
    private final long[] B;
    private int C;
    private boolean D;
    private long E;
    private long F;
    private long G;
    public boolean f;
    public boolean g;
    public final emm h;
    public final dwi i;
    private final ehk j;
    private ehw k;
    private dze l;
    private int m;
    private int n;
    private boolean o;
    private ehh p;
    private ehk q;
    private SimpleDecoderOutputBuffer r;
    private eox s;
    private eox t;
    private int u;
    private boolean v;
    private boolean w;
    private long x;
    private boolean y;
    private boolean z;

    public eme(Handler handler, els elsVar, ebu... ebuVarArr) {
        slp slpVar = new slp();
        slpVar.b((elm) sij.I(null, elm.a));
        slpVar.c(ebuVarArr);
        emm emmVarA = slpVar.a();
        super(1);
        this.i = new dwi(handler, elsVar);
        this.h = emmVarA;
        emmVarA.e = new emd(this);
        this.j = new ehk(0);
        this.u = 0;
        this.w = true;
        this.A = -9223372036854775807L;
        this.B = new long[10];
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.G = -9223372036854775807L;
    }

    private final void aa() throws eii {
        CryptoConfig cryptoConfigB;
        if (this.p != null) {
            return;
        }
        ad(this.t);
        eox eoxVar = this.s;
        if (eoxVar != null) {
            cryptoConfigB = eoxVar.b();
            if (cryptoConfigB == null && this.s.c() == null) {
                return;
            }
        } else {
            cryptoConfigB = null;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            ehh ehhVarY = Y(this.l, cryptoConfigB);
            this.p = ehhVarY;
            ehhVarY.g(this.c);
            Trace.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.i.h(this.p.c(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.k.a++;
        } catch (ehi e) {
            edb.d("DecoderAudioRenderer", "Audio codec error", e);
            this.i.c(e);
            throw h(e, this.l, 4001);
        } catch (OutOfMemoryError e2) {
            throw h(e2, this.l, 4001);
        }
    }

    private final void ab() throws IllegalStateException {
        this.z = true;
        this.h.l();
        this.G = this.F;
    }

    private final void ac() {
        this.q = null;
        this.r = null;
        this.u = 0;
        this.v = false;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        ehh ehhVar = this.p;
        if (ehhVar != null) {
            this.k.b++;
            ehhVar.f();
            this.i.i(this.p.c());
            this.p = null;
        }
        ad(null);
    }

    private final void ad(eox eoxVar) {
        cme.C(this.s, eoxVar);
        this.s = eoxVar;
    }

    private final void ae(eox eoxVar) {
        cme.C(this.t, eoxVar);
        this.t = eoxVar;
    }

    private final void af() {
        cH();
        long jD = this.h.D();
        if (jD != Long.MIN_VALUE) {
            if (!this.f) {
                jD = Math.max(this.x, jD);
            }
            this.x = jD;
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [eox, java.lang.Object] */
    private final void ag(hig higVar) throws eii {
        Object obj = higVar.a;
        obj.getClass();
        ae(higVar.b);
        dze dzeVar = this.l;
        dze dzeVar2 = (dze) obj;
        this.l = dzeVar2;
        this.m = dzeVar2.at;
        this.n = dzeVar2.au;
        ehh ehhVar = this.p;
        if (ehhVar == null) {
            aa();
            this.i.l(this.l, null);
            return;
        }
        ehx ehxVar = this.t != this.s ? new ehx(ehhVar.c(), dzeVar, dzeVar2, 0, 128) : new ehx(ehhVar.c(), dzeVar, dzeVar2, 0, 1);
        if (ehxVar.d == 0) {
            if (this.v) {
                this.u = 1;
            } else {
                ac();
                aa();
                this.w = true;
            }
        }
        this.i.l(this.l, ehxVar);
    }

    @Override // defpackage.ehv
    protected final void B() throws IllegalStateException {
        this.h.k();
        this.D = true;
    }

    @Override // defpackage.ehv
    protected final void C() throws IllegalStateException {
        af();
        this.h.j();
        this.D = false;
    }

    @Override // defpackage.ehv
    protected final void D(dze[] dzeVarArr, long j, long j2, evz evzVar) {
        this.o = false;
        if (this.A == -9223372036854775807L) {
            this.A = j2;
            return;
        }
        int i = this.C;
        long[] jArr = this.B;
        int length = jArr.length;
        if (i == 10) {
            edb.e("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + jArr[9]);
        } else {
            this.C = i + 1;
        }
        jArr[this.C - 1] = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca A[Catch: ely -> 0x01f7, elv -> 0x0201, elu -> 0x020b, ehi -> 0x0213, TryCatch #2 {ely -> 0x01f7, blocks: (B:24:0x0056, B:25:0x005b, B:27:0x0060, B:56:0x0141, B:58:0x0145, B:60:0x0149, B:63:0x014f, B:65:0x0153, B:67:0x015d, B:69:0x0161, B:70:0x0174, B:73:0x0182, B:75:0x0188, B:76:0x018d, B:78:0x0195, B:79:0x01a7, B:81:0x01ab, B:82:0x01b4, B:84:0x01c0, B:87:0x01ca, B:86:0x01c6, B:88:0x01e9, B:89:0x01ee, B:30:0x0070, B:32:0x0074, B:33:0x0080, B:35:0x0088, B:37:0x0091, B:38:0x009e, B:40:0x00a6, B:42:0x00aa, B:43:0x00b4, B:47:0x00c1, B:48:0x00c9, B:49:0x00ca, B:51:0x00d5, B:52:0x011d, B:54:0x012b, B:55:0x013b), top: B:105:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d A[Catch: ely -> 0x01f7, elv -> 0x0201, elu -> 0x020b, ehi -> 0x0213, PHI: r5
  0x015d: PHI (r5v8 ehk) = (r5v7 ehk), (r5v20 ehk) binds: [B:64:0x0151, B:66:0x015b] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {ely -> 0x01f7, blocks: (B:24:0x0056, B:25:0x005b, B:27:0x0060, B:56:0x0141, B:58:0x0145, B:60:0x0149, B:63:0x014f, B:65:0x0153, B:67:0x015d, B:69:0x0161, B:70:0x0174, B:73:0x0182, B:75:0x0188, B:76:0x018d, B:78:0x0195, B:79:0x01a7, B:81:0x01ab, B:82:0x01b4, B:84:0x01c0, B:87:0x01ca, B:86:0x01c6, B:88:0x01e9, B:89:0x01ee, B:30:0x0070, B:32:0x0074, B:33:0x0080, B:35:0x0088, B:37:0x0091, B:38:0x009e, B:40:0x00a6, B:42:0x00aa, B:43:0x00b4, B:47:0x00c1, B:48:0x00c9, B:49:0x00ca, B:51:0x00d5, B:52:0x011d, B:54:0x012b, B:55:0x013b), top: B:105:0x0056 }] */
    @Override // defpackage.ekc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(long r10, long r12) throws java.lang.IllegalStateException, defpackage.eii, defpackage.ebt {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eme.V(long, long):void");
    }

    protected abstract int W(dze dzeVar);

    protected abstract dze X(ehh ehhVar);

    protected abstract ehh Y(dze dzeVar, CryptoConfig cryptoConfig);

    protected int[] Z(ehh ehhVar) {
        throw null;
    }

    @Override // defpackage.ejj
    public final long a() {
        if (this.a == 2) {
            af();
        }
        return this.x;
    }

    @Override // defpackage.ejj
    public final eai b() {
        return this.h.j;
    }

    @Override // defpackage.ekc
    public final boolean cH() {
        return this.z && this.h.z();
    }

    @Override // defpackage.ekc
    public final boolean cI() {
        if (this.h.y()) {
            return true;
        }
        if (this.l != null) {
            return Q() || this.r != null;
        }
        return false;
    }

    @Override // defpackage.eke
    public final int cJ(dze dzeVar) {
        if (!eae.l(dzeVar.Y)) {
            return clw.F(0);
        }
        int iW = W(dzeVar);
        return iW <= 2 ? clw.F(iW) : clw.G(iW, 8, 32);
    }

    @Override // defpackage.ejj
    public final void d(eai eaiVar) {
        this.h.s(eaiVar);
    }

    @Override // defpackage.ehv, defpackage.ekc
    public final long e(long j, long j2) {
        if (this.G != -9223372036854775807L) {
            if (this.h.b() != -9223372036854775807L) {
                long jMin = (long) ((Math.min(r0, this.G - j) / (b() != null ? b().d : 1.0f)) / 2.0f);
                if (this.D) {
                    dm();
                    jMin -= edt.y(SystemClock.elapsedRealtime()) - j2;
                }
                return Math.max(10000L, jMin);
            }
        }
        return 10000L;
    }

    @Override // defpackage.ejj
    public final boolean g() {
        boolean z = this.g;
        this.g = false;
        return z;
    }

    @Override // defpackage.ehv, defpackage.ejz
    public final void s(int i, Object obj) throws IllegalStateException {
        if (i == 2) {
            this.h.v(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.h.n((dyo) obj);
            return;
        }
        if (i == 6) {
            this.h.p((dyp) obj);
        } else if (i == 12) {
            this.h.t((AudioDeviceInfo) obj);
        } else if (i == 9) {
            this.h.u(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                return;
            }
            this.h.o(((Integer) obj).intValue());
        }
    }

    @Override // defpackage.ehv
    protected final void v() {
        this.l = null;
        this.w = true;
        this.A = -9223372036854775807L;
        this.g = false;
        this.G = -9223372036854775807L;
        try {
            ae(null);
            ac();
            this.h.m();
        } finally {
            this.i.j(this.k);
        }
    }

    @Override // defpackage.ehv
    protected final void w(boolean z, boolean z2) throws IllegalStateException {
        ehw ehwVar = new ehw();
        this.k = ehwVar;
        this.i.k(ehwVar);
        if (l().c) {
            this.h.g();
        } else {
            this.h.f();
        }
        emm emmVar = this.h;
        emmVar.d = m();
        emmVar.q(dm());
    }

    @Override // defpackage.ehv
    protected final void x(long j, boolean z) throws IllegalStateException, eii {
        this.h.h();
        this.x = j;
        this.G = -9223372036854775807L;
        this.g = false;
        this.f = true;
        this.y = false;
        this.z = false;
        if (this.p != null) {
            if (this.u != 0) {
                ac();
                aa();
                return;
            }
            this.q = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.r;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.release();
                this.r = null;
            }
            ehh ehhVar = this.p;
            ehhVar.getClass();
            ehhVar.d();
            ehhVar.g(this.c);
            this.v = false;
        }
    }

    @Override // defpackage.ehv, defpackage.ekc
    public final ejj j() {
        return this;
    }
}

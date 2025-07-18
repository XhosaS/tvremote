package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.VideoDecoderOutputBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class faz extends ehv {
    private boolean A;
    private ebo B;
    private long C;
    private int D;
    private int E;
    private int F;
    private long G;
    private fbt H;
    private final epm I;
    protected ehw f;
    private final edn g;
    private final ehk h;
    private dze i;
    private dze j;
    private ehh k;
    private ehk l;
    private VideoDecoderOutputBuffer m;
    private int n;
    private Object o;
    private Surface p;
    private fbu q;
    private eox r;
    private eox s;
    private int t;
    private boolean u;
    private int v;
    private long w;
    private long x;
    private boolean y;
    private boolean z;

    protected faz(Handler handler, fcf fcfVar) {
        super(2);
        this.x = -9223372036854775807L;
        this.g = new edn();
        this.h = new ehk(0);
        this.I = new epm(handler, fcfVar);
        this.t = 0;
        this.n = -1;
        this.v = 0;
        this.f = new ehw();
    }

    private final void ag(int i) {
        this.v = Math.min(this.v, i);
    }

    private final void ah() throws eii {
        CryptoConfig cryptoConfigB;
        if (this.k != null) {
            return;
        }
        aj(this.s);
        eox eoxVar = this.r;
        if (eoxVar != null) {
            cryptoConfigB = eoxVar.b();
            if (cryptoConfigB == null && this.r.c() == null) {
                return;
            }
        } else {
            cryptoConfigB = null;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            dze dzeVar = this.i;
            dzeVar.getClass();
            ehh ehhVarW = W(dzeVar, cryptoConfigB);
            this.k = ehhVarW;
            ehhVarW.g(this.c);
            ad(this.n);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            epm epmVar = this.I;
            ehh ehhVar = this.k;
            ehhVar.getClass();
            epmVar.a(ehhVar.c(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.f.a++;
        } catch (ehi e) {
            edb.d("DecoderVideoRenderer", "Video codec error", e);
            this.I.h(e);
            throw h(e, this.i, 4001);
        } catch (OutOfMemoryError e2) {
            throw h(e2, this.i, 4001);
        }
    }

    private final void ai() {
        ebo eboVar = this.B;
        if (eboVar != null) {
            this.I.i(eboVar);
        }
    }

    private final void aj(eox eoxVar) {
        cme.C(this.r, eoxVar);
        this.r = eoxVar;
    }

    private final void ak() {
        this.x = -9223372036854775807L;
    }

    private final void al(eox eoxVar) {
        cme.C(this.s, eoxVar);
        this.s = eoxVar;
    }

    private final boolean am() {
        return this.n != -1;
    }

    private static boolean an(long j) {
        return j < -30000;
    }

    @Override // defpackage.ehv
    protected final void B() {
        this.D = 0;
        this.C = SystemClock.elapsedRealtime();
        this.G = edt.y(SystemClock.elapsedRealtime());
    }

    @Override // defpackage.ehv
    protected final void C() {
        this.x = -9223372036854775807L;
        if (this.D > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.I.d(this.D, jElapsedRealtime - this.C);
            this.D = 0;
            this.C = jElapsedRealtime;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0101, code lost:
    
        if (r13 != 2) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086 A[Catch: ehi -> 0x0200, TryCatch #0 {ehi -> 0x0200, blocks: (B:15:0x003c, B:16:0x0041, B:18:0x0046, B:75:0x0147, B:77:0x014b, B:79:0x014f, B:82:0x0155, B:84:0x0159, B:86:0x0163, B:88:0x016a, B:89:0x017d, B:94:0x018d, B:96:0x0193, B:97:0x01a2, B:99:0x01a6, B:100:0x01b4, B:101:0x01d7, B:102:0x01dd, B:21:0x0059, B:22:0x0069, B:24:0x006f, B:26:0x0073, B:27:0x007b, B:28:0x0086, B:30:0x0091, B:31:0x0093, B:33:0x00a2, B:35:0x00a8, B:107:0x01f0, B:36:0x00b5, B:38:0x00bf, B:42:0x00ce, B:47:0x00dc, B:49:0x00e9, B:106:0x01e8, B:58:0x0103, B:60:0x0107, B:64:0x0114, B:67:0x011b, B:68:0x012b, B:70:0x0131, B:74:0x013e, B:54:0x00f8, B:55:0x00fd, B:39:0x00c2, B:41:0x00c6), top: B:113:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0163 A[Catch: ehi -> 0x0200, PHI: r2
  0x0163: PHI (r2v9 ehk) = (r2v8 ehk), (r2v12 ehk) binds: [B:83:0x0157, B:85:0x0161] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {ehi -> 0x0200, blocks: (B:15:0x003c, B:16:0x0041, B:18:0x0046, B:75:0x0147, B:77:0x014b, B:79:0x014f, B:82:0x0155, B:84:0x0159, B:86:0x0163, B:88:0x016a, B:89:0x017d, B:94:0x018d, B:96:0x0193, B:97:0x01a2, B:99:0x01a6, B:100:0x01b4, B:101:0x01d7, B:102:0x01dd, B:21:0x0059, B:22:0x0069, B:24:0x006f, B:26:0x0073, B:27:0x007b, B:28:0x0086, B:30:0x0091, B:31:0x0093, B:33:0x00a2, B:35:0x00a8, B:107:0x01f0, B:36:0x00b5, B:38:0x00bf, B:42:0x00ce, B:47:0x00dc, B:49:0x00e9, B:106:0x01e8, B:58:0x0103, B:60:0x0107, B:64:0x0114, B:67:0x011b, B:68:0x012b, B:70:0x0131, B:74:0x013e, B:54:0x00f8, B:55:0x00fd, B:39:0x00c2, B:41:0x00c6), top: B:113:0x003c }] */
    @Override // defpackage.ekc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(long r17, long r19) throws defpackage.eii {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.faz.V(long, long):void");
    }

    protected abstract ehh W(dze dzeVar, CryptoConfig cryptoConfig);

    protected ehx X(String str, dze dzeVar, dze dzeVar2) {
        throw null;
    }

    protected final void Y(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        ae(0, 1);
        videoDecoderOutputBuffer.release();
    }

    protected final void Z() throws eii {
        this.F = 0;
        if (this.t != 0) {
            aa();
            ah();
            return;
        }
        this.l = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.m;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.m = null;
        }
        ehh ehhVar = this.k;
        ehhVar.getClass();
        ehhVar.d();
        ehhVar.g(this.c);
        this.u = false;
    }

    protected final void aa() {
        this.l = null;
        this.m = null;
        this.t = 0;
        this.u = false;
        this.F = 0;
        ehh ehhVar = this.k;
        if (ehhVar != null) {
            this.f.b++;
            ehhVar.f();
            this.I.b(this.k.c());
            this.k = null;
        }
        aj(null);
    }

    protected final void ab(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j, dze dzeVar) {
        boolean z;
        fbu fbuVar = this.q;
        if (fbuVar != null) {
            dm();
            fbuVar.c(j, System.nanoTime(), dzeVar, null);
        }
        this.G = edt.y(SystemClock.elapsedRealtime());
        int i = videoDecoderOutputBuffer.mode;
        if (i != 1) {
            z = false;
        } else if (this.p != null) {
            i = 1;
            z = true;
        } else {
            z = false;
            i = 1;
        }
        boolean z2 = i == 0 && this.H != null;
        if (!z2 && !z) {
            Y(videoDecoderOutputBuffer);
            return;
        }
        int i2 = videoDecoderOutputBuffer.width;
        int i3 = videoDecoderOutputBuffer.height;
        ebo eboVar = this.B;
        if (eboVar == null || eboVar.e != i2 || eboVar.f != i3) {
            ebo eboVar2 = new ebo(i2, i3);
            this.B = eboVar2;
            this.I.i(eboVar2);
        }
        if (z2) {
            fbt fbtVar = this.H;
            fbtVar.getClass();
            fbs fbsVar = fbtVar.a;
            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = (VideoDecoderOutputBuffer) fbsVar.b.getAndSet(videoDecoderOutputBuffer);
            if (videoDecoderOutputBuffer2 != null) {
                videoDecoderOutputBuffer2.release();
            }
            fbsVar.a.requestRender();
        } else {
            Surface surface = this.p;
            surface.getClass();
            ac(videoDecoderOutputBuffer, surface);
        }
        this.E = 0;
        this.f.e++;
        if (this.v != 3) {
            this.v = 3;
            Object obj = this.o;
            if (obj != null) {
                this.I.g(obj);
            }
        }
    }

    protected abstract void ac(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    protected abstract void ad(int i);

    protected final void ae(int i, int i2) {
        ehw ehwVar = this.f;
        ehwVar.h += i;
        int i3 = i + i2;
        ehwVar.g += i3;
        this.D += i3;
        int i4 = this.E + i3;
        this.E = i4;
        ehwVar.i = Math.max(i4, ehwVar.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [eox, java.lang.Object] */
    protected final void af(hig higVar) throws eii {
        ehx ehxVarX;
        this.y = true;
        Object obj = higVar.a;
        obj.getClass();
        al(higVar.b);
        dze dzeVar = this.i;
        dze dzeVar2 = (dze) obj;
        this.i = dzeVar2;
        ehh ehhVar = this.k;
        if (ehhVar == null) {
            ah();
            epm epmVar = this.I;
            dze dzeVar3 = this.i;
            dzeVar3.getClass();
            epmVar.f(dzeVar3, null);
            return;
        }
        if (this.s != this.r) {
            String strC = ehhVar.c();
            dzeVar.getClass();
            ehxVarX = new ehx(strC, dzeVar, dzeVar2, 0, 128);
        } else {
            String strC2 = ehhVar.c();
            dzeVar.getClass();
            ehxVarX = X(strC2, dzeVar, dzeVar2);
        }
        if (ehxVarX.d == 0) {
            if (this.u) {
                this.t = 1;
            } else {
                aa();
                ah();
            }
        }
        epm epmVar2 = this.I;
        dze dzeVar4 = this.i;
        dzeVar4.getClass();
        epmVar2.f(dzeVar4, ehxVarX);
    }

    @Override // defpackage.ekc
    public final boolean cH() {
        return this.A;
    }

    @Override // defpackage.ekc
    public final boolean cI() {
        if (this.i != null && ((Q() || this.m != null) && (this.v == 3 || !am()))) {
            this.x = -9223372036854775807L;
            return true;
        }
        if (this.x == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.x) {
            return true;
        }
        this.x = -9223372036854775807L;
        return false;
    }

    @Override // defpackage.ehv, defpackage.ekc
    public final void r() {
        if (this.v == 0) {
            this.v = 1;
        }
    }

    @Override // defpackage.ehv, defpackage.ejz
    public final void s(int i, Object obj) {
        int i2;
        Object obj2;
        if (i != 1) {
            if (i == 7) {
                this.q = (fbu) obj;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.p = (Surface) obj;
            this.H = null;
            this.n = 1;
            i2 = 1;
        } else if (obj instanceof fbt) {
            this.p = null;
            this.H = (fbt) obj;
            i2 = 0;
            this.n = 0;
        } else {
            this.p = null;
            this.H = null;
            i2 = -1;
            this.n = -1;
            obj = null;
        }
        if (this.o == obj) {
            if (obj != null) {
                ai();
                if (this.v != 3 || (obj2 = this.o) == null) {
                    return;
                }
                this.I.g(obj2);
                return;
            }
            return;
        }
        this.o = obj;
        if (obj == null) {
            this.B = null;
            ag(1);
            return;
        }
        if (this.k != null) {
            ad(i2);
        }
        ai();
        ag(1);
        if (this.a == 2) {
            ak();
        }
    }

    @Override // defpackage.ehv
    protected final void v() {
        this.i = null;
        this.B = null;
        ag(0);
        try {
            al(null);
            aa();
        } finally {
            this.I.c(this.f);
        }
    }

    @Override // defpackage.ehv
    protected final void w(boolean z, boolean z2) {
        ehw ehwVar = new ehw();
        this.f = ehwVar;
        this.I.e(ehwVar);
        this.v = z2 ? 1 : 0;
    }

    @Override // defpackage.ehv
    protected final void x(long j, boolean z) throws eii {
        this.z = false;
        this.A = false;
        ag(1);
        this.w = -9223372036854775807L;
        this.E = 0;
        if (this.k != null) {
            Z();
        }
        if (z) {
            ak();
        } else {
            this.x = -9223372036854775807L;
        }
        this.g.f();
    }

    @Override // defpackage.ehv
    protected final void D(dze[] dzeVarArr, long j, long j2, evz evzVar) {
    }
}

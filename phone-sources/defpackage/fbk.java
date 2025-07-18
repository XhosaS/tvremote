package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.Range;
import android.util.SparseArray;
import android.view.Surface;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbk extends esv implements fbw {
    private static final int[] i = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean x;
    private static boolean y;
    private final boolean A;
    private final int B;
    private final boolean C;
    private final fbx D;
    private final fbv E;
    private final long F;
    private final fby G;
    private final PriorityQueue H;
    private boolean I;
    private boolean J;
    private fcj K;
    private boolean L;
    private int M;
    private List N;
    private fbm O;
    private edk P;
    private boolean Q;
    private int R;
    private int S;
    private long T;
    private int U;
    private int V;
    private int W;
    private eki X;
    private boolean Y;
    private long Z;
    private int aa;
    private long ab;
    private ebo ac;
    private int ad;
    private boolean ae;
    private int af;
    private fbu ag;
    private long ah;
    private long ai;
    private boolean aj;
    private int ak;
    private final epm al;
    private tqr am;
    public Surface f;
    public ebo g;
    fbj h;
    private final Context z;

    protected fbk(fbi fbiVar) {
        super(2, fbiVar.c, fbiVar.b, 30.0f);
        Context applicationContext = fbiVar.a.getApplicationContext();
        this.z = applicationContext;
        this.B = fbiVar.g;
        this.K = null;
        this.al = new epm(fbiVar.e, fbiVar.f);
        this.A = this.K == null;
        this.D = new fbx(applicationContext, this, fbiVar.d);
        this.E = new fbv();
        this.C = "NVIDIA".equals(Build.MANUFACTURER);
        this.P = edk.a;
        this.R = 1;
        this.S = 0;
        this.g = ebo.a;
        this.af = 0;
        this.ac = null;
        this.ad = -1000;
        this.ah = -9223372036854775807L;
        this.ai = -9223372036854775807L;
        this.H = new PriorityQueue();
        long j = fbiVar.h;
        if (j != -9223372036854775807L) {
            this.F = -j;
            this.G = new fby();
        } else {
            this.F = -9223372036854775807L;
            this.G = null;
        }
        this.X = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c2, code lost:
    
        if (r3.equals("video/av01") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cb, code lost:
    
        if (r3.equals("video/3gpp") != false) goto L56;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int aG(defpackage.ess r9, defpackage.dze r10) {
        /*
            int r0 = r10.af
            int r1 = r10.ag
            r2 = -1
            if (r0 == r2) goto Ld3
            if (r1 != r2) goto Lb
            goto Ld3
        Lb:
            java.lang.String r3 = r10.Y
            defpackage.a.aq(r3)
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/av01"
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r4 == 0) goto L42
            int r3 = defpackage.ete.a
            android.util.Pair r10 = defpackage.eco.a(r10)
            if (r10 == 0) goto L41
            java.lang.Object r10 = r10.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r10 == r3) goto L3f
            r3 = 1
            if (r10 == r3) goto L3f
            if (r10 != r8) goto L39
            goto L3f
        L39:
            r3 = 1024(0x400, float:1.435E-42)
            if (r10 != r3) goto L41
            r3 = r6
            goto L42
        L3f:
            r3 = r5
            goto L42
        L41:
            r3 = r7
        L42:
            int r10 = r3.hashCode()
            switch(r10) {
                case -1664118616: goto Lc5;
                case -1662735862: goto Lbe;
                case -1662541442: goto Lac;
                case 1187890754: goto La3;
                case 1331836730: goto L5f;
                case 1599127256: goto L56;
                case 1599127257: goto L4b;
                default: goto L49;
            }
        L49:
            goto Ld3
        L4b:
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto Ld3
            r8 = 4
            goto Lcd
        L56:
            java.lang.String r9 = "video/x-vnd.on2.vp8"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto Ld3
            goto Lcd
        L5f:
            boolean r10 = r3.equals(r5)
            if (r10 == 0) goto Ld3
            java.lang.String r10 = "BRAVIA 4K 2015"
            java.lang.String r3 = android.os.Build.MODEL
            boolean r10 = r10.equals(r3)
            if (r10 != 0) goto Ld3
            java.lang.String r10 = "Amazon"
            java.lang.String r3 = android.os.Build.MANUFACTURER
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L91
            java.lang.String r10 = "KFSOWI"
            java.lang.String r3 = android.os.Build.MODEL
            boolean r10 = r10.equals(r3)
            if (r10 != 0) goto Ld3
            java.lang.String r10 = "AFTS"
            java.lang.String r3 = android.os.Build.MODEL
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L91
            boolean r9 = r9.f
            if (r9 != 0) goto Ld3
        L91:
            r9 = 16
            int r10 = defpackage.edt.c(r0, r9)
            int r9 = defpackage.edt.c(r1, r9)
            int r10 = r10 * r9
            int r10 = r10 * 256
            int r9 = aU(r10, r8)
            return r9
        La3:
            java.lang.String r9 = "video/mp4v-es"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto Ld3
            goto Lcd
        Lac:
            boolean r9 = r3.equals(r7)
            if (r9 == 0) goto Ld3
            int r0 = r0 * r1
            int r9 = aU(r0, r8)
            r10 = 2097152(0x200000, float:2.938736E-39)
            int r9 = java.lang.Math.max(r10, r9)
            return r9
        Lbe:
            boolean r9 = r3.equals(r6)
            if (r9 == 0) goto Ld3
            goto Lcd
        Lc5:
            java.lang.String r9 = "video/3gpp"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto Ld3
        Lcd:
            int r0 = r0 * r1
            int r9 = aU(r0, r8)
            return r9
        Ld3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbk.aG(ess, dze):int");
    }

    protected static int aH(ess essVar, dze dzeVar) {
        int i2 = dzeVar.Z;
        if (i2 == -1) {
            return aG(essVar, dzeVar);
        }
        List list = dzeVar.ab;
        int size = list.size();
        int length = 0;
        for (int i3 = 0; i3 < size; i3++) {
            length += ((byte[]) list.get(i3)).length;
        }
        return i2 + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c A[Catch: all -> 0x0675, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:505:0x066d, B:38:0x006c, B:40:0x0072, B:43:0x007d, B:73:0x00d8, B:75:0x00de, B:498:0x0657, B:506:0x0671), top: B:512:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0657 A[Catch: all -> 0x0675, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:505:0x066d, B:38:0x006c, B:40:0x0072, B:43:0x007d, B:73:0x00d8, B:75:0x00de, B:498:0x0657, B:506:0x0671), top: B:512:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8 A[Catch: all -> 0x0675, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:505:0x066d, B:38:0x006c, B:40:0x0072, B:43:0x007d, B:73:0x00d8, B:75:0x00de, B:498:0x0657, B:506:0x0671), top: B:512:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static final boolean aP(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 2290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbk.aP(java.lang.String):boolean");
    }

    protected static final boolean aS(ess essVar) {
        return Build.VERSION.SDK_INT >= 35 && essVar.i;
    }

    private static int aU(int i2, int i3) {
        return (i2 * 3) / (i3 + i3);
    }

    private final Surface aV(ess essVar) {
        fcj fcjVar = this.K;
        if (fcjVar != null) {
            return fcjVar.a();
        }
        Surface surface = this.f;
        if (surface != null) {
            return surface;
        }
        if (aS(essVar)) {
            return null;
        }
        a.ab(aO(essVar));
        fbm fbmVar = this.O;
        if (fbmVar != null) {
            if (fbmVar.b != essVar.f) {
                bb();
            }
        }
        if (this.O == null) {
            Context context = this.z;
            boolean z = essVar.f;
            boolean z2 = false;
            a.ab(!z || fbm.a(context));
            fbl fblVar = new fbl();
            int i2 = z ? fbm.a : 0;
            fblVar.start();
            fblVar.b = new Handler(fblVar.getLooper(), fblVar);
            fblVar.a = new ecs(fblVar.b);
            synchronized (fblVar) {
                fblVar.b.obtainMessage(1, i2, 0).sendToTarget();
                while (fblVar.e == null && fblVar.d == null && fblVar.c == null) {
                    try {
                        fblVar.wait();
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = fblVar.d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = fblVar.c;
            if (error != null) {
                throw error;
            }
            fbm fbmVar2 = fblVar.e;
            fbmVar2.getClass();
            this.O = fbmVar2;
        }
        return this.O;
    }

    private static List aW(Context context, esx esxVar, dze dzeVar, boolean z, boolean z2) {
        String str = dzeVar.Y;
        if (str == null) {
            return ImmutableList.of();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !fki.af(context)) {
            List listH = ete.h(dzeVar, z, z2);
            if (!listH.isEmpty()) {
                return listH;
            }
        }
        return ete.i(dzeVar, z, z2);
    }

    private final void aX() {
        if (this.U > 0) {
            dm();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.al.d(this.U, jElapsedRealtime - this.T);
            this.U = 0;
            this.T = jElapsedRealtime;
        }
    }

    private final void aY() {
        ebo eboVar = this.ac;
        if (eboVar != null) {
            this.al.i(eboVar);
        }
    }

    private final void aZ() {
        esp espVar;
        if (!this.ae || (espVar = ((esv) this).k) == null) {
            return;
        }
        this.h = new fbj(this, espVar);
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            espVar.l(bundle);
        }
    }

    private final void ba(long j, long j2, dze dzeVar) {
        fbu fbuVar = this.ag;
        if (fbuVar != null) {
            fbuVar.c(j, j2, dzeVar, ((esv) this).m);
        }
    }

    private final void bb() {
        fbm fbmVar = this.O;
        if (fbmVar != null) {
            fbmVar.release();
            this.O = null;
        }
    }

    private final void bc(Object obj) throws Throwable {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.f == surface) {
            if (surface != null) {
                aY();
                Surface surface2 = this.f;
                if (surface2 == null || !this.Q) {
                    return;
                }
                this.al.g(surface2);
                return;
            }
            return;
        }
        this.f = surface;
        if (this.K == null) {
            this.D.j(surface);
        }
        this.Q = false;
        int i2 = this.a;
        esp espVar = ((esv) this).k;
        if (espVar != null && this.K == null) {
            ess essVar = ((esv) this).n;
            essVar.getClass();
            if (!bd(essVar) || this.I) {
                at();
                aq();
            } else {
                Surface surfaceAV = aV(essVar);
                if (surfaceAV != null) {
                    espVar.k(surfaceAV);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    espVar.g();
                }
            }
        }
        if (surface != null) {
            aY();
        } else {
            this.ac = null;
            fcj fcjVar = this.K;
            if (fcjVar != null) {
                fcjVar.c();
            }
        }
        if (i2 == 2) {
            fcj fcjVar2 = this.K;
            if (fcjVar2 != null) {
                fcjVar2.e(true);
            } else {
                this.D.c(true);
            }
        }
        aZ();
    }

    private final boolean bd(ess essVar) {
        if (this.K != null) {
            return true;
        }
        Surface surface = this.f;
        return (surface != null && surface.isValid()) || aS(essVar) || aO(essVar);
    }

    private final boolean be(ehk ehkVar) {
        return ehkVar.e < this.c;
    }

    @Override // defpackage.esv, defpackage.ehv
    protected final void A() {
        try {
            super.A();
        } finally {
            this.L = false;
            this.ah = -9223372036854775807L;
            bb();
        }
    }

    @Override // defpackage.ehv
    protected final void B() {
        this.U = 0;
        dm();
        this.T = SystemClock.elapsedRealtime();
        this.Z = 0L;
        this.aa = 0;
        fcj fcjVar = this.K;
        if (fcjVar != null) {
            fcjVar.q();
        } else {
            this.D.d();
        }
    }

    @Override // defpackage.ehv
    protected final void C() {
        aX();
        int i2 = this.aa;
        if (i2 != 0) {
            epm epmVar = this.al;
            long j = this.Z;
            Object obj = epmVar.a;
            if (obj != null) {
                ((Handler) obj).post(new fce(epmVar, j, i2, 0));
            }
            this.Z = 0L;
            this.aa = 0;
        }
        fcj fcjVar = this.K;
        if (fcjVar != null) {
            fcjVar.r();
        } else {
            this.D.e();
        }
    }

    @Override // defpackage.esv, defpackage.ehv
    protected final void D(dze[] dzeVarArr, long j, long j2, evz evzVar) {
        super.D(dzeVarArr, j, j2, evzVar);
        eay eayVar = this.e;
        if (eayVar.q()) {
            this.ai = -9223372036854775807L;
        } else {
            this.ai = eayVar.o(evzVar.a, new eav()).i;
        }
    }

    @Override // defpackage.esv, defpackage.ehv, defpackage.ekc
    public final void K(float f, float f2) throws Throwable {
        super.K(f, f2);
        fcj fcjVar = this.K;
        if (fcjVar != null) {
            fcjVar.m(f);
        } else {
            this.D.k(f);
        }
        fby fbyVar = this.G;
        if (fbyVar != null) {
            a.H(f > 0.0f);
            fbyVar.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f));
            fbyVar.a();
        }
    }

    @Override // defpackage.ekc, defpackage.eke
    public final String U() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.esv, defpackage.ekc
    public final void V(long j, long j2) throws Throwable {
        fcj fcjVar = this.K;
        if (fcjVar != null) {
            try {
                fcjVar.h(j, j2);
            } catch (fci e) {
                throw h(e, e.a, 7001);
            }
        }
        super.V(j, j2);
    }

    @Override // defpackage.esv
    protected final float W(float f, dze dzeVar, dze[] dzeVarArr) {
        ess essVar;
        float fMax = -1.0f;
        for (dze dzeVar2 : dzeVarArr) {
            float f2 = dzeVar2.aj;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.X == null || (essVar = ((esv) this).n) == null) {
            return f3;
        }
        int i2 = dzeVar.af;
        int i3 = dzeVar.ag;
        float f4 = -3.4028235E38f;
        if (essVar.j) {
            float f5 = essVar.m;
            if (f5 != -3.4028235E38f && essVar.k == i2 && essVar.l == i3) {
                f4 = f5;
            } else {
                f4 = 1024.0f;
                if (!essVar.h(i2, i3, 1024.0d)) {
                    float f6 = 0.0f;
                    while (true) {
                        float f7 = f4 - f6;
                        if (Math.abs(f7) <= 5.0f) {
                            break;
                        }
                        float f8 = (f7 / 2.0f) + f6;
                        boolean zH = essVar.h(i2, i3, f8);
                        if (true == zH) {
                            f6 = f8;
                        }
                        if (true != zH) {
                            f4 = f8;
                        }
                    }
                    f4 = f6;
                }
                essVar.m = f4;
                essVar.k = i2;
                essVar.l = i3;
            }
        }
        return f3 != -1.0f ? Math.max(f3, f4) : f4;
    }

    @Override // defpackage.esv
    protected final int X(esx esxVar, dze dzeVar) {
        boolean z;
        String str = dzeVar.Y;
        int i2 = 0;
        if (!eae.p(str)) {
            return clw.F(0);
        }
        Context context = this.z;
        boolean z2 = dzeVar.ac != null;
        List listAW = aW(context, esxVar, dzeVar, z2, false);
        if (z2 && listAW.isEmpty()) {
            listAW = aW(context, esxVar, dzeVar, false, false);
        }
        if (listAW.isEmpty()) {
            return clw.F(1);
        }
        if (!aC(dzeVar)) {
            return clw.F(2);
        }
        ess essVar = (ess) listAW.get(0);
        boolean zE = essVar.e(dzeVar);
        if (zE) {
            z = true;
        } else {
            for (int i3 = 1; i3 < listAW.size(); i3++) {
                ess essVar2 = (ess) listAW.get(i3);
                if (essVar2.e(dzeVar)) {
                    z = false;
                    zE = true;
                    essVar = essVar2;
                    break;
                }
            }
            z = true;
        }
        int i4 = true != zE ? 3 : 4;
        int i5 = true != essVar.g(dzeVar) ? 8 : 16;
        int i6 = true != essVar.g ? 0 : 64;
        int i7 = true != z ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !fki.af(context)) {
            i7 = 256;
        }
        int i8 = i7;
        if (zE) {
            List listAW2 = aW(context, esxVar, dzeVar, z2, true);
            if (!listAW2.isEmpty()) {
                ess essVar3 = (ess) ete.e(listAW2, dzeVar).get(0);
                if (essVar3.e(dzeVar) && essVar3.g(dzeVar)) {
                    i2 = 32;
                }
            }
        }
        return clw.I(i4, i5, i2, i6, i8, 0);
    }

    @Override // defpackage.esv
    protected final ehx Y(ess essVar, dze dzeVar, dze dzeVar2) {
        int i2;
        int i3;
        ehx ehxVarB = essVar.b(dzeVar, dzeVar2);
        int i4 = ehxVarB.e;
        tqr tqrVar = this.am;
        tqrVar.getClass();
        if (dzeVar2.af > tqrVar.c || dzeVar2.ag > tqrVar.a) {
            i4 |= 256;
        }
        if (aH(essVar, dzeVar2) > tqrVar.b) {
            i4 |= 64;
        }
        String str = essVar.a;
        if (i4 != 0) {
            i3 = 0;
            i2 = i4;
        } else {
            i2 = 0;
            i3 = ehxVarB.d;
        }
        return new ehx(str, dzeVar, dzeVar2, i3, i2);
    }

    @Override // defpackage.esv
    protected final esn Z(ess essVar, dze dzeVar, MediaCrypto mediaCrypto, float f) {
        tqr tqrVar;
        Point pointA;
        int i2;
        int i3;
        int i4;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z;
        dze[] dzeVarArr;
        char c;
        boolean z2;
        boolean z3;
        int iAG;
        dze[] dzeVarArrR = R();
        int length = dzeVarArrR.length;
        int iAH = aH(essVar, dzeVar);
        int i5 = dzeVar.ag;
        int i6 = dzeVar.af;
        if (length == 1) {
            if (iAH != -1 && (iAG = aG(essVar, dzeVar)) != -1) {
                iAH = Math.min((int) (iAH * 1.5f), iAG);
            }
            tqrVar = new tqr(i6, i5, iAH, (byte[]) null);
        } else {
            int iMax = i5;
            int iMax2 = i6;
            int i7 = 0;
            boolean z4 = false;
            while (i7 < length) {
                dze dzeVar2 = dzeVarArrR[i7];
                dyt dytVar = dzeVar.ao;
                if (dytVar != null && dzeVar2.ao == null) {
                    dzd dzdVar = new dzd(dzeVar2);
                    dzdVar.C = dytVar;
                    dzeVar2 = new dze(dzdVar);
                }
                if (essVar.b(dzeVar, dzeVar2).d != 0) {
                    int i8 = dzeVar2.af;
                    c = 65535;
                    if (i8 != -1) {
                        dzeVarArr = dzeVarArrR;
                        if (dzeVar2.ag != -1) {
                            z2 = false;
                        }
                        z4 |= z2;
                        iMax2 = Math.max(iMax2, i8);
                        iMax = Math.max(iMax, dzeVar2.ag);
                        iAH = Math.max(iAH, aH(essVar, dzeVar2));
                    } else {
                        dzeVarArr = dzeVarArrR;
                    }
                    z2 = true;
                    z4 |= z2;
                    iMax2 = Math.max(iMax2, i8);
                    iMax = Math.max(iMax, dzeVar2.ag);
                    iAH = Math.max(iAH, aH(essVar, dzeVar2));
                } else {
                    dzeVarArr = dzeVarArrR;
                    c = 65535;
                }
                i7++;
                dzeVarArrR = dzeVarArr;
            }
            if (z4) {
                edb.e("MediaCodecVideoRenderer", a.ce(iMax, iMax2, "Resolutions unknown. Codec max resolution: ", "x"));
                boolean z5 = i5 > i6;
                int i9 = z5 ? i5 : i6;
                int i10 = true != z5 ? i5 : i6;
                int[] iArr = i;
                int i11 = 0;
                while (i11 < 9) {
                    float f2 = i10;
                    float f3 = i9;
                    int i12 = iArr[i11];
                    int i13 = i11;
                    float f4 = i12;
                    if (i12 <= i9 || (i2 = (int) (f4 * (f2 / f3))) <= i10) {
                        break;
                    }
                    int i14 = i9;
                    if (true != z5) {
                        i3 = i10;
                        i4 = i12;
                    } else {
                        i3 = i10;
                        i4 = i2;
                    }
                    if (true != z5) {
                        i12 = i2;
                    }
                    MediaCodecInfo.CodecCapabilities codecCapabilities = essVar.d;
                    pointA = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? null : ess.a(videoCapabilities, i4, i12);
                    float f5 = dzeVar.aj;
                    if (pointA != null) {
                        z = z5;
                        if (essVar.h(pointA.x, pointA.y, f5)) {
                            break;
                        }
                    } else {
                        z = z5;
                    }
                    i11 = i13 + 1;
                    i9 = i14;
                    i10 = i3;
                    z5 = z;
                }
                pointA = null;
                if (pointA != null) {
                    iMax2 = Math.max(iMax2, pointA.x);
                    iMax = Math.max(iMax, pointA.y);
                    dzd dzdVar2 = new dzd(dzeVar);
                    dzdVar2.t = iMax2;
                    dzdVar2.u = iMax;
                    iAH = Math.max(iAH, aG(essVar, new dze(dzdVar2)));
                    edb.e("MediaCodecVideoRenderer", a.ce(iMax, iMax2, "Codec max resolution adjusted to: ", "x"));
                }
            }
            tqrVar = new tqr(iMax2, iMax, iAH, (byte[]) null);
        }
        this.am = tqrVar;
        boolean z6 = this.C;
        int i15 = this.ae ? this.af : 0;
        String str = essVar.c;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i6);
        mediaFormat.setInteger("height", i5);
        ecm.d(mediaFormat, dzeVar.ab);
        float f6 = dzeVar.aj;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        ecm.c(mediaFormat, "rotation-degrees", dzeVar.ak);
        dyt dytVar2 = dzeVar.ao;
        if (dytVar2 != null) {
            ecm.c(mediaFormat, "color-transfer", dytVar2.j);
            ecm.c(mediaFormat, "color-standard", dytVar2.h);
            ecm.c(mediaFormat, "color-range", dytVar2.i);
            byte[] bArr = dytVar2.k;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(dzeVar.Y)) {
            int i16 = ete.a;
            Pair pairA = eco.a(dzeVar);
            if (pairA != null) {
                ecm.c(mediaFormat, "profile", ((Integer) pairA.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", tqrVar.c);
        mediaFormat.setInteger("max-height", tqrVar.a);
        ecm.c(mediaFormat, "max-input-size", tqrVar.b);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z6) {
            z3 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z3 = true;
        }
        if (i15 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z3);
            mediaFormat.setInteger("audio-session-id", i15);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.ad));
        }
        Surface surfaceAV = aV(essVar);
        if (this.K != null && !edt.al(this.z)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new esn(essVar, mediaFormat, dzeVar, surfaceAV, mediaCrypto, (ghc) null);
    }

    @Override // defpackage.esv
    protected final boolean aA(ess essVar) {
        return bd(essVar);
    }

    @Override // defpackage.esv
    protected final boolean aB() {
        ess essVar = ((esv) this).n;
        if (this.K != null && essVar != null) {
            String str = essVar.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.aB();
    }

    @Override // defpackage.esv
    protected final void aF(dze dzeVar) throws eii {
        fcj fcjVar = this.K;
        if (fcjVar == null || fcjVar.t()) {
            return;
        }
        try {
            fcjVar.w(dzeVar);
        } catch (fci e) {
            throw h(e, dzeVar, 7000);
        }
    }

    protected final long aI() {
        return -this.ah;
    }

    public final void aJ() {
        if (!this.D.m() || this.f == null) {
            return;
        }
        aL();
    }

    public final void aK(ebo eboVar) {
        if (eboVar.equals(ebo.a) || eboVar.equals(this.ac)) {
            return;
        }
        this.ac = eboVar;
        this.al.i(eboVar);
    }

    public final void aL() {
        this.al.g(this.f);
        this.Q = true;
    }

    protected final void aM(int i2, int i3) {
        ehw ehwVar = this.t;
        ehwVar.h += i2;
        int i4 = i2 + i3;
        ehwVar.g += i4;
        this.U += i4;
        int i5 = this.V + i4;
        this.V = i5;
        ehwVar.i = Math.max(i5, ehwVar.i);
        int i6 = this.B;
        if (i6 <= 0 || this.U < i6) {
            return;
        }
        aX();
    }

    protected final void aN(long j) {
        ehw ehwVar = this.t;
        ehwVar.k += j;
        ehwVar.l++;
        this.Z += j;
        this.aa++;
    }

    protected final boolean aO(ess essVar) {
        if (this.ae || aP(essVar.a)) {
            return false;
        }
        return !essVar.f || fbm.a(this.z);
    }

    protected final void aQ(esp espVar, int i2, long j) {
        Trace.beginSection("releaseOutputBuffer");
        espVar.j(i2, j);
        Trace.endSection();
        this.t.e++;
        this.V = 0;
        if (this.K == null) {
            aK(this.g);
            aJ();
        }
    }

    @Override // defpackage.fbw
    public final boolean aR(long j, long j2, boolean z, boolean z2) throws Throwable {
        int iC;
        if (this.K != null && this.A) {
            j2 -= aI();
        }
        if (j >= -500000 || z || (iC = c(j2)) == 0) {
            return false;
        }
        if (z2) {
            ehw ehwVar = this.t;
            int i2 = ehwVar.d + iC;
            ehwVar.d = i2;
            ehwVar.f += this.W;
            ehwVar.d = i2 + this.H.size();
        } else {
            this.t.j++;
            aM(iC + this.H.size(), this.W);
        }
        aE();
        fcj fcjVar = this.K;
        if (fcjVar != null) {
            fcjVar.d(false);
        }
        return true;
    }

    protected final void aT(esp espVar, int i2) {
        Trace.beginSection("skipVideoBuffer");
        espVar.q(i2);
        Trace.endSection();
        this.t.f++;
    }

    @Override // defpackage.esv
    protected final List aa(esx esxVar, dze dzeVar, boolean z) {
        return ete.e(aW(this.z, esxVar, dzeVar, z, this.ae), dzeVar);
    }

    @Override // defpackage.esv
    protected final void ab(ehk ehkVar) {
        if (this.J) {
            ByteBuffer byteBuffer = ehkVar.f;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        esp espVar = ((esv) this).k;
                        espVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        espVar.l(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.esv
    protected final void ac(Exception exc) {
        edb.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.al.h(exc);
    }

    @Override // defpackage.esv
    protected final void ad(String str) {
        this.al.b(str);
    }

    @Override // defpackage.esv
    protected final void ae(dze dzeVar, MediaFormat mediaFormat) {
        int integer;
        int i2;
        esp espVar = ((esv) this).k;
        if (espVar != null) {
            espVar.m(this.R);
        }
        if (this.ae) {
            i2 = dzeVar.af;
            integer = dzeVar.ag;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i2 = integer2;
        }
        float f = dzeVar.al;
        int i3 = dzeVar.ak;
        if (i3 == 90 || i3 == 270) {
            f = 1.0f / f;
            int i4 = integer;
            integer = i2;
            i2 = i4;
        }
        this.g = new ebo(i2, integer, f);
        fcj fcjVar = this.K;
        if (fcjVar == null || !this.aj) {
            this.D.i(dzeVar.aj);
        } else {
            dzd dzdVar = new dzd(dzeVar);
            dzdVar.t = i2;
            dzdVar.u = integer;
            dzdVar.z = f;
            dze dzeVar2 = new dze(dzdVar);
            int i5 = this.M;
            List listOf = this.N;
            if (listOf == null) {
                listOf = ImmutableList.of();
            }
            fcjVar.v(dzeVar2, ao(), i5, listOf);
            this.M = 2;
        }
        this.aj = false;
    }

    @Override // defpackage.esv
    protected final void af() {
        fcj fcjVar = this.K;
        if (fcjVar != null) {
            fcjVar.p();
            if (this.ah == -9223372036854775807L) {
                this.ah = ao();
            }
            this.K.i(aI());
        } else {
            this.D.f(2);
        }
        this.aj = true;
        aZ();
    }

    @Override // defpackage.esv
    protected final void ag() {
        fcj fcjVar = this.K;
        if (fcjVar != null) {
            fcjVar.p();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122  */
    @Override // defpackage.esv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean ah(long r19, long r21, defpackage.esp r23, java.nio.ByteBuffer r24, int r25, int r26, int r27, long r28, boolean r30, boolean r31, defpackage.dze r32) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbk.ah(long, long, esp, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, dze):boolean");
    }

    @Override // defpackage.esv
    protected final void ak(String str, long j, long j2) {
        this.al.a(str, j, j2);
        this.I = aP(str);
        ess essVar = ((esv) this).n;
        essVar.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(essVar.b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrI = essVar.i();
            int length = codecProfileLevelArrI.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (codecProfileLevelArrI[i2].profile == 16384) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        this.J = z;
        aZ();
    }

    @Override // defpackage.esv
    protected final ehx al(hig higVar) throws Throwable {
        ehx ehxVarAl = super.al(higVar);
        Object obj = higVar.a;
        obj.getClass();
        this.al.f((dze) obj, ehxVarAl);
        return ehxVarAl;
    }

    @Override // defpackage.esv
    protected final int am(ehk ehkVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.X == null && !this.ae) || !be(ehkVar)) ? 0 : 32;
        }
        return 0;
    }

    @Override // defpackage.esv
    protected final esr ap(Throwable th, ess essVar) {
        return new fbg(th, essVar, this.f);
    }

    @Override // defpackage.esv
    protected final void ar(long j) {
        super.ar(j);
        if (this.ae) {
            return;
        }
        this.W--;
    }

    @Override // defpackage.esv
    protected final void as(ehk ehkVar) {
        this.ak = 0;
        int iAm = am(ehkVar);
        if ((Build.VERSION.SDK_INT < 34 || (iAm & 32) == 0) && !this.ae) {
            this.W++;
        }
    }

    @Override // defpackage.esv
    protected final void au() {
        super.au();
        this.H.clear();
        this.W = 0;
        this.ak = 0;
        this.Y = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // defpackage.esv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean ay(defpackage.ehk r13) {
        /*
            r12 = this;
            boolean r0 = r12.O()
            r1 = 0
            if (r0 != 0) goto L88
            boolean r0 = r13.isLastSample()
            if (r0 == 0) goto Lf
            goto L88
        Lf:
            long r2 = r12.ai
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L88
            long r2 = r13.e
            long r6 = r12.an()
            long r2 = r2 - r6
            long r6 = r12.ai
            long r6 = r6 - r2
            r2 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L88
            boolean r0 = r12.be(r13)
            fby r2 = r12.G
            r3 = 1
            if (r2 == 0) goto L54
            long r6 = r13.e
            long r8 = r2.a
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 != 0) goto L3e
            r6 = r4
            goto L48
        L3e:
            long r10 = r2.b
            double r10 = (double) r10
            long r6 = r6 - r8
            double r8 = r2.c
            double r6 = (double) r6
            double r6 = r6 * r8
            double r10 = r10 + r6
            long r6 = (long) r10
        L48:
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 == 0) goto L54
            long r4 = r12.F
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 >= 0) goto L54
            r2 = r3
            goto L55
        L54:
            r2 = r1
        L55:
            if (r0 != 0) goto L5b
            if (r2 == 0) goto L5a
            goto L5b
        L5a:
            return r1
        L5b:
            boolean r2 = r13.hasSupplementalData()
            if (r2 == 0) goto L62
            return r1
        L62:
            boolean r2 = r13.notDependedOn()
            if (r2 == 0) goto L6c
            r13.clear()
            r1 = r3
        L6c:
            if (r1 == 0) goto L88
            if (r0 == 0) goto L78
            ehw r13 = r12.t
            int r0 = r13.d
            int r0 = r0 + r3
            r13.d = r0
            return r1
        L78:
            java.util.PriorityQueue r0 = r12.H
            long r4 = r13.e
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            r0.add(r13)
            int r13 = r12.ak
            int r13 = r13 + r3
            r12.ak = r13
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbk.ay(ehk):boolean");
    }

    @Override // defpackage.esv
    protected final boolean az() {
        return this.X == null || this.Y || this.v || ((esv) this).p != -9223372036854775807L;
    }

    @Override // defpackage.esv, defpackage.ekc
    public final boolean cH() {
        if (!((esv) this).q) {
            return false;
        }
        fcj fcjVar = this.K;
        return fcjVar == null || fcjVar.s();
    }

    @Override // defpackage.esv, defpackage.ekc
    public final boolean cI() {
        boolean zCI = super.cI();
        fcj fcjVar = this.K;
        if (fcjVar != null) {
            return fcjVar.u(zCI);
        }
        if (zCI && (((esv) this).k == null || this.ae)) {
            return true;
        }
        return this.D.l(zCI);
    }

    @Override // defpackage.ehv, defpackage.ekc
    public final void r() {
        fcj fcjVar = this.K;
        if (fcjVar == null) {
            this.D.b();
            return;
        }
        int i2 = this.M;
        if (i2 == 0 || i2 == 1) {
            this.M = 0;
        } else {
            fcjVar.b();
        }
    }

    @Override // defpackage.esv, defpackage.ehv, defpackage.ejz
    public final void s(int i2, Object obj) throws Throwable {
        if (i2 == 1) {
            bc(obj);
            return;
        }
        if (i2 == 7) {
            obj.getClass();
            fbu fbuVar = (fbu) obj;
            this.ag = fbuVar;
            fcj fcjVar = this.K;
            if (fcjVar != null) {
                fcjVar.o(fbuVar);
                return;
            }
            return;
        }
        if (i2 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.af != iIntValue) {
                this.af = iIntValue;
                if (this.ae) {
                    at();
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.R = iIntValue2;
            esp espVar = ((esv) this).k;
            if (espVar != null) {
                espVar.m(iIntValue2);
                return;
            }
            return;
        }
        if (i2 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.S = iIntValue3;
            fcj fcjVar2 = this.K;
            if (fcjVar2 != null) {
                fcjVar2.j(iIntValue3);
                return;
            } else {
                this.D.h(iIntValue3);
                return;
            }
        }
        if (i2 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(ebm.a)) {
                fcj fcjVar3 = this.K;
                if (fcjVar3 == null || !fcjVar3.t()) {
                    return;
                }
                fcjVar3.f();
                return;
            }
            this.N = list;
            fcj fcjVar4 = this.K;
            if (fcjVar4 != null) {
                fcjVar4.n(list);
                return;
            }
            return;
        }
        if (i2 == 14) {
            obj.getClass();
            edk edkVar = (edk) obj;
            if (edkVar.b == 0 || edkVar.c == 0) {
                return;
            }
            this.P = edkVar;
            fcj fcjVar5 = this.K;
            if (fcjVar5 != null) {
                Surface surface = this.f;
                eci.e(surface);
                fcjVar5.l(surface, edkVar);
                return;
            }
            return;
        }
        switch (i2) {
            case 16:
                obj.getClass();
                this.ad = ((Integer) obj).intValue();
                esp espVar2 = ((esv) this).k;
                if (espVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.ad));
                    espVar2.l(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.f;
                bc(null);
                obj.getClass();
                ((fbk) obj).s(1, surface2);
                break;
            case 18:
                boolean z = this.X != null;
                eki ekiVar = (eki) obj;
                this.X = ekiVar;
                if (z != (ekiVar != null)) {
                    super.aD(((esv) this).l);
                    break;
                }
                break;
            default:
                super.s(i2, obj);
                break;
        }
    }

    @Override // defpackage.esv, defpackage.ehv
    protected final void v() {
        this.ac = null;
        this.ai = -9223372036854775807L;
        aZ();
        this.Q = false;
        this.h = null;
        this.Y = true;
        try {
            super.v();
        } finally {
            epm epmVar = this.al;
            epmVar.c(this.t);
            epmVar.i(ebo.a);
        }
    }

    @Override // defpackage.esv, defpackage.ehv
    protected final void w(boolean z, boolean z2) {
        fcj fcjVar;
        super.w(z, z2);
        boolean z3 = l().c;
        a.ab((z3 && this.af == 0) ? false : true);
        if (this.ae != z3) {
            this.ae = z3;
            at();
        }
        this.al.e(this.t);
        if (!this.L) {
            if (this.N != null && this.K == null) {
                fbn fbnVar = new fbn(this.z, this.D);
                fbnVar.c = true;
                fbnVar.d = dm();
                a.ab(!fbnVar.e);
                if (fbnVar.f == null) {
                    fbnVar.f = new dhq((char[]) null, (byte[]) null);
                }
                fbr fbrVar = new fbr(fbnVar);
                fbnVar.e = true;
                fbrVar.p = 1;
                SparseArray sparseArray = fbrVar.b;
                if (edt.ag(sparseArray, 0)) {
                    fcjVar = (fcj) sparseArray.get(0);
                } else {
                    fbo fboVar = new fbo(fbrVar, fbrVar.a);
                    fbrVar.f.add(fboVar);
                    sparseArray.put(0, fboVar);
                    fcjVar = fboVar;
                }
                this.K = fcjVar;
            }
            this.L = true;
        }
        int i2 = !z2 ? 1 : 0;
        fcj fcjVar2 = this.K;
        if (fcjVar2 == null) {
            fbx fbxVar = this.D;
            fbxVar.a = dm();
            fbxVar.f(i2);
            return;
        }
        fcjVar2.k(new fbh(this), ugk.a);
        fbu fbuVar = this.ag;
        if (fbuVar != null) {
            this.K.o(fbuVar);
        }
        if (this.f != null && !this.P.equals(edk.a)) {
            this.K.l(this.f, this.P);
        }
        this.K.j(this.S);
        this.K.m(((esv) this).j);
        List list = this.N;
        if (list != null) {
            this.K.n(list);
        }
        this.M = i2;
        this.u = true;
    }

    @Override // defpackage.esv, defpackage.ehv
    protected final void x(long j, boolean z) throws Throwable {
        fcj fcjVar = this.K;
        if (fcjVar != null && !z) {
            fcjVar.d(true);
        }
        super.x(j, z);
        if (this.K == null) {
            this.D.g();
        }
        fby fbyVar = this.G;
        if (fbyVar != null) {
            fbyVar.a();
        }
        if (z) {
            fcj fcjVar2 = this.K;
            if (fcjVar2 != null) {
                fcjVar2.e(false);
            } else {
                this.D.c(false);
            }
        }
        aZ();
        this.V = 0;
    }

    @Override // defpackage.ehv
    protected final void y() {
        fcj fcjVar = this.K;
        if (fcjVar == null || !this.A) {
            return;
        }
        fcjVar.g();
    }
}

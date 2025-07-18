package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eiz extends dyq implements ExoPlayer {
    public static final /* synthetic */ int J = 0;
    public dyx A;
    public ebo B;
    public eab C;
    public ejx D;
    public int E;
    public long F;
    public final ele G;
    public final fvu H;
    final sro I;
    private final ekc[] K;
    private final ekc[] L;
    private final ezk M;
    private final CopyOnWriteArraySet N;
    private final eav O;
    private final boolean P;
    private final evy Q;
    private final ezm R;
    private final long S;
    private final long T;
    private final long U;
    private final eiw V;
    private final long W;
    private int X;
    private boolean Y;
    private boolean Z;
    private ImmutableSet aa;
    private eki ab;
    private ekj ac;
    private eim ad;
    private Surface ae;
    private fcs af;
    private int ag;
    private edk ah;
    private boolean ai;
    private boolean aj;
    private int ak;
    private boolean al;
    private final fxr am;
    private final shx an;
    private final shx ao = new shx();
    private nuh ap;
    private cvi aq;
    private final pku ar;
    final eak b;
    public final Context c;
    public final eao d;
    public final ecu e;
    public final eje f;
    public final List g;
    public final Looper h;
    public final ecn i;
    public final eix j;
    public final eck k;
    public int l;
    public int m;
    public boolean n;
    public eak o;
    public eab p;
    public eab q;
    public Object r;
    public SurfaceHolder s;
    public boolean t;
    public TextureView u;
    public dyo v;
    public float w;
    public boolean x;
    public ecb y;
    public boolean z;

    static {
        dzz.b("media3.exoplayer");
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [ecn, java.lang.Object] */
    public eiz(eil eilVar) {
        byte[] bArr;
        try {
            edb.h("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0-alpha01] [" + edt.a + "]");
            this.c = eilVar.a.getApplicationContext();
            this.G = (ele) eilVar.h.apply(eilVar.b);
            this.ak = -1000;
            this.ap = eilVar.z;
            this.v = eilVar.k;
            int i = 1;
            this.ag = 1;
            this.x = false;
            this.W = 2000L;
            eiw eiwVar = new eiw(this);
            this.V = eiwVar;
            this.j = new eix();
            Handler handler = new Handler(eilVar.i);
            ekh ekhVar = (ekh) eilVar.c.get();
            ekc[] ekcVarArrA = ekhVar.a(handler, eiwVar, eiwVar, eiwVar, eiwVar);
            this.K = ekcVarArrA;
            a.ab(ekcVarArrA.length > 0);
            this.L = new ekc[ekcVarArrA.length];
            int i2 = 0;
            while (true) {
                ekc[] ekcVarArr = this.L;
                bArr = null;
                if (i2 >= ekcVarArr.length) {
                    break;
                }
                ekhVar.b(this.K[i2]);
                ekcVarArr[i2] = null;
                i2++;
            }
            ezk ezkVar = (ezk) eilVar.e.get();
            this.M = ezkVar;
            this.Q = (evy) eilVar.d.get();
            ezm ezmVar = (ezm) eilVar.g.get();
            this.R = ezmVar;
            this.P = true;
            this.ac = eilVar.o;
            this.S = eilVar.q;
            this.T = eilVar.r;
            this.U = 3000L;
            this.ab = eilVar.p;
            Looper looper = eilVar.i;
            this.h = looper;
            ecn ecnVar = eilVar.b;
            this.i = ecnVar;
            this.d = this;
            this.H = new fvu(looper, ecnVar, new ekw(i));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.N = copyOnWriteArraySet;
            this.g = new ArrayList();
            this.aq = new cvi((byte[]) null);
            this.ad = eim.a;
            int length = this.K.length;
            sro sroVar = new sro(new ekf[length], new ezf[length], ebh.a, null);
            this.I = sroVar;
            this.O = new eav();
            int[] iArr = eaj.a;
            rin rinVar = new rin(null, null);
            rinVar.l(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            ezkVar.n();
            eaj.c(29, true, rinVar);
            eaj.c(23, false, rinVar);
            eaj.c(25, false, rinVar);
            eaj.c(33, false, rinVar);
            eaj.c(26, false, rinVar);
            eaj.c(34, false, rinVar);
            eak eakVarA = eaj.a(rinVar);
            this.b = eakVarA;
            rin rinVar2 = new rin(null, null);
            eaj.b(eakVarA, rinVar2);
            rinVar2.j(4);
            rinVar2.j(10);
            this.o = eaj.a(rinVar2);
            this.e = ecnVar.b(looper, null);
            pku pkuVar = new pku(this, bArr);
            this.ar = pkuVar;
            this.D = ejx.l(sroVar);
            final ele eleVar = this.G;
            a.ab(eleVar.d == null || eleVar.b.b.isEmpty());
            getClass();
            eleVar.d = this;
            eleVar.e = eleVar.a.b(looper, null);
            fvu fvuVar = eleVar.f;
            eleVar.f = new fvu((CopyOnWriteArraySet) fvuVar.f, looper, fvuVar.g, new ecx() { // from class: eks
                @Override // defpackage.ecx
                public final void a(Object obj, dzb dzbVar) {
                    ((ekm) obj).at(this, new dwi(dzbVar, eleVar.c));
                }
            }, fvuVar.b);
            elk elkVar = new elk(eilVar.x);
            eje ejeVar = new eje(this.c, this.K, this.L, ezkVar, sroVar, (ehz) eilVar.f.get(), ezmVar, this.X, this.Y, this.G, this.ac, eilVar.y, 500L, looper, ecnVar, pkuVar, elkVar, this.ad, this.j);
            this.f = ejeVar;
            Looper looper2 = ejeVar.e;
            this.w = 1.0f;
            this.X = 0;
            eab eabVar = eab.a;
            this.p = eabVar;
            this.q = eabVar;
            this.C = eabVar;
            this.E = -1;
            this.y = ecb.a;
            this.ai = true;
            S(this.G);
            ezmVar.d(new Handler(looper), this.G);
            copyOnWriteArraySet.add(this.V);
            if (Build.VERSION.SDK_INT >= 31) {
                ecnVar.b(ejeVar.e, null).d(new fob(this.c, true, this, elkVar, 1));
            }
            eck eckVar = new eck(0, looper2, looper, ecnVar, new pku(this, null));
            this.k = eckVar;
            eckVar.a.d(new caw(this, 17));
            Context context = eilVar.a;
            Looper looper3 = eilVar.i;
            context.getApplicationContext();
            ecnVar.b(looper2, null);
            new ehr(ecnVar.b(looper3, null));
            this.an = new shx(eilVar.a, looper2, ecnVar);
            this.am = new fxr(eilVar.a, looper2, ecnVar);
            this.A = dyx.a;
            this.B = ebo.a;
            this.ah = edk.a;
            ejeVar.d.h(38, this.ab).l();
            ejeVar.f(this.v, eilVar.l);
            az(1, 3, this.v);
            az(2, 4, Integer.valueOf(this.ag));
            az(2, 5, 0);
            az(1, 9, Boolean.valueOf(this.x));
            az(6, 8, this.j);
            az(-1, 16, Integer.valueOf(this.ak));
        } finally {
            this.ao.g();
        }
    }

    private final int aH(ejx ejxVar) {
        eay eayVar = ejxVar.b;
        return eayVar.q() ? this.E : eayVar.o(ejxVar.c.a, this.O).h;
    }

    private final long aI(ejx ejxVar) {
        evz evzVar = ejxVar.c;
        if (!evzVar.b()) {
            return edt.F(aJ(ejxVar));
        }
        eay eayVar = ejxVar.b;
        Object obj = evzVar.a;
        eav eavVar = this.O;
        eayVar.o(obj, eavVar);
        long j = ejxVar.d;
        return j == -9223372036854775807L ? eayVar.p(aH(ejxVar), this.a).b() : eavVar.f() + edt.F(j);
    }

    private final long aJ(ejx ejxVar) {
        eay eayVar = ejxVar.b;
        if (eayVar.q()) {
            return edt.y(this.F);
        }
        long jA = ejxVar.p ? ejxVar.a() : ejxVar.s;
        evz evzVar = ejxVar.c;
        return evzVar.b() ? jA : au(eayVar, evzVar, jA);
    }

    private static long aK(ejx ejxVar) {
        eax eaxVar = new eax();
        eav eavVar = new eav();
        eay eayVar = ejxVar.b;
        eayVar.o(ejxVar.c.a, eavVar);
        long j = ejxVar.d;
        return j == -9223372036854775807L ? eayVar.p(eavVar.h, eaxVar).z : eavVar.j + j;
    }

    private final Pair aL(eay eayVar, eay eayVar2, int i, long j) {
        if (eayVar.q() || eayVar2.q()) {
            boolean z = false;
            if (!eayVar.q() && eayVar2.q()) {
                z = true;
            }
            return aM(eayVar2, true != z ? i : -1, true != z ? j : -9223372036854775807L);
        }
        eax eaxVar = this.a;
        eav eavVar = this.O;
        Pair pairL = eayVar.l(eaxVar, eavVar, i, edt.y(j));
        Object obj = pairL.first;
        if (eayVar2.a(obj) != -1) {
            return pairL;
        }
        int iA = eje.a(eaxVar, eavVar, this.X, this.Y, obj, eayVar, eayVar2);
        return iA != -1 ? aM(eayVar2, iA, eayVar2.p(iA, eaxVar).b()) : aM(eayVar2, -1, -9223372036854775807L);
    }

    private final Pair aM(eay eayVar, int i, long j) {
        if (eayVar.q()) {
            this.E = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.F = j;
            return null;
        }
        if (i == -1 || i >= eayVar.c()) {
            i = eayVar.g(this.Y);
            j = eayVar.p(i, this.a).b();
        }
        return eayVar.l(this.a, this.O, i, edt.y(j));
    }

    private final eay aN() {
        return new ehp(this.g, this.aq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ebf aO(ebf ebfVar, ImmutableSet immutableSet) {
        ebe ebeVarB = ebfVar.b();
        UnmodifiableIterator it = immutableSet.iterator();
        while (it.hasNext()) {
            ebeVarB.l(((Integer) it.next()).intValue(), true);
        }
        return ebeVarB.a();
    }

    private final ejx aP(ejx ejxVar, int i, List list) {
        eay eayVar = ejxVar.b;
        this.l++;
        List listAT = aT(i, list);
        eay eayVarAN = aN();
        ejx ejxVarAR = aR(ejxVar, eayVarAN, aL(eayVar, eayVarAN, aH(ejxVar), aI(ejxVar)));
        this.f.d.j(18, i, 0, new ejb(listAT, this.aq, -1, -9223372036854775807L)).l();
        return ejxVarAR;
    }

    private static ejx aQ(ejx ejxVar, int i) {
        ejx ejxVarH = ejxVar.h(i);
        return (i == 1 || i == 4) ? ejxVarH.c(false) : ejxVarH;
    }

    private final ejx aR(ejx ejxVar, eay eayVar, Pair pair) {
        a.H(eayVar.q() || pair != null);
        eay eayVar2 = ejxVar.b;
        long jAI = aI(ejxVar);
        ejx ejxVarI = ejxVar.i(eayVar);
        if (eayVar.q()) {
            evz evzVar = ejx.a;
            long jY = edt.y(this.F);
            ejx ejxVarD = ejxVarI.k(evzVar, jY, jY, jY, 0L, exi.a, this.I, ImmutableList.of()).d(evzVar);
            ejxVarD.q = ejxVarD.s;
            return ejxVarD;
        }
        evz evzVar2 = ejxVarI.c;
        Object obj = evzVar2.a;
        String str = edt.a;
        boolean zEquals = obj.equals(pair.first);
        evz evzVar3 = !zEquals ? new evz(pair.first) : evzVar2;
        long jLongValue = ((Long) pair.second).longValue();
        long jY2 = edt.y(jAI);
        if (!eayVar2.q()) {
            jY2 -= eayVar2.o(obj, this.O).j;
        }
        if (!zEquals || jLongValue < jY2) {
            evz evzVar4 = evzVar3;
            a.ab(!evzVar4.b());
            ejx ejxVarD2 = ejxVarI.k(evzVar4, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? exi.a : ejxVarI.i, !zEquals ? this.I : ejxVarI.u, !zEquals ? ImmutableList.of() : ejxVarI.j).d(evzVar4);
            ejxVarD2.q = jLongValue;
            return ejxVarD2;
        }
        if (jLongValue != jY2) {
            evz evzVar5 = evzVar3;
            a.ab(!evzVar5.b());
            long jMax = Math.max(0L, ejxVarI.r - (jLongValue - jY2));
            long j = ejxVarI.q;
            if (ejxVarI.k.equals(evzVar2)) {
                j = jLongValue + jMax;
            }
            ejx ejxVarK = ejxVarI.k(evzVar5, jLongValue, jLongValue, jLongValue, jMax, ejxVarI.i, ejxVarI.u, ejxVarI.j);
            ejxVarK.q = j;
            return ejxVarK;
        }
        int iA = eayVar.a(ejxVarI.k.a);
        if (iA != -1) {
            eav eavVar = this.O;
            if (eayVar.n(iA, eavVar).h == eayVar.o(evzVar3.a, eavVar).h) {
                return ejxVarI;
            }
        }
        Object obj2 = evzVar3.a;
        eav eavVar2 = this.O;
        eayVar.o(obj2, eavVar2);
        long jE = evzVar3.b() ? eavVar2.e(evzVar3.b, evzVar3.c) : eavVar2.i;
        evz evzVar6 = evzVar3;
        ejx ejxVarD3 = ejxVarI.k(evzVar6, ejxVarI.s, ejxVarI.s, ejxVarI.e, jE - ejxVarI.s, ejxVarI.i, ejxVarI.u, ejxVarI.j).d(evzVar6);
        ejxVarD3.q = jE;
        return ejxVarD3;
    }

    private final ejx aS(ejx ejxVar, int i, int i2) {
        List list = this.g;
        int iAH = aH(ejxVar);
        long jAI = aI(ejxVar);
        eay eayVar = ejxVar.b;
        int size = list.size();
        this.l++;
        aV(i, i2);
        eay eayVarAN = aN();
        ejx ejxVarAR = aR(ejxVar, eayVarAN, aL(eayVar, eayVarAN, iAH, jAI));
        int i3 = ejxVarAR.f;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && iAH >= ejxVarAR.b.c()) {
            ejxVarAR = aQ(ejxVarAR, 4);
        }
        this.f.d.j(20, i, i2, this.aq).l();
        return ejxVarAR;
    }

    private final List aT(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ejt ejtVar = new ejt((ewb) list.get(i2), this.P);
            arrayList.add(ejtVar);
            this.g.add(i2 + i, new eiy(ejtVar.b, ejtVar.a));
        }
        this.aq = this.aq.u(i, arrayList.size());
        return arrayList;
    }

    private final List aU(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.Q.b((dzy) list.get(i)));
        }
        return arrayList;
    }

    private final void aV(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.g.remove(i3);
        }
        cvi cviVar = this.aq;
        int i4 = i2 - i;
        int[] iArr = (int[]) cviVar.c;
        int[] iArr2 = new int[iArr.length - i4];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 < i || i7 >= i2) {
                int i8 = i6 - i5;
                if (i7 >= i) {
                    i7 -= i4;
                }
                iArr2[i8] = i7;
            } else {
                i5++;
            }
        }
        this.aq = new cvi(iArr2, new Random(((Random) cviVar.a).nextLong()));
    }

    private final void aW() {
        if (this.af != null) {
            eka ekaVarAx = ax(this.j);
            ekaVarAx.e(WVMediaCrypto.TYPE);
            ekaVarAx.d(null);
            ekaVarAx.c();
            fcs fcsVar = this.af;
            fcsVar.a.remove(this.V);
            this.af = null;
        }
        TextureView textureView = this.u;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.V) {
                edb.e("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.u.setSurfaceTextureListener(null);
            }
            this.u = null;
        }
        SurfaceHolder surfaceHolder = this.s;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.V);
            this.s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void aX(java.util.List r16, int r17, long r18, boolean r20) {
        /*
            r15 = this;
            r1 = r17
            ejx r2 = r15.D
            int r2 = r15.aH(r2)
            long r3 = r15.D()
            int r5 = r15.l
            r6 = 1
            int r5 = r5 + r6
            r15.l = r5
            java.util.List r5 = r15.g
            boolean r7 = r5.isEmpty()
            r8 = 0
            if (r7 != 0) goto L22
            int r5 = r5.size()
            r15.aV(r8, r5)
        L22:
            r5 = r16
            java.util.List r10 = r15.aT(r8, r5)
            eay r5 = r15.aN()
            boolean r7 = r5.q()
            if (r7 != 0) goto L40
            r7 = r5
            ehp r7 = (defpackage.ehp) r7
            int r7 = r7.e
            if (r1 >= r7) goto L3a
            goto L40
        L3a:
            dzi r1 = new dzi
            r1.<init>()
            throw r1
        L40:
            r7 = -1
            if (r20 == 0) goto L50
            boolean r1 = r15.Y
            int r1 = r5.g(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4e:
            r12 = r1
            goto L58
        L50:
            if (r1 != r7) goto L55
            r12 = r2
            r2 = r3
            goto L58
        L55:
            r2 = r18
            goto L4e
        L58:
            ejx r1 = r15.D
            android.util.Pair r4 = r15.aM(r5, r12, r2)
            ejx r1 = r15.aR(r1, r5, r4)
            int r4 = r1.f
            if (r12 == r7) goto L79
            if (r4 == r6) goto L79
            boolean r4 = r5.q()
            r7 = 4
            if (r4 != 0) goto L78
            ehp r5 = (defpackage.ehp) r5
            int r4 = r5.e
            if (r12 < r4) goto L76
            goto L78
        L76:
            r4 = 2
            goto L79
        L78:
            r4 = r7
        L79:
            ejx r1 = aQ(r1, r4)
            eje r4 = r15.f
            long r13 = defpackage.edt.y(r2)
            cvi r11 = r15.aq
            ecu r2 = r4.d
            ejb r9 = new ejb
            r9.<init>(r10, r11, r12, r13)
            r3 = 17
            nxb r2 = r2.h(r3, r9)
            r2.l()
            ejx r2 = r15.D
            evz r2 = r2.c
            java.lang.Object r2 = r2.a
            evz r3 = r1.c
            java.lang.Object r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lb1
            ejx r2 = r15.D
            eay r2 = r2.b
            boolean r2 = r2.q()
            if (r2 != 0) goto Lb1
            r3 = r6
            goto Lb2
        Lb1:
            r3 = r8
        Lb2:
            long r5 = r15.aJ(r1)
            r7 = -1
            r8 = 0
            r2 = 0
            r4 = 4
            r0 = r15
            r0.aE(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eiz.aX(java.util.List, int, long, boolean):void");
    }

    private final void aY(SurfaceHolder surfaceHolder) {
        this.t = false;
        this.s = surfaceHolder;
        surfaceHolder.addCallback(this.V);
        Surface surface = this.s.getSurface();
        if (surface == null || !surface.isValid()) {
            ay(0, 0);
        } else {
            Rect surfaceFrame = this.s.getSurfaceFrame();
            ay(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    private final void aZ(eii eiiVar) {
        ejx ejxVar = this.D;
        ejx ejxVarD = ejxVar.d(ejxVar.c);
        ejxVarD.q = ejxVarD.s;
        ejxVarD.r = 0L;
        ejx ejxVarAQ = aQ(ejxVarD, 1);
        if (eiiVar != null) {
            ejxVarAQ = ejxVarAQ.f(eiiVar);
        }
        this.l++;
        this.f.d.g(6).l();
        aE(ejxVarAQ, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final void ba() {
        eak eakVar = this.o;
        String str = edt.a;
        eao eaoVar = this.d;
        boolean zAn = eaoVar.an();
        boolean zT = eaoVar.t();
        boolean zP = eaoVar.p();
        boolean zO = eaoVar.o();
        boolean zS = eaoVar.s();
        boolean zR = eaoVar.r();
        boolean zQ = eaoVar.N().q();
        int[] iArr = eaj.a;
        rin rinVar = new rin(null, null);
        eaj.b(this.b, rinVar);
        boolean z = !zAn;
        eaj.c(4, z, rinVar);
        boolean z2 = false;
        eaj.c(5, zT && !zAn, rinVar);
        eaj.c(6, zP && !zAn, rinVar);
        eaj.c(7, !zQ && (zP || !zS || zT) && !zAn, rinVar);
        eaj.c(8, zO && !zAn, rinVar);
        int i = 9;
        eaj.c(9, !zQ && (zO || (zS && zR)) && !zAn, rinVar);
        eaj.c(10, z, rinVar);
        eaj.c(11, zT && !zAn, rinVar);
        if (zT && !zAn) {
            z2 = true;
        }
        eaj.c(12, z2, rinVar);
        eak eakVarA = eaj.a(rinVar);
        this.o = eakVarA;
        if (eakVarA.equals(eakVar)) {
            return;
        }
        this.H.e(13, new ein(this, i));
    }

    @Override // defpackage.eao
    public final long A() {
        aG();
        if (!an()) {
            return B();
        }
        ejx ejxVar = this.D;
        return ejxVar.k.equals(ejxVar.c) ? edt.F(this.D.q) : E();
    }

    @Override // defpackage.eao
    public final long B() {
        aG();
        if (this.D.b.q()) {
            return this.F;
        }
        ejx ejxVar = this.D;
        if (ejxVar.k.d != ejxVar.c.d) {
            return ejxVar.b.p(bd(), this.a).c();
        }
        long j = ejxVar.q;
        if (this.D.k.b()) {
            ejx ejxVar2 = this.D;
            ejxVar2.b.o(ejxVar2.k.a, this.O).g(this.D.k.b);
            j = 0;
        }
        ejx ejxVar3 = this.D;
        return edt.F(au(ejxVar3.b, ejxVar3.k, j));
    }

    @Override // defpackage.eao
    public final long C() {
        aG();
        return aI(this.D);
    }

    @Override // defpackage.eao
    public final long D() {
        aG();
        return edt.F(aJ(this.D));
    }

    @Override // defpackage.eao
    public final long E() {
        aG();
        if (!an()) {
            return d();
        }
        ejx ejxVar = this.D;
        evz evzVar = ejxVar.c;
        eay eayVar = ejxVar.b;
        Object obj = evzVar.a;
        eav eavVar = this.O;
        eayVar.o(obj, eavVar);
        return edt.F(eavVar.e(evzVar.b, evzVar.c));
    }

    @Override // defpackage.eao
    public final long F() {
        aG();
        return this.U;
    }

    @Override // defpackage.eao
    public final long G() {
        aG();
        return this.S;
    }

    @Override // defpackage.eao
    public final long H() {
        aG();
        return this.T;
    }

    @Override // defpackage.eao
    public final long I() {
        aG();
        return edt.F(this.D.r);
    }

    @Override // defpackage.eao
    public final eab J() {
        aG();
        return this.p;
    }

    @Override // defpackage.eao
    public final /* bridge */ /* synthetic */ eah K() {
        throw null;
    }

    @Override // defpackage.eao
    public final eai L() {
        aG();
        return this.D.o;
    }

    @Override // defpackage.eao
    public final eak M() {
        aG();
        return this.o;
    }

    @Override // defpackage.eao
    public final eay N() {
        aG();
        return this.D.b;
    }

    @Override // defpackage.eao
    public final ebf O() {
        aG();
        ebf ebfVarC = this.M.c();
        if (!this.Z) {
            return ebfVarC;
        }
        eyu eyuVar = new eyu((eyv) ebfVarC);
        eyuVar.g(this.aa);
        return new eyv(eyuVar);
    }

    @Override // defpackage.eao
    public final ebh P() {
        aG();
        return (ebh) this.D.u.b;
    }

    @Override // defpackage.eao
    public final ebo Q() {
        aG();
        return this.B;
    }

    @Override // defpackage.eao
    public final ecb R() {
        aG();
        return this.y;
    }

    @Override // defpackage.eao
    public final void S(eam eamVar) {
        eamVar.getClass();
        this.H.c(eamVar);
    }

    @Override // defpackage.eao
    public final void T(int i, List list) {
        aG();
        List listAU = aU(list);
        aG();
        a.H(i >= 0);
        List list2 = this.g;
        int iMin = Math.min(i, list2.size());
        if (list2.isEmpty()) {
            aA(listAU, this.E == -1);
        } else {
            aE(aP(this.D, iMin, listAU), 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    @Override // defpackage.eao
    public final void U() {
        aG();
        aW();
        aC(null);
        ay(0, 0);
    }

    @Override // defpackage.eao
    public final void V(int i, int i2, int i3) {
        aG();
        a.H(i <= i2);
        List list = this.g;
        int size = list.size();
        int iMin = Math.min(i2, size);
        int iMin2 = Math.min(i3, size - (iMin - i));
        if (i >= size || i == iMin || i == iMin2) {
            return;
        }
        eay eayVarN = N();
        this.l++;
        edt.ae(list, i, iMin, iMin2);
        this.aq = this.aq;
        eay eayVarAN = aN();
        ejx ejxVar = this.D;
        ejx ejxVarAR = aR(ejxVar, eayVarAN, aL(eayVarN, eayVarAN, aH(ejxVar), aI(this.D)));
        this.f.d.h(19, new tqp(i, iMin, iMin2, this.aq)).l();
        aE(ejxVarAR, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.eao
    public final void W() {
        aG();
        ejx ejxVar = this.D;
        if (ejxVar.f != 1) {
            return;
        }
        ejx ejxVarF = ejxVar.f(null);
        ejx ejxVarAQ = aQ(ejxVarF, true != ejxVarF.b.q() ? 2 : 4);
        this.l++;
        this.f.d.g(29).l();
        aE(ejxVarAQ, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.eao
    public final void X(eam eamVar) {
        aG();
        eamVar.getClass();
        this.H.g(eamVar);
    }

    @Override // defpackage.eao
    public final void Y(int i, int i2) {
        aG();
        boolean z = false;
        if (i >= 0 && i2 >= i) {
            z = true;
        }
        a.H(z);
        int size = this.g.size();
        int iMin = Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        ejx ejxVarAS = aS(this.D, i, iMin);
        aE(ejxVarAS, 0, !ejxVarAS.c.a.equals(this.D.c.a), 4, aJ(ejxVarAS), -1, false);
    }

    @Override // defpackage.eao
    public final void Z(int i, int i2, List list) {
        aG();
        a.H(i >= 0 && i2 >= i);
        List list2 = this.g;
        int size = list2.size();
        if (i > size) {
            return;
        }
        int iMin = Math.min(i2, size);
        if (iMin - i == list.size()) {
            for (int i3 = i; i3 < iMin; i3++) {
                if (((eiy) list2.get(i3)).a.o((dzy) list.get(i3 - i))) {
                }
            }
            this.l++;
            this.f.d.j(27, i, iMin, list).l();
            for (int i4 = i; i4 < iMin; i4++) {
                eiy eiyVar = (eiy) list2.get(i4);
                eiyVar.b = new exh(eiyVar.b, (dzy) list.get(i4 - i));
            }
            aE(this.D.i(aN()), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        List listAU = aU(list);
        if (list2.isEmpty()) {
            aA(listAU, this.E == -1);
        } else {
            ejx ejxVarAS = aS(aP(this.D, iMin, listAU), i, iMin);
            aE(ejxVarAS, 0, !ejxVarAS.c.a.equals(this.D.c.a), 4, aJ(ejxVarAS), -1, false);
        }
    }

    public final void aA(List list, boolean z) {
        aG();
        aX(list, -1, -9223372036854775807L, z);
    }

    public final void aB(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        aC(surface);
        this.ae = surface;
    }

    public final void aC(Object obj) {
        Object obj2 = this.r;
        boolean z = false;
        boolean zE = true;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        long j = z ? this.W : -9223372036854775807L;
        eje ejeVar = this.f;
        if (!ejeVar.i && ejeVar.e.getThread().isAlive()) {
            ecn ecnVar = ejeVar.f;
            shx shxVar = new shx();
            ejeVar.d.h(30, new Pair(obj, shxVar)).l();
            if (j != -9223372036854775807L) {
                zE = shxVar.e(j);
            }
        }
        if (z) {
            Object obj3 = this.r;
            Surface surface = this.ae;
            if (obj3 == surface) {
                surface.release();
                this.ae = null;
            }
        }
        this.r = obj;
        if (zE) {
            return;
        }
        aZ(new eii(2, new ejf(3), 1003));
    }

    public final void aD(boolean z, int i) {
        int i2;
        if (this.Z) {
            i2 = 4;
        } else {
            i2 = 0;
            if (this.D.n == 1 && !z) {
                i2 = 1;
            }
        }
        ejx ejxVarB = this.D;
        if (ejxVarB.l == z && ejxVarB.n == i2 && ejxVarB.m == i) {
            return;
        }
        this.l++;
        if (ejxVarB.p) {
            ejxVarB = ejxVarB.b();
        }
        ejx ejxVarE = ejxVarB.e(z, i, i2);
        this.f.d.i(1, z ? 1 : 0, i | (i2 << 4)).l();
        aE(ejxVarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03e6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aE(defpackage.ejx r33, int r34, boolean r35, int r36, long r37, int r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eiz.aE(ejx, int, boolean, int, long, int, boolean):void");
    }

    public final void aF() {
        int iBf = bf();
        boolean z = false;
        if (iBf != 2 && iBf != 3) {
            this.an.a(false);
            this.am.a(false);
            return;
        }
        aG();
        boolean z2 = this.D.p;
        shx shxVar = this.an;
        if (al() && !z2) {
            z = true;
        }
        shxVar.a(z);
        this.am.a(al());
    }

    public final void aG() {
        this.ao.c();
        Looper looper = this.h;
        if (Thread.currentThread() != looper.getThread()) {
            String strR = edt.R("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), looper.getThread().getName());
            if (this.ai) {
                throw new IllegalStateException(strR);
            }
            edb.f("ExoPlayerImpl", strR, this.aj ? null : new IllegalStateException());
            this.aj = true;
        }
    }

    @Override // defpackage.eao
    public final void aa(List list, int i, long j) {
        aG();
        List listAU = aU(list);
        aG();
        aX(listAU, i, j, false);
    }

    @Override // defpackage.eao
    public final void ab(boolean z) {
        aG();
        aD(z, 1);
    }

    @Override // defpackage.eao
    public final void ac(eai eaiVar) {
        aG();
        if (this.D.o.equals(eaiVar)) {
            return;
        }
        ejx ejxVarG = this.D.g(eaiVar);
        this.l++;
        this.f.d.h(4, eaiVar).l();
        aE(ejxVarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.eao
    public final void ad(int i) {
        aG();
        if (this.X != i) {
            this.X = i;
            this.f.d.i(11, i, 0).l();
            fvu fvuVar = this.H;
            fvuVar.e(8, new eiq(i, 1));
            ba();
            fvuVar.d();
        }
    }

    @Override // defpackage.eao
    public final void ae(boolean z) {
        aG();
        if (this.Y != z) {
            this.Y = z;
            this.f.d.i(12, z ? 1 : 0, 0).l();
            fvu fvuVar = this.H;
            fvuVar.e(9, new eiv(z, 1));
            ba();
            fvuVar.d();
        }
    }

    @Override // defpackage.eao
    public final void af(ebf ebfVar) {
        ebf ebfVarAO;
        aG();
        ezk ezkVar = this.M;
        ezkVar.n();
        ebf ebfVarO = O();
        if (this.Z) {
            this.aa = ebfVar.an;
            ebfVarAO = aO(ebfVar, this.ab.b);
        } else {
            ebfVarAO = ebfVar;
        }
        if (!ebfVarAO.equals(ezkVar.c())) {
            ezkVar.k(ebfVarAO);
        }
        if (ebfVarO.equals(ebfVar)) {
            return;
        }
        this.H.h(19, new ein(ebfVar, 8));
    }

    @Override // defpackage.eao
    public final void ag(Surface surface) {
        aG();
        aW();
        aC(surface);
        int i = surface == null ? 0 : -1;
        ay(i, i);
    }

    @Override // defpackage.eao
    public final void ah(SurfaceView surfaceView) {
        aG();
        if (surfaceView instanceof fbt) {
            aW();
            aC(surfaceView);
            aY(surfaceView.getHolder());
            return;
        }
        if (surfaceView instanceof fcs) {
            aW();
            this.af = (fcs) surfaceView;
            eka ekaVarAx = ax(this.j);
            ekaVarAx.e(WVMediaCrypto.TYPE);
            ekaVarAx.d(this.af);
            ekaVarAx.c();
            this.af.a.add(this.V);
            aC(this.af.e);
            aY(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        aG();
        if (holder == null) {
            U();
            return;
        }
        aW();
        this.t = true;
        this.s = holder;
        holder.addCallback(this.V);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            aC(null);
            ay(0, 0);
        } else {
            aC(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            ay(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.eao
    public final void ai(TextureView textureView) {
        aG();
        if (textureView == null) {
            U();
            return;
        }
        aW();
        this.u = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            edb.e("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.V);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            aC(null);
            ay(0, 0);
        } else {
            aB(surfaceTexture);
            ay(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // defpackage.eao
    public final void aj(float f) {
        aG();
        final float fA = edt.a(f, 0.0f, 1.0f);
        if (this.w == fA) {
            return;
        }
        this.w = fA;
        eje ejeVar = this.f;
        ejeVar.d.h(32, Float.valueOf(fA)).l();
        this.H.h(22, new ecw() { // from class: eio
            @Override // defpackage.ecw
            public final void a(Object obj) {
                int i = eiz.J;
                ((eam) obj).D(fA);
            }
        });
    }

    @Override // defpackage.eao
    public final void ak() {
        aG();
        aZ(null);
        this.y = new ecb(ImmutableList.of(), this.D.s);
    }

    @Override // defpackage.eao
    public final boolean al() {
        aG();
        return this.D.l;
    }

    @Override // defpackage.eao
    public final boolean am() {
        aG();
        return this.Y;
    }

    @Override // defpackage.eao
    public final boolean an() {
        aG();
        return this.D.c.b();
    }

    @Override // defpackage.eao
    public final void ao(List list) {
        aG();
        aA(aU(list), true);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final eka ap(ejz ejzVar) {
        aG();
        return ax(ejzVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void aq(ekm ekmVar) {
        this.G.L(ekmVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void ar() {
        edb.h("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0-alpha01] [" + edt.a + "] [" + dzz.a() + "]");
        aG();
        this.an.a(false);
        this.am.a(false);
        eje ejeVar = this.f;
        int i = 1;
        if (!ejeVar.i && ejeVar.e.getThread().isAlive()) {
            ejeVar.i = true;
            ecn ecnVar = ejeVar.f;
            shx shxVar = new shx();
            ejeVar.d.h(7, shxVar).l();
            long j = ejeVar.h;
            if (!shxVar.e(500L)) {
                this.H.h(10, new eit(i));
            }
        }
        this.H.f();
        this.e.e();
        ezm ezmVar = this.R;
        ele eleVar = this.G;
        ezmVar.e(eleVar);
        ejx ejxVar = this.D;
        if (ejxVar.p) {
            this.D = ejxVar.b();
        }
        ejx ejxVarAQ = aQ(this.D, 1);
        this.D = ejxVarAQ;
        ejx ejxVarD = ejxVarAQ.d(ejxVarAQ.c);
        this.D = ejxVarD;
        ejxVarD.q = ejxVarD.s;
        this.D.r = 0L;
        ecu ecuVar = eleVar.e;
        eci.e(ecuVar);
        ecuVar.d(new caw(eleVar, 19));
        aW();
        Surface surface = this.ae;
        if (surface != null) {
            surface.release();
            this.ae = null;
        }
        if (this.al) {
            nuh nuhVar = this.ap;
            nuhVar.getClass();
            nuhVar.p(this.ak);
            this.al = false;
        }
        this.y = ecb.a;
        this.z = true;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void as(ewb ewbVar) {
        aG();
        List listSingletonList = Collections.singletonList(ewbVar);
        aG();
        aA(listSingletonList, true);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void at(int i) {
        aG();
        this.ag = i;
        az(2, 4, Integer.valueOf(i));
    }

    public final long au(eay eayVar, evz evzVar, long j) {
        Object obj = evzVar.a;
        eav eavVar = this.O;
        eayVar.o(obj, eavVar);
        return j + eavVar.j;
    }

    public final eab av() {
        eay eayVarN = N();
        if (eayVarN.q()) {
            return this.C;
        }
        dzy dzyVar = eayVarN.p(bd(), this.a).q;
        eaa eaaVar = new eaa(this.C);
        eab eabVar = dzyVar.e;
        if (eabVar != null) {
            CharSequence charSequence = eabVar.b;
            if (charSequence != null) {
                eaaVar.a = charSequence;
            }
            CharSequence charSequence2 = eabVar.c;
            if (charSequence2 != null) {
                eaaVar.b = charSequence2;
            }
            CharSequence charSequence3 = eabVar.d;
            if (charSequence3 != null) {
                eaaVar.c = charSequence3;
            }
            CharSequence charSequence4 = eabVar.e;
            if (charSequence4 != null) {
                eaaVar.d = charSequence4;
            }
            CharSequence charSequence5 = eabVar.f;
            if (charSequence5 != null) {
                eaaVar.e = charSequence5;
            }
            CharSequence charSequence6 = eabVar.g;
            if (charSequence6 != null) {
                eaaVar.f = charSequence6;
            }
            CharSequence charSequence7 = eabVar.h;
            if (charSequence7 != null) {
                eaaVar.g = charSequence7;
            }
            Long l = eabVar.i;
            if (l != null) {
                eaaVar.c(l);
            }
            eaq eaqVar = eabVar.j;
            if (eaqVar != null) {
                eaaVar.i = eaqVar;
            }
            eaq eaqVar2 = eabVar.k;
            if (eaqVar2 != null) {
                eaaVar.j = eaqVar2;
            }
            Uri uri = eabVar.n;
            if (uri != null || eabVar.l != null) {
                eaaVar.m = uri;
                eaaVar.b(eabVar.l, eabVar.m);
            }
            Integer num = eabVar.o;
            if (num != null) {
                eaaVar.n = num;
            }
            Integer num2 = eabVar.p;
            if (num2 != null) {
                eaaVar.o = num2;
            }
            Integer num3 = eabVar.q;
            if (num3 != null) {
                eaaVar.p = num3;
            }
            Boolean bool = eabVar.r;
            if (bool != null) {
                eaaVar.q = bool;
            }
            Boolean bool2 = eabVar.s;
            if (bool2 != null) {
                eaaVar.r = bool2;
            }
            Integer num4 = eabVar.t;
            if (num4 != null) {
                eaaVar.s = num4;
            }
            Integer num5 = eabVar.u;
            if (num5 != null) {
                eaaVar.s = num5;
            }
            Integer num6 = eabVar.v;
            if (num6 != null) {
                eaaVar.t = num6;
            }
            Integer num7 = eabVar.w;
            if (num7 != null) {
                eaaVar.u = num7;
            }
            Integer num8 = eabVar.x;
            if (num8 != null) {
                eaaVar.v = num8;
            }
            Integer num9 = eabVar.y;
            if (num9 != null) {
                eaaVar.w = num9;
            }
            Integer num10 = eabVar.z;
            if (num10 != null) {
                eaaVar.x = num10;
            }
            CharSequence charSequence8 = eabVar.A;
            if (charSequence8 != null) {
                eaaVar.y = charSequence8;
            }
            CharSequence charSequence9 = eabVar.B;
            if (charSequence9 != null) {
                eaaVar.z = charSequence9;
            }
            CharSequence charSequence10 = eabVar.C;
            if (charSequence10 != null) {
                eaaVar.A = charSequence10;
            }
            Integer num11 = eabVar.D;
            if (num11 != null) {
                eaaVar.B = num11;
            }
            Integer num12 = eabVar.E;
            if (num12 != null) {
                eaaVar.C = num12;
            }
            CharSequence charSequence11 = eabVar.F;
            if (charSequence11 != null) {
                eaaVar.D = charSequence11;
            }
            CharSequence charSequence12 = eabVar.G;
            if (charSequence12 != null) {
                eaaVar.E = charSequence12;
            }
            CharSequence charSequence13 = eabVar.H;
            if (charSequence13 != null) {
                eaaVar.F = charSequence13;
            }
            Integer num13 = eabVar.I;
            if (num13 != null) {
                eaaVar.G = num13;
            }
            Bundle bundle = eabVar.J;
            if (bundle != null) {
                eaaVar.H = bundle;
            }
            ImmutableList immutableList = eabVar.K;
            if (!immutableList.isEmpty()) {
                eaaVar.d(immutableList);
            }
        }
        return new eab(eaaVar);
    }

    public final eii aw() {
        aG();
        return this.D.g;
    }

    public final eka ax(ejz ejzVar) {
        aH(this.D);
        eay eayVar = this.D.b;
        eje ejeVar = this.f;
        return new eka(ejeVar, ejzVar, ejeVar.e);
    }

    public final void ay(final int i, final int i2) {
        edk edkVar = this.ah;
        if (i == edkVar.b && i2 == edkVar.c) {
            return;
        }
        this.ah = new edk(i, i2);
        this.H.h(24, new ecw() { // from class: eip
            @Override // defpackage.ecw
            public final void a(Object obj) {
                int i3 = eiz.J;
                ((eam) obj).y(i, i2);
            }
        });
        az(2, 14, new edk(i, i2));
    }

    public final void az(int i, int i2, Object obj) {
        for (ekc ekcVar : this.K) {
            if (i == -1 || ekcVar.dk() == i) {
                eka ekaVarAx = ax(ekcVar);
                ekaVarAx.e(i2);
                ekaVarAx.d(obj);
                ekaVarAx.c();
            }
        }
        for (ekc ekcVar2 : this.L) {
            if (ekcVar2 != null && (i == -1 || ekcVar2.dk() == i)) {
                eka ekaVarAx2 = ax(ekcVar2);
                ekaVarAx2.e(i2);
                ekaVarAx2.d(obj);
                ekaVarAx2.c();
            }
        }
    }

    @Override // defpackage.eao
    public final int bb() {
        aG();
        if (an()) {
            return this.D.c.b;
        }
        return -1;
    }

    @Override // defpackage.eao
    public final int bc() {
        aG();
        if (an()) {
            return this.D.c.c;
        }
        return -1;
    }

    @Override // defpackage.eao
    public final int bd() {
        aG();
        int iAH = aH(this.D);
        if (iAH == -1) {
            return 0;
        }
        return iAH;
    }

    @Override // defpackage.eao
    public final int be() {
        aG();
        if (this.D.b.q()) {
            return 0;
        }
        ejx ejxVar = this.D;
        return ejxVar.b.a(ejxVar.c.a);
    }

    @Override // defpackage.eao
    public final int bf() {
        aG();
        return this.D.f;
    }

    @Override // defpackage.eao
    public final int bg() {
        aG();
        return this.D.n;
    }

    @Override // defpackage.eao
    public final int bh() {
        aG();
        return this.X;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        aG();
        return this.Z;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        aG();
        az(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        ebf ebfVarAO;
        aG();
        if (z == this.Z) {
            return;
        }
        this.Z = z;
        if (!this.ab.b.isEmpty()) {
            ezk ezkVar = this.M;
            ezkVar.n();
            ebf ebfVarC = ezkVar.c();
            if (z) {
                this.aa = ebfVarC.an;
                ebfVarAO = aO(ebfVarC, this.ab.b);
            } else {
                eyu eyuVar = new eyu((eyv) ebfVarC);
                eyuVar.s(this.aa);
                eyv eyvVar = new eyv(eyuVar);
                this.aa = null;
                ebfVarAO = eyvVar;
            }
            if (!ebfVarAO.equals(ebfVarC)) {
                ezkVar.k(ebfVarAO);
            }
        }
        eje ejeVar = this.f;
        ejeVar.d.h(36, Boolean.valueOf(z)).l();
        ejx ejxVar = this.D;
        aD(ejxVar.l, ejxVar.m);
    }

    @Override // defpackage.dyq
    public final void v(int i, long j, boolean z) {
        aG();
        if (i == -1) {
            return;
        }
        a.H(i >= 0);
        eay eayVar = this.D.b;
        if (eayVar.q() || i < eayVar.c()) {
            this.G.M();
            this.l++;
            if (an()) {
                edb.e("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                ejd ejdVar = new ejd(this.D);
                ejdVar.a(1);
                this.ar.s(ejdVar);
                return;
            }
            ejx ejxVarAQ = this.D;
            int i2 = ejxVarAQ.f;
            if (i2 == 3 || (i2 == 4 && !eayVar.q())) {
                ejxVarAQ = aQ(this.D, 2);
            }
            int iBd = bd();
            ejx ejxVarAR = aR(ejxVarAQ, eayVar, aM(eayVar, i, j));
            this.f.d.h(3, new erh(eayVar, i, edt.y(j))).l();
            aE(ejxVarAR, 0, true, 1, aJ(ejxVarAR), iBd, z);
        }
    }
}

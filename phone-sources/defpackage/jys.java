package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.support.v7.widget.RecyclerView;
import androidx.compose.foundation.layout.AspectRatioElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.videos.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jys {
    private static jys a;

    public jys() {
    }

    public static /* synthetic */ void A(nmp nmpVar, int i) {
        nmx nmxVar = nmpVar.a.b;
        if (nmxVar == null) {
            return;
        }
        try {
            nmxVar.c(new nve(i));
        } catch (RemoteException unused) {
            nsf.e();
        }
    }

    public static void B(nll nllVar) {
        if (nllVar.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(nllVar.d) && nllVar.d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(nllVar.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(nllVar.f) || nllVar.f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }

    public static String C(String str) {
        if (str != null) {
            return new mru(str, (Collection) null).e();
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }

    public static String N(nwu nwuVar) {
        nrs nrsVar = (nrs) nwuVar.k(nse.a);
        nrsVar.N();
        return nrsVar.f;
    }

    public static void O(nwu nwuVar, String str) throws IOException {
        try {
            ((nrs) nwuVar.k(nse.a)).q(str);
        } catch (RemoteException unused) {
            throw new IOException("service error");
        }
    }

    public static void P(nwu nwuVar, String str, nkl nklVar) throws IOException {
        try {
            nrs nrsVar = (nrs) nwuVar.k(nse.a);
            nrv.h(str);
            nrsVar.q(str);
            if (nklVar != null) {
                Map map = nrsVar.e;
                synchronized (map) {
                    map.put(str, nklVar);
                }
                nsa nsaVar = (nsa) nrsVar.L();
                if (nrsVar.w()) {
                    Context context = nrsVar.u;
                    nsaVar.d(str, ocv.q());
                }
            }
        } catch (RemoteException unused) {
            throw new IOException("service error");
        }
    }

    public static nwx Q(nwu nwuVar, String str, String str2) {
        return nwuVar.b(new nkc(nwuVar, str, str2));
    }

    public static nde R(int i) {
        switch (i) {
            case 0:
            case 5:
                return nde.o;
            case 1:
            case 8:
                return nde.b;
            case 2:
                return nde.p;
            case 3:
                return nde.s;
            case 4:
                return nde.c;
            case 6:
                return nde.B;
            case 7:
                return nde.u;
            default:
                throw new IllegalArgumentException(a.cf(i, "bad state group: "));
        }
    }

    public static nde S(int i) {
        switch (i) {
            case 0:
            case 8:
                return nde.b;
            case 1:
                return nde.n;
            case 2:
                return nde.r;
            case 3:
            case 7:
                return nde.t;
            case 4:
                return nde.e;
            case 5:
                return nde.y;
            case 6:
                return nde.D;
            default:
                throw new IllegalArgumentException(a.cf(i, "bad state group: "));
        }
    }

    public static nde T(int i) {
        switch (i) {
            case 0:
                return nde.b;
            case 1:
                return nde.f;
            case 2:
                return nde.g;
            case 3:
                return nde.i;
            case 4:
                return nde.l;
            case 5:
                return nde.m;
            case 6:
                return nde.q;
            case 7:
            case 13:
                return nde.v;
            case 8:
                return nde.d;
            case 9:
                return nde.k;
            case 10:
                return nde.w;
            case 11:
                return nde.z;
            case 12:
                return nde.C;
            case 14:
                return nde.A;
            case 15:
                return nde.h;
            case 16:
                return nde.j;
            default:
                return nde.x;
        }
    }

    public static int U(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 9:
            case 15:
            case 16:
                return 0;
            case 4:
            case 5:
                return 1;
            case 6:
                return 2;
            case 7:
                return 3;
            case 8:
                return 4;
            case 10:
            case 11:
            case 14:
            default:
                return 5;
            case 12:
                return 6;
            case 13:
                return 7;
        }
    }

    public static /* synthetic */ void V(ndm ndmVar) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            ndl next = it.next();
            next.j(nde.a[ndmVar.c(next)]);
        }
    }

    public static /* synthetic */ void W(ndm ndmVar) {
        Iterator<ndl> it = ndmVar.iterator();
        while (it.hasNext()) {
            it.next().j(0.0f);
        }
    }

    public static /* synthetic */ nbs X(vtw vtwVar) {
        vuc vucVarR = vtwVar.r();
        vucVarR.getClass();
        return (nbs) vucVarR;
    }

    public static void Y(ubz ubzVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        nbs nbsVar = (nbs) vtwVar.b;
        nbs nbsVar2 = nbs.a;
        nbsVar.c = ubzVar;
        nbsVar.b |= 1;
    }

    public static void Z(vsz vszVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        nbs nbsVar = (nbs) vtwVar.b;
        nbs nbsVar2 = nbs.a;
        nbsVar.b |= 2;
        nbsVar.d = vszVar;
    }

    public static void a(final bkp bkpVar, final wnu wnuVar, final boolean z, final boolean z2, final boolean z3, final yjk yjkVar, bao baoVar, final int i) {
        int i2;
        boolean z4;
        bao baoVar2;
        bkpVar.getClass();
        yjkVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1653919715);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(wnuVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.G(z2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            z4 = z3;
            i2 |= true != baoVarD.G(z4) ? 8192 : 16384;
        } else {
            z4 = z3;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            bvt bvtVarA = zf.a(xk.a, bkb.n, baoVarD, 48);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar2 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            yjz yjzVar = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar);
            yjz yjzVar2 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar2);
            yjz yjzVar3 = bxt.e;
            int i4 = i2;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar3);
            }
            yjz yjzVar4 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar4);
            baoVarD.x(5004770);
            int i5 = i4 & 458752;
            Object objT = basVar.T();
            if (i5 == 131072 || objT == ban.a) {
                objT = new jwz(yjkVar, 18);
                basVar.ae(objT);
            }
            basVar.aa();
            wv.E(z4, (yjk) objT, null, false, null, baoVarD, (i4 >> 12) & 14);
            bkm bkmVar = bkp.g;
            bvt bvtVarA2 = xu.a(xk.c, bkb.j, baoVarD, 0);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkmVar);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar2);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar);
            beb.a(baoVarD, bhuVarAi2, yjzVar2);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK2))) {
                Integer numValueOf2 = Integer.valueOf(iK2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar3);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar4);
            baoVarD.x(198141990);
            String strW = !z2 ? wnuVar.b : ccf.w(R.string.allow_all, baoVarD);
            basVar.aa();
            strW.getClass();
            axa.b(strW, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVarD).j, baoVarD, 0, 0, 131070);
            baoVarD.x(198147433);
            if (z || z2) {
                baoVar2 = baoVarD;
                axa.b(ccf.w(z ? R.string.most_restrictive : R.string.least_restrictive, baoVarD), null, wv.K(baoVarD).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVarD).j, baoVar2, 0, 0, 131066);
            } else {
                baoVar2 = baoVarD;
            }
            basVar.aa();
            baoVar2.o();
            baoVar2.o();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: jyo
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bkp bkpVar2 = bkpVar;
                    wnu wnuVar2 = wnuVar;
                    boolean z5 = z;
                    boolean z6 = z2;
                    boolean z7 = z3;
                    jys.a(bkpVar2, wnuVar2, z5, z6, z7, yjkVar, (bao) obj, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static boolean aa(String str) {
        return str.length() > 4;
    }

    public static ksx ab(kwi kwiVar) {
        return ksx.a((List) kwiVar.j().h(Collections.EMPTY_LIST));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(defpackage.bao r10, int r11) {
        /*
            r0 = 2134641773(0x7f3c0c6d, float:2.4995938E38)
            bao r8 = r10.d(r0)
            r10 = 0
            if (r11 != 0) goto L16
            boolean r11 = r8.K()
            if (r11 != 0) goto L12
            r11 = r10
            goto L16
        L12:
            r8.t()
            goto L87
        L16:
            bkm r0 = defpackage.bkp.g
            bkp r0 = defpackage.zi.i(r0)
            java.lang.String r1 = "loading_spinner"
            bkp r0 = defpackage.ccf.d(r0, r1)
            bkd r1 = defpackage.bkb.e
            bvt r10 = defpackage.xo.a(r1, r10)
            long r1 = defpackage.zy.p(r8)
            int r1 = defpackage.a.k(r1)
            r2 = r8
            bas r2 = (defpackage.bas) r2
            bhu r3 = r2.ai()
            bkp r0 = defpackage.bdi.C(r8, r0)
            yjk r4 = defpackage.bxt.a
            r8.z()
            boolean r5 = r2.w
            if (r5 == 0) goto L48
            r8.k(r4)
            goto L4b
        L48:
            r8.B()
        L4b:
            yjz r4 = defpackage.bxt.d
            defpackage.beb.a(r8, r10, r4)
            yjz r10 = defpackage.bxt.c
            defpackage.beb.a(r8, r3, r10)
            yjz r10 = defpackage.bxt.e
            boolean r3 = r2.w
            if (r3 != 0) goto L69
            java.lang.Object r3 = r2.T()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            boolean r3 = defpackage.yks.e(r3, r4)
            if (r3 != 0) goto L73
        L69:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.ae(r1)
            r8.i(r1, r10)
        L73:
            yjz r10 = defpackage.bxt.b
            defpackage.beb.a(r8, r0, r10)
            r7 = 0
            r9 = 0
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            defpackage.aoy.b(r1, r2, r4, r5, r7, r8, r9)
            r8.o()
            r10 = r11
        L87:
            bcr r11 = r8.M()
            if (r11 == 0) goto L95
            jtq r0 = new jtq
            r1 = 2
            r0.<init>(r10, r1)
            r11.d = r0
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jys.b(bao, int):void");
    }

    public static void c(ihw ihwVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        ihwVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(585919177);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(ihwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            if (ihwVar instanceof ihu) {
                krd.d("Could not load content ratings", ((ihu) ihwVar).a);
            } else if (ihwVar instanceof ihv) {
                krd.c("Could not loading content ratings ".concat(((ihv) ihwVar).a));
            }
            bkp bkpVarA = bkp.g.a(zi.c);
            bvt bvtVarA = xo.a(bkb.e, false);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarA);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            baoVar2 = baoVarD;
            axa.b(ccf.w(R.string.something_went_wrong, baoVarD), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, baoVar2, 0, 0, 262142);
            baoVar2.o();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(ihwVar, i, 15);
        }
    }

    public static void d(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(-382684464);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.G(false) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkpVar2 = bkp.g;
            baoVarD.x(1607426272);
            bol bolVarE = rdd.E(baoVarD);
            ((bas) baoVarD).aa();
            e(yjkVar, bolVarE, wv.K(baoVarD).I, wv.K(baoVarD).q, rdd.I(), wv.K(baoVarD).J, bkpVar2, baoVarD, ((i3 >> 3) & 14) | ((i3 << 3) & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i3 << 18) & 234881024));
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(yjkVar, bkpVar2, i, 9);
        }
    }

    public static void e(final yjk yjkVar, final bol bolVar, final long j, final long j2, final long j3, final long j4, final bkp bkpVar, bao baoVar, final int i) {
        int i2;
        long j5;
        bao baoVarD = baoVar.d(1593511877);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.G(false) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bolVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            j5 = j;
            i2 |= true != baoVarD.E(j5) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            j5 = j;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.E(j2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.E(j3) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i2 |= true != baoVarD.E(j4) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != baoVarD.C(32.0f) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 33554432 : 67108864;
        }
        if ((38347923 & i2) == 38347922 && baoVarD.K()) {
            baoVarD.t();
        } else {
            String string = ((Context) baoVarD.f(AndroidCompositionLocals_androidKt.b)).getString(R.string.cb_content_description_play);
            string.getClass();
            int i3 = i2;
            bkp bkpVarW = bga.w(ht.l(zi.e(bkpVar, j3), 1.0f, j4, bolVar), bolVar);
            ase aseVarG = rdd.G(j5, j2, baoVarD, 12);
            baoVarD = baoVarD;
            rdd.B(yjkVar, bkpVarW, false, bolVar, aseVarG, null, bga.k(683015333, new kgx(string, 5), baoVarD), baoVarD, ((i3 >> 3) & 14) | 1572864 | ((i3 << 3) & 7168), 36);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: kha
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    yjk yjkVar2 = yjkVar;
                    bol bolVar2 = bolVar;
                    long j6 = j;
                    long j7 = j2;
                    long j8 = j3;
                    long j9 = j4;
                    jys.e(yjkVar2, bolVar2, j6, j7, j8, j9, bkpVar, (bao) obj, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static void f(yjk yjkVar, boolean z, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bol bolVarB;
        bas basVar;
        long j;
        bkp bkpVar2;
        bao baoVarD = baoVar.d(-1027796494);
        if ((i & 6) == 0) {
            i2 = i | (true != baoVarD.H(yjkVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.G(z) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            if (z) {
                baoVarD.x(130056323);
                baoVarD.x(1025082713);
                bolVarB = pot.b(8, baoVarD);
                basVar = (bas) baoVarD;
                basVar.aa();
            } else {
                baoVarD.x(130055010);
                baoVarD.x(669872043);
                bolVarB = pot.b(7, baoVarD);
                basVar = (bas) baoVarD;
                basVar.aa();
            }
            basVar.aa();
            bkp bkpVarE = zi.e(bkmVar, a.j((a.r(2, 0) ? 24.0f : a.r(2, 1) ? 32.0f : a.r(2, 2) ? 48.0f : 0.0f) + 24.0f, 56.0f));
            if (z) {
                baoVarD.x(-262837935);
                j = wv.K(baoVarD).A;
                ((bas) baoVarD).aa();
            } else {
                baoVarD.x(-262920798);
                j = wv.K(baoVarD).J;
                ((bas) baoVarD).aa();
            }
            bkp bkpVarL = ht.l(bkpVarE, 1.0f, j, bolVarB);
            long j2 = wv.K(baoVarD).I;
            long j3 = wv.K(baoVarD).u;
            long j4 = wv.K(baoVarD).q;
            bol bolVar = bolVarB;
            long j5 = wv.K(baoVarD).v;
            baoVarD.x(-1535153843);
            long j6 = bnq.f;
            long jK = bny.k(bnq.d(j4), bnq.c(j4), bnq.b(j4), 0.38f, bnq.f(j4));
            arl arlVarK = wv.K(baoVarD);
            long j7 = ((bnq) baoVarD.f(arr.a)).h;
            ash ashVar = arlVarK.aa;
            if (ashVar == null) {
                ashVar = new ash(j6, j7, j6, bny.k(bnq.d(j7), bnq.c(j7), bnq.b(j7), 0.38f, bnq.f(j7)), j6, arm.e(arlVarK, 26));
                arlVarK.aa = ashVar;
            }
            if (j2 == 16) {
                j2 = ashVar.a;
            }
            long j8 = j2;
            long j9 = j4 == 16 ? ashVar.b : j4;
            long j10 = j6 != 16 ? j6 : ashVar.c;
            long j11 = jK != 16 ? jK : ashVar.d;
            if (j3 == 16) {
                j3 = ashVar.e;
            }
            long j12 = j3;
            if (j5 == 16) {
                j5 = ashVar.f;
            }
            ash ashVar2 = new ash(j8, j9, j10, j11, j12, j5);
            bas basVar2 = (bas) baoVarD;
            basVar2.aa();
            baoVarD.x(5004770);
            int i4 = i3 & 14;
            Object objT = basVar2.T();
            if (i4 == 4 || objT == ban.a) {
                objT = new kah(yjkVar, 18);
                basVar2.ae(objT);
            }
            basVar2.aa();
            rdd.A(z, (yjv) objT, bkpVarL, false, ashVar2, bolVar, bga.k(-191493761, new kgx(context, 4), baoVarD), baoVarD, ((i3 >> 3) & 14) | 12582912);
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new aly(yjkVar, z, bkpVar2, i, 3);
        }
    }

    public static void g(yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjk yjkVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(52358146);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            yjkVar2 = yjkVar;
        } else {
            bkpVar = bkp.g;
            yjkVar2 = yjkVar;
            rdd.B(yjkVar2, bga.w(ht.l(zi.d(bkpVar, 80.0f), 1.0f, wv.K(baoVarD).J, rdd.D(baoVarD)), rdd.D(baoVarD)), false, rdd.D(baoVarD), rdd.G(wv.K(baoVarD).I, wv.K(baoVarD).q, baoVarD, 12), null, bga.k(-430554910, new kgx((Context) baoVarD.f(AndroidCompositionLocals_androidKt.b), 3), baoVarD), baoVarD, (i3 & 14) | 1572864, 36);
            baoVarD = baoVarD;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new key(yjkVar2, bkpVar, i, 8);
        }
    }

    public static void h(yjz yjzVar, yjz yjzVar2, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjzVar.getClass();
        yjzVar2.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1370584360);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            rdd.q(yjzVar, yjzVar2, bkpVar, 0.0f, baoVarD, i2 & 1022);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe((Object) yjzVar, (Object) yjzVar2, (Object) bkpVar, i, 6);
        }
    }

    public static void i(kox koxVar, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        yjkVar.getClass();
        bao baoVarD = baoVar.d(-566008397);
        if ((i & 6) == 0) {
            i2 = i | (true != baoVarD.F(koxVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            yy yyVar = koy.a;
            long j = koxVar.d;
            og.x(yjkVar, ht.l(bkmVar, 1.0f, bny.k(bnq.d(j), bnq.c(j), bnq.b(j), 0.32f, bnq.f(j)), koy.c), false, null, og.C(bnq.f, 0L, 0L, 0L, baoVarD, 14), null, null, bga.k(1469968734, new khb(koxVar, 12), baoVarD), baoVarD, ((i3 >> 3) & 14) | 100663296, 236);
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia((Object) koxVar, (Object) yjkVar, bkpVar2, i, 19);
        }
    }

    public static void j(bkp bkpVar, kox koxVar, bao baoVar, int i) {
        bkp bkpVar2;
        bao baoVarD = baoVar.d(-962297794);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(koxVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkpVar2 = bkp.g;
            bvt bvtVarA = zf.a(xk.e(8.0f), bkb.n, baoVarD, 54);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar2);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            String str = koxVar.c;
            bkp bkpVarW = bga.w(bkpVar2, aep.a);
            yy yyVar = koy.a;
            knh.d(str, zi.d(bkpVarW, koy.b), null, null, baoVarD, 384, 24);
            axa.b(koxVar.a, null, koxVar.d, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, wv.N(baoVarD).j, baoVarD, 0, 24576, 114682);
            baoVarD = baoVarD;
            zy.k(zh.a(bkpVar2, 1.0f, true), baoVarD);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(bkpVar2, (Object) koxVar, i, 14);
        }
    }

    public static void k(wqo wqoVar, long j, bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        long j2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1187018983);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(wqoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= true != baoVarD.E(j2) ? 16 : 32;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            int i4 = i2 >> 3;
            p(j2, bkpVar, bga.k(-1247653329, new kie(jwq.q(wqoVar), 12), baoVarD), yjzVar, baoVarD, (i4 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 14) | 384 | (i2 & 7168), 0);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new koq(wqoVar, j, bkpVar, yjzVar, i, 4);
        }
    }

    public static void l(wtt wttVar, long j, bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        long j2;
        yjz yjzVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1442485718);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(wttVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.E(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            yjzVar2 = yjzVar;
            j2 = j;
        } else {
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new bcf(0);
                basVar.ae(objT);
            }
            bdn bdnVar = (bdn) objT;
            basVar.aa();
            float fCp = ((clx) baoVarD.f(ccq.d)).cp(bdnVar.e());
            bkp bkpVarD = ccf.d(hq.f(bkpVar.a(zi.c), j, boh.a), "story_background_poster");
            bkd bkdVar = bkb.a;
            bvt bvtVarA = xo.a(bkdVar, false);
            int iK = a.k(zy.p(baoVarD));
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarD);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            int i4 = i2;
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            yjz yjzVar3 = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar3);
            yjz yjzVar4 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar4);
            yjz yjzVar5 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar5);
            }
            yjz yjzVar6 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar6);
            bkm bkmVar = bkp.g;
            yy yyVar = kot.a;
            bkp bkpVarO = wv.o(bkmVar, kot.a);
            bvt bvtVarA2 = xo.a(bkdVar, false);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarO);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar3);
            beb.a(baoVarD, bhuVarAi2, yjzVar4);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK2))) {
                Integer numValueOf2 = Integer.valueOf(iK2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar5);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar6);
            xs xsVar = xs.a;
            bvt bvtVarA3 = zf.a(xk.a, bkb.m, baoVarD, 0);
            int iK3 = a.k(zy.p(baoVarD));
            bhu bhuVarAi3 = basVar.ai();
            bkp bkpVarC3 = bdi.C(baoVarD, bkmVar);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA3, yjzVar3);
            beb.a(baoVarD, bhuVarAi3, yjzVar4);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK3))) {
                Integer numValueOf3 = Integer.valueOf(iK3);
                basVar.ae(numValueOf3);
                baoVarD.i(numValueOf3, yjzVar5);
            }
            beb.a(baoVarD, bkpVarC3, yjzVar6);
            wlx wlxVar = wttVar.c;
            if (wlxVar == null) {
                wlxVar = wlx.a;
            }
            wlw wlwVar = wlxVar.b == 3 ? (wlw) wlxVar.c : wlw.a;
            wlwVar.getClass();
            bkp bkpVarA = zi.a(bga.w(bkmVar, kot.e), 0.4919f).a(new AspectRatioElement(1.0f));
            baoVarD.x(5004770);
            Object objT2 = basVar.T();
            int i5 = 9;
            if (objT2 == obj) {
                objT2 = new kij(bdnVar, i5);
                basVar.ae(objT2);
            }
            basVar.aa();
            knh.c(wlwVar, fh.S(bkpVarA, (yjv) objT2), null, baoVarD, 432, 8);
            bkp bkpVarO2 = wv.o(bkmVar, kot.b);
            float f = kot.c;
            bkp bkpVarF = hq.f(bga.w(bkpVarO2, aep.a(f)), j, aep.a(f));
            bvt bvtVarA4 = xo.a(bkdVar, false);
            int iK4 = a.k(zy.p(baoVarD));
            bhu bhuVarAi4 = basVar.ai();
            bkp bkpVarC4 = bdi.C(baoVarD, bkpVarF);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA4, yjzVar3);
            beb.a(baoVarD, bhuVarAi4, yjzVar4);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK4))) {
                Integer numValueOf4 = Integer.valueOf(iK4);
                basVar.ae(numValueOf4);
                baoVarD.i(numValueOf4, yjzVar5);
            }
            beb.a(baoVarD, bkpVarC4, yjzVar6);
            wlx wlxVar2 = wttVar.d;
            if (wlxVar2 == null) {
                wlxVar2 = wlx.a;
            }
            wlw wlwVar2 = wlxVar2.b == 3 ? (wlw) wlxVar2.c : wlw.a;
            wlwVar2.getClass();
            j2 = j;
            knh.c(wlwVar2, bga.w(zi.a(wv.p(bkmVar, 8.0f), 1.0f), aep.a(20.0f)).a(new AspectRatioElement(0.6666667f)), null, baoVarD, 384, 8);
            baoVarD.o();
            baoVarD.o();
            bkp bkpVarF2 = hq.f(zi.a(bga.w(wv.v(xsVar.a(bkmVar, bkb.g), kot.d, fCp, 0.0f, 0.0f, 12), aep.a(f)), 0.601f), j2, aep.a(f));
            bvt bvtVarA5 = xo.a(bkdVar, false);
            int iK5 = a.k(zy.p(baoVarD));
            bhu bhuVarAi5 = basVar.ai();
            bkp bkpVarC5 = bdi.C(baoVarD, bkpVarF2);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA5, yjzVar3);
            beb.a(baoVarD, bhuVarAi5, yjzVar4);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK5))) {
                Integer numValueOf5 = Integer.valueOf(iK5);
                basVar.ae(numValueOf5);
                baoVarD.i(numValueOf5, yjzVar5);
            }
            beb.a(baoVarD, bkpVarC5, yjzVar6);
            wlx wlxVar3 = wttVar.e;
            if (wlxVar3 == null) {
                wlxVar3 = wlx.a;
            }
            wlw wlwVar3 = wlxVar3.b == 3 ? (wlw) wlxVar3.c : wlw.a;
            wlwVar3.getClass();
            knh.c(wlwVar3, bga.w(zi.a(wv.p(bkmVar, 8.0f), 1.0f).a(new AspectRatioElement(1.7777778f)), aep.a(20.0f)), null, baoVarD, 384, 8);
            baoVarD.o();
            baoVarD.o();
            yjzVar2 = yjzVar;
            yjzVar2.a(baoVarD, Integer.valueOf((i4 >> 9) & 14));
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new koq(wttVar, j2, bkpVar, yjzVar2, i, 3);
        }
    }

    public static void m(wqo wqoVar, long j, bkp bkpVar, float f, yjz yjzVar, bao baoVar, int i) {
        wqo wqoVar2;
        int i2;
        yjz yjzVar2;
        float f2;
        bao baoVarD = baoVar.d(28857921);
        if ((i & 6) == 0) {
            wqoVar2 = wqoVar;
            i2 = (true != baoVarD.F(wqoVar2) ? 2 : 4) | i;
        } else {
            wqoVar2 = wqoVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.E(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            yjzVar2 = yjzVar;
            i3 |= true != baoVarD.H(yjzVar2) ? 8192 : 16384;
        } else {
            yjzVar2 = yjzVar;
        }
        if ((i3 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
            f2 = f;
        } else {
            int i4 = i3 >> 3;
            p(j, bkpVar, bga.k(1491909207, new kie(jwq.q(wqoVar2), 11), baoVarD), yjzVar2, baoVarD, (i4 & 14) | 384 | (i4 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 7168), 0);
            f2 = 1.0f;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new koz(wqoVar, j, bkpVar, f2, yjzVar, i, 1);
        }
    }

    public static void n(wqo wqoVar, long j, bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        long j2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1949075759);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(wqoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= true != baoVarD.E(j2) ? 16 : 32;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            int i4 = i2 >> 3;
            p(j2, bkpVar, bga.k(278514279, new kie(jwq.q(wqoVar), 10), baoVarD), yjzVar, baoVarD, (i4 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 14) | 384 | (i2 & 7168), 0);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new koq(wqoVar, j, bkpVar, yjzVar, i, 2);
        }
    }

    public static void o(wqo wqoVar, long j, bkp bkpVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        long j2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1715613493);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(wqoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= true != baoVarD.E(j2) ? 16 : 32;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            int i4 = i2 >> 3;
            p(j2, bkpVar, bga.k(-252562207, new kie(jwq.q(wqoVar), 9), baoVarD), yjzVar, baoVarD, (i4 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 14) | 384 | (i2 & 7168), 0);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new koq(wqoVar, j, bkpVar, yjzVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(long r15, defpackage.bkp r17, defpackage.yjz r18, defpackage.yjz r19, defpackage.bao r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jys.p(long, bkp, yjz, yjz, bao, int, int):void");
    }

    public static void q(bkp bkpVar, bnn bnnVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(425904709);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bnnVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            xo.b(hq.g(zi.a(bkpVar, 1.0f).a(new AspectRatioElement(0.6666667f)), bnnVar, null, 6), baoVarD, 0);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kid(bkpVar, (Object) bnnVar, i, 10);
        }
    }

    public static void r(final int i, final int i2, final bkp bkpVar, int i3, long j, long j2, float f, float f2, yjv yjvVar, yjk yjkVar, bao baoVar, final int i4, final int i5) {
        int i6;
        int i7;
        final long j3;
        final int i8;
        final float f3;
        final float f4;
        final yjv yjvVar2;
        final yjk yjkVar2;
        final long j4;
        bao baoVarD = baoVar.d(-1186003316);
        if ((i4 & 6) == 0) {
            i6 = (true != baoVarD.D(i) ? 2 : 4) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= true != baoVarD.D(i2) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i6 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        int i9 = i5 | 54;
        int i10 = i6 | 920349696;
        if ((306783379 & i10) == 306783378 && (i9 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            i8 = i3;
            j4 = j;
            j3 = j2;
            f3 = f;
            f4 = f2;
            yjvVar2 = yjvVar;
            yjkVar2 = yjkVar;
        } else {
            long j5 = kok.a;
            long j6 = kok.a;
            long j7 = kok.b;
            float f5 = kok.d;
            float f6 = kok.c;
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new kil(10);
                basVar.ae(objT);
            }
            yjv yjvVar3 = (yjv) objT;
            basVar.aa();
            baoVarD.x(1849434622);
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                i7 = i10;
                objT2 = new jzm(15);
                basVar.ae(objT2);
            } else {
                i7 = i10;
            }
            yjk yjkVar3 = (yjk) objT2;
            basVar.aa();
            baoVarD.x(5004770);
            int i11 = i7 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            Object objT3 = basVar.T();
            if (i11 == 32 || objT3 == obj) {
                objT3 = new bcf(i2);
                basVar.ae(objT3);
            }
            bdn bdnVar = (bdn) objT3;
            basVar.aa();
            baoVarD.x(5004770);
            Object objT4 = basVar.T();
            if (i11 == 32 || objT4 == obj) {
                objT4 = ms.a(0.0f);
                basVar.ae(objT4);
            }
            basVar.aa();
            bvt bvtVarA = zf.a(xk.a, bkb.m, baoVarD, 0);
            int iK = a.k(zy.p(baoVarD));
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar4 = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar4);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Object objValueOf = Integer.valueOf(iK);
                basVar.ae(objValueOf);
                baoVarD.i(objValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            baoVarD.x(692045304);
            int i12 = 0;
            while (i12 < i) {
                bdnVar.e();
                final float f7 = i12 > bdnVar.e() ? 0.0f : 1.0f;
                bkp bkpVarB = zi.b(wv.p(zh.a(bkp.g, 1.0f, true), f6), f5);
                baoVarD.x(1849434622);
                Object objT5 = basVar.T();
                if (objT5 == obj) {
                    objT5 = new kil(11);
                    basVar.ae(objT5);
                }
                basVar.aa();
                bkp bkpVarB2 = cfd.b(bkpVarB, false, (yjv) objT5);
                baoVarD.x(5004770);
                boolean zC = baoVarD.C(f7);
                Object objT6 = basVar.T();
                if (zC || objT6 == obj) {
                    objT6 = new yjk() { // from class: kol
                        @Override // defpackage.yjk
                        public final Object a() {
                            return Float.valueOf(f7);
                        }
                    };
                    basVar.ae(objT6);
                }
                yjk yjkVar5 = (yjk) objT6;
                basVar.aa();
                baoVarD.x(1849434622);
                Object objT7 = basVar.T();
                int i13 = 12;
                if (objT7 == obj) {
                    objT7 = new kil(i13);
                    basVar.ae(objT7);
                }
                basVar.aa();
                int i14 = i7 >> 12;
                long j8 = j7;
                atj.a(yjkVar5, bkpVarB2, j6, j8, (yjv) objT7, baoVarD, (i14 & 7168) | (i14 & 896) | 1769472);
                i12++;
                j7 = j8;
            }
            basVar.aa();
            baoVarD.x(692066670);
            basVar.aa();
            baoVarD.o();
            j3 = j7;
            i8 = 5000;
            f3 = f5;
            f4 = f6;
            yjvVar2 = yjvVar3;
            yjkVar2 = yjkVar3;
            j4 = j6;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: kom
                @Override // defpackage.yjz
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i15 = i;
                    int i16 = i2;
                    bkp bkpVar2 = bkpVar;
                    int i17 = i8;
                    long j9 = j4;
                    long j10 = j3;
                    float f8 = f3;
                    float f9 = f4;
                    yjv yjvVar4 = yjvVar2;
                    int i18 = i4;
                    jys.r(i15, i16, bkpVar2, i17, j9, j10, f8, f9, yjvVar4, yjkVar2, (bao) obj2, bdi.n(i18 | 1), bdi.n(i5));
                    return ygi.a;
                }
            };
        }
    }

    public static void s(bcb bcbVar, kob kobVar) {
        bcbVar.b(kobVar);
    }

    public static void t(bnn bnnVar, bao baoVar, int i) {
        int i2;
        bnnVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(120247123);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bnnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
        } else {
            xo.b(ccf.d(hq.g(bkp.g.a(zi.c), bnnVar, null, 6), "touch_feedback_scrim"), baoVarD, 0);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kny(bnnVar, i, i4);
        }
    }

    public static void u(bkp bkpVar, yjk yjkVar, String str, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(755906696);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(str) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.x(5004770);
            int i4 = i2 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (i4 == 32 || objT == ban.a) {
                objT = new kih(yjkVar, 11);
                basVar.ae(objT);
            }
            basVar.aa();
            bkp bkpVarU = hu.u(bkpVar, false, null, (yjk) objT, 15);
            baoVarD.x(5004770);
            int i5 = i2 & 896;
            Object objT2 = basVar.T();
            if (i5 == 256 || objT2 == ban.a) {
                objT2 = new kij(str, 8);
                basVar.ae(objT2);
            }
            basVar.aa();
            xo.b(cfd.b(bkpVarU, false, (yjv) objT2), baoVarD, 0);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia(bkpVar, yjkVar, str, i, 15);
        }
    }

    public static void v(bhi bhiVar, bdn bdnVar, int i, yjz yjzVar, yjz yjzVar2, yjz yjzVar3, yjk yjkVar, yjk yjkVar2, bkp bkpVar, boolean z, yy yyVar, yjz yjzVar4, bao baoVar, int i2, int i3) {
        int i4;
        bdn bdnVar2;
        int i5;
        yjz yjzVar5;
        yjz yjzVar6;
        yjk yjkVar3;
        yy yyVar2;
        int i6;
        bhiVar.getClass();
        bdnVar.getClass();
        yjzVar.getClass();
        yjzVar2.getClass();
        yjzVar3.getClass();
        yjkVar.getClass();
        yjkVar2.getClass();
        yjzVar4.getClass();
        int i7 = i2 & 6;
        bao baoVarD = baoVar.d(-299919504);
        if (i7 == 0) {
            i4 = (true != baoVarD.F(bhiVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            bdnVar2 = bdnVar;
            i4 |= true != baoVarD.F(bdnVar2) ? 16 : 32;
        } else {
            bdnVar2 = bdnVar;
        }
        if ((i2 & 384) == 0) {
            i5 = i;
            i4 |= true != baoVarD.D(i5) ? 128 : 256;
        } else {
            i5 = i;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != baoVarD.H(yjzVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 24576) == 0) {
            yjzVar5 = yjzVar2;
            i4 |= true != baoVarD.H(yjzVar5) ? 8192 : 16384;
        } else {
            yjzVar5 = yjzVar2;
        }
        if ((196608 & i2) == 0) {
            yjzVar6 = yjzVar3;
            i4 |= true != baoVarD.H(yjzVar6) ? 65536 : 131072;
        } else {
            yjzVar6 = yjzVar3;
        }
        if ((1572864 & i2) == 0) {
            yjkVar3 = yjkVar;
            i4 |= true != baoVarD.H(yjkVar3) ? 524288 : 1048576;
        } else {
            yjkVar3 = yjkVar;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != baoVarD.H(yjkVar2) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != baoVarD.F(bkpVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != baoVarD.G(z) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            yyVar2 = yyVar;
            i6 = i3 | (true != baoVarD.F(yyVar2) ? 2 : 4);
        } else {
            yyVar2 = yyVar;
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= true != baoVarD.H(yjzVar4) ? 16 : 32;
        }
        if ((306783379 & i4) == 306783378 && (i6 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                bci bciVar = new bci(kob.c, bcz.c);
                basVar.ae(bciVar);
                objT = bciVar;
            }
            basVar.aa();
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            baoVarD.v(-459811711, Integer.valueOf(bdnVar2.e()));
            yjz yjzVar7 = yjzVar6;
            yjk yjkVar4 = yjkVar3;
            wv.i(bkpVar.a(zi.c), null, false, bga.k(560281843, new koh(yjzVar, yyVar2, z, yjkVar4, yjkVar2, yjzVar7, yjzVar5, (bcb) objT, yjzVar4, bdnVar2, context, i5, bhiVar), baoVarD), baoVarD, 3072, 6);
            basVar.aa();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kog(bhiVar, bdnVar, i, yjzVar, yjzVar2, yjzVar3, yjkVar, yjkVar2, bkpVar, z, yyVar, yjzVar4, i2, i3, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, java.util.List] */
    public static void w(bkp bkpVar, isy isyVar, mdw mdwVar, bao baoVar, int i) {
        int i2;
        bas basVar;
        bao baoVar2;
        bkpVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-734080539);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? baoVarD.F(isyVar) : baoVarD.H(isyVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(mdwVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            baoVarD.x(1849434622);
            bas basVar2 = (bas) baoVarD;
            Object objT = basVar2.T();
            Object obj = ban.a;
            Object obj2 = objT;
            if (objT == obj) {
                int size = isyVar.d.size();
                ArrayList arrayList = new ArrayList(size);
                int i4 = 0;
                while (i4 < size) {
                    arrayList.add(Boolean.valueOf(i4 == isyVar.c()));
                    i4++;
                }
                bje bjeVar = new bje();
                bjeVar.addAll(arrayList);
                basVar2.ae(bjeVar);
                obj2 = bjeVar;
            }
            bje bjeVar2 = (bje) obj2;
            basVar2.aa();
            bvt bvtVarA = xu.a(xk.c, bkb.j, baoVarD, 0);
            int iK = a.k(zy.p(baoVarD));
            bhu bhuVarAi = basVar2.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar2.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar2.w || !yks.e(basVar2.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar2.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            String strW = ccf.w(R.string.allow_up_to, baoVarD);
            chc chcVar = wv.N(baoVarD).k;
            long j = wv.K(baoVarD).s;
            bkm bkmVar = bkp.g;
            axa.b(strW, wv.p(bkmVar, ccf.x(R.dimen.content_restriction_padding, baoVarD)), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, chcVar, baoVarD, 0, 0, 131064);
            bkp bkpVarB = xx.b(zi.a(bkmVar, 1.0f), 0.2f, true);
            baoVarD.x(-1746271574);
            if ((i2 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 32 && ((i2 & 64) == 0 || !baoVarD.H(isyVar))) {
                z = false;
            }
            boolean zH = baoVarD.H(mdwVar) | z;
            Object objT2 = basVar2.T();
            if (zH || objT2 == obj) {
                ikc ikcVar = new ikc(isyVar, bjeVar2, mdwVar, 12, (short[]) null);
                basVar = basVar2;
                basVar.ae(ikcVar);
                objT2 = ikcVar;
            } else {
                basVar = basVar2;
            }
            basVar.aa();
            d.n(bkpVarB, null, null, null, null, null, false, null, (yjv) objT2, baoVarD, 0, 510);
            og.v(null, 0.0f, wv.K(baoVarD).B, baoVarD, 0, 3);
            baoVar2 = baoVarD;
            axa.b(ccf.w(R.string.parental_controls_rating_disclaimer, baoVarD), wv.p(bkmVar, ccf.x(R.dimen.content_restriction_padding, baoVarD)), wv.K(baoVarD).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wv.N(baoVarD).k, baoVar2, 0, 0, 131064);
            baoVar2.o();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kbe(bkpVar, isyVar, mdwVar, i, 1, null);
        }
    }

    public static void x(bje bjeVar, mdw mdwVar, isy isyVar, wnu wnuVar, boolean z, int i) {
        int iA = bjeVar.a();
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= iA) {
                break;
            }
            if (i2 != i) {
                z2 = false;
            }
            bjeVar.set(i2, Boolean.valueOf(z2));
            i2++;
        }
        int iAs = a.as(((wnv) isyVar.a).b);
        if (iAs == 0) {
            iAs = 1;
        }
        wkc wkcVarR = z ? wkc.a : jbr.r(wnuVar);
        wkcVarR.getClass();
        int i3 = iAs - 2;
        if (i3 == 1) {
            wkc wkcVar = ((isi) mdwVar.h).i.q;
            if (wkcVar == null) {
                wkcVar = wkc.a;
            }
            wkcVar.getClass();
            mdwVar.r(wkcVarR, wkcVar);
            return;
        }
        if (i3 != 2) {
            return;
        }
        wkc wkcVar2 = ((isi) mdwVar.h).i.p;
        if (wkcVar2 == null) {
            wkcVar2 = wkc.a;
        }
        wkcVar2.getClass();
        mdwVar.r(wkcVar2, wkcVarR);
    }

    public static synchronized void y() {
        if (a == null) {
            a = new jys((byte[]) null);
        }
    }

    public void D() {
        throw null;
    }

    public void E(int i) {
        throw null;
    }

    public void F(int i) {
        throw null;
    }

    public void G(int i) {
        throw null;
    }

    public void z() {
        throw null;
    }

    public jys(char[] cArr) {
    }

    private jys(byte[] bArr) {
        new ConcurrentHashMap();
    }

    public void K() {
    }

    public void M() {
    }

    public void H(int i) {
    }

    public void I(int i) {
    }

    public void J(njz njzVar) {
    }

    public void L(int i) {
    }
}

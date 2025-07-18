package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.googletv.app.player.PlayerActivity;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pku {
    public final /* synthetic */ Object a;

    public pku() {
        throw null;
    }

    public static final void h(tme tmeVar) {
        ((tug) ((tug) iwu.a.f().h(tvo.a, "VIRTUAL_REMOTE")).i(tmeVar).j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl$virtualRemoteConnectionListener$1", "onException", 260, "VirtualRemoteImpl.kt")).s("Encountered an exception in the virtual remote connection.");
    }

    public static final void k(tmg tmgVar) {
        tmgVar.getClass();
        ((tug) itv.a.b().j("com/google/android/apps/googletv/app/device/impl/MediaDeviceControllerImpl$startVirtualRemoteDiscovery$1", "onScanStateChanged", 514, "MediaDeviceControllerImpl.kt")).v("Virtual remote scan state changed to %s.", tmgVar);
    }

    public final void A(float f, float f2) {
        bpn bpnVar = (bpn) this.a;
        bnp bnpVarB = bpnVar.b();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (u() >> 32)) - (f + 0.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (u() & 4294967295L)) - (f2 + 0.0f);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            bny.a("Width and height must be greater than or equal to zero");
        }
        bpnVar.h(jFloatToRawIntBits);
        bnpVarB.i(0.0f, 0.0f);
    }

    public final void B(float f, float f2) {
        ayd aydVar = (ayd) this.a;
        aydVar.m(f);
        aydVar.f.h(f2);
    }

    public final List C(int i) {
        ArrayList arrayList = new ArrayList();
        Object obj = this.a;
        bit bitVarT = bcm.t();
        yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
        bit bitVarU = bcm.u(bitVarT);
        try {
            abj abjVar = ((abw) obj).b ? ((abw) obj).c : (abj) ((abw) obj).e.a();
            if (abjVar != null) {
                yld yldVar = new yld();
                yldVar.a = 1;
                List list = (List) abjVar.h.a(Integer.valueOf(i));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    yfw yfwVar = (yfw) list.get(i2);
                    arrayList.add(((abw) obj).j.a(((Number) yfwVar.a).intValue(), ((clv) yfwVar.b).a, false, new gk((Object) yldVar, (Object) list, (Object) abjVar, 4, (byte[]) null)));
                }
            }
            return arrayList;
        } finally {
            bcm.z(bitVarT, bitVarU, yjvVarI);
        }
    }

    public final adl D(int i) {
        Object obj = this.a;
        bit bitVarT = bcm.t();
        yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
        bit bitVarU = bcm.u(bitVarT);
        try {
            aai aaiVar = (aai) ((aan) obj).f.a();
            bcm.z(bitVarT, bitVarU, yjvVarI);
            aan aanVar = (aan) this.a;
            return aanVar.k.a(i, aaiVar.h, aanVar.d, new pl(18));
        } catch (Throwable th) {
            bcm.z(bitVarT, bitVarU, yjvVarI);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf A[PHI: r18 r19
  0x00bf: PHI (r18v2 float) = (r18v1 float), (r18v5 float) binds: [B:52:0x00ec, B:41:0x00b8] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r19v1 float) = (r19v0 float), (r19v2 float) binds: [B:52:0x00ec, B:41:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012e A[PHI: r14
  0x012e: PHI (r14v3 float) = (r14v2 float), (r14v4 float) binds: [B:76:0x0159, B:65:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long E(long r22, int r24) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pku.E(long, int):long");
    }

    public final long F(long j) {
        vx vxVar = (vx) this.a;
        return vxVar.c(vxVar.h, j, 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nzw] */
    public final void a(nve nveVar) {
        this.a.aC(nveVar);
    }

    public final void b(Map map) {
        map.getClass();
        kmy kmyVar = (kmy) this.a;
        Set set = (Set) map.get(kmyVar.b.bq());
        kmyVar.k.c(set != null ? yfm.al(set) : yhb.a);
    }

    public final AppCompatActivity c() {
        Context baseContext = ((mvr) this.a).b;
        while ((baseContext instanceof ContextWrapper) && !(baseContext instanceof AppCompatActivity)) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return (AppCompatActivity) baseContext;
    }

    public final void d(hij hijVar, List list) {
        uof uofVarK;
        Object obj = this.a;
        int i = hijVar.a;
        if (i != 0) {
            jde jdeVar = ((kmg) obj).g;
            if (jdeVar != null) {
                Objects.toString(hijVar);
                jdeVar.a(i, new IllegalStateException("Transaction failed. BillingResponse=".concat(String.valueOf(hijVar))));
                return;
            }
            return;
        }
        kmg kmgVar = (kmg) obj;
        kmd kmdVar = null;
        if (kmgVar.e != null) {
            String strOptString = ((JSONObject) ((ghd) list.get(0)).b).optString("purchaseId");
            strOptString.getClass();
            hio hioVar = kmgVar.e;
            kmgVar.f = new kme(strOptString, hioVar != null ? hioVar.a : 0L, hioVar != null ? hioVar.b : null);
        }
        list.getClass();
        if (list.isEmpty() || kmgVar.f == null) {
            return;
        }
        izo izoVar = kmgVar.b;
        kmd kmdVar2 = kmgVar.c;
        if (kmdVar2 == null) {
            yks.c("product");
            kmdVar2 = null;
        }
        izoVar.f(kmdVar2.a);
        kmd kmdVar3 = kmgVar.c;
        if (kmdVar3 == null) {
            yks.c("product");
            kmdVar3 = null;
        }
        int iAU = a.aU(kmdVar3.a.c);
        if (iAU != 0 && iAU == 5) {
            kmd kmdVar4 = kmgVar.c;
            if (kmdVar4 == null) {
                yks.c("product");
                kmdVar4 = null;
            }
            uofVarK = new uof(kmdVar4.d, (String) null);
        } else {
            kmd kmdVar5 = kmgVar.c;
            if (kmdVar5 == null) {
                yks.c("product");
                kmdVar5 = null;
            }
            kmd kmdVar6 = kmgVar.c;
            if (kmdVar6 == null) {
                yks.c("product");
                kmdVar6 = null;
            }
            uofVarK = uof.k(kmdVar5.d, kmdVar6.a.b);
        }
        kmgVar.a.e(uofVarK, icz.a, new mfm());
        jde jdeVar2 = kmgVar.g;
        jdeVar2.getClass();
        kme kmeVar = kmgVar.f;
        kmeVar.getClass();
        igi igiVar = (igi) jdeVar2.c;
        String str = igiVar.c;
        if (str == null) {
            yks.c("transactionId");
            str = null;
        }
        kmd kmdVar7 = igiVar.b;
        if (kmdVar7 == null) {
            yks.c("product");
        } else {
            kmdVar = kmdVar7;
        }
        kuw kuwVar = igiVar.d;
        str.getClass();
        kmdVar.getClass();
        nuh nuhVarD = kuwVar.D(194422);
        vtw vtwVarM = ubx.a.m();
        vty vtyVar = (vty) wdm.a.m();
        vtyVar.getClass();
        String str2 = kmdVar.a.b;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar = (wdm) vtyVar.b;
        str2.getClass();
        wdmVar.b |= 64;
        wdmVar.g = str2;
        int iZ = kuw.z(kmdVar.c);
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar2 = (wdm) vtyVar.b;
        wdmVar2.d = iZ - 1;
        wdmVar2.b |= 2;
        String str3 = kmeVar.a;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar3 = (wdm) vtyVar.b;
        wdmVar3.b |= 4;
        wdmVar3.e = str3;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar4 = (wdm) vtyVar.b;
        wdmVar4.f = 4;
        wdmVar4.b |= 8;
        int iB = kuw.B(kmdVar);
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar5 = (wdm) vtyVar.b;
        wdmVar5.i = iB - 1;
        wdmVar5.b |= 512;
        int iA = kuw.A(kmdVar);
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar6 = (wdm) vtyVar.b;
        wdmVar6.j = iA - 1;
        wdmVar6.b |= 1024;
        vwe vweVarE = vxf.e(System.currentTimeMillis());
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar7 = (wdm) vtyVar.b;
        vweVarE.getClass();
        wdmVar7.m = vweVarE;
        wdmVar7.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        String str4 = kmdVar.e;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar8 = (wdm) vtyVar.b;
        wdmVar8.b |= 1;
        wdmVar8.c = str4;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        wdm wdmVar9 = (wdm) vtyVar.b;
        wdmVar9.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
        wdmVar9.k = str;
        String str5 = kmeVar.c;
        if (str5 != null) {
            vtw vtwVarM2 = wdo.a.m();
            vtw vtwVarM3 = wdn.a.m();
            long j = kmeVar.b;
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            vuc vucVar = vtwVarM3.b;
            wdn wdnVar = (wdn) vucVar;
            wdnVar.b |= 1;
            wdnVar.c = j;
            if (!vucVar.A()) {
                vtwVarM3.u();
            }
            wdn wdnVar2 = (wdn) vtwVarM3.b;
            wdnVar2.b |= 2;
            wdnVar2.d = str5;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            wdo wdoVar = (wdo) vtwVarM2.b;
            wdn wdnVar3 = (wdn) vtwVarM3.r();
            wdnVar3.getClass();
            wdoVar.c = wdnVar3;
            wdoVar.b |= 1;
            if (!vtyVar.b.A()) {
                vtyVar.u();
            }
            wdm wdmVar10 = (wdm) vtyVar.b;
            wdo wdoVar2 = (wdo) vtwVarM2.r();
            wdoVar2.getClass();
            wdmVar10.h = wdoVar2;
            wdmVar10.b |= 128;
        }
        vuc vucVarO = vtyVar.r();
        vucVarO.getClass();
        wdm wdmVar11 = (wdm) vucVarO;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ubx ubxVar = (ubx) vtwVarM.b;
        ubxVar.f = wdmVar11;
        ubxVar.b |= 8;
        nuhVarD.w(kuw.y((ubx) vtwVarM.r()));
        ((ntp) kuwVar.b).w(nuhVarD.y());
    }

    public final void e(long j) {
        long j2 = ynm.a;
        long jP = ylh.p(j, yno.c);
        if (j >= 0) {
            ksy ksyVar = null;
            kvw kvwVar = new kvw((byte[]) null);
            kvwVar.b(vxd.d(j));
            Object obj = this.a;
            kvwVar.c = tst.i(jdd.Q(System.currentTimeMillis()));
            jdd jddVar = (jdd) obj;
            kvwVar.b = tst.i(jddVar.K);
            kvx kvxVarA = kvwVar.a();
            lzw lzwVarM = jddVar.M();
            ksn ksnVar = (ksn) ((ldy) jddVar.e()).a().g();
            ksy ksyVar2 = jddVar.L;
            if (ksyVar2 == null) {
                yks.c("assetId");
            } else {
                ksyVar = ksyVar2;
            }
            lzwVarM.a(ksnVar, ImmutableMap.of(ksyVar, kvxVarA));
            long j3 = jddVar.D;
            if (ynm.b(ynm.b(jP, j3) > 0 ? ynm.n(jP, j3) : ynm.n(j3, jP), jdd.b) > 0) {
                jddVar.J(j);
            } else {
                ((tug) jdd.a.e().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment$currentPositionListener$1", "onCurrentPlaybackPositionUpdated", 506, "TvodPlayerFragment.kt")).u("New position updated locally: %d", j);
            }
        }
    }

    public final void f(String str, boolean z, boolean z2) {
        str.getClass();
        PlayerActivity playerActivity = (PlayerActivity) this.a;
        out outVar = playerActivity.j;
        playerActivity.d(new jbv(str, true, z, z2, false, outVar.b, outVar.c.b == ouq.f));
    }

    public final void g(tmc tmcVar) {
        tmcVar.getClass();
        Object obj = this.a;
        iwu iwuVar = (iwu) obj;
        if (iwuVar.o.get()) {
            ((tug) iwu.a.e().h(tvo.a, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl$virtualRemoteConnectionListener$1", "onConnectionStateChanged", 225, "VirtualRemoteImpl.kt")).B("Virtual remote connection state has changed to %s from %s.", tmcVar, iwuVar.e.e());
            int iOrdinal = tmcVar.ordinal();
            if (iOrdinal == 0) {
                iwu iwuVar2 = (iwu) this.a;
                iwuVar2.o(2);
                iwuVar2.e.j(ivy.b);
                return;
            }
            int i = 3;
            if (iOrdinal == 1) {
                iwu iwuVar3 = (iwu) this.a;
                iwr iwrVar = iwuVar3.e;
                if (iwrVar.e() == ivy.d) {
                    iwuVar3.d.ap(7);
                }
                iwuVar3.o(1);
                iwrVar.p(new iwg(i));
                iwuVar3.p = 0;
                iwuVar3.m();
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new yfu();
            }
            ReentrantLock reentrantLock = iwuVar.h;
            reentrantLock.lock();
            try {
                ((iwu) obj).s = null;
                reentrantLock.unlock();
                ((iwu) this.a).k(tmcVar);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final void i() {
        iwu iwuVar = (iwu) this.a;
        iwuVar.e.k(false);
        Iterator it = iwuVar.g.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            new Handler(Looper.getMainLooper()).post(new iuc(((pku) next).a, 5));
        }
    }

    public final void j() {
        iwu iwuVar;
        ith ithVarE = ((ivd) this.a).c.e();
        if (ithVarE == null || (iwuVar = ((iua) ithVarE).j) == null) {
            return;
        }
        iwuVar.e();
    }

    public final void l(int i) {
        ftw ftwVar = (ftw) this.a;
        fux fuxVarD = ftwVar.d();
        if (ftwVar.f() != fuxVarD) {
            ftwVar.m(fuxVarD, i, true);
        }
    }

    public final void m(int i, long j) throws eaf {
        Object obj = this.a;
        if (i == 20529) {
            if (j != 0) {
                throw new eaf(a.cp(j, "ContentEncodingOrder ", " not supported"), null, true, 1);
            }
            return;
        }
        if (i == 20530) {
            if (j != 1) {
                throw new eaf(a.cp(j, "ContentEncodingScope ", " not supported"), null, true, 1);
            }
            return;
        }
        switch (i) {
            case 131:
                ((fhb) obj).i(i).e = (int) j;
                return;
            case 136:
                ((fhb) obj).i(i).X = j == 1;
                return;
            case 155:
                fhb fhbVar = (fhb) obj;
                fhbVar.s = fhbVar.h(j);
                return;
            case 159:
                ((fhb) obj).i(i).Q = (int) j;
                return;
            case 176:
                ((fhb) obj).i(i).n = (int) j;
                return;
            case 179:
                fhb fhbVar2 = (fhb) obj;
                fhbVar2.j(i);
                fhbVar2.x.b(fhbVar2.h(j));
                return;
            case 186:
                ((fhb) obj).i(i).o = (int) j;
                return;
            case 215:
                ((fhb) obj).i(i).d = (int) j;
                return;
            case 231:
                fhb fhbVar3 = (fhb) obj;
                fhbVar3.q = fhbVar3.h(j);
                return;
            case 238:
                ((fhb) obj).t = (int) j;
                return;
            case 241:
                fhb fhbVar4 = (fhb) obj;
                if (fhbVar4.r) {
                    return;
                }
                fhbVar4.j(i);
                fhbVar4.y.b(j);
                fhbVar4.r = true;
                return;
            case 251:
                ((fhb) obj).u = true;
                return;
            case 16871:
                ((fhb) obj).i(i).h = (int) j;
                return;
            case 16980:
                if (j != 3) {
                    throw new eaf(a.cp(j, "ContentCompAlgo ", " not supported"), null, true, 1);
                }
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    throw new eaf(a.cp(j, "DocTypeReadVersion ", " not supported"), null, true, 1);
                }
                return;
            case 17143:
                if (j != 1) {
                    throw new eaf(a.cp(j, "EBMLReadVersion ", " not supported"), null, true, 1);
                }
                return;
            case 18401:
                if (j != 5) {
                    throw new eaf(a.cp(j, "ContentEncAlgo ", " not supported"), null, true, 1);
                }
                return;
            case 18408:
                if (j != 1) {
                    throw new eaf(a.cp(j, "AESSettingsCipherMode ", " not supported"), null, true, 1);
                }
                return;
            case 21420:
                fhb fhbVar5 = (fhb) obj;
                fhbVar5.n = j + fhbVar5.f;
                return;
            case 21432:
                int i2 = (int) j;
                fhb fhbVar6 = (fhb) obj;
                fhbVar6.k(i);
                if (i2 == 0) {
                    fhbVar6.k.y = 0;
                    return;
                }
                if (i2 == 1) {
                    fhbVar6.k.y = 2;
                    return;
                } else if (i2 == 3) {
                    fhbVar6.k.y = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    fhbVar6.k.y = 3;
                    return;
                }
            case 21680:
                ((fhb) obj).i(i).q = (int) j;
                return;
            case 21682:
                ((fhb) obj).i(i).s = (int) j;
                return;
            case 21690:
                ((fhb) obj).i(i).r = (int) j;
                return;
            case 21930:
                ((fhb) obj).i(i).W = j == 1;
                return;
            case 21938:
                fhb fhbVar7 = (fhb) obj;
                fhbVar7.k(i);
                fha fhaVar = fhbVar7.k;
                fhaVar.z = true;
                fhaVar.p = (int) j;
                return;
            case 21998:
                ((fhb) obj).i(i).g = (int) j;
                return;
            case 22186:
                ((fhb) obj).i(i).T = j;
                return;
            case 22203:
                ((fhb) obj).i(i).U = j;
                return;
            case 25188:
                ((fhb) obj).i(i).R = (int) j;
                return;
            case 30114:
                ((fhb) obj).v = j;
                return;
            case 30321:
                int i3 = (int) j;
                fhb fhbVar8 = (fhb) obj;
                fhbVar8.k(i);
                if (i3 == 0) {
                    fhbVar8.k.t = 0;
                    return;
                }
                if (i3 == 1) {
                    fhbVar8.k.t = 1;
                    return;
                } else if (i3 == 2) {
                    fhbVar8.k.t = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    fhbVar8.k.t = 3;
                    return;
                }
            case 2352003:
                ((fhb) obj).i(i).f = (int) j;
                return;
            case 2807729:
                ((fhb) obj).g = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        fhb fhbVar9 = (fhb) obj;
                        fhbVar9.k(i);
                        if (i4 == 1) {
                            fhbVar9.k.C = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            fhbVar9.k.C = 1;
                            return;
                        }
                    case 21946:
                        fhb fhbVar10 = (fhb) obj;
                        fhbVar10.k(i);
                        int iB = dyt.b((int) j);
                        if (iB != -1) {
                            fhbVar10.k.B = iB;
                            return;
                        }
                        return;
                    case 21947:
                        fhb fhbVar11 = (fhb) obj;
                        fhbVar11.k(i);
                        fhbVar11.k.z = true;
                        int iA = dyt.a((int) j);
                        if (iA != -1) {
                            fhbVar11.k.A = iA;
                            return;
                        }
                        return;
                    case 21948:
                        ((fhb) obj).i(i).D = (int) j;
                        return;
                    case 21949:
                        ((fhb) obj).i(i).E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void n(int i, long j, long j2) throws eaf {
        fhb fhbVar = (fhb) this.a;
        fhbVar.l();
        if (i == 160) {
            fhbVar.u = false;
            fhbVar.v = 0L;
            return;
        }
        if (i == 174) {
            fhbVar.k = new fha();
            fhbVar.k.a = fhbVar.j;
            return;
        }
        if (i == 187) {
            fhbVar.r = false;
            return;
        }
        if (i == 19899) {
            fhbVar.m = -1;
            fhbVar.n = -1L;
            return;
        }
        if (i == 20533) {
            fhbVar.i(i).i = true;
            return;
        }
        if (i == 21968) {
            fhbVar.i(i).z = true;
            return;
        }
        if (i == 408125543) {
            long j3 = fhbVar.f;
            if (j3 != -1 && j3 != j) {
                throw new eaf("Multiple Segment elements not supported", null, true, 1);
            }
            fhbVar.f = j;
            fhbVar.e = j2;
            return;
        }
        if (i == 475249515) {
            fhbVar.x = new ira((byte[]) null);
            fhbVar.y = new ira((byte[]) null);
        } else if (i == 524531317 && !fhbVar.l) {
            if (fhbVar.d && fhbVar.p != -1) {
                fhbVar.o = true;
            } else {
                fhbVar.w.r(new fee(fhbVar.i));
                fhbVar.l = true;
            }
        }
    }

    public final void o(IOException iOException) {
        ((enf) this.a).e(iOException);
    }

    public final void p() {
        long j;
        synchronized (fay.b) {
            j = fay.c ? fay.d : -9223372036854775807L;
        }
        ((enf) this.a).f(j);
    }

    public final void q(long j) {
        elw elwVar = ((emm) this.a).e;
        if (elwVar != null) {
            elwVar.h(j);
        }
    }

    public final void r() {
        eje ejeVar = (eje) this.a;
        if (ejeVar.g() || ejeVar.k) {
            ejeVar.d.f(2);
        }
    }

    public final void s(ejd ejdVar) {
        Object obj = this.a;
        ((eiz) obj).e.d(new edd(obj, ejdVar, 3));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final void t(long j, yka ykaVar) {
        if (j != Long.MIN_VALUE && j <= -4611686018427387904L) {
            throw new IllegalArgumentException("You may not specify item ids less than -4611686018427387904 in a Glance\nwidget. These are reserved.");
        }
        this.a.add(new yfw(Long.valueOf(j), ykaVar));
    }

    public final long u() {
        return ((bpn) this.a).a();
    }

    public final void v(float f, float f2, float f3, float f4, int i) {
        ((bpn) this.a).b().a(f, f2, f3, f4, i);
    }

    public final void w(float f, long j) {
        bnp bnpVarB = ((bpn) this.a).b();
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        bnpVarB.i(Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
        bnpVarB.f(f);
        bnpVarB.i(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i));
    }

    public final void x(float f, float f2, long j) {
        bnp bnpVarB = ((bpn) this.a).b();
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        bnpVarB.i(Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
        bnpVarB.h(f, f2);
        bnpVarB.i(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i));
    }

    public final void y(float f, float f2) {
        ((bpn) this.a).b().i(f, f2);
    }

    public final void z(bni bniVar) {
        ((bpn) this.a).b().k(bniVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pku(ftw ftwVar) {
        this(null, null, null);
        this.a = ftwVar;
    }

    public pku(Object obj) {
        this.a = obj;
    }

    public /* synthetic */ pku(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public pku(byte[] bArr, byte[] bArr2, byte[] bArr3) {
    }
}

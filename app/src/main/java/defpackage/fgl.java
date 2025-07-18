package defpackage;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import com.google.android.katniss.R;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fgl implements ffk, fex, ffo {
    public final List A;
    public ahdl B;
    public boolean C;
    public final hvf D;
    private final ConnectivityManager F;
    private final tne G;
    private final gzu H;
    private final gfr I;
    private final gmd J;
    private final hab K;
    private final jca L;
    private fey M;
    private final List N;
    private final Map O;
    private final tnc P;
    private final int Q;
    private final euk R;
    public final agte c;
    public final ahbt d;
    public final ahbt e;
    public final ahbt f;
    public final agow g;
    public final gph h;
    public final jrs i;
    public final ffp j;
    public final gtu k;
    public final agow l;
    public final glq m;
    public final gqr n;
    public final ztw o;
    public final ghr p;
    public int q;
    public fey r;
    public volatile String s;
    public volatile String t;
    public volatile boolean u;
    public volatile boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static final fgc a = new fgc();
    public static final zdy b = zdy.h("com/google/android/apps/tvsearch/controller/libas/LibAsHandler");
    private static final Map E = agrj.d(new agpi("tap_input", "tapInput"), new agpi("asst_input.INTENT", "intentInput"), new agpi("asst_input.INTENT_UPDATE", "intentInput"));

    public fgl(ConnectivityManager connectivityManager, agte agteVar, ahbt ahbtVar, ahbt ahbtVar2, ahbt ahbtVar3, tne tneVar, euk eukVar, agow agowVar, gph gphVar, gzu gzuVar, jrs jrsVar, ffp ffpVar, gtu gtuVar, agow agowVar2, gfr gfrVar, glq glqVar, gmd gmdVar, gqr gqrVar, hab habVar, hvf hvfVar, ztw ztwVar, ghr ghrVar, jca jcaVar) throws abxv {
        agteVar.getClass();
        ahbtVar.getClass();
        ahbtVar2.getClass();
        ahbtVar3.getClass();
        tneVar.getClass();
        eukVar.getClass();
        gzuVar.getClass();
        ffpVar.getClass();
        gtuVar.getClass();
        gfrVar.getClass();
        gmdVar.getClass();
        habVar.getClass();
        hvfVar.getClass();
        ztwVar.getClass();
        ghrVar.getClass();
        jcaVar.getClass();
        this.F = connectivityManager;
        this.c = agteVar;
        this.d = ahbtVar;
        this.e = ahbtVar2;
        this.f = ahbtVar3;
        this.G = tneVar;
        this.R = eukVar;
        this.g = agowVar;
        this.h = gphVar;
        this.H = gzuVar;
        this.i = jrsVar;
        this.j = ffpVar;
        this.k = gtuVar;
        this.l = agowVar2;
        this.I = gfrVar;
        this.m = glqVar;
        this.J = gmdVar;
        this.n = gqrVar;
        this.K = habVar;
        this.D = hvfVar;
        this.o = ztwVar;
        this.p = ghrVar;
        this.L = jcaVar;
        this.v = true;
        this.N = new ArrayList();
        this.y = true;
        this.O = new ConcurrentHashMap();
        this.A = new ArrayList();
        tnc tncVar = new tnc() { // from class: fgb
            @Override // defpackage.tnc
            public final void a(addj addjVar) throws abxv {
                this.a.L(addjVar);
            }
        };
        this.P = tncVar;
        R();
        if (gphVar != gph.b && gphVar != gph.c) {
            L(null);
            tneVar.b.remove(tncVar);
            tneVar.a(tncVar);
        }
        this.Q = -1;
    }

    private final void R() {
        String strA = fbo.x.a();
        Map map = this.O;
        map.put(strA, false);
        map.put(fbo.S.a(), false);
    }

    private final void S() {
        gmd gmdVar = this.J;
        gmdVar.c();
        gmdVar.d();
    }

    public final String A(byte[] bArr) throws abxv {
        byte bByteValue;
        try {
            abxd abxdVarH = abxd.h(xqu.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                if (bByteValue != 0) {
                    boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                    abxdVarH.cM(2, true != zL ? null : abxdVarH);
                    if (zL) {
                    }
                }
                throw new abzz().a();
            }
            return ((xqu) abxdVarH).c;
        } catch (abxv e) {
            ((zdv) ((zdv) b.c()).p(e).q("com/google/android/apps/tvsearch/controller/libas/LibAsHandler", "getTextFromClientOpArgs", 913, "LibAsHandler.kt")).u("Invalid ShowTextArgs, cannot parse");
            return null;
        }
    }

    public final void B() {
        this.A.clear();
    }

    public final void C() {
        fey feyVar = this.r;
        if (feyVar != null) {
            feyVar.J();
        }
    }

    public final void D(lyv lyvVar) {
        this.N.remove(lyvVar);
    }

    public final void E(xqk xqkVar) {
        if (xqkVar == null) {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/controller/libas/LibAsHandler", "performShowShelves", 825, "LibAsHandler.kt")).u("Attempting to performShowShelves with null args.");
            return;
        }
        fey feyVar = this.r;
        if (feyVar != null) {
            feyVar.u(xqkVar);
        }
    }

    public final void F(lyv lyvVar) {
        this.N.add(lyvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G() throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 999
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgl.G():void");
    }

    public final void H() {
        int iA;
        fey feyVar = this.M;
        if (feyVar != null) {
            euk eukVar = this.R;
            String str = this.H.a;
            if (str.length() == 0) {
                str = null;
            }
            far farVarA = eukVar.a(str);
            feyVar.o(farVarA);
            ffp ffpVar = this.j;
            xds xdsVarA = farVarA.a();
            try {
                int i = xdsVarA.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(xdsVarA.getClass()).a(xdsVarA);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(xdsVarA.getClass()).a(xdsVarA);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        xdsVarA.memoizedSerializedSize = (Integer.MIN_VALUE & xdsVarA.memoizedSerializedSize) | iA;
                    }
                }
                byte[] bArr = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(xdsVarA.getClass()).m(xdsVarA, abwa.a(abvwVar));
                abvwVar.K();
                ffpVar.s(bArr);
            } catch (IOException e) {
                throw new RuntimeException(a.x(xdsVarA, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
            }
        }
    }

    public final void I(jov jovVar) {
        this.I.b(rpm.cs(), null, null);
        this.J.b(gmc.au);
        fey feyVar = this.r;
        if (feyVar != null) {
            job jobVar = (job) jovVar;
            if (jobVar.a == 1) {
                this.s = jobVar.b;
            }
            feyVar.H(jovVar);
        }
    }

    public final void J(xmy xmyVar) {
        ahal.e(this.d, null, 0, new fge(this, xmyVar, null), 3);
    }

    public final void K(String str) {
        if (str == null) {
            str = "";
        }
        this.H.a(str);
    }

    public final void L(addj addjVar) throws abxv {
        int iA;
        gph gphVar = this.h;
        if (gphVar == gph.b || gphVar == gph.c) {
            return;
        }
        byte[] bArr = null;
        if (addjVar != null && (addjVar.c & 1) != 0) {
            try {
                abvo abvoVar = addjVar.d;
                ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                adbd adbdVar = adbd.a;
                abvt abvtVarK = abvoVar.k();
                adbd adbdVar2 = new adbd();
                try {
                    try {
                        try {
                            abzj abzjVarA = abza.a.a(adbdVar2.getClass());
                            abzjVarA.i(adbdVar2, abvu.p(abvtVarK), generatedRegistry);
                            abzjVarA.g(adbdVar2);
                            try {
                                abvtVarK.z(0);
                                Byte b2 = (byte) 1;
                                b2.getClass();
                                if (adbdVar2.b.size() < 100) {
                                    xew xewVar = xew.a;
                                    xev xevVar = new xev();
                                    abxc abxcVar = addj.b;
                                    abxcVar.getClass();
                                    xevVar.f(abxcVar, addjVar);
                                    abxd abxdVarV = xevVar.v();
                                    abxdVarV.getClass();
                                    xew xewVar2 = (xew) abxdVarV;
                                    try {
                                        int i = xewVar2.memoizedSerializedSize;
                                        if ((i & Integer.MIN_VALUE) != 0) {
                                            iA = abza.a.a(xewVar2.getClass()).a(xewVar2);
                                            if (iA < 0) {
                                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                            }
                                        } else {
                                            iA = i & Integer.MAX_VALUE;
                                            if (iA == Integer.MAX_VALUE) {
                                                iA = abza.a.a(xewVar2.getClass()).a(xewVar2);
                                                if (iA < 0) {
                                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                                }
                                                xewVar2.memoizedSerializedSize = (Integer.MIN_VALUE & xewVar2.memoizedSerializedSize) | iA;
                                            }
                                        }
                                        byte[] bArr2 = new byte[iA];
                                        boolean z = abvz.e;
                                        abvw abvwVar = new abvw(bArr2, 0, iA);
                                        abza.a.a(xewVar2.getClass()).m(xewVar2, abwa.a(abvwVar));
                                        abvwVar.K();
                                        bArr = bArr2;
                                    } catch (IOException e) {
                                        throw new RuntimeException(a.A(xewVar2, "byte array"), e);
                                    }
                                }
                            } catch (abxv e2) {
                                throw e2;
                            }
                        } catch (abxv e3) {
                            if (!e3.a) {
                                throw e3;
                            }
                            throw new abxv(e3);
                        } catch (RuntimeException e4) {
                            if (!(e4.getCause() instanceof abxv)) {
                                throw e4;
                            }
                            throw ((abxv) e4.getCause());
                        }
                    } catch (abzz e5) {
                        throw e5.a();
                    }
                } catch (IOException e6) {
                    if (!(e6.getCause() instanceof abxv)) {
                        throw new abxv(e6);
                    }
                    throw ((abxv) e6.getCause());
                }
            } catch (abxv e7) {
                ((zdv) ((zdv) b.c()).p(e7).q("com/google/android/apps/tvsearch/controller/libas/LibAsHandler", "updateXUiKitParams", 1135, "LibAsHandler.kt")).u("Failed to parse TemplateServingContext in XUiKitRequestMetadata");
            }
        }
        this.j.v(bArr);
    }

    public final boolean M(aeal aealVar) {
        adyj adyjVar = aealVar.c;
        if (adyjVar == null) {
            adyjVar = adyj.a;
        }
        adxr adxrVar = adyjVar.c;
        if (adxrVar == null) {
            adxrVar = adxr.a;
        }
        if ((adxrVar.b & 1) == 0) {
            return false;
        }
        ((zdv) b.c().q("com/google/android/apps/tvsearch/controller/libas/LibAsHandler", "hasImageResult", 553, "LibAsHandler.kt")).u("Image Result not supported.");
        return true;
    }

    public final boolean N() {
        NetworkInfo activeNetworkInfo = this.F.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public final boolean O() {
        return this.r != null;
    }

    public final boolean P(xqk xqkVar) {
        return xqkVar.b.size() == 1 && agvy.c(((xqi) xqkVar.b.get(0)).d, "csat_embedded_shelf");
    }

    public final void Q() {
        fey feyVar = this.r;
        if (feyVar != null) {
            feyVar.I();
        } else {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/controller/libas/LibAsHandler", "onNetworkConnectivityResult", 980, "LibAsHandler.kt")).u("Reporting network connectivity failure, but no receiver");
            this.i.a(R.string.err_no_internet);
        }
    }

    @Override // defpackage.fex
    public final int a() {
        return this.Q;
    }

    @Override // defpackage.fex
    public final String b() {
        return this.t;
    }

    @Override // defpackage.fex
    public final void c(String str) {
        this.t = str;
    }

    @Override // defpackage.fex
    public final void d(boolean z) {
        this.v = z;
    }

    @Override // defpackage.fex
    public final boolean e() {
        return this.u;
    }

    @Override // defpackage.fex
    public final boolean f() {
        return this.v;
    }

    @Override // defpackage.fex
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // defpackage.fex
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // defpackage.fex
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.fex
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.fex
    public final boolean k() {
        return this.C;
    }

    @Override // defpackage.ffk
    public final void l(fey feyVar) {
        this.r = feyVar;
        feyVar.G(this.x);
        zdm zdmVarListIterator = yye.a(this.N).listIterator(0);
        zdmVarListIterator.getClass();
        while (zdmVarListIterator.hasNext()) {
            ((lyv) zdmVarListIterator.next()).a();
        }
    }

    @Override // defpackage.ffk
    public final void m(fey feyVar) {
        this.M = feyVar;
        if (this.h == gph.a) {
            ahal.e(this.d, null, 0, new fgd(this, null), 3);
        }
    }

    @Override // defpackage.ffk
    public final void n() {
        this.j.q();
    }

    @Override // defpackage.ffk
    public final void o(String str, int i) {
        this.s = str;
        this.j.f(str, i);
        I(a.i(str));
    }

    @Override // defpackage.ffk
    public final void p(xgw xgwVar, Optional optional) {
        xgwVar.getClass();
        String str = xgwVar.c;
        str.getClass();
        Map map = E;
        if (!map.containsKey(str)) {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/controller/libas/LibAsHandler", "startAssistantClientInput", 378, "LibAsHandler.kt")).x("Unsupported client input name: %s, skip triggering client input", str);
            return;
        }
        S();
        H();
        ffp ffpVar = this.j;
        xht xhtVar = xht.a;
        xhs xhsVar = new xhs();
        xho xhoVar = xho.a;
        xhn xhnVar = new xhn();
        if ((xhnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xhnVar.y();
        }
        xho xhoVar2 = (xho) xhnVar.b;
        xhoVar2.c = xgwVar;
        xhoVar2.b = 5;
        xho xhoVarA = xkj.a(xhnVar);
        if ((xhsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xhsVar.y();
        }
        xht xhtVar2 = (xht) xhsVar.b;
        xhtVar2.c = xhoVarA;
        xhtVar2.b = 3;
        xht xhtVarA = xlq.a(xhsVar);
        String str2 = (String) map.get(str);
        if (str2 == null) {
            str2 = "";
        }
        ffpVar.l(xhtVarA, str2, optional);
    }

    @Override // defpackage.ffk
    public final void q(abvo abvoVar, int i) {
        int iA;
        S();
        H();
        xix xixVar = xix.a;
        xiw xiwVar = new xiw();
        if ((xiwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xiwVar.y();
        }
        xix xixVar2 = (xix) xiwVar.b;
        xixVar2.b |= 1;
        xixVar2.c = abvoVar;
        xix xixVarA = xlp.a(xiwVar);
        xjp xjpVar = xjp.a;
        xnu xnuVar = new xnu(new xjo());
        xjo xjoVar = xnuVar.a;
        if ((xjoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xjoVar.y();
        }
        xjp xjpVar2 = (xjp) xjoVar.b;
        xjpVar2.b |= 1;
        xjpVar2.c = "assistant.api.client_input.IntentInput";
        try {
            int i2 = xixVarA.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(xixVarA.getClass()).a(xixVarA);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(xixVarA.getClass()).a(xixVarA);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    xixVarA.memoizedSerializedSize = (xixVarA.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(xixVarA.getClass()).m(xixVarA, abwa.a(abvwVar));
            xnuVar.b(abvk.a(abvwVar, bArr));
            xjp xjpVarA = xnuVar.a();
            xgw xgwVar = xgw.a;
            xgu xguVar = new xgu();
            if ((xguVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xguVar.y();
            }
            xgw xgwVar2 = (xgw) xguVar.b;
            xgwVar2.b |= 1;
            xgwVar2.c = "asst_input.INTENT";
            DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((xgw) xguVar.b).d)).getClass();
            xguVar.a("intent_input", xjpVarA);
            xgw xgwVarA = xki.a(xguVar);
            ffp ffpVar = this.j;
            xht xhtVar = xht.a;
            xhs xhsVar = new xhs();
            xho xhoVar = xho.a;
            xhn xhnVar = new xhn();
            if ((xhnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xhnVar.y();
            }
            xho xhoVar2 = (xho) xhnVar.b;
            xhoVar2.c = xgwVarA;
            xhoVar2.b = 5;
            xho xhoVarA = xkj.a(xhnVar);
            if ((Integer.MIN_VALUE & xhsVar.b.memoizedSerializedSize) == 0) {
                xhsVar.y();
            }
            xht xhtVar2 = (xht) xhsVar.b;
            xhtVar2.c = xhoVarA;
            xhtVar2.b = 3;
            ffpVar.l(xlq.a(xhsVar), "intentInput", Optional.of(Integer.valueOf(i)));
        } catch (IOException e) {
            throw new RuntimeException(a.x(xixVarA, "Serializing ", " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    @Override // defpackage.ffk
    public final void r(Intent intent) {
        if (intent.hasExtra("query")) {
            S();
            if (!N()) {
                Q();
                return;
            }
            ffp ffpVar = this.j;
            ffpVar.c("led_set_is_hotword_source_false");
            ffpVar.k(intent);
            I(a.i(this.s));
        }
    }

    @Override // defpackage.ffk
    public final void s(xkc xkcVar) {
        int iA;
        xkcVar.getClass();
        S();
        H();
        xjp xjpVar = xjp.a;
        xnu xnuVar = new xnu(new xjo());
        xjo xjoVar = xnuVar.a;
        if ((xjoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xjoVar.y();
        }
        xjp xjpVar2 = (xjp) xjoVar.b;
        xjpVar2.b |= 1;
        xjpVar2.c = "assistant.api.client_input.TapInput";
        try {
            int i = xkcVar.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(xkcVar.getClass()).a(xkcVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(xkcVar.getClass()).a(xkcVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    xkcVar.memoizedSerializedSize = (xkcVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            abvo abvoVar = abvo.b;
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(xkcVar.getClass()).m(xkcVar, abwa.a(abvwVar));
            xnuVar.b(abvk.a(abvwVar, bArr));
            xjp xjpVarA = xnuVar.a();
            xgw xgwVar = xgw.a;
            xgu xguVar = new xgu();
            if ((xguVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xguVar.y();
            }
            xgw xgwVar2 = (xgw) xguVar.b;
            xgwVar2.b |= 1;
            xgwVar2.c = "ui.TAP";
            DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((xgw) xguVar.b).d)).getClass();
            xguVar.a("tap_input", xjpVarA);
            xgw xgwVarA = xki.a(xguVar);
            ffp ffpVar = this.j;
            xht xhtVar = xht.a;
            xhs xhsVar = new xhs();
            xho xhoVar = xho.a;
            xhn xhnVar = new xhn();
            if ((xhnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xhnVar.y();
            }
            xho xhoVar2 = (xho) xhnVar.b;
            xhoVar2.c = xgwVarA;
            xhoVar2.b = 5;
            xho xhoVarA = xkj.a(xhnVar);
            if ((xhsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xhsVar.y();
            }
            xht xhtVar2 = (xht) xhsVar.b;
            xhtVar2.c = xhoVarA;
            xhtVar2.b = 3;
            ffpVar.l(xlq.a(xhsVar), "tapInput", Optional.empty());
        } catch (IOException e) {
            throw new RuntimeException(a.x(xkcVar, "Serializing ", " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    @Override // defpackage.ffk
    public final void t(String str, int i) {
        S();
        if (!N()) {
            Q();
        } else {
            this.j.c("led_set_is_hotword_source_false");
            o(str, i);
        }
    }

    @Override // defpackage.ffk
    public final void u() {
        fbl.b(false, this.L);
        this.j.c("led_to_idle_state");
        this.r = null;
    }

    @Override // defpackage.ffk
    public final void v() {
        this.M = null;
    }

    @Override // defpackage.ffo
    public final void w() {
        this.j.b(true);
        this.q++;
    }

    @Override // defpackage.ffo
    public final void x() {
        this.j.b(false);
        this.q--;
    }

    public final SuggestionChipList y(byte[] bArr) {
        xqo xqoVarA = hst.a.a(bArr);
        if (xqoVarA == null) {
            return null;
        }
        xqoVarA.c.size();
        hab habVar = this.K;
        hsx hsxVar = SuggestionChipList.a;
        yyk yykVarI = yyk.i(habVar);
        yykVarI.getClass();
        return hsxVar.b(xqoVarA, yykVarI, this.t);
    }

    public final aeal z(byte[] bArr) throws abxv {
        byte bByteValue;
        try {
            abxd abxdVarH = abxd.h(aeal.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                if (bByteValue != 0) {
                    boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                    abxdVarH.cM(2, true != zL ? null : abxdVarH);
                    if (zL) {
                    }
                }
                throw new abzz().a();
            }
            return (aeal) abxdVarH;
        } catch (abxv e) {
            ((zdv) ((zdv) b.c()).p(e).q("com/google/android/apps/tvsearch/controller/libas/LibAsHandler", "getVoiceSearchResponseFromClientArgs", 945, "LibAsHandler.kt")).u("Invalid VoiceSearchResponseArgs, cannot parse.");
            return null;
        }
    }
}

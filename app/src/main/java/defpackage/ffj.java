package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.tvsearch.results.searchentity.info.EntityInfo;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import com.google.android.katniss.R;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ffj implements fev, fey, jad, ffn {
    public static final ffa a = new ffa();
    public static final zdy b = zdy.h("com/google/android/apps/tvsearch/controller/SearchController");
    public static final Duration c;
    public static final Duration d;
    private static final Duration i;
    private static final Duration j;
    private static final Duration k;
    private static final Duration l;
    private static final Duration m;
    private static final List n;
    private static final jov o;
    private final agow A;
    private final aehf B;
    private hrw C;
    private htu D;
    private String E;
    private jae F;
    private boolean G;
    private final fff H;
    private boolean I;
    private boolean J;
    private Duration K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private oat P;
    private SuggestionChipList Q;
    private final gyh R;
    public final Context e;
    public final ffm f;
    public final izr g;
    public hkx h;
    private final AccessibilityManager p;
    private final ahbt q;
    private final agow r;
    private final gph s;
    private final hka t;
    private final exl u;
    private final agow v;
    private final agow w;
    private final agow x;
    private final ffk y;
    private final agow z;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        durationOfSeconds.getClass();
        i = durationOfSeconds;
        Duration durationOfSeconds2 = Duration.ofSeconds(60L);
        durationOfSeconds2.getClass();
        j = durationOfSeconds2;
        Duration durationOfSeconds3 = Duration.ofSeconds(10L);
        durationOfSeconds3.getClass();
        k = durationOfSeconds3;
        Duration durationOfSeconds4 = Duration.ofSeconds(30L);
        durationOfSeconds4.getClass();
        l = durationOfSeconds4;
        Duration durationOfSeconds5 = Duration.ofSeconds(15L);
        durationOfSeconds5.getClass();
        m = durationOfSeconds5;
        n = agqq.d("google-sans", "google-sans-medium", "google-sans-display-regular");
        Duration durationOfSeconds6 = Duration.ofSeconds(15L);
        durationOfSeconds6.getClass();
        c = durationOfSeconds6;
        Duration durationOfMillis = Duration.ofMillis(800L);
        durationOfMillis.getClass();
        d = durationOfMillis;
        o = jov.e(4).a();
    }

    public ffj(AccessibilityManager accessibilityManager, Context context, ahbt ahbtVar, agow agowVar, gph gphVar, hka hkaVar, gyh gyhVar, exl exlVar, agow agowVar2, agow agowVar3, agow agowVar4, ezn eznVar, ffm ffmVar, ffk ffkVar, idl idlVar, izr izrVar, agow agowVar5, agow agowVar6, aehf aehfVar) {
        context.getClass();
        ahbtVar.getClass();
        agowVar4.getClass();
        eznVar.getClass();
        ffkVar.getClass();
        idlVar.getClass();
        agowVar5.getClass();
        agowVar6.getClass();
        aehfVar.getClass();
        this.p = accessibilityManager;
        this.e = context;
        this.q = ahbtVar;
        this.r = agowVar;
        this.s = gphVar;
        this.t = hkaVar;
        this.R = gyhVar;
        this.u = exlVar;
        this.v = agowVar2;
        this.w = agowVar3;
        this.x = agowVar4;
        this.f = ffmVar;
        this.y = ffkVar;
        this.g = izrVar;
        this.z = agowVar5;
        this.A = agowVar6;
        this.B = aehfVar;
        this.E = "";
        this.H = new ffg(this);
        this.J = true;
        this.K = ffl.b;
    }

    private final void V() {
        this.y.n();
    }

    private final void W(hkx hkxVar, boolean z) {
        gph gphVar = this.s;
        this.C = (gphVar == gph.a || gphVar == gph.c || (hkxVar != null && ((hky) hkxVar).i)) ? this.t.am() : this.t.an(z);
    }

    private final void X() {
        this.f.a();
    }

    private final void Y(hrw hrwVar) {
        if (hrwVar != null) {
            this.f.r(hrwVar);
            this.D = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void Z(defpackage.hkx r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffj.Z(hkx):void");
    }

    private final void aa(hkx hkxVar) {
        String str = ((hky) hkxVar).k;
        if (str.length() > 0) {
            this.f.m(str);
        }
    }

    private final void ab(SuggestionChipList suggestionChipList, boolean z) {
        oat oatVar;
        int iA;
        ad(suggestionChipList);
        if (z && (oatVar = this.P) != null) {
            abeq abeqVarA = a.a(suggestionChipList);
            try {
                int i2 = abeqVarA.memoizedSerializedSize;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(abeqVarA.getClass()).a(abeqVarA);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i2 & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(abeqVarA.getClass()).a(abeqVarA);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        abeqVarA.memoizedSerializedSize = (Integer.MIN_VALUE & abeqVarA.memoizedSerializedSize) | iA;
                    }
                }
                byte[] bArr = new byte[iA];
                boolean z2 = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(abeqVarA.getClass()).m(abeqVarA, abwa.a(abvwVar));
                abvwVar.K();
                oatVar.b("android-tv-amati-suggestion-chip", bArr);
            } catch (IOException e) {
                throw new RuntimeException(a.x(abeqVarA, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
            }
        }
        this.Q = suggestionChipList;
        hrw hrwVar = this.C;
        if (hrwVar != null) {
            hrwVar.br = suggestionChipList;
        }
        htu htuVar = this.D;
        if (htuVar != null) {
            htuVar.aD(suggestionChipList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ac(java.lang.String r8, int r9) throws defpackage.lxd, java.lang.NumberFormatException {
        /*
            r7 = this;
            r0 = 1
            r7.U(r0)
            r0 = 0
            r7.G = r0
            ffk r1 = r7.y
            r1.t(r8, r9)
            gyh r8 = r7.R
            android.content.ContentResolver r8 = r8.a
            java.lang.String r9 = "aah:num_prequeried_high_usage_providers"
            lxa r1 = defpackage.lwy.a
            monitor-enter(r1)
            r2 = r1
            lxe r2 = (defpackage.lxe) r2     // Catch: java.lang.Throwable -> L75
            r2.d(r8)     // Catch: java.lang.Throwable -> L75
            r2 = r1
            lxe r2 = (defpackage.lxe) r2     // Catch: java.lang.Throwable -> L75
            java.lang.Object r2 = r2.e     // Catch: java.lang.Throwable -> L75
            r3 = r1
            lxe r3 = (defpackage.lxe) r3     // Catch: java.lang.Throwable -> L75
            java.util.HashMap r3 = r3.c     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L75
            r5 = r1
            lxe r5 = (defpackage.lxe) r5     // Catch: java.lang.Throwable -> L75
            java.lang.Object r3 = r5.b(r3, r9, r4)     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L75
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L75
            r4 = 0
            if (r3 == 0) goto L3b
            int r8 = r3.intValue()
            goto L5b
        L3b:
            r5 = r1
            lxe r5 = (defpackage.lxe) r5
            java.lang.String r8 = r5.a(r8, r9, r4)
            if (r8 != 0) goto L46
        L44:
            r8 = r0
            goto L4e
        L46:
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L44
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.NumberFormatException -> L44
        L4e:
            monitor-enter(r1)
            r5 = r1
            lxe r5 = (defpackage.lxe) r5     // Catch: java.lang.Throwable -> L72
            java.util.HashMap r5 = r5.c     // Catch: java.lang.Throwable -> L72
            r6 = r1
            lxe r6 = (defpackage.lxe) r6     // Catch: java.lang.Throwable -> L72
            r6.e(r2, r5, r9, r3)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
        L5b:
            if (r8 <= 0) goto L71
            ahbt r9 = r7.q
            ffh r1 = new ffh
            r1.<init>(r7, r8, r4)
            r8 = 3
            ahdl r8 = defpackage.ahal.e(r9, r4, r0, r1, r8)
            fez r9 = new fez
            r9.<init>()
            r8.w(r9)
        L71:
            return
        L72:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            throw r8
        L75:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L75
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffj.ac(java.lang.String, int):void");
    }

    private final void ad(SuggestionChipList suggestionChipList) {
        this.f.z(suggestionChipList);
    }

    private final void ae() {
        hrw hrwVarAo = this.t.ao();
        this.C = hrwVarAo;
        Y(hrwVarAo);
    }

    private final void af(Duration duration) {
        this.K = duration;
        if (this.O || this.H.e()) {
            return;
        }
        this.f.A(this.K);
    }

    private final boolean ag(hkx hkxVar) {
        adyz adyzVar;
        if (!hkxVar.h()) {
            return false;
        }
        aeal aealVar = ((hky) hkxVar).e;
        if (aealVar != null) {
            adyj adyjVar = aealVar.c;
            if (adyjVar == null) {
                adyjVar = adyj.a;
            }
            adyd adydVar = adyjVar.d;
            if (adydVar == null) {
                adydVar = adyd.a;
            }
            adyzVar = adydVar.q;
            if (adyzVar == null) {
                adyzVar = adyz.a;
            }
        } else {
            adyzVar = adyz.a;
        }
        adyx adyxVar = adyzVar.d;
        if (adyxVar == null) {
            adyxVar = adyx.a;
        }
        adyxVar.getClass();
        if (!adyxVar.c) {
            abxs abxsVar = adyzVar.c;
            abxsVar.getClass();
            if (abxsVar.isEmpty()) {
                return false;
            }
            Iterator<E> it = abxsVar.iterator();
            while (it.hasNext()) {
                adyx adyxVar2 = ((adzm) it.next()).c;
                if (adyxVar2 == null) {
                    adyxVar2 = adyx.a;
                }
                if (adyxVar2.c) {
                }
            }
            return false;
        }
        return true;
    }

    private final boolean ah(String str, Set set, Set set2, Set set3, List list, boolean z) {
        hrw hrwVar;
        List list2;
        this.E = str;
        str.getClass();
        jab jabVar = (jab) this.g;
        jabVar.hashCode();
        jabVar.b();
        jae jaeVar = null;
        if (str.length() != 0) {
            List listX = agqq.x(jabVar.b.c());
            ArrayList arrayList = new ArrayList();
            for (Object obj : listX) {
                if (((jba) obj).m()) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                jabVar.hashCode();
            } else {
                if (list != null) {
                    list.clear();
                    list2 = list;
                } else {
                    list2 = null;
                }
                List listA = irw.a(list2);
                if (set == null) {
                    set = agrf.a;
                }
                if (set3 == null) {
                    set3 = agrf.a;
                }
                agqq.k(listA, jabVar.e(arrayList, set, set3, jabVar.f.a()));
                if (set2 == null) {
                    set2 = agrf.a;
                }
                Set set4 = set2;
                if (!listA.isEmpty()) {
                    jae jaeVar2 = new jae(listA.size(), str);
                    jabVar.d = ahal.e(jabVar.a, null, 0, new izx(listA, this, jaeVar2, jabVar, str, set4, null), 3);
                    jaeVar = jaeVar2;
                }
            }
        }
        this.F = jaeVar;
        if (jaeVar == null) {
            return false;
        }
        if (!z || (hrwVar = this.C) == null) {
            return true;
        }
        hrwVar.bF();
        return true;
    }

    @Override // defpackage.fey
    public final void A() {
        this.f.w();
    }

    @Override // defpackage.fey, defpackage.ffn
    public final void B() {
        if (this.C == null) {
            hkx hkxVar = this.h;
            hmx hmxVar = hkxVar != null ? ((hky) hkxVar).a : null;
            if (true != (hmxVar instanceof hrw)) {
                hmxVar = null;
            }
            this.C = (hrw) hmxVar;
        }
        hrw hrwVar = this.C;
        if (hrwVar == null) {
            ((zdv) b.c().q("com/google/android/apps/tvsearch/controller/SearchController", "removeShelfAsRenderedCard", 285, "SearchController.kt")).u("Unable to remove shelf as RenderedCard: currentFragment not found");
            return;
        }
        hrwVar.bC();
        hkx hkxVar2 = this.h;
        if (hkxVar2 != null) {
            ((hky) hkxVar2).b = null;
        }
    }

    @Override // defpackage.fey
    public final void C(boolean z) {
        this.M = z;
    }

    @Override // defpackage.fey
    public final void D(Bundle bundle) {
        bq bqVarP = this.t.P();
        if (bqVarP != null) {
            hkb.b(bqVarP).putAll(bundle);
        } else {
            bqVarP = null;
        }
        if (bqVarP != null) {
            this.f.r(bqVarP);
            return;
        }
        ffm ffmVar = this.f;
        CharSequence text = this.e.getText(R.string.assistant_internal_error);
        text.getClass();
        ffmVar.m(text);
    }

    @Override // defpackage.fey
    public final void E() {
        this.f.x();
    }

    @Override // defpackage.fey
    public final void F() {
        af(m);
    }

    @Override // defpackage.fey
    public final void G(boolean z) {
        this.O = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    @Override // defpackage.fey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(defpackage.jov r4) {
        /*
            r3 = this;
            r0 = r4
            job r0 = (defpackage.job) r0
            int r0 = r0.a
            if (r0 == 0) goto L3a
            r1 = 18
            if (r0 == r1) goto L25
            r1 = 4
            r2 = 1
            if (r0 == r1) goto L22
            r1 = 5
            if (r0 == r1) goto L1e
            r1 = 10
            if (r0 == r1) goto L3a
            r1 = 11
            if (r0 == r1) goto L1b
            goto L42
        L1b:
            r3.G = r2
            goto L42
        L1e:
            r0 = 0
            r3.N = r0
            goto L42
        L22:
            r3.N = r2
            goto L42
        L25:
            boolean r0 = r3.G
            if (r0 != 0) goto L36
            agow r0 = r3.z
            java.lang.Object r0 = r0.a()
            ghr r0 = (defpackage.ghr) r0
            r1 = 8
            r0.aa(r1)
        L36:
            r3.q()
            goto L42
        L3a:
            r3.L()
            r0 = 0
            r3.C = r0
            r3.D = r0
        L42:
            ffm r0 = r3.f
            r0.y(r4)
            htu r0 = r3.D
            if (r0 == 0) goto L4e
            r0.aF(r4)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffj.H(jov):void");
    }

    @Override // defpackage.fey
    public final void I() {
        this.f.t();
    }

    @Override // defpackage.fey
    public final void J() {
        this.J = false;
    }

    @Override // defpackage.ffn
    public final bq K(hkx hkxVar, List list) {
        ffj ffjVar;
        if (hkxVar == null || hkxVar.i()) {
            return null;
        }
        this.h = hkxVar;
        this.C = this.t.am();
        if (hkxVar.k()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((htg) it.next()).e());
            }
            Set setZ = agqq.z(arrayList);
            Set setE = hkxVar.e();
            if (setE != null) {
                agqq.k(setZ, setE);
            }
            ffjVar = this;
            ffjVar.ah(hkxVar.b(), null, hkxVar.f(), setZ, null, ag(hkxVar));
        } else {
            ffjVar = this;
        }
        hrw hrwVar = ffjVar.C;
        if (hrwVar != null) {
            hrwVar.et(list);
            int i2 = ffm.so;
            af(ffl.a);
        }
        hrw hrwVar2 = ffjVar.C;
        if (hrwVar2 != null) {
            hrwVar2.bB(ffjVar.h, !ffjVar.I);
        }
        ffjVar.D = null;
        return ffjVar.C;
    }

    public final void L() {
        this.g.b();
        this.E = "";
        this.F = null;
        this.H.d.removeCallbacksAndMessages(null);
        hrw hrwVar = this.C;
        if (hrwVar != null) {
            hrwVar.br();
        }
    }

    @Override // defpackage.ffn
    public final void M() {
        ae();
    }

    @Override // defpackage.ffn
    public final void N() {
        this.y.v();
    }

    @Override // defpackage.ffn
    public final void O() {
        this.y.m(this);
    }

    @Override // defpackage.ffn
    public final void P() {
        Object objA = this.B.a();
        objA.getClass();
        tkw tkwVar = (tkw) objA;
        tkwVar.j().b.b();
        toj tojVarK = tkwVar.k();
        List list = n;
        yyf yyfVarG = yyk.g(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yyfVarG.g(tojVarK.c((String) it.next()));
        }
        yyfVarG.f();
        this.P = tkwVar.c();
        this.J = true;
        this.y.l(this);
    }

    @Override // defpackage.ffn
    public final void Q(boolean z) {
        this.J = true;
        U(z);
        this.y.u();
        ((huc) this.A.a()).a();
    }

    @Override // defpackage.ffn
    public final void R() {
        V();
    }

    @Override // defpackage.ffn
    public final void S() {
        U(true);
        this.E = "";
        this.F = null;
    }

    @Override // defpackage.ffn
    public final void T(String str) throws lxd, NumberFormatException {
        str.getClass();
        ac(str, 10);
    }

    @Override // defpackage.ffn
    public final void U(boolean z) {
        L();
        if (z) {
            V();
        }
        hrw hrwVar = this.C;
        if (hrwVar != null) {
            hrwVar.bv = false;
            hoh hohVar = hrwVar.aH;
            if (hohVar != null) {
                hohVar.j = false;
            }
        }
        this.C = null;
        this.D = null;
        this.Q = null;
        this.F = null;
        this.E = "";
        this.H.a = null;
        this.h = null;
        this.I = false;
        int i2 = ffm.so;
        this.K = ffl.b;
    }

    @Override // defpackage.fev
    public final void a() {
        ae();
    }

    @Override // defpackage.jad
    public final void ai(jae jaeVar) {
        this.F = jaeVar;
        hrw hrwVar = this.C;
        if (hrwVar != null) {
            boolean zIsEmpty = jaeVar.c.isEmpty();
            boolean z = !zIsEmpty;
            ArrayList arrayList = new ArrayList();
            while (!jaeVar.d()) {
                htg htgVarA = jaeVar.a();
                if (htgVarA != null) {
                    arrayList.add(htgVarA);
                }
            }
            final fff fffVar = this.H;
            if (fffVar.e()) {
                hrwVar.bB.addAll(arrayList);
                if (!zIsEmpty || !jaeVar.c()) {
                    fffVar.h = z;
                    fffVar.g = true;
                    if (fffVar.f == null) {
                        fffVar.d.post(new Runnable() { // from class: ffc
                            @Override // java.lang.Runnable
                            public final void run() {
                                fffVar.b();
                            }
                        });
                    }
                }
            } else {
                hrwVar.et(arrayList);
            }
        }
        if (!jaeVar.c()) {
            fff fffVar2 = this.H;
            fffVar2.d.removeCallbacks(fffVar2.e);
            hrw hrwVar2 = this.C;
            if (hrwVar2 != null) {
                hrwVar2.br();
            }
        }
        af(this.K);
    }

    @Override // defpackage.fev
    public final void b(fat fatVar) {
        fatVar.getClass();
        U(true);
        this.y.s(fatVar.dA());
        EntityInfo entityInfoDz = fatVar.dz();
        boolean zJ = fatVar.j();
        W(null, true);
        hrw hrwVar = this.C;
        if (hrwVar != null) {
            hrwVar.bs = entityInfoDz;
            hrwVar.bt = zJ;
            hrwVar.bo = zpg.OPA_TV_IMPRESSION_NATIVE_NAVI_SEARCH;
            hrwVar.bp = 13976;
            if (hrwVar.R != null) {
                hrwVar.bE(hrwVar.b);
            }
            hrwVar.bv = false;
            hrwVar.bw = false;
            hrwVar.bx = true;
            hrwVar.by();
        }
        Y(this.C);
    }

    @Override // defpackage.fev
    public final void c() {
        X();
    }

    @Override // defpackage.fev
    public final void d(abvo abvoVar, int i2) {
        abvoVar.getClass();
        U(true);
        this.G = false;
        this.y.q(abvoVar, i2);
    }

    @Override // defpackage.fev
    public final void e(Intent intent) {
        U(true);
        this.G = false;
        this.y.r(intent);
    }

    @Override // defpackage.fev, defpackage.ffn
    public final void f(String str) {
        htu htuVar = this.D;
        if (htuVar != null) {
            jou jouVarE = jov.e(3);
            ((joa) jouVarE).b = str;
            htuVar.aF(jouVarE.a());
        }
        U(true);
        this.y.o(str, 2);
    }

    @Override // defpackage.fev
    public final void g(xkc xkcVar) {
        this.y.s(xkcVar);
    }

    @Override // defpackage.fev
    public final void h(String str, int i2) throws lxd, NumberFormatException {
        str.getClass();
        ac(str, i2);
    }

    @Override // defpackage.fey
    public final void i(xps xpsVar) {
        hrw hrwVar = this.C;
        if (hrwVar != null) {
            hrwVar.bk(xpsVar);
        } else {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/controller/SearchController", "addDisclaimerChips", 1156, "SearchController.kt")).u("Wrongly #addDisclaimerChips into non-SearchRowsFragment");
        }
    }

    @Override // defpackage.fey
    public final void j(xqe xqeVar, boolean z) {
        List list;
        hrw hrwVar = this.C;
        if (hrwVar == null) {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/controller/SearchController", "addMediaBrowseRow", 596, "SearchController.kt")).u("Wrongly #addMediaBrowseRow into non-SearchRowsFragment");
            return;
        }
        if (z && (list = ((hky) hrwVar.bq).f) != null) {
            list.add(xqeVar);
        }
        if (hrwVar.bJ) {
            hrwVar.aY();
            hrwVar.bC.add(xqeVar);
            hrwVar.aR(hrwVar.aH == null ? 0 : 1);
            hrwVar.aT();
            return;
        }
        if (hrwVar.bH || (hrwVar.bI && hrwVar.aK.e() == 1)) {
            if (((hky) hrwVar.bq).r) {
                return;
            }
            hrwVar.bp(xqeVar, xqeVar.c);
        } else if (z) {
            hrwVar.bC.add(xqeVar);
        }
    }

    @Override // defpackage.fey
    public final void k(List list) {
        hkx hkxVar = this.h;
        if (hkxVar == null) {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/controller/SearchController", "addMediaOnDeviceLookupEntries", 605, "SearchController.kt")).u("#addMediaOnDeviceLookupEntries with null ResponseWrapper");
        } else {
            hkxVar.g(list);
            Z(hkxVar);
        }
    }

    @Override // defpackage.fey
    public final void l(xpy xpyVar) {
        hrw hrwVar = this.C;
        if (hrwVar != null) {
            hrwVar.aP(xpyVar);
        } else {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/controller/SearchController", "addPivotRow", 583, "SearchController.kt")).u("Wrongly #addPivotRow into non-SearchRowsFragment");
        }
    }

    @Override // defpackage.fey
    public final void m(xpu xpuVar) {
        hrw hrwVar = this.C;
        if (hrwVar != null) {
            hrwVar.aQ(xpuVar);
        } else {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/controller/SearchController", "addRefinementRow", 588, "SearchController.kt")).u("Wrongly #addRefinementRow into non-SearchRowsFragment");
        }
    }

    @Override // defpackage.fey
    public final void n(abky abkyVar) {
        hrw hrwVar = this.C;
        if (hrwVar != null) {
            hrwVar.bo(abkyVar);
        } else {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/controller/SearchController", "addShelfAsRenderedCard", 1150, "SearchController.kt")).u("Wrongly #addShelfAsRenderedCard into non-SearchRowsFragment");
        }
    }

    @Override // defpackage.fey
    public final void o(far farVar) {
        farVar.e = this.J;
        this.f.p(farVar);
    }

    @Override // defpackage.fey
    public final void p(xob xobVar) {
        xoa xoaVarB = xoa.b(xobVar.b);
        if (xoaVarB == null) {
            xoaVarB = xoa.UNRECOGNIZED;
        }
        ffm ffmVar = this.f;
        xoaVarB.getClass();
        ffmVar.s(xoaVarB);
        xoa xoaVarB2 = xoa.b(xobVar.b);
        if (xoaVarB2 == null) {
            xoaVarB2 = xoa.UNRECOGNIZED;
        }
        int iOrdinal = xoaVarB2.ordinal();
        if (iOrdinal == 1 || iOrdinal == 5 || iOrdinal == 6 || iOrdinal == 7 || iOrdinal == 8) {
            af(ffl.a);
        }
    }

    @Override // defpackage.fey
    public final void q() {
        if (!this.L) {
            af(this.K);
        } else {
            this.f.u();
            af(this.K);
        }
    }

    @Override // defpackage.fey
    public final void r(String str) {
        this.J = false;
        agow agowVar = this.x;
        ((gmd) agowVar.a()).a(gmc.K);
        ((gmd) agowVar.a()).a(gmc.L);
        ((gmd) agowVar.a()).a(gmc.N);
        ((gmd) agowVar.a()).a(gmc.M);
        ((gmd) agowVar.a()).a(gmc.O);
        this.L = true;
        af(k);
        this.f.z(SuggestionChipList.a.a(str));
    }

    @Override // defpackage.fey
    public final void s(xps xpsVar) {
        int iA;
        oat oatVar = this.P;
        if (oatVar != null) {
            abem abemVar = abem.a;
            abel abelVar = new abel();
            DesugarCollections.unmodifiableList(((abem) abelVar.b).b).getClass();
            abxs abxsVar = (xpsVar.b == 2 ? (xpm) xpsVar.c : xpm.a).b;
            abxsVar.getClass();
            if ((abelVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                abelVar.y();
            }
            abem abemVar2 = (abem) abelVar.b;
            abxs abxsVar2 = abemVar2.b;
            if (!abxsVar2.c()) {
                int size = abxsVar2.size();
                abemVar2.b = abxsVar2.d(size + size);
            }
            abus.m(abxsVar, abemVar2.b);
            abxd abxdVarV = abelVar.v();
            abxdVarV.getClass();
            abem abemVar3 = (abem) abxdVarV;
            try {
                int i2 = abemVar3.memoizedSerializedSize;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(abemVar3.getClass()).a(abemVar3);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i2 & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(abemVar3.getClass()).a(abemVar3);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        abemVar3.memoizedSerializedSize = (abemVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                    }
                }
                byte[] bArr = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(abemVar3.getClass()).m(abemVar3, abwa.a(abvwVar));
                abvwVar.K();
                oatVar.b("android-tv-amati-disclaimer-chips", bArr);
            } catch (IOException e) {
                throw new RuntimeException(a.x(abemVar3, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        if (r1 != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017c  */
    @Override // defpackage.fey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(defpackage.xqg r14, java.lang.String r15) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffj.t(xqg, java.lang.String):void");
    }

    @Override // defpackage.fey
    public final void u(xqk xqkVar) throws abxv {
        int iA;
        ((gfr) this.w.a()).a(rpm.bU(), abqb.OK, null, null);
        abek abekVar = abek.a;
        abej abejVar = new abej();
        Iterator it = xqkVar.b.iterator();
        while (true) {
            byte b2 = 0;
            if (!it.hasNext()) {
                abxd abxdVarV = abejVar.v();
                abxdVarV.getClass();
                abek abekVar2 = (abek) abxdVarV;
                oat oatVar = this.P;
                if (oatVar != null) {
                    try {
                        int i2 = abekVar2.memoizedSerializedSize;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            iA = abza.a.a(abekVar2.getClass()).a(abekVar2);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                        } else {
                            iA = i2 & Integer.MAX_VALUE;
                            if (iA == Integer.MAX_VALUE) {
                                iA = abza.a.a(abekVar2.getClass()).a(abekVar2);
                                if (iA < 0) {
                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                }
                                abekVar2.memoizedSerializedSize = (abekVar2.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                            }
                        }
                        byte[] bArr = new byte[iA];
                        boolean z = abvz.e;
                        abvw abvwVar = new abvw(bArr, 0, iA);
                        abza.a.a(abekVar2.getClass()).m(abekVar2, abwa.a(abvwVar));
                        abvwVar.K();
                        oatVar.b("android-tv-amati-davinci-shelves", bArr);
                        return;
                    } catch (IOException e) {
                        throw new RuntimeException(a.x(abekVar2, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
                    }
                }
                return;
            }
            xqi xqiVar = (xqi) it.next();
            xqm xqmVar = xqiVar.c;
            if (xqmVar == null) {
                xqmVar = xqm.a;
            }
            if ((xqmVar.b & 1) != 0) {
                xqm xqmVar2 = xqiVar.c;
                if (xqmVar2 == null) {
                    xqmVar2 = xqm.a;
                }
                addb addbVar = xqmVar2.c;
                if (addbVar == null) {
                    addbVar = addb.a;
                }
                addbVar.getClass();
                Object objA = this.B.a();
                objA.getClass();
                tkw tkwVar = (tkw) objA;
                tjl tjlVarG = tkwVar.g();
                adax adaxVar = addbVar.d;
                if (adaxVar == null) {
                    adaxVar = adax.a;
                }
                tjlVarG.a(adaxVar);
                tjk tjkVarF = tkwVar.f();
                adct adctVar = addbVar.e;
                if (adctVar == null) {
                    adctVar = adct.a;
                }
                tjkVarF.a(adctVar);
                try {
                    abuy abuyVar = addbVar.c;
                    if (abuyVar == null) {
                        abuyVar = abuy.a;
                    }
                    abvo abvoVar = abuyVar.c;
                    ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                    acvw acvwVar = acvw.a;
                    abvt abvtVarK = abvoVar.k();
                    acvw acvwVar2 = new acvw();
                    try {
                        try {
                            try {
                                try {
                                    abzj abzjVarA = abza.a.a(acvwVar2.getClass());
                                    abzjVarA.i(acvwVar2, abvu.p(abvtVarK), generatedRegistry);
                                    abzjVarA.g(acvwVar2);
                                    try {
                                        abvtVarK.z(0);
                                        byte b3 = acvwVar2.f;
                                        Byte.valueOf(b3).getClass();
                                        if (b3 != 1) {
                                            if (b3 != 0) {
                                                boolean zL = abza.a.a(acvwVar2.getClass()).l(acvwVar2);
                                                if ((true != zL ? null : acvwVar2) != null) {
                                                    b2 = 1;
                                                }
                                                acvwVar2.f = b2;
                                                if (!zL) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        DesugarCollections.unmodifiableList(((abek) abejVar.b).b).getClass();
                                        abei abeiVar = abei.a;
                                        abeh abehVar = new abeh();
                                        if ((abehVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            abehVar.y();
                                        }
                                        abei abeiVar2 = (abei) abehVar.b;
                                        abeiVar2.c = acvwVar2;
                                        abeiVar2.b = 1 | abeiVar2.b;
                                        abxd abxdVarV2 = abehVar.v();
                                        abxdVarV2.getClass();
                                        abei abeiVar3 = (abei) abxdVarV2;
                                        if ((abejVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            abejVar.y();
                                        }
                                        abek abekVar3 = (abek) abejVar.b;
                                        abxs abxsVar = abekVar3.b;
                                        if (!abxsVar.c()) {
                                            int size = abxsVar.size();
                                            abekVar3.b = abxsVar.d(size + size);
                                        }
                                        abekVar3.b.add(abeiVar3);
                                        gfq.a((gfr) this.w.a(), rpm.em(), abqb.OK, 8);
                                        ((ghr) this.z.a()).af();
                                    } catch (abxv e2) {
                                        throw e2;
                                    }
                                } catch (RuntimeException e3) {
                                    if (!(e3.getCause() instanceof abxv)) {
                                        throw e3;
                                    }
                                    throw ((abxv) e3.getCause());
                                }
                            } catch (abxv e4) {
                                if (!e4.a) {
                                    throw e4;
                                }
                                throw new abxv(e4);
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
                    ((zdv) ((zdv) b.c()).p(e7).q("com/google/android/apps/tvsearch/controller/SearchController", "onShelvesReceived", 1003, "SearchController.kt")).x("[DaVinci] Error parsing element tree: %s", e7);
                    gfq.a((gfr) this.w.a(), rpm.em(), abqb.UNKNOWN, 8);
                }
            }
        }
        throw new abzz().a();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    @Override // defpackage.fey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(defpackage.hkx r21) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffj.v(hkx):void");
    }

    @Override // defpackage.fey
    public final void w(SuggestionChipList suggestionChipList) {
        ab(suggestionChipList, true);
    }

    @Override // defpackage.fey
    public final void x(String str, String str2) {
        if (str.length() == 0) {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/controller/SearchController", "onTextReadyToDisplay", 1161, "SearchController.kt")).u("#onTextReadyToDisplay with empty text.");
            if (((Boolean) this.r.a()).booleanValue()) {
                agow agowVar = this.v;
                gfl gflVarA = ((gfn) agowVar.a()).a(rpm.cQ()).a(str2);
                gflVarA.h(str2);
                gflVarA.c();
                gfg gfgVarA = ((gfn) agowVar.a()).c(rpm.dX()).a(str2);
                gfgVarA.g(str2);
                gfgVarA.c(abqb.OK);
                return;
            }
            return;
        }
        agow agowVar2 = this.r;
        if (((Boolean) agowVar2.a()).booleanValue()) {
            gfl gflVarA2 = ((gfn) this.v.a()).a(rpm.cX()).a(str2);
            gflVarA2.h(str2);
            gflVarA2.c();
        }
        if (this.D != null) {
            if (((Boolean) agowVar2.a()).booleanValue()) {
                gfl gflVarA3 = ((gfn) this.v.a()).a(rpm.cP()).a(str2);
                gflVarA3.h(str2);
                gflVarA3.c();
            }
            htu htuVar = this.D;
            if (htuVar != null) {
                hkb.g(htuVar, str2);
            }
            htu htuVar2 = this.D;
            if (htuVar2 != null) {
                htuVar2.aB(str);
            }
            af(i);
            this.L = false;
            return;
        }
        htu htuVarAp = this.t.ap(str);
        this.D = htuVarAp;
        if (!(htuVarAp instanceof bq)) {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/controller/SearchController", "onTextReadyToDisplay", 1228, "SearchController.kt")).u("#onTextReadyToDisplay unable to create the Fragment.");
            if (((Boolean) agowVar2.a()).booleanValue()) {
                gfg gfgVarA2 = ((gfn) this.v.a()).c(rpm.dX()).a(str2);
                gfgVarA2.g(str2);
                gfgVarA2.c(abqb.INTERNAL);
                return;
            }
            return;
        }
        if (((Boolean) agowVar2.a()).booleanValue()) {
            gfl gflVarA4 = ((gfn) this.v.a()).a(rpm.cV()).a(str2);
            gflVarA4.h(str2);
            gflVarA4.c();
        }
        hkb.g(htuVarAp, str2);
        ((gfr) this.w.a()).b(rpm.m212do(), null, null);
        ((gmd) this.x.a()).l(gmc.O);
        af(i);
        this.L = false;
        if (this.N) {
            jov jovVar = o;
            jovVar.getClass();
            htuVarAp.aF(jovVar);
        }
        SuggestionChipList suggestionChipList = this.Q;
        if (suggestionChipList != null) {
            htuVarAp.aD(suggestionChipList);
        }
        this.f.r(htuVarAp);
    }

    @Override // defpackage.fey
    public final void y(SuggestionChipList suggestionChipList) {
        ad(suggestionChipList);
    }

    @Override // defpackage.fey
    public final void z() {
        this.f.v();
    }
}

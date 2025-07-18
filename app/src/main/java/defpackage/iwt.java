package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwt implements iwk {
    private static final zdy v = zdy.h("com/google/android/apps/tvsearch/suggestedqueries/controller/SuggestedQueriesControllerImpl");
    public final ahbt a;
    public final gzu b;
    public final gfr c;
    public final gmd d;
    public final iwu e;
    public final flz f;
    public final agow g;
    public final ztw h;
    public final ghr i;
    public final Handler j;
    public iyd k;
    public boolean l;
    public boolean m;
    public xds n;
    public Duration o;
    public String p;
    public ffm q;
    public Runnable r;
    public Runnable s;
    public final euk t;
    public final iwj u;
    private final ffp w;
    private boolean x;
    private Duration y;
    private boolean z;

    public iwt(ahbt ahbtVar, euk eukVar, gzu gzuVar, ffp ffpVar, gfr gfrVar, gmd gmdVar, iwj iwjVar, iwu iwuVar, flz flzVar, agow agowVar, ztw ztwVar, ghr ghrVar) {
        ahbtVar.getClass();
        eukVar.getClass();
        gzuVar.getClass();
        ffpVar.getClass();
        gfrVar.getClass();
        gmdVar.getClass();
        iwuVar.getClass();
        agowVar.getClass();
        ztwVar.getClass();
        ghrVar.getClass();
        this.a = ahbtVar;
        this.t = eukVar;
        this.b = gzuVar;
        this.w = ffpVar;
        this.c = gfrVar;
        this.d = gmdVar;
        this.u = iwjVar;
        this.e = iwuVar;
        this.f = flzVar;
        this.g = agowVar;
        this.h = ztwVar;
        this.i = ghrVar;
        this.j = new Handler(Looper.getMainLooper());
        Duration duration = Duration.ZERO;
        duration.getClass();
        this.y = duration;
        Duration duration2 = Duration.ZERO;
        duration2.getClass();
        this.o = duration2;
    }

    private final void k(List list, abnb abnbVar, String str) {
        yfn yfnVar = yfn.a;
        yfl yflVar = new yfl();
        if ((yflVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yflVar.y();
        }
        yfn yfnVar2 = (yfn) yflVar.b;
        yfnVar2.c = 1;
        yfnVar2.b |= 1;
        if ((yflVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yflVar.y();
        }
        ghr ghrVar = this.i;
        yfn yfnVar3 = (yfn) yflVar.b;
        yfnVar3.d = 1;
        yfnVar3.b |= 2;
        abxd abxdVarV = yflVar.v();
        abxdVarV.getClass();
        ghrVar.s(list, abnbVar, (yfn) abxdVarV, str);
    }

    @Override // defpackage.iwk
    public final void a(ffm ffmVar) {
        if (this.q != null) {
            ((zdv) v.c().q("com/google/android/apps/tvsearch/suggestedqueries/controller/SuggestedQueriesControllerImpl", "bindToViewManager", 372, "SuggestedQueriesControllerImpl.kt")).u("#bindToViewManager called when already bound.");
        }
        this.q = ffmVar;
    }

    @Override // defpackage.iwk
    public final void b() {
        this.w.u(null);
        if (this.x) {
            gfq.a(this.c, rpm.eD(), abqb.CANCELLED, 8);
            this.d.a(gmc.U);
            Runnable runnable = this.r;
            if (runnable != null) {
                this.j.removeCallbacks(runnable);
            }
            Runnable runnable2 = this.s;
            if (runnable2 != null) {
                this.j.removeCallbacks(runnable2);
            }
            iwu iwuVar = this.e;
            iwuVar.b();
            iwuVar.c();
            this.m = false;
            this.l = false;
        }
        if (((ixd) this.g.a()).n()) {
            this.c.a(rpm.cK(), abqb.OK, null, null);
            this.d.l(gmc.S);
            this.j.post(new Runnable() { // from class: iwn
                @Override // java.lang.Runnable
                public final void run() {
                    iwt iwtVar = this.a;
                    ((ixd) iwtVar.g.a()).m();
                    iwtVar.c.a(rpm.cJ(), abqb.OK, null, null);
                    iwtVar.d.m(gmc.S);
                }
            });
        }
        this.x = false;
    }

    @Override // defpackage.iwk
    public final void c() {
        gfr gfrVar = this.c;
        gfq.a(gfrVar, rpm.eD(), abqb.CANCELLED, 8);
        gmd gmdVar = this.d;
        gmdVar.a(gmc.U);
        if (((ixd) this.g.a()).n()) {
            gfrVar.a(rpm.cK(), abqb.OK, null, null);
            gmdVar.l(gmc.S);
            this.j.post(new Runnable() { // from class: iwm
                @Override // java.lang.Runnable
                public final void run() {
                    iwt iwtVar = this.a;
                    ((ixd) iwtVar.g.a()).m();
                    iwtVar.c.a(rpm.cJ(), abqb.OK, null, null);
                    iwtVar.d.m(gmc.S);
                }
            });
        }
        Runnable runnable = this.r;
        if (runnable != null) {
            this.j.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.s;
        if (runnable2 != null) {
            this.j.removeCallbacks(runnable2);
        }
        iwu iwuVar = this.e;
        iwuVar.b();
        iwuVar.c();
        this.m = false;
        this.l = false;
        this.x = false;
    }

    @Override // defpackage.iwk
    public final void d(final abnb abnbVar) {
        abnbVar.getClass();
        if (this.z) {
            return;
        }
        this.c.b(rpm.cN(), null, null);
        this.d.l(gmc.U);
        int iOrdinal = abnbVar.ordinal();
        if (iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6 || iOrdinal == 7) {
            Duration duration = Duration.ZERO;
            duration.getClass();
            this.y = duration;
        } else if (iOrdinal == 11) {
            Duration durationOfMillis = Duration.ofMillis(800L);
            durationOfMillis.getClass();
            this.y = durationOfMillis;
        }
        this.k = new iwr(this, abnbVar);
        Runnable runnable = new Runnable() { // from class: iwl
            @Override // java.lang.Runnable
            public final void run() {
                iwt iwtVar = this;
                abnb abnbVar2 = abnbVar;
                int iOrdinal2 = abnbVar2.ordinal();
                if (iOrdinal2 == 3 || iOrdinal2 == 4 || iOrdinal2 == 5 || iOrdinal2 == 6 || iOrdinal2 == 7) {
                    ghr ghrVar = iwtVar.i;
                    yfr yfrVar = yfr.a;
                    yfp yfpVar = new yfp();
                    ygw.b(yfpVar);
                    ghrVar.t(abnbVar2, ygw.a(yfpVar), iwtVar.p);
                } else if (iOrdinal2 == 11) {
                    ghr ghrVar2 = iwtVar.i;
                    yfr yfrVar2 = yfr.a;
                    yfp yfpVar2 = new yfp();
                    ygw.b(yfpVar2);
                    ghrVar2.t(abnbVar2, ygw.a(yfpVar2), iwtVar.p);
                }
                ahal.e(iwtVar.a, null, 0, new iws(iwtVar, abnbVar2, null), 3);
            }
        };
        this.r = runnable;
        feq.e(this.j, this.y, runnable);
    }

    @Override // defpackage.iwk
    public final void e(boolean z, byte[] bArr) throws abxv {
        abnb abnbVarB;
        this.x = z;
        if (z) {
            euk eukVar = this.t;
            String str = this.b.a;
            if (str.length() == 0) {
                str = null;
            }
            int length = bArr.length;
            far farVarA = eukVar.a(str);
            farVarA.b(abvo.u(bArr, 0, length));
            this.n = farVarA.a();
            xds xdsVarA = farVarA.a();
            abmr abmrVar = xdsVarA.c;
            if (abmrVar == null) {
                abmrVar = abmr.a;
            }
            if (abmrVar.c == 26) {
                abmr abmrVar2 = xdsVarA.c;
                if (abmrVar2 == null) {
                    abmrVar2 = abmr.a;
                }
                if (abmrVar2.c != 26 || (abnbVarB = abnb.b(((Integer) abmrVar2.d).intValue())) == null) {
                    abnbVarB = abnb.UNKNOWN;
                }
                abnbVarB.getClass();
                d(abnbVarB);
                return;
            }
            return;
        }
        try {
            abvo abvoVarU = abvo.u(bArr, 0, bArr.length);
            ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
            jas jasVar = jas.a;
            abvt abvtVarK = abvoVarU.k();
            jas jasVar2 = new jas();
            try {
                try {
                    abzj abzjVarA = abza.a.a(jasVar2.getClass());
                    abzjVarA.i(jasVar2, abvu.p(abvtVarK), generatedRegistry);
                    abzjVarA.g(jasVar2);
                    try {
                        abvtVarK.z(0);
                        Byte b = (byte) 1;
                        b.getClass();
                        abxs<jaq> abxsVar = jasVar2.d;
                        abxsVar.getClass();
                        if ((jasVar2.b & 1) != 0) {
                            abnb abnbVarB2 = abnb.b(jasVar2.c);
                            if (abnbVarB2 == null) {
                                abnbVarB2 = abnb.UNKNOWN;
                            }
                            abnbVarB2.getClass();
                        }
                        if (abxsVar.isEmpty()) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (jaq jaqVar : abxsVar) {
                            if ((jaqVar.b & 1) != 0) {
                                arrayList.add(jaqVar.c);
                            }
                        }
                        ((ixd) this.g.a()).l(arrayList);
                    } catch (abxv e) {
                        throw e;
                    }
                } catch (abxv e2) {
                    if (!e2.a) {
                        throw e2;
                    }
                    throw new abxv(e2);
                } catch (abzz e3) {
                    throw e3.a();
                }
            } catch (IOException e4) {
                if (!(e4.getCause() instanceof abxv)) {
                    throw new abxv(e4);
                }
                throw ((abxv) e4.getCause());
            } catch (RuntimeException e5) {
                if (!(e5.getCause() instanceof abxv)) {
                    throw e5;
                }
                throw ((abxv) e5.getCause());
            }
        } catch (abxv e6) {
            ((zdv) ((zdv) v.b()).p(e6).q("com/google/android/apps/tvsearch/suggestedqueries/controller/SuggestedQueriesControllerImpl", "triggerContextualSpaceTips", 282, "SuggestedQueriesControllerImpl.kt")).u("Failed to parse ContextualSpaceTriggerRequest.");
        }
    }

    @Override // defpackage.iwk
    public final void f() {
        this.p = null;
        if (this.q == null) {
            ((zdv) v.d().q("com/google/android/apps/tvsearch/suggestedqueries/controller/SuggestedQueriesControllerImpl", "unbindViewManager", 385, "SuggestedQueriesControllerImpl.kt")).u("#unbindViewManager called when nothing bound.");
        } else {
            this.q = null;
        }
    }

    @Override // defpackage.iwk
    public final void g(String str) {
        this.p = str;
    }

    @Override // defpackage.iwk
    public final void h(boolean z) {
        this.z = z;
        if (z) {
            c();
        }
    }

    public final void i(List list, abnb abnbVar) {
        int iA;
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xva xvaVar = (xva) it.next();
            if ((xvaVar.b & 1) != 0) {
                arrayList.add(xvaVar.c);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ahal.e(this.a, null, 0, new iwo(abnbVar, this, null), 3);
        gfq.a(this.c, rpm.eD(), abqb.OK, 8);
        this.d.m(gmc.U);
        this.m = false;
        this.l = false;
        if (!this.x) {
            if (abnbVar == abnb.MEDIA_SEARCH_RESULT_PAGE) {
                ffm ffmVar = this.q;
                if (ffmVar != null) {
                    ffmVar.o(list);
                }
                k(list, abnbVar, this.p);
                ((ixd) this.g.a()).l(arrayList);
                return;
            }
            return;
        }
        ffp ffpVar = this.w;
        xuy xuyVar = xuy.a;
        xuv xuvVar = new xuv();
        DesugarCollections.unmodifiableList(((xuy) xuvVar.b).c).getClass();
        if ((xuvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xuvVar.y();
        }
        xuy xuyVar2 = (xuy) xuvVar.b;
        abxs abxsVar = xuyVar2.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            xuyVar2.c = abxsVar.d(size + size);
        }
        abus.m(list, xuyVar2.c);
        abxd abxdVarV = xuvVar.v();
        abxdVarV.getClass();
        xuy xuyVar3 = (xuy) abxdVarV;
        try {
            int i = xuyVar3.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(xuyVar3.getClass()).a(xuyVar3);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(xuyVar3.getClass()).a(xuyVar3);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    xuyVar3.memoizedSerializedSize = (Integer.MIN_VALUE & xuyVar3.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(xuyVar3.getClass()).m(xuyVar3, abwa.a(abvwVar));
            abvwVar.K();
            ffpVar.u(bArr);
            k(list, abnbVar, this.p);
            ((ixd) this.g.a()).l(arrayList);
        } catch (IOException e) {
            throw new RuntimeException(a.x(xuyVar3, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    @Override // defpackage.ixc
    public final void j() {
    }
}

package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unc {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public unc(rnt rntVar, tst tstVar, yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4) {
        this.e = rntVar;
        this.a = tstVar;
        this.b = yfoVar;
        this.d = yfoVar2;
        this.c = yfoVar3;
        this.f = yfoVar4;
    }

    public static final onz b(onz onzVar) {
        return onzVar.a(umy.a, new nuz(2));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad A[EDGE_INSN: B:164:0x00ad->B:33:0x00ad BREAK  A[LOOP:2: B:25:0x0089->B:165:?]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(defpackage.ntg r19, defpackage.ttm r20, defpackage.tsl r21) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unc.e(ntg, ttm, tsl):void");
    }

    private final String h() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(((uiz) this.a).f().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private static String i(String str) {
        return str.replace('-', (char) 8209);
    }

    private static String j(String str) {
        if (str != null) {
            return sij.D(str.trim());
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, unj] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, unn] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, unj] */
    public final onz a(String str, String str2, String str3, Bundle bundle) {
        int iB;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", ((uiz) this.a).d().b);
        und undVar = (und) this.b;
        bundle.putString("gmsv", Integer.toString(undVar.a()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", undVar.c());
        bundle.putString("app_ver_name", undVar.d());
        bundle.putString("firebase-app-name-hash", h());
        try {
            String str4 = ((unr) osk.s(this.f.j())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fiid-21.1.1");
        umw umwVar = (umw) this.e.a();
        upt uptVar = (upt) this.d.a();
        if (umwVar != null && uptVar != null && (iB = umwVar.b()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(uiv.h(iB)));
            bundle.putString("Firebase-Client", uptVar.a());
        }
        return ((nvc) this.c).b(bundle);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final smc c(slo sloVar) {
        wfl wflVar = new wfl(this, sloVar, 1);
        ?? r2 = this.a;
        Uri uri = sloVar.a;
        Pair pair = (Pair) Map.EL.computeIfAbsent(r2, uri, wflVar);
        smc smcVar = (smc) pair.first;
        slo sloVar2 = (slo) pair.second;
        if (sloVar.equals(sloVar2)) {
            return smcVar;
        }
        vvj vvjVar = sloVar.b;
        String strM = sij.m("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", vvjVar.getClass().getSimpleName(), uri);
        sij.s(uri.equals(sloVar2.a), strM, "uri");
        sij.s(vvjVar.equals(sloVar2.b), strM, "schema");
        sij.s(sloVar.c.equals(sloVar2.c), strM, "handler");
        sij.s(sloVar.d.equals(sloVar2.d), strM, "migrations");
        sij.s(sloVar.e.equals(sloVar2.e), strM, "variantConfig");
        sij.s(sloVar.f == sloVar2.f, strM, "useGeneratedExtensionRegistry");
        sij.s(true, strM, "enableTracing");
        throw new IllegalArgumentException(sij.m(strM, "unknown"));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public final List d(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ?? r1 = this.d;
        if (!r1.isEmpty()) {
            int i = sjn.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                skw skwVarB = ((skx) it.next()).b();
                if (skwVarB != null) {
                    arrayList2.add(skwVarB);
                }
            }
            sjn sjnVar = !arrayList2.isEmpty() ? new sjn(outputStream, arrayList2) : null;
            if (sjnVar != null) {
                arrayList.add(sjnVar);
            }
        }
        for (sky skyVar : this.f) {
            arrayList.add(skyVar.d());
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qth] */
    public final void f(Object obj, quv quvVar) {
        ?? r0 = this.c;
        String strJ = j(r0.f(obj));
        String strJ2 = j(r0.d(obj));
        qux quxVar = (qux) this.d;
        qtl qtlVar = quxVar.b;
        if (true == qtl.a(obj, r0).a) {
            strJ2 = null;
        }
        if (strJ == null) {
            strJ = strJ2;
        }
        String str = true != a.au(strJ, strJ2) ? strJ2 : null;
        strJ.getClass();
        String strI = i(strJ);
        TextView textView = (TextView) this.a;
        textView.setText(strI);
        if (str != null) {
            Object obj2 = this.e;
            String strI2 = i(str);
            int[] iArr = cww.a;
            ((View) obj2).setImportantForAccessibility(2);
            strI = a.cq(strI2, strI, "\n");
            TextView textView2 = (TextView) obj2;
            textView2.setText(strI2);
            textView2.setVisibility(0);
        } else {
            ((TextView) this.e).setVisibility(8);
        }
        Object obj3 = this.b;
        if (obj3 != null) {
            ((TextView) this.e).getVisibility();
            tst tstVar = quxVar.a;
            if (tstVar.g()) {
                tstVar.c();
            }
            ((TextView) obj3).setVisibility(8);
        }
        String strA = quvVar.a(strI);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) this.f;
        accountParticleDisc.i(obj);
        String strB = accountParticleDisc.b();
        if (strB != null) {
            strA = a.cq(strB, strA, "\n");
        }
        textView.setContentDescription(strA);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, yil] */
    public final Object g(vmd vmdVar, yih yihVar) throws Throwable {
        Object objL = ykr.l(this.d, new pfd(this, vmdVar, (yih) null, 9), yihVar);
        return objL == yio.a ? objL : ygi.a;
    }

    public unc(sjo sjoVar) {
        this.b = sjoVar.a;
        this.a = sjoVar.b;
        this.f = sjoVar.c;
        this.d = sjoVar.d;
        this.e = sjoVar.e;
        this.c = sjoVar.f;
    }

    public unc(uiz uizVar, und undVar, nvc nvcVar, unj unjVar, unj unjVar2, unn unnVar) {
        this.a = uizVar;
        this.b = undVar;
        this.c = nvcVar;
        this.d = unjVar;
        this.e = unjVar2;
        this.f = unnVar;
    }

    public unc(unc uncVar, uht uhtVar, Random random, yfo yfoVar, yfo yfoVar2, yfo yfoVar3) {
        this.e = uncVar;
        this.a = uhtVar;
        this.f = random;
        this.b = yfoVar;
        this.c = yfoVar2;
        this.d = yfoVar3;
    }

    public unc(yfo yfoVar, yfo yfoVar2, yfo yfoVar3, yfo yfoVar4, yfo yfoVar5, yfo yfoVar6) {
        this.d = yfoVar;
        this.a = yfoVar2;
        this.c = yfoVar3;
        this.b = yfoVar4;
        this.f = yfoVar5;
        this.e = yfoVar6;
    }

    public unc() {
        this.c = new AtomicBoolean(false);
        this.a = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.d = new Object();
        this.f = new HashMap();
        this.b = new HashMap();
    }

    public unc(Executor executor, aafi aafiVar, smf smfVar, java.util.Map map) {
        this.a = new ConcurrentHashMap();
        executor.getClass();
        this.f = executor;
        aafiVar.getClass();
        this.c = aafiVar;
        this.e = smfVar;
        this.d = map;
        a.H(!map.isEmpty());
        this.b = new pri(10);
    }

    public unc(xzg xzgVar, qjy qjyVar, cb cbVar, yil yilVar, tst tstVar, yfo yfoVar) {
        xzgVar.getClass();
        qjyVar.getClass();
        yfoVar.getClass();
        this.e = xzgVar;
        this.a = qjyVar;
        this.f = cbVar;
        this.d = yilVar;
        this.b = tstVar;
        this.c = yfoVar;
    }

    public unc(quw quwVar, qth qthVar, qux quxVar) {
        this.f = quwVar.i();
        this.a = quwVar.g();
        this.e = quwVar.h();
        this.b = quwVar.f();
        qthVar.getClass();
        this.c = qthVar;
        this.d = quxVar;
    }

    public unc(qvh qvhVar, rim rimVar, wds wdsVar, rjg rjgVar, qvs qvsVar) {
        this.b = qvhVar;
        this.e = rimVar;
        vtw vtwVar = (vtw) wdsVar.a(5, null);
        vtwVar.x(wdsVar);
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wds wdsVar2 = (wds) vtwVar.b;
        wdsVar2.c = 3;
        wdsVar2.b |= 1;
        this.d = (wds) vtwVar.r();
        vtw vtwVar2 = (vtw) wdsVar.a(5, null);
        vtwVar2.x(wdsVar);
        if (!vtwVar2.b.A()) {
            vtwVar2.u();
        }
        wds wdsVar3 = (wds) vtwVar2.b;
        wdsVar3.c = 4;
        wdsVar3.b |= 1;
        this.f = (wds) vtwVar2.r();
        this.c = rjgVar;
        this.a = qvsVar;
    }

    public unc(ulp ulpVar) {
        rgq rgqVar = new rgq(ulpVar, 2);
        this.f = rgqVar;
        xcq xcqVarC = xcl.c(new sgl(rgqVar, 5));
        this.e = xcqVarC;
        xcq xcqVarC2 = xcl.c(new rbe(rgqVar, xcqVarC, 16));
        this.b = xcqVarC2;
        xcq xcqVarC3 = xcl.c(new sgl(rgqVar, 3));
        this.c = xcqVarC3;
        xcq xcqVarC4 = xcl.c(new rrw(xcqVarC2, xcqVarC3, (xcq) rgqVar, 5, (int[]) null));
        this.a = xcqVarC4;
        this.d = xcl.c(new sgl(xcqVarC4, 4));
    }
}

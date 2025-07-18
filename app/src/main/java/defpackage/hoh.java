package defpackage;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.tvsearch.results.searchentity.info.EntityInfo;
import com.google.android.katniss.R;
import j$.time.Duration;
import j$.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hoh extends azr implements jac {
    private static final zdy l = zdy.h("com/google/android/apps/tvsearch/results/searchentity/EntityRow");
    protected final heq a;
    public EntityInfo c;
    public adyd d;
    public boolean g;
    public hog h;
    public boolean i;
    public boolean j;
    private final PackageManager m;
    private final exl n;
    private adyx p;
    private String r;
    private int s;
    public final List e = new ArrayList();
    private final Set o = new HashSet();
    private Map q = new HashMap();
    public final List f = new ArrayList();
    public boolean k = false;

    public hoh(PackageManager packageManager, exl exlVar, heq heqVar) {
        this.m = packageManager;
        this.n = exlVar;
        this.a = heqVar;
    }

    public final void A(adyd adydVar, boolean z) {
        this.d = adydVar;
        this.c = null;
        this.g = x();
        this.j = z;
        u();
        t();
    }

    public final int a() {
        adyd adydVar = this.d;
        if (adydVar == null || (adydVar.b & 8) == 0) {
            return -1;
        }
        adxn adxnVar = adydVar.g;
        if (adxnVar == null) {
            adxnVar = adxn.a;
        }
        if ((adxnVar.b & 4) == 0) {
            return -1;
        }
        adxn adxnVar2 = this.d.g;
        if (adxnVar2 == null) {
            adxnVar2 = adxn.a;
        }
        return adxnVar2.e;
    }

    public final int b() {
        adyd adydVar = this.d;
        if (adydVar == null || (adydVar.b & 8) == 0) {
            return -1;
        }
        adxn adxnVar = adydVar.g;
        if (adxnVar == null) {
            adxnVar = adxn.a;
        }
        if ((adxnVar.b & 2) == 0) {
            return -1;
        }
        adxn adxnVar2 = this.d.g;
        if (adxnVar2 == null) {
            adxnVar2 = adxn.a;
        }
        return adxnVar2.d;
    }

    public final int c() {
        adyd adydVar = this.d;
        if (adydVar != null) {
            return adydVar.p;
        }
        return 0;
    }

    public final adwo d() {
        adyd adydVar = this.d;
        if (adydVar == null) {
            return this.c.e;
        }
        adwo adwoVar = adydVar.n;
        return adwoVar == null ? adwo.a : adwoVar;
    }

    public final adwq e() {
        adyd adydVar = this.d;
        if (adydVar == null || (adydVar.b & 8) == 0) {
            return null;
        }
        adxn adxnVar = adydVar.g;
        if (adxnVar == null) {
            adxnVar = adxn.a;
        }
        if (adxnVar.f.size() <= 0) {
            return null;
        }
        adxn adxnVar2 = this.d.g;
        if (adxnVar2 == null) {
            adxnVar2 = adxn.a;
        }
        return (adwq) adxnVar2.f.get(0);
    }

    public final adws f() {
        adyd adydVar = this.d;
        if (adydVar == null || (adydVar.b & 2048) == 0) {
            return null;
        }
        adws adwsVar = adydVar.m;
        return adwsVar == null ? adws.a : adwsVar;
    }

    public final adyf g() {
        adyd adydVar = this.d;
        if (adydVar == null) {
            return this.c.d;
        }
        adyf adyfVar = adydVar.j;
        return adyfVar == null ? adyf.a : adyfVar;
    }

    public final Duration h() {
        adyd adydVar = this.d;
        return (adydVar == null || (adydVar.b & 1024) == 0) ? Duration.ZERO : Duration.ofSeconds(adydVar.l);
    }

    final String i() {
        adyd adydVar = this.d;
        return adydVar != null ? adydVar.c : "";
    }

    public final String j() {
        adyd adydVar = this.d;
        if (adydVar == null || (adydVar.b & 8) == 0) {
            return null;
        }
        adxn adxnVar = adydVar.g;
        if (adxnVar == null) {
            adxnVar = adxn.a;
        }
        return adxnVar.c;
    }

    public final String k() {
        adyd adydVar = this.d;
        if (adydVar == null || (adydVar.b & 256) == 0) {
            return null;
        }
        adyf adyfVar = adydVar.j;
        if (adyfVar == null) {
            adyfVar = adyf.a;
        }
        String str = adyfVar.f;
        List listG = yrl.b(new ypz('/')).g(str);
        if (listG.size() < 2) {
            return str;
        }
        return ((String) listG.get(0)) + "/" + ((String) listG.get(1));
    }

    public final String l() {
        adwq adwqVarE = e();
        if (adwqVarE == null) {
            return null;
        }
        String str = adwqVarE.d;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public final String m() {
        adyd adydVar = this.d;
        return adydVar != null ? adydVar.d : this.c.c;
    }

    public final String n() {
        adyd adydVar = this.d;
        if (adydVar != null) {
            return adydVar.c;
        }
        EntityInfo entityInfo = this.c;
        return entityInfo == null ? "" : entityInfo.b;
    }

    @Override // defpackage.jac
    public final void o() {
        this.i = true;
        hog hogVar = this.h;
        if (hogVar != null) {
            hogVar.o();
        }
    }

    @Override // defpackage.jac
    public final void p() {
        this.i = false;
        hog hogVar = this.h;
        if (hogVar != null) {
            hogVar.p();
        }
    }

    public final String q() {
        adyd adydVar = this.d;
        if (adydVar == null || (adydVar.b & 256) == 0) {
            return null;
        }
        adyf adyfVar = adydVar.j;
        if (adyfVar == null) {
            adyfVar = adyf.a;
        }
        return adyfVar.h;
    }

    public final List r() {
        adyd adydVar = this.d;
        if (adydVar == null || adydVar.f.size() <= 0 || !x()) {
            return null;
        }
        return this.d.f;
    }

    protected final void s(hej hejVar) {
        Intent intent;
        int i = 0;
        while (true) {
            List list = this.e;
            if (i >= list.size()) {
                list.add(hejVar);
                break;
            } else {
                if (hejVar.i > ((hej) list.get(i)).i) {
                    list.add(i, hejVar);
                    break;
                }
                i++;
            }
        }
        if (this.j && hejVar.a.i && (intent = hejVar.h) != null) {
            this.n.b(intent, exj.b, exk.a, 2, null);
            this.j = false;
        }
    }

    public void t() {
        adyd adydVar = this.d;
        if (adydVar == null) {
            return;
        }
        for (aear aearVar : adydVar.i) {
            String str = aearVar.f;
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (this.m.getApplicationInfo(str, 0).enabled) {
                        hej hejVarA = this.a.a(aearVar, i());
                        if (z(hejVarA)) {
                            s(hejVarA);
                            this.o.add(str);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    ((zdv) ((zdv) l.d()).q("com/google/android/apps/tvsearch/results/searchentity/EntityRow", "isPackageAvailable", 550, "EntityRow.java")).x("Failed to find the application with package name:%s", str);
                }
            }
        }
        List list = this.f;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y((htg) it.next());
        }
        list.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u() {
        /*
            r3 = this;
            adyd r0 = r3.d
            if (r0 != 0) goto L6
            goto L77
        L6:
            java.lang.String r1 = r0.c
            r3.r = r1
            r1 = 0
            r3.s = r1
            int r1 = r0.b
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L2f
            adyf r0 = r0.j
            if (r0 != 0) goto L19
            adyf r0 = defpackage.adyf.a
        L19:
            int r0 = r0.b
            r0 = r0 & 1
            if (r0 == 0) goto L2f
            adyd r0 = r3.d     // Catch: java.lang.NumberFormatException -> L2f
            adyf r0 = r0.j     // Catch: java.lang.NumberFormatException -> L2f
            if (r0 != 0) goto L27
            adyf r0 = defpackage.adyf.a     // Catch: java.lang.NumberFormatException -> L2f
        L27:
            java.lang.String r0 = r0.d     // Catch: java.lang.NumberFormatException -> L2f
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L2f
            r3.s = r0     // Catch: java.lang.NumberFormatException -> L2f
        L2f:
            adyd r0 = r3.d
            int r1 = r0.b
            r2 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r2
            if (r1 == 0) goto L55
            adyz r0 = r0.q
            if (r0 != 0) goto L3e
            adyz r0 = defpackage.adyz.a
        L3e:
            int r0 = r0.b
            r0 = r0 & 1
            if (r0 == 0) goto L55
            adyd r0 = r3.d
            adyz r0 = r0.q
            if (r0 != 0) goto L4c
            adyz r0 = defpackage.adyz.a
        L4c:
            adyx r0 = r0.d
            if (r0 != 0) goto L52
            adyx r0 = defpackage.adyx.a
        L52:
            r3.p = r0
            goto L64
        L55:
            adyd r0 = r3.d
            int r0 = r0.l
            long r0 = (long) r0
            j$.time.Duration r0 = j$.time.Duration.ofSeconds(r0)
            adyx r0 = defpackage.htb.a(r0)
            r3.p = r0
        L64:
            adyd r0 = r3.d
            int r1 = r0.b
            r1 = r1 & r2
            if (r1 == 0) goto L77
            adyz r0 = r0.q
            if (r0 != 0) goto L71
            adyz r0 = defpackage.adyz.a
        L71:
            java.util.Map r0 = defpackage.htb.b(r0)
            r3.q = r0
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hoh.u():void");
    }

    public final boolean v() {
        adyd adydVar = this.d;
        return adydVar != null && adydVar.u;
    }

    public final boolean w() {
        adyd adydVar = this.d;
        if (adydVar == null || (adydVar.b & 8) == 0) {
            return false;
        }
        adxn adxnVar = adydVar.g;
        if (adxnVar == null) {
            adxnVar = adxn.a;
        }
        if ((adxnVar.b & 4) == 0) {
            return false;
        }
        adxn adxnVar2 = this.d.g;
        if (adxnVar2 == null) {
            adxnVar2 = adxn.a;
        }
        return (adxnVar2.b & 2) != 0;
    }

    public final boolean x() {
        int iA;
        adyd adydVar = this.d;
        return (adydVar == null || (adydVar.b & 512) == 0 || (iA = adyh.a(adydVar.k)) == 0 || iA != 2) ? false : true;
    }

    public final boolean y(htg htgVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        Comparable comparable;
        htf htfVar;
        ApplicationInfo applicationInfo;
        String string;
        Set set = this.o;
        String strE = htgVar.e();
        if (!set.contains(strE)) {
            adyx adyxVar = (adyx) Map.EL.getOrDefault(this.q, strE, this.p);
            String str = this.r;
            int i = this.s;
            htgVar.getClass();
            adyxVar.getClass();
            str.getClass();
            String string2 = null;
            if (adyxVar.c) {
                agwy agwyVarB = agwz.b(0, Math.min(htgVar.f(), adyxVar.h));
                ArrayList arrayList = new ArrayList(agqq.i(agwyVarB, 10));
                agrh it = agwyVarB.iterator();
                while (((agwx) it).a) {
                    arrayList.add(htgVar.g(it.a()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (htb.c(adyxVar, htd.a.a((htf) obj), new htd(str, i, Duration.ZERO))) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) < 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                htfVar = (htf) comparable;
            } else {
                htfVar = null;
            }
            if (htfVar != null) {
                Intent intent = htfVar.i;
                if (!TextUtils.isEmpty(intent.getAction())) {
                    intent.putExtra("android.intent.extra.START_PLAYBACK", true);
                    heq heqVar = this.a;
                    String str2 = htfVar.j;
                    boolean z = htgVar.e;
                    String strI = i();
                    double dA = z ? 3.0d : agvy.c(str2, "com.google.android.katniss") ? 1.0d : ((her) heqVar).e.a(str2);
                    her herVar = (her) heqVar;
                    PackageManager packageManager = herVar.d;
                    String str3 = str2 == null ? "" : str2;
                    if (str3.length() == 0) {
                        applicationInfo = null;
                    } else {
                        try {
                            applicationInfo = packageManager.getApplicationInfo(str3, 0);
                        } catch (PackageManager.NameNotFoundException e) {
                            ((zdv) ((zdv) her.a.d()).p(e).q("com/google/android/apps/tvsearch/results/actionitem/factory/ActionItemFactoryImpl", "getApplicationInfo", 143, "ActionItemFactoryImpl.kt")).x("Failed to find the application with package name:%s", str3);
                        }
                    }
                    if (applicationInfo != null) {
                        string2 = herVar.c.getResources().getString(R.string.available_on);
                        string = herVar.d.getApplicationLabel(applicationInfo).toString();
                    } else {
                        string = null;
                    }
                    if (intent != null) {
                        intent.setFlags(335544320);
                    }
                    aear aearVar = aear.a;
                    aeao aeaoVar = new aeao();
                    if (str2 != null) {
                        if ((aeaoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aeaoVar.y();
                        }
                        aear aearVar2 = (aear) aeaoVar.b;
                        aearVar2.b |= 16;
                        aearVar2.f = str2;
                    }
                    if ((aeaoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        aeaoVar.y();
                    }
                    aear aearVar3 = (aear) aeaoVar.b;
                    aearVar3.b |= 64;
                    aearVar3.h = 13885;
                    if (intent != null) {
                        aebk aebkVar = aebk.a;
                        aebh aebhVar = new aebh();
                        if ((aebhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aebhVar.y();
                        }
                        aebk aebkVar2 = (aebk) aebhVar.b;
                        aebkVar2.h = 2;
                        aebkVar2.b |= 128;
                        abvo abvoVarA = fen.a(intent);
                        abvoVarA.getClass();
                        if ((aebhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aebhVar.y();
                        }
                        aebk aebkVar3 = (aebk) aebhVar.b;
                        aebkVar3.b |= 64;
                        aebkVar3.g = abvoVarA;
                        abxd abxdVarV = aebhVar.v();
                        abxdVarV.getClass();
                        aebk aebkVar4 = (aebk) abxdVarV;
                        if ((aeaoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            aeaoVar.y();
                        }
                        aear aearVar4 = (aear) aeaoVar.b;
                        aearVar4.e = aebkVar4;
                        aearVar4.b |= 8;
                    }
                    if ((Integer.MIN_VALUE & aeaoVar.b.memoizedSerializedSize) == 0) {
                        aeaoVar.y();
                    }
                    aear aearVar5 = (aear) aeaoVar.b;
                    aearVar5.b |= 256;
                    aearVar5.i = false;
                    abxd abxdVarV2 = aeaoVar.v();
                    abxdVarV2.getClass();
                    s(new hej((aear) abxdVarV2, str2, string2 == null ? "" : string2, string == null ? "" : string, strI == null ? "" : strI, null, 13885, intent, dA, her.b, true));
                    return true;
                }
            }
        }
        return false;
    }

    protected boolean z(hej hejVar) {
        return hejVar != null && hejVar.o;
    }
}

package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yv implements aag, aaq {
    final aar c;
    zu d;
    zl e;
    zs f;
    public final zd k;
    public final aah l;
    public zu m;
    public zu n;
    public zu o;
    public zl p;
    public int q;
    private final Context s;
    private final boolean w;
    private final zw x;
    private zg y;
    private zg z;
    final yt a = new yt(this);
    final Map b = new HashMap();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    private final Map t = new HashMap();
    public final Map i = new HashMap();
    public final ArrayList j = new ArrayList();
    private final ArrayList u = new ArrayList();
    private final aas v = new aas();
    private final byj A = new byj(this, null);
    final zh r = new ys(this);

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yv(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv.<init>(android.content.Context):void");
    }

    private final int q(String str) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((zu) arrayList.get(i)).c.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private final boolean r(zu zuVar) {
        return zuVar.d() == this.l && zuVar.h("android.media.intent.category.LIVE_AUDIO") && !zuVar.h("android.media.intent.category.LIVE_VIDEO");
    }

    final int a(zu zuVar, zf zfVar) {
        int iC = zuVar.c(zfVar);
        if (iC != 0) {
            if ((iC & 1) != 0) {
                this.a.a(259, zuVar);
            }
            if ((iC & 2) != 0) {
                this.a.a(260, zuVar);
            }
            if ((iC & 4) != 0) {
                this.a.a(261, zuVar);
            }
        }
        return iC;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zl b(defpackage.zu r6) {
        /*
            r5 = this;
            zu r0 = r5.d
            if (r6 != r0) goto La
            zl r0 = r5.e
            if (r0 != 0) goto L9
            goto La
        L9:
            return r0
        La:
            boolean r0 = r6 instanceof defpackage.zr
            r1 = 0
            if (r0 == 0) goto L56
            r0 = r6
            zr r0 = (defpackage.zr) r0
            defpackage.zv.c()
            yv r2 = defpackage.zv.a()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Map r2 = r2.t
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L28:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L37
            java.lang.Object r4 = r2.next()
            yu r4 = (defpackage.yu) r4
            zr r4 = r4.b
            goto L28
        L37:
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L56
            java.util.Map r6 = r5.t
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L47:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r6.next()
            yu r0 = (defpackage.yu) r0
            zr r0 = r0.b
            goto L47
        L56:
            java.util.Map r0 = r5.b
            java.lang.String r6 = r6.c
            java.lang.Object r6 = r0.get(r6)
            zl r6 = (defpackage.zl) r6
            if (r6 == 0) goto L63
            return r6
        L63:
            java.util.Map r6 = r5.t
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L74
        L73:
            return r1
        L74:
            java.lang.Object r6 = r6.next()
            yu r6 = (defpackage.yu) r6
            java.util.Map r6 = r6.a
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv.b(zu):zl");
    }

    public final zt c(zn znVar) {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            zt ztVar = (zt) arrayList.get(i);
            i++;
            if (ztVar.a == znVar) {
                return ztVar;
            }
        }
        return null;
    }

    public final zu d() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zu zuVar = (zu) arrayList.get(i);
            if (zuVar != this.m && r(zuVar) && zuVar.g()) {
                return zuVar;
            }
        }
        return this.m;
    }

    public final zu e() {
        zu zuVar = this.d;
        if (zuVar != null) {
            return zuVar;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    final String f(zt ztVar, String str) {
        String str2;
        String strFlattenToShortString = ztVar.a().flattenToShortString();
        boolean z = ztVar.c;
        if (z) {
            str2 = str;
        } else {
            str2 = strFlattenToShortString + ":" + str;
        }
        if (z || q(str2) < 0) {
            this.i.put(new oz(strFlattenToShortString, str), str2);
            return str2;
        }
        Log.w("AxMediaRouter", "Either " + str + " isn't unique in " + strFlattenToShortString + " or we're trying to assign a unique ID for an already added route");
        int i = 2;
        while (true) {
            String str3 = String.format(Locale.US, "%s_%d", str2, Integer.valueOf(i));
            if (q(str3) < 0) {
                this.i.put(new oz(strFlattenToShortString, str), str3);
                return str3;
            }
            i++;
        }
    }

    public final void g(zn znVar, boolean z) {
        if (c(znVar) == null) {
            zt ztVar = new zt(znVar, z);
            this.j.add(ztVar);
            this.a.a(513, ztVar);
            n(ztVar, znVar.j);
            znVar.H(this.A);
            znVar.G(this.y);
        }
    }

    final void h() {
        zl zlVarE;
        if (this.d.f()) {
            List<zu> listUnmodifiableList = DesugarCollections.unmodifiableList(this.d.n);
            HashSet hashSet = new HashSet();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((zu) it.next()).c);
            }
            Map map = this.b;
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    zl zlVar = (zl) entry.getValue();
                    zlVar.i(0);
                    zlVar.a();
                    it2.remove();
                }
            }
            for (zu zuVar : listUnmodifiableList) {
                String str = zuVar.c;
                if (!map.containsKey(str) && (zlVarE = zuVar.d().E(zuVar.b, this.d.b)) != null) {
                    zlVarE.g();
                    map.put(str, zlVarE);
                }
            }
        }
    }

    final void i(yv yvVar, zu zuVar, zl zlVar, int i, boolean z, zu zuVar2, Collection collection) {
        zs zsVar = this.f;
        if (zsVar != null) {
            zsVar.a();
            this.f = null;
        }
        zs zsVar2 = new zs(yvVar, zuVar, zlVar, i, z, zuVar2, collection);
        this.f = zsVar2;
        int i2 = zsVar2.b;
        zsVar2.b();
    }

    final void j(zu zuVar, int i, boolean z) {
        if (!this.h.contains(zuVar)) {
            Objects.toString(zuVar);
            Log.w("AxMediaRouter", "Ignoring attempt to select removed route: ".concat(String.valueOf(zuVar)));
            return;
        }
        if (!zuVar.f) {
            Objects.toString(zuVar);
            Log.w("AxMediaRouter", "Ignoring attempt to select disabled route: ".concat(String.valueOf(zuVar)));
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            zn znVarD = zuVar.d();
            zd zdVar = this.k;
            if (znVarD == zdVar && this.d != zuVar) {
                String str = zuVar.b;
                MediaRoute2Info mediaRoute2Info = null;
                if (str != null) {
                    Iterator it = zdVar.c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        MediaRoute2Info mediaRoute2InfoM50m = pd$$ExternalSyntheticApiModelOutline3.m50m(it.next());
                        if (TextUtils.equals(mediaRoute2InfoM50m.getId(), str)) {
                            mediaRoute2Info = mediaRoute2InfoM50m;
                            break;
                        }
                    }
                }
                if (mediaRoute2Info == null) {
                    Log.w("MR2Provider", "transferTo: Specified route not found. routeId=".concat(String.valueOf(str)));
                    return;
                } else {
                    zdVar.a.transferTo(mediaRoute2Info);
                    return;
                }
            }
        }
        k(zuVar, i, z);
    }

    public final void k(zu zuVar, int i, boolean z) {
        zo zoVar;
        String str;
        if (this.d == zuVar) {
            return;
        }
        zu zuVar2 = this.m;
        if (this.n != null && zuVar == zuVar2) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder sb = new StringBuilder("- Stacktrace: [");
            int i2 = 3;
            while (true) {
                int length = stackTrace.length;
                if (i2 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                sb.append(stackTraceElement.getClassName());
                sb.append(".");
                sb.append(stackTraceElement.getMethodName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                i2++;
                if (i2 < length) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            if (this.d != null) {
                Locale locale = Locale.US;
                zu zuVar3 = this.d;
                String str2 = zuVar3.d;
                zv.c();
                str = String.format(locale, "%s(BT=%b, syncMediaRoute1Provider=%b)", str2, Boolean.valueOf(zv.a().n == zuVar3), Boolean.valueOf(z));
            } else {
                str = null;
            }
            Log.w("AxMediaRouter", "Changing selection(" + str + ") to default while BT is available: pkgName=" + this.s.getPackageName() + ((Object) sb));
        }
        if (this.o != null) {
            this.o = null;
            zl zlVar = this.p;
            if (zlVar != null) {
                zlVar.i(3);
                this.p.a();
                this.p = null;
            }
        }
        if (p() && (zoVar = zuVar.a.d) != null && zoVar.b) {
            zn znVarD = zuVar.d();
            String str3 = zuVar.b;
            Bundle bundle = new Bundle();
            Context context = this.s;
            se.i(context.getPackageName(), bundle);
            zi ziVarC = znVarD.C(str3, new zm(bundle));
            if (ziVarC != null) {
                Executor executorC = nf.c(context);
                zh zhVar = this.r;
                synchronized (ziVarC.j) {
                    if (executorC == null) {
                        throw new NullPointerException("Executor shouldn't be null");
                    }
                    if (zhVar == null) {
                        throw new NullPointerException("Listener shouldn't be null");
                    }
                    ziVarC.k = executorC;
                    ziVarC.l = zhVar;
                    Collection collection = ziVarC.n;
                    if (collection != null && !collection.isEmpty()) {
                        zf zfVar = ziVarC.m;
                        Collection collection2 = ziVarC.n;
                        ziVarC.m = null;
                        ziVarC.n = null;
                        ziVarC.k.execute(new rj(ziVarC, zhVar, zfVar, collection2, 3));
                    }
                }
                this.o = zuVar;
                this.p = ziVarC;
                ziVarC.g();
                return;
            }
            Objects.toString(zuVar);
            Log.w("AxMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=".concat(String.valueOf(zuVar)));
        }
        zn znVarD2 = zuVar.d();
        String str4 = zuVar.b;
        Bundle bundle2 = new Bundle();
        se.i(this.s.getPackageName(), bundle2);
        zl zlVarD = znVarD2.D(str4, new zm(bundle2));
        if (zlVarD != null) {
            zlVarD.g();
        }
        if (this.d != null) {
            i(this, zuVar, zlVarD, i, z, null, null);
            return;
        }
        this.d = zuVar;
        this.e = zlVarD;
        this.a.b(null, zuVar, i, z);
    }

    public final void l() {
        zg zgVar;
        apl aplVar = new apl();
        zw zwVar = this.x;
        zwVar.c = 0L;
        zwVar.d = false;
        SystemClock.elapsedRealtime();
        zwVar.a.removeCallbacks(zwVar.b);
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            zv zvVar = (zv) ((WeakReference) arrayList.get(size)).get();
            if (zvVar == null) {
                arrayList.remove(size);
            } else {
                ArrayList arrayList2 = zvVar.c;
                int size2 = arrayList2.size();
                i += size2;
                for (int i2 = 0; i2 < size2; i2++) {
                    zq zqVar = (zq) arrayList2.get(i2);
                    aplVar.d(zqVar.b);
                    int i3 = zqVar.c;
                    long j = zqVar.d;
                }
            }
        }
        boolean z = zwVar.d;
        this.q = i;
        zp zpVar = zp.a;
        zp zpVarA = aplVar.a();
        if (p() && ((zgVar = this.z) == null || !zgVar.a().equals(zpVarA) || this.z.b())) {
            if (!zpVarA.c()) {
                this.z = new zg(zpVarA, false);
            } else if (this.z != null) {
                this.z = null;
            }
            this.k.G(this.z);
        }
        zg zgVar2 = this.y;
        if (zgVar2 == null || !zgVar2.a().equals(zpVar) || this.y.b()) {
            if (!zpVar.c()) {
                this.y = new zg(zpVar, false);
            } else if (this.y == null) {
                return;
            } else {
                this.y = null;
            }
            ArrayList arrayList3 = this.j;
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                zn znVar = ((zt) arrayList3.get(i4)).a;
                if (znVar != this.k) {
                    znVar.G(this.y);
                }
            }
        }
    }

    final void m() {
        MediaRouter2.RoutingController routingController;
        zu zuVar = this.d;
        if (zuVar != null) {
            aas aasVar = this.v;
            aasVar.a = zuVar.k;
            aasVar.b = zuVar.l;
            aasVar.c = zuVar.b();
            zu zuVar2 = this.d;
            aasVar.d = zuVar2.i;
            aasVar.e = zuVar2.h;
            if (p() && zuVar2.d() == this.k) {
                zl zlVar = this.e;
                int i = zd.e;
                aasVar.f = ((zlVar instanceof yy) && (routingController = ((yy) zlVar).b) != null) ? routingController.getId() : null;
            } else {
                aasVar.f = null;
            }
            ArrayList arrayList = this.u;
            if (arrayList.size() <= 0) {
                return;
            }
            throw null;
        }
    }

    public final void n(zt ztVar, zo zoVar) {
        String strConcat;
        int i;
        boolean z;
        if (ztVar.d != zoVar) {
            ztVar.d = zoVar;
            if (zoVar == null || !(zoVar.b() || zoVar == this.l.j)) {
                if (zoVar != null) {
                    Objects.toString(zoVar);
                    strConcat = "Ignoring invalid provider descriptor: ".concat(zoVar.toString());
                } else {
                    ComponentName componentNameA = ztVar.a();
                    Objects.toString(componentNameA);
                    strConcat = "Ignoring null provider descriptor from ".concat(componentNameA.toString());
                }
                Log.w("AxMediaRouter", strConcat);
                i = 0;
                z = false;
            } else {
                List<zf> list = zoVar.a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                z = false;
                int i2 = 0;
                for (zf zfVar : list) {
                    if (zfVar == null || !zfVar.v()) {
                        Objects.toString(zfVar);
                        Log.w("AxMediaRouter", "Ignoring invalid route descriptor: ".concat(String.valueOf(zfVar)));
                    } else {
                        String strN = zfVar.n();
                        List list2 = ztVar.b;
                        int size = list2.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                i3 = -1;
                                break;
                            } else if (((zu) list2.get(i3)).b.equals(strN)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 < 0) {
                            int i4 = i2 + 1;
                            zu zuVar = new zu(ztVar, strN, f(ztVar, strN), zfVar.u());
                            list2.add(i2, zuVar);
                            this.h.add(zuVar);
                            if (zfVar.q().isEmpty()) {
                                zuVar.c(zfVar);
                                this.a.a(257, zuVar);
                            } else {
                                arrayList.add(new oz(zuVar, zfVar));
                            }
                            i2 = i4;
                        } else if (i3 < i2) {
                            Objects.toString(zfVar);
                            Log.w("AxMediaRouter", "Ignoring route descriptor with duplicate id: ".concat(zfVar.toString()));
                        } else {
                            int i5 = i2 + 1;
                            zu zuVar2 = (zu) list2.get(i3);
                            Collections.swap(list2, i3, i2);
                            if (!zfVar.q().isEmpty()) {
                                arrayList2.add(new oz(zuVar2, zfVar));
                            } else if (a(zuVar2, zfVar) != 0 && zuVar2 == this.d) {
                                i2 = i5;
                                z = true;
                            }
                            i2 = i5;
                        }
                    }
                }
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    oz ozVar = (oz) arrayList.get(i6);
                    zu zuVar3 = (zu) ozVar.a;
                    zuVar3.c((zf) ozVar.b);
                    this.a.a(257, zuVar3);
                }
                int size3 = arrayList2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    oz ozVar2 = (oz) arrayList2.get(i7);
                    zu zuVar4 = (zu) ozVar2.a;
                    if (a(zuVar4, (zf) ozVar2.b) != 0 && zuVar4 == this.d) {
                        z = true;
                    }
                }
                i = i2;
            }
            List list3 = ztVar.b;
            for (int size4 = list3.size() - 1; size4 >= i; size4--) {
                zu zuVar5 = (zu) list3.get(size4);
                zuVar5.c(null);
                this.h.remove(zuVar5);
            }
            o(z);
            for (int size5 = list3.size() - 1; size5 >= i; size5--) {
                this.a.a(258, (zu) list3.remove(size5));
            }
            this.a.a(515, ztVar);
        }
    }

    final void o(boolean z) {
        zu zuVar = this.m;
        if (zuVar != null && !zuVar.g()) {
            zu zuVar2 = this.m;
            Objects.toString(zuVar2);
            Log.i("AxMediaRouter", "Clearing the default route because it is no longer selectable: ".concat(String.valueOf(zuVar2)));
            this.m = null;
        }
        if (this.m == null) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                zu zuVar3 = (zu) arrayList.get(i);
                if (zuVar3.d() == this.l && zuVar3.b.equals("DEFAULT_ROUTE") && zuVar3.g()) {
                    this.m = zuVar3;
                    zu zuVar4 = this.m;
                    Objects.toString(zuVar4);
                    Log.i("AxMediaRouter", "Found default route: ".concat(String.valueOf(zuVar4)));
                    break;
                }
                i++;
            }
        }
        zu zuVar5 = this.n;
        if (zuVar5 != null && !zuVar5.g()) {
            zu zuVar6 = this.n;
            Objects.toString(zuVar6);
            Log.i("AxMediaRouter", "Clearing the bluetooth route because it is no longer selectable: ".concat(String.valueOf(zuVar6)));
            this.n = null;
        }
        if (this.n == null) {
            ArrayList arrayList2 = this.h;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                zu zuVar7 = (zu) arrayList2.get(i2);
                if (r(zuVar7) && zuVar7.g()) {
                    this.n = zuVar7;
                    zu zuVar8 = this.n;
                    Objects.toString(zuVar8);
                    Log.i("AxMediaRouter", "Found bluetooth route: ".concat(String.valueOf(zuVar8)));
                    break;
                }
                i2++;
            }
        }
        zu zuVar9 = this.d;
        if (zuVar9 == null || !zuVar9.f) {
            zu zuVar10 = this.d;
            Objects.toString(zuVar10);
            Log.i("AxMediaRouter", "Unselecting the current route because it is no longer selectable: ".concat(String.valueOf(zuVar10)));
            k(d(), 0, true);
            return;
        }
        if (z) {
            h();
            m();
        }
    }

    final boolean p() {
        return this.w;
    }
}

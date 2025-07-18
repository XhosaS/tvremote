package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.VolumeProvider;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
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
public final class ftw {
    private final boolean C;
    private final fuz D;
    private fuh E;
    final fvu c;
    public fux d;
    public fun e;
    fuv f;
    public final Context g;
    public final boolean m;
    public fue n;
    public final fvl o;
    public fvb p;
    public fux q;
    public fux r;
    public fux s;
    public fun t;
    public fuh u;
    public int v;
    public ftu w;
    public eu x;
    public cvw z;
    final fts a = new fts(this);
    final Map b = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final Map j = new HashMap();
    public final Map k = new HashMap();
    private final ArrayList A = new ArrayList();
    private final ArrayList B = new ArrayList();
    public final fvv l = new fvv();
    private final pku F = new pku(this);
    final fuj y = new ftr(this);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0086  */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ftw(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftw.<init>(android.content.Context):void");
    }

    private final int t(String str) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((fux) arrayList.get(i)).d.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private final boolean u(fux fuxVar) {
        return fuxVar.i() == this.o && fuxVar.v("android.media.intent.category.LIVE_AUDIO") && !fuxVar.v("android.media.intent.category.LIVE_VIDEO");
    }

    final int a(fux fuxVar, fug fugVar) {
        int iG = fuxVar.g(fugVar);
        if (iG != 0) {
            if ((iG & 1) != 0) {
                this.a.a(259, fuxVar);
            }
            if ((iG & 2) != 0) {
                this.a.a(260, fuxVar);
            }
            if ((iG & 4) != 0) {
                this.a.a(261, fuxVar);
            }
        }
        return iG;
    }

    public final fun b(fux fuxVar) {
        fun funVar;
        if (fuxVar == this.d && (funVar = this.e) != null) {
            return funVar;
        }
        if ((fuxVar instanceof fuu) && ((fuu) fuxVar).b()) {
            s();
            return null;
        }
        fun funVar2 = (fun) this.b.get(fuxVar.d);
        if (funVar2 != null) {
            return funVar2;
        }
        Iterator it = this.j.values().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Map map = ((ftv) it.next()).a;
        throw null;
    }

    public final fuw c(fup fupVar) {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            fuw fuwVar = (fuw) arrayList.get(i);
            i++;
            if (fuwVar.a == fupVar) {
                return fuwVar;
            }
        }
        return null;
    }

    public final fux d() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fux fuxVar = (fux) arrayList.get(i);
            if (fuxVar != this.q && u(fuxVar) && fuxVar.s()) {
                return fuxVar;
            }
        }
        return this.q;
    }

    final fux e() {
        fux fuxVar = this.q;
        if (fuxVar != null) {
            return fuxVar;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    public final fux f() {
        fux fuxVar = this.d;
        if (fuxVar != null) {
            return fuxVar;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    final String g(fuw fuwVar, String str) {
        String strFlattenToShortString = fuwVar.a().flattenToShortString();
        boolean z = fuwVar.c;
        String strCq = z ? str : a.cq(str, strFlattenToShortString, ":");
        if (z || t(strCq) < 0) {
            this.k.put(new cui(strFlattenToShortString, str), strCq);
            return strCq;
        }
        Log.w("AxMediaRouter", a.ci(strFlattenToShortString, str, "Either ", " isn't unique in ", " or we're trying to assign a unique ID for an already added route"));
        int i = 2;
        while (true) {
            String str2 = String.format(Locale.US, "%s_%d", strCq, Integer.valueOf(i));
            if (t(str2) < 0) {
                this.k.put(new cui(strFlattenToShortString, str), str2);
                return str2;
            }
            i++;
        }
    }

    public final void h(fup fupVar, boolean z) {
        if (c(fupVar) == null) {
            fuw fuwVar = new fuw(fupVar, z);
            this.A.add(fuwVar);
            this.a.a(513, fuwVar);
            p(fuwVar, fupVar.i);
            fupVar.dD(this.F);
            fupVar.dB(this.E);
        }
    }

    final void i() {
        fun funVarDz;
        if (this.d.r()) {
            List<fux> listK = this.d.k();
            HashSet hashSet = new HashSet();
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                hashSet.add(((fux) it.next()).d);
            }
            Map map = this.b;
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    fun funVar = (fun) entry.getValue();
                    funVar.n(0);
                    funVar.b();
                    it2.remove();
                }
            }
            for (fux fuxVar : listK) {
                String str = fuxVar.d;
                if (!map.containsKey(str) && (funVarDz = fuxVar.i().dz(fuxVar.c, this.d.c)) != null) {
                    funVarDz.l();
                    map.put(str, funVarDz);
                }
            }
        }
    }

    final void j(ftw ftwVar, fux fuxVar, fun funVar, int i, boolean z, fux fuxVar2, Collection collection) {
        fuv fuvVar = this.f;
        if (fuvVar != null) {
            fuvVar.a();
            this.f = null;
        }
        fuv fuvVar2 = new fuv(ftwVar, fuxVar, funVar, i, z, fuxVar2, collection);
        this.f = fuvVar2;
        int i2 = fuvVar2.b;
        fuvVar2.b();
    }

    public final void k(fup fupVar) {
        fuw fuwVarC = c(fupVar);
        if (fuwVarC != null) {
            fupVar.dD(null);
            fupVar.dB(null);
            p(fuwVarC, null);
            this.a.a(514, fuwVarC);
            this.A.remove(fuwVarC);
        }
    }

    public final void l(fux fuxVar, int i, boolean z) {
        if (!this.i.contains(fuxVar)) {
            Objects.toString(fuxVar);
            Log.w("AxMediaRouter", "Ignoring attempt to select removed route: ".concat(String.valueOf(fuxVar)));
            return;
        }
        if (!fuxVar.h) {
            Objects.toString(fuxVar);
            Log.w("AxMediaRouter", "Ignoring attempt to select disabled route: ".concat(String.valueOf(fuxVar)));
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            fup fupVarI = fuxVar.i();
            fue fueVar = this.n;
            if (fupVarI == fueVar && this.d != fuxVar) {
                String str = fuxVar.c;
                MediaRoute2Info mediaRoute2InfoA = fueVar.a(str);
                if (mediaRoute2InfoA == null) {
                    Log.w("MR2Provider", "transferTo: Specified route not found. routeId=".concat(String.valueOf(str)));
                    return;
                } else {
                    fueVar.a.transferTo(mediaRoute2InfoA);
                    return;
                }
            }
        }
        m(fuxVar, i, z);
    }

    public final void m(fux fuxVar, int i, boolean z) {
        fuq fuqVar;
        String str;
        if (this.d == fuxVar) {
            return;
        }
        fux fuxVar2 = this.q;
        if (this.r != null && fuxVar == fuxVar2) {
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
                fux fuxVar3 = this.d;
                String str2 = fuxVar3.e;
                fuy.e();
                str = String.format(locale, "%s(BT=%b, syncMediaRoute1Provider=%b)", str2, Boolean.valueOf(fuy.a().r == fuxVar3), Boolean.valueOf(z));
            } else {
                str = null;
            }
            Log.w("AxMediaRouter", "Changing selection(" + str + ") to default while BT is available: pkgName=" + this.g.getPackageName() + ((Object) sb));
        }
        if (this.s != null) {
            this.s = null;
            fun funVar = this.t;
            if (funVar != null) {
                funVar.n(3);
                this.t.b();
                this.t = null;
            }
        }
        if (r() && (fuqVar = fuxVar.b.d) != null && fuqVar.b) {
            fup fupVarI = fuxVar.i();
            String str3 = fuxVar.c;
            Bundle bundle = new Bundle();
            Context context = this.g;
            fus.k(context.getPackageName(), bundle);
            fuk fukVarDx = fupVarI.dx(str3, new fuo(bundle));
            if (fukVarDx != null) {
                Executor executorE = czi.e(context);
                fuj fujVar = this.y;
                synchronized (fukVarDx.k) {
                    if (executorE == null) {
                        throw new NullPointerException("Executor shouldn't be null");
                    }
                    if (fujVar == null) {
                        throw new NullPointerException("Listener shouldn't be null");
                    }
                    fukVarDx.l = executorE;
                    fukVarDx.m = fujVar;
                    Collection collection = fukVarDx.o;
                    if (collection != null && !collection.isEmpty()) {
                        fug fugVar = fukVarDx.n;
                        Collection collection2 = fukVarDx.o;
                        fukVarDx.n = null;
                        fukVarDx.o = null;
                        fukVarDx.l.execute(new ejr(fukVarDx, fujVar, fugVar, collection2, 8, (short[]) null));
                    }
                }
                this.s = fuxVar;
                this.t = fukVarDx;
                fukVarDx.l();
                return;
            }
            Objects.toString(fuxVar);
            Log.w("AxMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=".concat(String.valueOf(fuxVar)));
        }
        fup fupVarI2 = fuxVar.i();
        String str4 = fuxVar.c;
        Bundle bundle2 = new Bundle();
        fus.k(this.g.getPackageName(), bundle2);
        fun funVarDy = fupVarI2.dy(str4, new fuo(bundle2));
        if (funVarDy != null) {
            funVarDy.l();
        }
        if (this.d != null) {
            j(this, fuxVar, funVarDy, i, z, null, null);
            return;
        }
        this.d = fuxVar;
        this.e = funVarDy;
        this.a.b(null, fuxVar, i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftw.n():void");
    }

    final void o() {
        MediaRouter2.RoutingController routingController;
        fux fuxVar = this.d;
        if (fuxVar == null) {
            ftu ftuVar = this.w;
            if (ftuVar != null) {
                ftuVar.a();
                return;
            }
            return;
        }
        fvv fvvVar = this.l;
        fvvVar.a = fuxVar.n;
        fvvVar.b = fuxVar.o;
        fvvVar.c = fuxVar.f();
        fux fuxVar2 = this.d;
        fvvVar.d = fuxVar2.l;
        fvvVar.e = fuxVar2.k;
        if (r() && fuxVar2.i() == this.n) {
            fun funVar = this.e;
            fvvVar.f = ((funVar instanceof ftz) && (routingController = ((ftz) funVar).b) != null) ? routingController.getId() : null;
        } else {
            fvvVar.f = null;
        }
        ArrayList arrayList = this.B;
        if (arrayList.size() > 0) {
            throw null;
        }
        if (this.w != null) {
            if (this.d == e() || this.d == this.r) {
                this.w.a();
                return;
            }
            int i = fvvVar.c == 1 ? 2 : 0;
            ftu ftuVar2 = this.w;
            int i2 = fvvVar.b;
            int i3 = fvvVar.a;
            String str = fvvVar.f;
            dyk dykVar = ftuVar2.b;
            if (dykVar != null && i == 0 && i2 == 0) {
                dykVar.a = i3;
                ((VolumeProvider) dykVar.a()).setCurrentVolume(i3);
                return;
            }
            ftuVar2.b = new ftt(ftuVar2, i, i2, i3, str);
            eu euVar = ftuVar2.a;
            dyk dykVar2 = ftuVar2.b;
            if (dykVar2 == null) {
                throw new IllegalArgumentException("volumeProvider may not be null!");
            }
            ((en) euVar.c).a.setPlaybackToRemote((VolumeProvider) dykVar2.a());
        }
    }

    public final void p(fuw fuwVar, fuq fuqVar) {
        String strConcat;
        int i;
        boolean z;
        if (fuwVar.d != fuqVar) {
            fuwVar.d = fuqVar;
            if (fuqVar == null || !(fuqVar.b() || fuqVar == this.o.i)) {
                if (fuqVar != null) {
                    Objects.toString(fuqVar);
                    strConcat = "Ignoring invalid provider descriptor: ".concat(fuqVar.toString());
                } else {
                    ComponentName componentNameA = fuwVar.a();
                    Objects.toString(componentNameA);
                    strConcat = "Ignoring null provider descriptor from ".concat(componentNameA.toString());
                }
                Log.w("AxMediaRouter", strConcat);
                i = 0;
                z = false;
            } else {
                List<fug> list = fuqVar.a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                z = false;
                int i2 = 0;
                for (fug fugVar : list) {
                    if (fugVar == null || !fugVar.v()) {
                        Objects.toString(fugVar);
                        Log.w("AxMediaRouter", "Ignoring invalid route descriptor: ".concat(String.valueOf(fugVar)));
                    } else {
                        String strN = fugVar.n();
                        List list2 = fuwVar.b;
                        int size = list2.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                i3 = -1;
                                break;
                            } else if (((fux) list2.get(i3)).c.equals(strN)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 < 0) {
                            int i4 = i2 + 1;
                            fux fuxVar = new fux(fuwVar, strN, g(fuwVar, strN), fugVar.u());
                            list2.add(i2, fuxVar);
                            this.i.add(fuxVar);
                            if (fugVar.q().isEmpty()) {
                                fuxVar.g(fugVar);
                                this.a.a(257, fuxVar);
                            } else {
                                arrayList.add(new cui(fuxVar, fugVar));
                            }
                            i2 = i4;
                        } else if (i3 < i2) {
                            Objects.toString(fugVar);
                            Log.w("AxMediaRouter", "Ignoring route descriptor with duplicate id: ".concat(fugVar.toString()));
                        } else {
                            int i5 = i2 + 1;
                            fux fuxVar2 = (fux) list2.get(i3);
                            Collections.swap(list2, i3, i2);
                            if (!fugVar.q().isEmpty()) {
                                arrayList2.add(new cui(fuxVar2, fugVar));
                            } else if (a(fuxVar2, fugVar) != 0 && fuxVar2 == this.d) {
                                i2 = i5;
                                z = true;
                            }
                            i2 = i5;
                        }
                    }
                }
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    cui cuiVar = (cui) arrayList.get(i6);
                    fux fuxVar3 = (fux) cuiVar.a;
                    fuxVar3.g((fug) cuiVar.b);
                    this.a.a(257, fuxVar3);
                }
                int size3 = arrayList2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    cui cuiVar2 = (cui) arrayList2.get(i7);
                    fux fuxVar4 = (fux) cuiVar2.a;
                    if (a(fuxVar4, (fug) cuiVar2.b) != 0 && fuxVar4 == this.d) {
                        z = true;
                    }
                }
                i = i2;
            }
            List list3 = fuwVar.b;
            for (int size4 = list3.size() - 1; size4 >= i; size4--) {
                fux fuxVar5 = (fux) list3.get(size4);
                fuxVar5.g(null);
                this.i.remove(fuxVar5);
            }
            q(z);
            for (int size5 = list3.size() - 1; size5 >= i; size5--) {
                this.a.a(258, (fux) list3.remove(size5));
            }
            this.a.a(515, fuwVar);
        }
    }

    final void q(boolean z) {
        fux fuxVar = this.q;
        if (fuxVar != null && !fuxVar.s()) {
            Objects.toString(this.q);
            this.q = null;
        }
        if (this.q == null) {
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                fux fuxVar2 = (fux) arrayList.get(i);
                if (fuxVar2.i() == this.o && fuxVar2.c.equals("DEFAULT_ROUTE") && fuxVar2.s()) {
                    this.q = fuxVar2;
                    Objects.toString(this.q);
                    break;
                }
                i++;
            }
        }
        fux fuxVar3 = this.r;
        if (fuxVar3 != null && !fuxVar3.s()) {
            Objects.toString(this.r);
            this.r = null;
        }
        if (this.r == null) {
            ArrayList arrayList2 = this.i;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                fux fuxVar4 = (fux) arrayList2.get(i2);
                if (u(fuxVar4) && fuxVar4.s()) {
                    this.r = fuxVar4;
                    Objects.toString(this.r);
                    break;
                }
                i2++;
            }
        }
        fux fuxVar5 = this.d;
        if (fuxVar5 == null || !fuxVar5.h) {
            Objects.toString(this.d);
            m(d(), 0, true);
        } else if (z) {
            i();
            o();
        }
    }

    public final boolean r() {
        if (!this.C) {
            return false;
        }
        fvb fvbVar = this.p;
        return fvbVar == null || fvbVar.b;
    }

    public final void s() {
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            fuu fuuVar = ((ftv) it.next()).b;
        }
    }
}

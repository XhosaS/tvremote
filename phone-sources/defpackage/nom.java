package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nom extends fus {
    public static final nsf a = new nsf("MRDiscoveryCallback");
    private final obl f;
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    public final Set b = DesugarCollections.synchronizedSet(new LinkedHashSet());
    public final nrd e = new nrd(this, 1);

    public nom(Context context) {
        this.f = new obl(context);
    }

    public final Map R() {
        HashMap map = new HashMap();
        Map map2 = this.c;
        synchronized (map2) {
            for (String str : map2.keySet()) {
                Set setS = S(str);
                if (!setS.isEmpty()) {
                    map.put(str, setS);
                }
            }
        }
        return ImmutableMap.copyOf((Map) map);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Collection] */
    public final Set S(String str) {
        nsf nsfVar = (nsf) this.c.get(sij.K(str));
        return nsfVar == null ? ImmutableSet.of() : ImmutableSet.copyOf((Collection) nsfVar.a);
    }

    public final void T() {
        this.d.size();
        nsf.e();
        String.valueOf(this.c.keySet());
        nsf.e();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            U();
        } else {
            new ogh(Looper.getMainLooper()).post(new mpz(this, 15));
        }
    }

    public final void U() {
        obl oblVar = this.f;
        oblVar.e(this);
        LinkedHashSet linkedHashSet = this.d;
        synchronized (linkedHashSet) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                nxb nxbVar = new nxb();
                nxbVar.i(jys.C(str));
                fur furVarG = nxbVar.g();
                Map map = this.c;
                if (((nsf) map.get(str)) == null) {
                    map.put(str, new nsf(furVarG));
                }
                jys.C(str);
                nsf.e();
                oblVar.f(furVarG, this);
            }
        }
        String.valueOf(this.c.keySet());
        nsf.e();
    }

    public final void V() {
        this.f.e(this);
    }

    public final void W(fux fuxVar, boolean z) {
        boolean zAdd;
        nsf nsfVar = a;
        nsf.e();
        Map map = this.c;
        synchronized (map) {
            String.valueOf(map.keySet());
            nsf.e();
            zAdd = false;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                nsf nsfVar2 = (nsf) entry.getValue();
                if (fuxVar.u((fur) nsfVar2.b)) {
                    if (z) {
                        nsf.e();
                        zAdd = ((LinkedHashSet) nsfVar2.a).add(fuxVar);
                        if (!zAdd) {
                            nsfVar.d("Route " + String.valueOf(fuxVar) + " already exists for appId " + str, new Object[0]);
                        }
                    } else {
                        nsf.e();
                        zAdd = ((LinkedHashSet) nsfVar2.a).remove(fuxVar);
                        if (!zAdd) {
                            nsfVar.d("Route " + String.valueOf(fuxVar) + " already removed from appId " + str, new Object[0]);
                        }
                    }
                }
            }
        }
        if (zAdd) {
            nsf.e();
            Set set = this.b;
            synchronized (set) {
                Map mapR = R();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((pku) it.next()).b(mapR);
                }
            }
        }
    }

    @Override // defpackage.fus
    public final void onRouteAdded(fuy fuyVar, fux fuxVar) {
        nsf.e();
        W(fuxVar, true);
    }

    @Override // defpackage.fus
    public final void onRouteChanged(fuy fuyVar, fux fuxVar) {
        nsf.e();
        W(fuxVar, true);
    }

    @Override // defpackage.fus
    public final void onRouteRemoved(fuy fuyVar, fux fuxVar) {
        nsf.e();
        W(fuxVar, false);
    }
}

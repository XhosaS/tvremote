package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sbu implements sbj, sbm {
    public final sbu a;
    public final sby b;
    public final List c;
    public final yjz d;
    public final List e;
    public Object f;
    public final List g;
    public List h;
    public final List i;
    public final int j;
    public final Set k;
    public final Set l;
    public int m;
    public final Map n;
    public final sbq o;
    private final Map p;
    private int q;

    private sbu(sbu sbuVar, sby sbyVar, List list, yjz yjzVar) {
        this.a = sbuVar;
        this.b = sbyVar;
        this.c = list;
        this.d = yjzVar;
        this.e = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        this.h = yhb.a;
        this.i = arrayList;
        this.j = (sbuVar != null ? sbuVar.j : -1) + 1;
        this.q = 2;
        this.p = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.k = linkedHashSet;
        linkedHashSet.add(this);
        this.l = linkedHashSet;
        this.n = new LinkedHashMap();
        this.o = new sbq(null);
    }

    private final void e(Object obj) {
        Map map = this.p;
        if (map.containsKey(obj)) {
            return;
        }
        sbv sbvVar = new sbv(new qyw(this, obj, 5, null));
        if (obj instanceof dvs) {
            try {
                ((dvs) obj).e(sbvVar);
                map.put(obj, new qyw(obj, sbvVar, 6));
                return;
            } catch (IllegalArgumentException | IllegalStateException unused) {
                return;
            }
        }
        int i = 7;
        if (obj instanceof Observable) {
            ((Observable) obj).addObserver(sbvVar);
            this.p.put(obj, new qyw(obj, sbvVar, i));
        } else if (obj instanceof ids) {
            ((ids) obj).ea(sbvVar);
            this.p.put(obj, new qyw(obj, sbvVar, 8));
        } else if (obj instanceof yva) {
            this.p.put(obj, new ovo(ykr.q(yoz.m(), null, 0, new qxa(obj, sbvVar, (yih) null, 7), 3), 4));
        }
    }

    private final void f() {
        int i = this.b.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            s();
        } else if (i2 == 1) {
            t();
        } else {
            if (i2 != 2) {
                throw new yfu();
            }
            u();
        }
    }

    public final void a(Object... objArr) {
        e(objArr[0]);
        yfm.J(this.e, objArr);
    }

    public final void b(Object... objArr) {
        sby sbyVar = this.b;
        TreeMap treeMap = sbyVar.c;
        Integer numValueOf = Integer.valueOf(this.j);
        Object arrayList = treeMap.get(numValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            treeMap.put(numValueOf, arrayList);
        }
        List list = (List) arrayList;
        if (!list.contains(this)) {
            list.add(this);
            treeMap.put(numValueOf, list);
            if (sbyVar.e == 1) {
                sbyVar.e();
            }
        }
        yfm.J(this.k, objArr);
    }

    public final void c(Object obj) {
        yjk yjkVar = (yjk) this.p.remove(obj);
        if (yjkVar != null) {
            yjkVar.a();
        }
    }

    public final boolean d() {
        return this.q == 3;
    }

    @Override // defpackage.sbj
    public final void s() {
        if (d()) {
            throw new IllegalStateException("can't activate a node that's already destroyed");
        }
        if (this.q != 1) {
            this.q = 1;
            for (Object obj : this.c) {
                sbj sbjVar = obj instanceof sbj ? (sbj) obj : null;
                if (sbjVar != null) {
                    sbjVar.s();
                }
            }
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((sbu) it.next()).s();
            }
        }
    }

    @Override // defpackage.sbj
    public final void t() {
        if (d()) {
            throw new IllegalStateException("can't deactivate a node that's already destroyed");
        }
        if (this.q != 2) {
            this.q = 2;
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((sbu) it.next()).t();
            }
            for (Object obj : this.c) {
                sbj sbjVar = obj instanceof sbj ? (sbj) obj : null;
                if (sbjVar != null) {
                    sbjVar.t();
                }
            }
        }
    }

    @Override // defpackage.sbm
    public final void u() {
        if (d()) {
            throw new UnsupportedOperationException("can't destroy a node that's already destroyed");
        }
        t();
        List list = this.g;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((sbu) it.next()).u();
        }
        list.clear();
        for (Object obj : this.c) {
            sbm sbmVar = obj instanceof sbm ? (sbm) obj : null;
            if (sbmVar != null) {
                sbmVar.u();
            }
        }
        Map map = this.p;
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            ((yjk) ((Map.Entry) it2.next()).getValue()).a();
        }
        map.clear();
        this.k.clear();
        this.q = 3;
    }

    public sbu(sbu sbuVar, List list, yjz yjzVar) {
        this(sbuVar, sbuVar.b, list, yjzVar);
        sbuVar.g.add(this);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e(it.next());
        }
        f();
    }

    public sbu(sby sbyVar, List list, yjz yjzVar) {
        this(null, sbyVar, list, yjzVar);
        if (sbyVar.b == null) {
            sbyVar.b = this;
            f();
            return;
        }
        throw new UnsupportedOperationException("root of scope already set");
    }
}

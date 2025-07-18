package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class deh implements ddx {
    private final ded a;
    private final deg b;
    private final Map c;
    private final Map d;
    private final int e;
    private int f;

    public deh() {
        this.a = new ded();
        this.b = new deg();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    private final ddw f(Class cls) {
        ddw debVar;
        Map map = this.d;
        ddw ddwVar = (ddw) map.get(cls);
        if (ddwVar != null) {
            return ddwVar;
        }
        if (cls.equals(int[].class)) {
            debVar = new dee();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(String.valueOf(cls.getSimpleName())));
            }
            debVar = new deb();
        }
        map.put(cls, debVar);
        return debVar;
    }

    private final Object g(def defVar, Class cls) {
        ded dedVar = this.a;
        ddw ddwVarF = f(cls);
        Object objA = dedVar.a(defVar);
        if (objA != null) {
            this.f -= ddwVarF.a(objA) * ddwVarF.b();
            i(ddwVarF.a(objA), cls);
        }
        if (objA != null) {
            return objA;
        }
        if (Log.isLoggable(ddwVarF.d(), 2)) {
            Log.v(ddwVarF.d(), "Allocated " + defVar.a + " bytes");
        }
        return ddwVarF.c(defVar.a);
    }

    private final NavigableMap h(Class cls) {
        Map map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    private final void i(int i, Class cls) {
        NavigableMap navigableMapH = h(cls);
        Integer numValueOf = Integer.valueOf(i);
        Integer num = (Integer) navigableMapH.get(numValueOf);
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapH.remove(numValueOf);
                return;
            } else {
                navigableMapH.put(numValueOf, Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + toString());
    }

    private final void j(int i) {
        while (this.f > i) {
            Object objB = this.a.b();
            dqk.d(objB, "Argument must not be null");
            ddw ddwVarF = f(objB.getClass());
            this.f -= ddwVarF.a(objB) * ddwVarF.b();
            i(ddwVarF.a(objB), objB.getClass());
            if (Log.isLoggable(ddwVarF.d(), 2)) {
                Log.v(ddwVarF.d(), "evicted: " + ddwVarF.a(objB));
            }
        }
    }

    @Override // defpackage.ddx
    public final synchronized Object a(int i, Class cls) {
        Integer num;
        int i2;
        num = (Integer) h(cls).ceilingKey(Integer.valueOf(i));
        return g((num == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && num.intValue() > i * 8)) ? this.b.d(i, cls) : this.b.d(num.intValue(), cls), cls);
    }

    @Override // defpackage.ddx
    public final synchronized void b() {
        j(0);
    }

    @Override // defpackage.ddx
    public final synchronized void c(Object obj) {
        Class<?> cls = obj.getClass();
        ddw ddwVarF = f(cls);
        int iA = ddwVarF.a(obj);
        int iB = ddwVarF.b() * iA;
        int i = this.e;
        if (iB <= (i >> 1)) {
            def defVarD = this.b.d(iA, cls);
            this.a.c(defVarD, obj);
            NavigableMap navigableMapH = h(cls);
            Integer num = (Integer) navigableMapH.get(Integer.valueOf(defVarD.a));
            Integer numValueOf = Integer.valueOf(defVarD.a);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapH.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iB;
            j(i);
        }
    }

    @Override // defpackage.ddx
    public final synchronized void d(int i) {
        if (i >= 40) {
            b();
        } else if (i >= 20 || i == 15) {
            j(this.e >> 1);
        }
    }

    @Override // defpackage.ddx
    public final synchronized Object e(Class cls) {
        return g(this.b.d(8, cls), cls);
    }

    public deh(int i) {
        this.a = new ded();
        this.b = new deg();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }
}

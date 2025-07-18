package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hok {
    private final hog a;
    private final hoj b;
    private final Map c;
    private final Map d;
    private final int e;
    private int f;

    public hok() {
        this.a = new hog();
        this.b = new hoj();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    private final hob f(Class cls) {
        hoh hohVar;
        Map map = this.d;
        hob hobVar = (hob) map.get(cls);
        if (hobVar != null) {
            return hobVar;
        }
        if (cls.equals(int[].class)) {
            hohVar = new hoh(0);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(String.valueOf(cls.getSimpleName())));
            }
            hohVar = new hoh(1);
        }
        map.put(cls, hohVar);
        return hohVar;
    }

    private final Object g(hoi hoiVar, Class cls) {
        hog hogVar = this.a;
        hob hobVarF = f(cls);
        Object objA = hogVar.a(hoiVar);
        if (objA != null) {
            this.f -= hobVarF.a(objA) * hobVarF.b();
            i(hobVarF.a(objA), cls);
        }
        return objA == null ? hobVarF.c(hoiVar.a) : objA;
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
            hju.p(objB);
            hob hobVarF = f(objB.getClass());
            this.f -= hobVarF.a(objB) * hobVarF.b();
            i(hobVarF.a(objB), objB.getClass());
        }
    }

    public final synchronized Object a(int i, Class cls) {
        Integer num;
        int i2;
        num = (Integer) h(cls).ceilingKey(Integer.valueOf(i));
        return g((num == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && num.intValue() > i * 8)) ? this.b.d(i, cls) : this.b.d(num.intValue(), cls), cls);
    }

    public final synchronized void b() {
        j(0);
    }

    public final synchronized void c(Object obj) {
        Class<?> cls = obj.getClass();
        hob hobVarF = f(cls);
        int iA = hobVarF.a(obj);
        int iB = hobVarF.b() * iA;
        int i = this.e;
        if (iB <= (i >> 1)) {
            hoi hoiVarD = this.b.d(iA, cls);
            this.a.c(hoiVarD, obj);
            NavigableMap navigableMapH = h(cls);
            Integer num = (Integer) navigableMapH.get(Integer.valueOf(hoiVarD.a));
            Integer numValueOf = Integer.valueOf(hoiVarD.a);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapH.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iB;
            j(i);
        }
    }

    public final synchronized void d(int i) {
        if (i >= 40) {
            b();
        } else if (i >= 20 || i == 15) {
            j(this.e >> 1);
        }
    }

    public final synchronized Object e(Class cls) {
        return g(this.b.d(8, cls), cls);
    }

    public hok(int i) {
        this.a = new hog();
        this.b = new hoj();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }
}

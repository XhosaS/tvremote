package defpackage;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
class dqq<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public boolean c;
    private volatile dqp e;
    public List a = Collections.EMPTY_LIST;
    public Map b = Collections.EMPTY_MAP;
    public Map d = Collections.EMPTY_MAP;

    private final int g(Comparable comparable) {
        int size = this.a.size();
        int i = size - 1;
        int i2 = 0;
        if (i >= 0) {
            int iCompareTo = comparable.compareTo(((dqn) this.a.get(i)).a);
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i;
            }
        }
        while (i2 <= i) {
            int i3 = (i2 + i) / 2;
            int iCompareTo2 = comparable.compareTo(((dqn) this.a.get(i3)).a);
            if (iCompareTo2 < 0) {
                i = i3 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    private final SortedMap h() {
        f();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.b = treeMap;
            this.d = treeMap.descendingMap();
        }
        return (SortedMap) this.b;
    }

    public final int a() {
        return this.a.size();
    }

    public final Iterable b() {
        return this.b.isEmpty() ? Collections.EMPTY_SET : this.b.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iG = g(comparable);
        if (iG >= 0) {
            return ((dqn) this.a.get(iG)).setValue(obj);
        }
        f();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(16);
        }
        int i = -(iG + 1);
        if (i >= 16) {
            return h().put(comparable, obj);
        }
        if (this.a.size() == 16) {
            dqn dqnVar = (dqn) this.a.remove(15);
            h().put(dqnVar.a, dqnVar.b);
        }
        this.a.add(i, new dqn(this, comparable, obj, 0));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.b.containsKey(comparable);
    }

    public final Object d(int i) {
        f();
        Object obj = ((dqn) this.a.remove(i)).b;
        if (!this.b.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            List list = this.a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new dqn(this, (Comparable) entry.getKey(), entry.getValue(), 0));
            it.remove();
        }
        return obj;
    }

    public final Map.Entry e(int i) {
        return (Map.Entry) this.a.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new dqp(this);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqq)) {
            return super.equals(obj);
        }
        dqq dqqVar = (dqq) obj;
        int size = size();
        if (size != dqqVar.size()) {
            return false;
        }
        int iA = a();
        if (iA != dqqVar.a()) {
            return entrySet().equals(dqqVar.entrySet());
        }
        for (int i = 0; i < iA; i++) {
            if (!e(i).equals(dqqVar.e(i))) {
                return false;
            }
        }
        if (iA != size) {
            return this.b.equals(dqqVar.b);
        }
        return true;
    }

    public final void f() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? (V) ((dqn) this.a.get(iG)).b : (V) this.b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iA = a();
        int iHashCode = 0;
        for (int i = 0; i < iA; i++) {
            iHashCode += ((dqn) this.a.get(i)).hashCode();
        }
        return this.b.size() > 0 ? iHashCode + this.b.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return (V) d(iG);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return (V) this.b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size() + this.b.size();
    }
}

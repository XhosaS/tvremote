package defpackage;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbq extends AbstractMap implements Serializable {
    public static final Comparator a = new abbj();
    abbp b;
    int c;
    int d;
    final abbp e;
    private final Comparator f;
    private final boolean g;
    private abbl h;
    private abbn i;

    public abbq() {
        this(a, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f(defpackage.abbp r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            abbp r0 = r9.b
            abbp r1 = r9.c
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.i
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.i
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            abbp r0 = r1.b
            abbp r3 = r1.c
            if (r3 == 0) goto L22
            int r3 = r3.i
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.i
            goto L29
        L28:
            r0 = r2
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.i(r1)
            r8.h(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.h(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            abbp r1 = r0.b
            abbp r3 = r0.c
            if (r3 == 0) goto L4e
            int r3 = r3.i
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.i
            goto L55
        L54:
            r1 = r2
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.h(r0)
            r8.i(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.i(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.i = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.i = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            abbp r9 = r9.a
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abbq.f(abbp, boolean):void");
    }

    private final void g(abbp abbpVar, abbp abbpVar2) {
        abbp abbpVar3 = abbpVar.a;
        abbpVar.a = null;
        if (abbpVar2 != null) {
            abbpVar2.a = abbpVar3;
        }
        if (abbpVar3 == null) {
            this.b = abbpVar2;
        } else if (abbpVar3.b == abbpVar) {
            abbpVar3.b = abbpVar2;
        } else {
            abbpVar3.c = abbpVar2;
        }
    }

    private final void h(abbp abbpVar) {
        abbp abbpVar2 = abbpVar.b;
        abbp abbpVar3 = abbpVar.c;
        abbp abbpVar4 = abbpVar3.b;
        abbp abbpVar5 = abbpVar3.c;
        abbpVar.c = abbpVar4;
        if (abbpVar4 != null) {
            abbpVar4.a = abbpVar;
        }
        g(abbpVar, abbpVar3);
        abbpVar3.b = abbpVar;
        abbpVar.a = abbpVar3;
        int iMax = Math.max(abbpVar2 != null ? abbpVar2.i : 0, abbpVar4 != null ? abbpVar4.i : 0) + 1;
        abbpVar.i = iMax;
        abbpVar3.i = Math.max(iMax, abbpVar5 != null ? abbpVar5.i : 0) + 1;
    }

    private final void i(abbp abbpVar) {
        abbp abbpVar2 = abbpVar.b;
        abbp abbpVar3 = abbpVar.c;
        abbp abbpVar4 = abbpVar2.b;
        abbp abbpVar5 = abbpVar2.c;
        abbpVar.b = abbpVar5;
        if (abbpVar5 != null) {
            abbpVar5.a = abbpVar;
        }
        g(abbpVar, abbpVar2);
        abbpVar2.c = abbpVar;
        abbpVar.a = abbpVar2;
        int iMax = Math.max(abbpVar3 != null ? abbpVar3.i : 0, abbpVar5 != null ? abbpVar5.i : 0) + 1;
        abbpVar.i = iMax;
        abbpVar2.i = Math.max(iMax, abbpVar4 != null ? abbpVar4.i : 0) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    final abbp a(Object obj, boolean z) {
        int iCompareTo;
        abbp abbpVar;
        Comparator comparator = this.f;
        abbp abbpVar2 = this.b;
        if (abbpVar2 != null) {
            Comparable comparable = comparator == a ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(abbpVar2.f) : comparator.compare(obj, abbpVar2.f);
                if (iCompareTo == 0) {
                    return abbpVar2;
                }
                abbp abbpVar3 = iCompareTo < 0 ? abbpVar2.b : abbpVar2.c;
                if (abbpVar3 == null) {
                    break;
                }
                abbpVar2 = abbpVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i = iCompareTo;
        if (!z) {
            return null;
        }
        abbp abbpVar4 = this.e;
        if (abbpVar2 != null) {
            abbp abbpVar5 = abbpVar2;
            abbpVar = new abbp(this.g, abbpVar5, obj, abbpVar4, abbpVar4.e);
            if (i < 0) {
                abbpVar5.b = abbpVar;
            } else {
                abbpVar5.c = abbpVar;
            }
            f(abbpVar5, true);
        } else {
            if (comparator == a && !(obj instanceof Comparable)) {
                throw new ClassCastException(String.valueOf(obj.getClass().getName()).concat(" is not Comparable"));
            }
            abbpVar = new abbp(this.g, null, obj, abbpVar4, abbpVar4.e);
            this.b = abbpVar;
        }
        this.c++;
        this.d++;
        return abbpVar;
    }

    final abbp b(Map.Entry entry) {
        abbp abbpVarC = c(entry.getKey());
        if (abbpVarC == null || !Objects.equals(abbpVarC.h, entry.getValue())) {
            return null;
        }
        return abbpVarC;
    }

    final abbp c(Object obj) {
        if (obj != null) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        abbp abbpVar = this.e;
        abbpVar.e = abbpVar;
        abbpVar.d = abbpVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    final abbp d(Object obj) {
        abbp abbpVarC = c(obj);
        if (abbpVarC != null) {
            e(abbpVarC, true);
        }
        return abbpVarC;
    }

    final void e(abbp abbpVar, boolean z) {
        abbp abbpVar2;
        abbp abbpVar3;
        int i;
        if (z) {
            abbp abbpVar4 = abbpVar.e;
            abbpVar4.d = abbpVar.d;
            abbpVar.d.e = abbpVar4;
        }
        abbp abbpVar5 = abbpVar.b;
        abbp abbpVar6 = abbpVar.c;
        abbp abbpVar7 = abbpVar.a;
        int i2 = 0;
        if (abbpVar5 == null || abbpVar6 == null) {
            if (abbpVar5 != null) {
                g(abbpVar, abbpVar5);
                abbpVar.b = null;
            } else if (abbpVar6 != null) {
                g(abbpVar, abbpVar6);
                abbpVar.c = null;
            } else {
                g(abbpVar, null);
            }
            f(abbpVar7, false);
            this.c--;
            this.d++;
            return;
        }
        if (abbpVar5.i > abbpVar6.i) {
            do {
                abbpVar3 = abbpVar5;
                abbpVar5 = abbpVar5.c;
            } while (abbpVar5 != null);
        } else {
            do {
                abbpVar2 = abbpVar6;
                abbpVar6 = abbpVar6.b;
            } while (abbpVar6 != null);
            abbpVar3 = abbpVar2;
        }
        e(abbpVar3, false);
        abbp abbpVar8 = abbpVar.b;
        if (abbpVar8 != null) {
            i = abbpVar8.i;
            abbpVar3.b = abbpVar8;
            abbpVar8.a = abbpVar3;
            abbpVar.b = null;
        } else {
            i = 0;
        }
        abbp abbpVar9 = abbpVar.c;
        if (abbpVar9 != null) {
            i2 = abbpVar9.i;
            abbpVar3.c = abbpVar9;
            abbpVar9.a = abbpVar3;
            abbpVar.c = null;
        }
        abbpVar3.i = Math.max(i, i2) + 1;
        g(abbpVar, abbpVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        abbl abblVar = this.h;
        if (abblVar != null) {
            return abblVar;
        }
        abbl abblVar2 = new abbl(this);
        this.h = abblVar2;
        return abblVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        abbp abbpVarC = c(obj);
        if (abbpVarC != null) {
            return abbpVarC.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        abbn abbnVar = this.i;
        if (abbnVar != null) {
            return abbnVar;
        }
        abbn abbnVar2 = new abbn(this);
        this.i = abbnVar2;
        return abbnVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.g) {
            throw new NullPointerException("value == null");
        }
        abbp abbpVarA = a(obj, true);
        Object obj3 = abbpVarA.h;
        abbpVarA.h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        abbp abbpVarD = d(obj);
        if (abbpVarD != null) {
            return abbpVarD.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    public abbq(Comparator comparator, boolean z) {
        this.c = 0;
        this.d = 0;
        this.f = comparator;
        this.g = z;
        this.e = new abbp(z);
    }
}

package j$.util.stream;

import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class K {
    public static final K DISTINCT;
    public static final K ORDERED;
    public static final K SHORT_CIRCUIT;
    public static final K SIZED;
    public static final K SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final /* synthetic */ K[] r;
    public final EnumMap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        J j2 = J.SPLITERATOR;
        j$.time.format.s sVarL = l(j2);
        J j3 = J.STREAM;
        sVarL.l(j3);
        J j4 = J.OP;
        ((EnumMap) sVarL.b).put((EnumMap) j4, (J) 3);
        K k2 = new K("DISTINCT", 0, 0, sVarL);
        DISTINCT = k2;
        j$.time.format.s sVarL2 = l(j2);
        sVarL2.l(j3);
        ((EnumMap) sVarL2.b).put((EnumMap) j4, (J) 3);
        K k3 = new K("SORTED", 1, 1, sVarL2);
        SORTED = k3;
        j$.time.format.s sVarL3 = l(j2);
        sVarL3.l(j3);
        EnumMap enumMap = (EnumMap) sVarL3.b;
        enumMap.put((EnumMap) j4, (J) 3);
        J j5 = J.TERMINAL_OP;
        enumMap.put((EnumMap) j5, (J) 2);
        J j6 = J.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) j6, (J) 2);
        K k4 = new K("ORDERED", 2, 2, sVarL3);
        ORDERED = k4;
        j$.time.format.s sVarL4 = l(j2);
        sVarL4.l(j3);
        ((EnumMap) sVarL4.b).put((EnumMap) j4, (J) 2);
        K k5 = new K("SIZED", 3, 3, sVarL4);
        SIZED = k5;
        j$.time.format.s sVarL5 = l(j4);
        sVarL5.l(j5);
        int i2 = 0;
        K k6 = new K("SHORT_CIRCUIT", 4, 12, sVarL5);
        SHORT_CIRCUIT = k6;
        r = new K[]{k2, k3, k4, k5, k6};
        f = j(j2);
        g = j(j3);
        h = j(j4);
        j(j5);
        j(j6);
        for (K k7 : values()) {
            i2 |= k7.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        K k8 = DISTINCT;
        int i5 = k8.c;
        m = k8.d;
        K k9 = SORTED;
        int i6 = k9.c;
        n = k9.d;
        K k10 = ORDERED;
        int i7 = k10.c;
        o = k10.d;
        K k11 = SIZED;
        int i8 = k11.c;
        p = k11.d;
        q = SHORT_CIRCUIT.c;
    }

    public K(String str, int i2, int i3, j$.time.format.s sVar) {
        EnumMap enumMap = (EnumMap) sVar.b;
        for (J j2 : J.values()) {
            j$.nio.file.attribute.a.K(enumMap, j2, 0);
        }
        this.a = enumMap;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public static int i(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    public static int j(J j2) {
        int iIntValue = 0;
        for (K k2 : values()) {
            iIntValue |= ((Integer) k2.a.get(j2)).intValue() << k2.b;
        }
        return iIntValue;
    }

    public static j$.time.format.s l(J j2) {
        j$.time.format.s sVar = new j$.time.format.s(7, new EnumMap(J.class));
        sVar.l(j2);
        return sVar;
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) r.clone();
    }

    public final boolean k(int i2) {
        return (i2 & this.e) == this.c;
    }
}

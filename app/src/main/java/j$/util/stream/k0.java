package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
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
/* loaded from: classes3.dex */
public final class k0 {
    public static final k0 DISTINCT;
    public static final k0 ORDERED;
    public static final k0 SHORT_CIRCUIT;
    public static final k0 SIZED;
    public static final k0 SORTED;
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
    public static final /* synthetic */ k0[] r;
    public final EnumMap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        j0 j0Var = j0.SPLITERATOR;
        j$.desugar.sun.nio.fs.h hVarE = E(j0Var);
        j0 j0Var2 = j0.STREAM;
        hVarE.b(j0Var2);
        j0 j0Var3 = j0.OP;
        ((EnumMap) hVarE.b).put((EnumMap) j0Var3, (j0) 3);
        k0 k0Var = new k0("DISTINCT", 0, 0, hVarE);
        DISTINCT = k0Var;
        j$.desugar.sun.nio.fs.h hVarE2 = E(j0Var);
        hVarE2.b(j0Var2);
        ((EnumMap) hVarE2.b).put((EnumMap) j0Var3, (j0) 3);
        k0 k0Var2 = new k0("SORTED", 1, 1, hVarE2);
        SORTED = k0Var2;
        j$.desugar.sun.nio.fs.h hVarE3 = E(j0Var);
        hVarE3.b(j0Var2);
        EnumMap enumMap = (EnumMap) hVarE3.b;
        enumMap.put((EnumMap) j0Var3, (j0) 3);
        j0 j0Var4 = j0.TERMINAL_OP;
        enumMap.put((EnumMap) j0Var4, (j0) 2);
        j0 j0Var5 = j0.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) j0Var5, (j0) 2);
        k0 k0Var3 = new k0("ORDERED", 2, 2, hVarE3);
        ORDERED = k0Var3;
        j$.desugar.sun.nio.fs.h hVarE4 = E(j0Var);
        hVarE4.b(j0Var2);
        ((EnumMap) hVarE4.b).put((EnumMap) j0Var3, (j0) 2);
        k0 k0Var4 = new k0("SIZED", 3, 3, hVarE4);
        SIZED = k0Var4;
        j$.desugar.sun.nio.fs.h hVarE5 = E(j0Var3);
        hVarE5.b(j0Var4);
        int i2 = 0;
        k0 k0Var5 = new k0("SHORT_CIRCUIT", 4, 12, hVarE5);
        SHORT_CIRCUIT = k0Var5;
        r = new k0[]{k0Var, k0Var2, k0Var3, k0Var4, k0Var5};
        f = l(j0Var);
        g = l(j0Var2);
        h = l(j0Var3);
        l(j0Var4);
        l(j0Var5);
        for (k0 k0Var6 : values()) {
            i2 |= k0Var6.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        k0 k0Var7 = DISTINCT;
        int i5 = k0Var7.c;
        m = k0Var7.d;
        k0 k0Var8 = SORTED;
        int i6 = k0Var8.c;
        n = k0Var8.d;
        k0 k0Var9 = ORDERED;
        int i7 = k0Var9.c;
        o = k0Var9.d;
        k0 k0Var10 = SIZED;
        int i8 = k0Var10.c;
        p = k0Var10.d;
        q = SHORT_CIRCUIT.c;
    }

    public k0(String str, int i2, int i3, j$.desugar.sun.nio.fs.h hVar) {
        EnumMap enumMap = (EnumMap) hVar.b;
        for (j0 j0Var : j0.values()) {
            Map.EL.putIfAbsent(enumMap, j0Var, 0);
        }
        this.a = enumMap;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public static j$.desugar.sun.nio.fs.h E(j0 j0Var) {
        j$.desugar.sun.nio.fs.h hVar = new j$.desugar.sun.nio.fs.h(8, new EnumMap(j0.class));
        hVar.b(j0Var);
        return hVar;
    }

    public static int i(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    public static int l(j0 j0Var) {
        int iIntValue = 0;
        for (k0 k0Var : values()) {
            iIntValue |= ((Integer) k0Var.a.get(j0Var)).intValue() << k0Var.b;
        }
        return iIntValue;
    }

    public static int m(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) r.clone();
    }

    public final boolean t(int i2) {
        return (i2 & this.e) == this.c;
    }
}

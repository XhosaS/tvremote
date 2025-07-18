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
/* loaded from: classes4.dex */
public final class a1 {
    public static final a1 DISTINCT;
    public static final a1 ORDERED;
    public static final a1 SHORT_CIRCUIT;
    public static final a1 SIZED;
    public static final a1 SORTED;
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
    public static final int r;
    public static final int s;
    public static final /* synthetic */ a1[] t;
    public final EnumMap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        Z0 z0 = Z0.SPLITERATOR;
        j$.desugar.sun.nio.fs.h hVarA = A(z0);
        Z0 z02 = Z0.STREAM;
        hVarA.c(z02);
        Z0 z03 = Z0.OP;
        ((EnumMap) hVarA.b).put((EnumMap) z03, (Z0) 3);
        a1 a1Var = new a1("DISTINCT", 0, 0, hVarA);
        DISTINCT = a1Var;
        j$.desugar.sun.nio.fs.h hVarA2 = A(z0);
        hVarA2.c(z02);
        ((EnumMap) hVarA2.b).put((EnumMap) z03, (Z0) 3);
        a1 a1Var2 = new a1("SORTED", 1, 1, hVarA2);
        SORTED = a1Var2;
        j$.desugar.sun.nio.fs.h hVarA3 = A(z0);
        hVarA3.c(z02);
        EnumMap enumMap = (EnumMap) hVarA3.b;
        enumMap.put((EnumMap) z03, (Z0) 3);
        Z0 z04 = Z0.TERMINAL_OP;
        enumMap.put((EnumMap) z04, (Z0) 2);
        Z0 z05 = Z0.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) z05, (Z0) 2);
        a1 a1Var3 = new a1("ORDERED", 2, 2, hVarA3);
        ORDERED = a1Var3;
        j$.desugar.sun.nio.fs.h hVarA4 = A(z0);
        hVarA4.c(z02);
        ((EnumMap) hVarA4.b).put((EnumMap) z03, (Z0) 2);
        a1 a1Var4 = new a1("SIZED", 3, 3, hVarA4);
        SIZED = a1Var4;
        j$.desugar.sun.nio.fs.h hVarA5 = A(z03);
        hVarA5.c(z04);
        int i2 = 0;
        a1 a1Var5 = new a1("SHORT_CIRCUIT", 4, 12, hVarA5);
        SHORT_CIRCUIT = a1Var5;
        t = new a1[]{a1Var, a1Var2, a1Var3, a1Var4, a1Var5};
        f = l(z0);
        g = l(z02);
        h = l(z03);
        l(z04);
        l(z05);
        for (a1 a1Var6 : values()) {
            i2 |= a1Var6.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        a1 a1Var7 = DISTINCT;
        int i5 = a1Var7.c;
        m = a1Var7.d;
        a1 a1Var8 = SORTED;
        int i6 = a1Var8.c;
        n = a1Var8.d;
        a1 a1Var9 = ORDERED;
        o = a1Var9.c;
        p = a1Var9.d;
        a1 a1Var10 = SIZED;
        q = a1Var10.c;
        r = a1Var10.d;
        s = SHORT_CIRCUIT.c;
    }

    public a1(String str, int i2, int i3, j$.desugar.sun.nio.fs.h hVar) {
        EnumMap enumMap = (EnumMap) hVar.b;
        for (Z0 z0 : Z0.values()) {
            Map.EL.a(enumMap, z0, 0);
        }
        this.a = enumMap;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public static j$.desugar.sun.nio.fs.h A(Z0 z0) {
        j$.desugar.sun.nio.fs.h hVar = new j$.desugar.sun.nio.fs.h(13, new EnumMap(Z0.class));
        hVar.c(z0);
        return hVar;
    }

    public static int i(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    public static int l(Z0 z0) {
        int iIntValue = 0;
        for (a1 a1Var : values()) {
            iIntValue |= ((Integer) a1Var.a.get(z0)).intValue() << a1Var.b;
        }
        return iIntValue;
    }

    public static int m(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) t.clone();
    }

    public final boolean t(int i2) {
        return (i2 & this.e) == this.c;
    }
}

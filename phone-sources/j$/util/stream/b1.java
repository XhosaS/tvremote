package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b1 {
    public static final b1 DOUBLE_VALUE;
    public static final b1 INT_VALUE;
    public static final b1 LONG_VALUE;
    public static final b1 REFERENCE;
    public static final /* synthetic */ b1[] a;

    static {
        b1 b1Var = new b1("REFERENCE", 0);
        REFERENCE = b1Var;
        b1 b1Var2 = new b1("INT_VALUE", 1);
        INT_VALUE = b1Var2;
        b1 b1Var3 = new b1("LONG_VALUE", 2);
        LONG_VALUE = b1Var3;
        b1 b1Var4 = new b1("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = b1Var4;
        a = new b1[]{b1Var, b1Var2, b1Var3, b1Var4};
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) a.clone();
    }
}

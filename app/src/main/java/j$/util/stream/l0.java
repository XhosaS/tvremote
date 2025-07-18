package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l0 {
    public static final l0 DOUBLE_VALUE;
    public static final l0 INT_VALUE;
    public static final l0 LONG_VALUE;
    public static final l0 REFERENCE;
    public static final /* synthetic */ l0[] a;

    static {
        l0 l0Var = new l0("REFERENCE", 0);
        REFERENCE = l0Var;
        l0 l0Var2 = new l0("INT_VALUE", 1);
        INT_VALUE = l0Var2;
        l0 l0Var3 = new l0("LONG_VALUE", 2);
        LONG_VALUE = l0Var3;
        l0 l0Var4 = new l0("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = l0Var4;
        a = new l0[]{l0Var, l0Var2, l0Var3, l0Var4};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) a.clone();
    }
}

package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class L {
    public static final L DOUBLE_VALUE;
    public static final L INT_VALUE;
    public static final L LONG_VALUE;
    public static final L REFERENCE;
    public static final /* synthetic */ L[] a;

    static {
        L l = new L("REFERENCE", 0);
        REFERENCE = l;
        L l2 = new L("INT_VALUE", 1);
        INT_VALUE = l2;
        L l3 = new L("LONG_VALUE", 2);
        LONG_VALUE = l3;
        L l4 = new L("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = l4;
        a = new L[]{l, l2, l3, l4};
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) a.clone();
    }
}

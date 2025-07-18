package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j0 {
    public static final j0 OP;
    public static final j0 SPLITERATOR;
    public static final j0 STREAM;
    public static final j0 TERMINAL_OP;
    public static final j0 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ j0[] a;

    static {
        j0 j0Var = new j0("SPLITERATOR", 0);
        SPLITERATOR = j0Var;
        j0 j0Var2 = new j0("STREAM", 1);
        STREAM = j0Var2;
        j0 j0Var3 = new j0("OP", 2);
        OP = j0Var3;
        j0 j0Var4 = new j0("TERMINAL_OP", 3);
        TERMINAL_OP = j0Var4;
        j0 j0Var5 = new j0("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = j0Var5;
        a = new j0[]{j0Var, j0Var2, j0Var3, j0Var4, j0Var5};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) a.clone();
    }
}

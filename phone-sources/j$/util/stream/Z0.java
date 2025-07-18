package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Z0 {
    public static final Z0 OP;
    public static final Z0 SPLITERATOR;
    public static final Z0 STREAM;
    public static final Z0 TERMINAL_OP;
    public static final Z0 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ Z0[] a;

    static {
        Z0 z0 = new Z0("SPLITERATOR", 0);
        SPLITERATOR = z0;
        Z0 z02 = new Z0("STREAM", 1);
        STREAM = z02;
        Z0 z03 = new Z0("OP", 2);
        OP = z03;
        Z0 z04 = new Z0("TERMINAL_OP", 3);
        TERMINAL_OP = z04;
        Z0 z05 = new Z0("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = z05;
        a = new Z0[]{z0, z02, z03, z04, z05};
    }

    public static Z0 valueOf(String str) {
        return (Z0) Enum.valueOf(Z0.class, str);
    }

    public static Z0[] values() {
        return (Z0[]) a.clone();
    }
}

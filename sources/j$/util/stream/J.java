package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class J {
    public static final J OP;
    public static final J SPLITERATOR;
    public static final J STREAM;
    public static final J TERMINAL_OP;
    public static final J UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ J[] a;

    static {
        J j = new J("SPLITERATOR", 0);
        SPLITERATOR = j;
        J j2 = new J("STREAM", 1);
        STREAM = j2;
        J j3 = new J("OP", 2);
        OP = j3;
        J j4 = new J("TERMINAL_OP", 3);
        TERMINAL_OP = j4;
        J j5 = new J("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = j5;
        a = new J[]{j, j2, j3, j4, j5};
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) a.clone();
    }
}

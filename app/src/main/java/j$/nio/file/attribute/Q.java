package j$.nio.file.attribute;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Q {
    public static final Q GROUP_EXECUTE;
    public static final Q GROUP_READ;
    public static final Q GROUP_WRITE;
    public static final Q OTHERS_EXECUTE;
    public static final Q OTHERS_READ;
    public static final Q OTHERS_WRITE;
    public static final Q OWNER_EXECUTE;
    public static final Q OWNER_READ;
    public static final Q OWNER_WRITE;
    public static final /* synthetic */ Q[] a;

    static {
        Q q = new Q("OWNER_READ", 0);
        OWNER_READ = q;
        Q q2 = new Q("OWNER_WRITE", 1);
        OWNER_WRITE = q2;
        Q q3 = new Q("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = q3;
        Q q4 = new Q("GROUP_READ", 3);
        GROUP_READ = q4;
        Q q5 = new Q("GROUP_WRITE", 4);
        GROUP_WRITE = q5;
        Q q6 = new Q("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = q6;
        Q q7 = new Q("OTHERS_READ", 6);
        OTHERS_READ = q7;
        Q q8 = new Q("OTHERS_WRITE", 7);
        OTHERS_WRITE = q8;
        Q q9 = new Q("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = q9;
        a = new Q[]{q, q2, q3, q4, q5, q6, q7, q8, q9};
    }

    public static Q valueOf(String str) {
        return (Q) Enum.valueOf(Q.class, str);
    }

    public static Q[] values() {
        return (Q[]) a.clone();
    }
}

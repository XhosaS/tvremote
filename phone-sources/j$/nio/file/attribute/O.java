package j$.nio.file.attribute;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class O {
    public static final O GROUP_EXECUTE;
    public static final O GROUP_READ;
    public static final O GROUP_WRITE;
    public static final O OTHERS_EXECUTE;
    public static final O OTHERS_READ;
    public static final O OTHERS_WRITE;
    public static final O OWNER_EXECUTE;
    public static final O OWNER_READ;
    public static final O OWNER_WRITE;
    public static final /* synthetic */ O[] a;

    static {
        O o = new O("OWNER_READ", 0);
        OWNER_READ = o;
        O o2 = new O("OWNER_WRITE", 1);
        OWNER_WRITE = o2;
        O o3 = new O("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = o3;
        O o4 = new O("GROUP_READ", 3);
        GROUP_READ = o4;
        O o5 = new O("GROUP_WRITE", 4);
        GROUP_WRITE = o5;
        O o6 = new O("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = o6;
        O o7 = new O("OTHERS_READ", 6);
        OTHERS_READ = o7;
        O o8 = new O("OTHERS_WRITE", 7);
        OTHERS_WRITE = o8;
        O o9 = new O("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = o9;
        a = new O[]{o, o2, o3, o4, o5, o6, o7, o8, o9};
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) a.clone();
    }
}

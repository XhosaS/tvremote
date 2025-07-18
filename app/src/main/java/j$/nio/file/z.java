package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class z implements InterfaceC0041o {
    public static final z APPEND;
    public static final z CREATE;
    public static final z CREATE_NEW;
    public static final z DELETE_ON_CLOSE;
    public static final z DSYNC;
    public static final z READ;
    public static final z SPARSE;
    public static final z SYNC;
    public static final z TRUNCATE_EXISTING;
    public static final z WRITE;
    public static final /* synthetic */ z[] a;

    static {
        z zVar = new z("READ", 0);
        READ = zVar;
        z zVar2 = new z("WRITE", 1);
        WRITE = zVar2;
        z zVar3 = new z("APPEND", 2);
        APPEND = zVar3;
        z zVar4 = new z("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = zVar4;
        z zVar5 = new z("CREATE", 4);
        CREATE = zVar5;
        z zVar6 = new z("CREATE_NEW", 5);
        CREATE_NEW = zVar6;
        z zVar7 = new z("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = zVar7;
        z zVar8 = new z("SPARSE", 7);
        SPARSE = zVar8;
        z zVar9 = new z("SYNC", 8);
        SYNC = zVar9;
        z zVar10 = new z("DSYNC", 9);
        DSYNC = zVar10;
        a = new z[]{zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7, zVar8, zVar9, zVar10};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) a.clone();
    }
}

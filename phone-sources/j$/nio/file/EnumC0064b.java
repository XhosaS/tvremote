package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.nio.file.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC0064b {
    public static final EnumC0064b EXECUTE;
    public static final EnumC0064b READ;
    public static final EnumC0064b WRITE;
    public static final /* synthetic */ EnumC0064b[] a;

    static {
        EnumC0064b enumC0064b = new EnumC0064b("READ", 0);
        READ = enumC0064b;
        EnumC0064b enumC0064b2 = new EnumC0064b("WRITE", 1);
        WRITE = enumC0064b2;
        EnumC0064b enumC0064b3 = new EnumC0064b("EXECUTE", 2);
        EXECUTE = enumC0064b3;
        a = new EnumC0064b[]{enumC0064b, enumC0064b2, enumC0064b3};
    }

    public static EnumC0064b valueOf(String str) {
        return (EnumC0064b) Enum.valueOf(EnumC0064b.class, str);
    }

    public static EnumC0064b[] values() {
        return (EnumC0064b[]) a.clone();
    }
}

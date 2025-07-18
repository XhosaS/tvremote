package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.nio.file.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0028b {
    public static final EnumC0028b EXECUTE;
    public static final EnumC0028b READ;
    public static final EnumC0028b WRITE;
    public static final /* synthetic */ EnumC0028b[] a;

    static {
        EnumC0028b enumC0028b = new EnumC0028b("READ", 0);
        READ = enumC0028b;
        EnumC0028b enumC0028b2 = new EnumC0028b("WRITE", 1);
        WRITE = enumC0028b2;
        EnumC0028b enumC0028b3 = new EnumC0028b("EXECUTE", 2);
        EXECUTE = enumC0028b3;
        a = new EnumC0028b[]{enumC0028b, enumC0028b2, enumC0028b3};
    }

    public static EnumC0028b valueOf(String str) {
        return (EnumC0028b) Enum.valueOf(EnumC0028b.class, str);
    }

    public static EnumC0028b[] values() {
        return (EnumC0028b[]) a.clone();
    }
}

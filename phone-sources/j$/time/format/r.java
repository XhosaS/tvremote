package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r {
    public static final r LENIENT;
    public static final r SMART;
    public static final r STRICT;
    public static final /* synthetic */ r[] a;

    static {
        r rVar = new r("STRICT", 0);
        STRICT = rVar;
        r rVar2 = new r("SMART", 1);
        SMART = rVar2;
        r rVar3 = new r("LENIENT", 2);
        LENIENT = rVar3;
        a = new r[]{rVar, rVar2, rVar3};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) a.clone();
    }
}

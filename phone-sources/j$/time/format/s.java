package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class s {
    public static final s ALWAYS;
    public static final s EXCEEDS_PAD;
    public static final s NEVER;
    public static final s NORMAL;
    public static final s NOT_NEGATIVE;
    public static final /* synthetic */ s[] a;

    static {
        s sVar = new s("NORMAL", 0);
        NORMAL = sVar;
        s sVar2 = new s("ALWAYS", 1);
        ALWAYS = sVar2;
        s sVar3 = new s("NEVER", 2);
        NEVER = sVar3;
        s sVar4 = new s("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = sVar4;
        s sVar5 = new s("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = sVar5;
        a = new s[]{sVar, sVar2, sVar3, sVar4, sVar5};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) a.clone();
    }
}

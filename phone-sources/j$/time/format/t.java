package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class t {
    public static final t FULL;
    public static final t FULL_STANDALONE;
    public static final t NARROW;
    public static final t NARROW_STANDALONE;
    public static final t SHORT;
    public static final t SHORT_STANDALONE;
    public static final /* synthetic */ t[] a;

    static {
        t tVar = new t("FULL", 0);
        FULL = tVar;
        t tVar2 = new t("FULL_STANDALONE", 1);
        FULL_STANDALONE = tVar2;
        t tVar3 = new t("SHORT", 2);
        SHORT = tVar3;
        t tVar4 = new t("SHORT_STANDALONE", 3);
        SHORT_STANDALONE = tVar4;
        t tVar5 = new t("NARROW", 4);
        NARROW = tVar5;
        t tVar6 = new t("NARROW_STANDALONE", 5);
        NARROW_STANDALONE = tVar6;
        a = new t[]{tVar, tVar2, tVar3, tVar4, tVar5, tVar6};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) a.clone();
    }
}

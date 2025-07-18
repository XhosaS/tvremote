package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class asv {
    public static final asv a;
    public static final asv b;
    public static final asv c;
    public static final asv d;
    public static final asv e;
    public static final asv f;
    public static final asv g;
    public static final asv h;
    public static final asv i;
    private static final /* synthetic */ asv[] j;

    static {
        asv asvVar = new asv("PENALTY_LOG", 0);
        a = asvVar;
        asv asvVar2 = new asv("PENALTY_DEATH", 1);
        b = asvVar2;
        asv asvVar3 = new asv("DETECT_FRAGMENT_REUSE", 2);
        c = asvVar3;
        asv asvVar4 = new asv("DETECT_FRAGMENT_TAG_USAGE", 3);
        d = asvVar4;
        asv asvVar5 = new asv("DETECT_WRONG_NESTED_HIERARCHY", 4);
        e = asvVar5;
        asv asvVar6 = new asv("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f = asvVar6;
        asv asvVar7 = new asv("DETECT_SET_USER_VISIBLE_HINT", 6);
        g = asvVar7;
        asv asvVar8 = new asv("DETECT_TARGET_FRAGMENT_USAGE", 7);
        h = asvVar8;
        asv asvVar9 = new asv("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        i = asvVar9;
        asv[] asvVarArr = {asvVar, asvVar2, asvVar3, asvVar4, asvVar5, asvVar6, asvVar7, asvVar8, asvVar9};
        j = asvVarArr;
        agtw.a(asvVarArr);
    }

    private asv(String str, int i2) {
    }

    public static asv[] values() {
        return (asv[]) j.clone();
    }
}

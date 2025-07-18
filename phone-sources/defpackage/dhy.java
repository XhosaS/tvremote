package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhy {
    public static final dhy a;
    public static final dhy b;
    public static final dhy c;
    public static final dhy d;
    public static final dhy e;
    public static final dhy f;
    public static final dhy g;
    public static final dhy h;
    public static final dhy i;
    private static final /* synthetic */ dhy[] j;

    static {
        dhy dhyVar = new dhy("PENALTY_LOG", 0);
        a = dhyVar;
        dhy dhyVar2 = new dhy("PENALTY_DEATH", 1);
        b = dhyVar2;
        dhy dhyVar3 = new dhy("DETECT_FRAGMENT_REUSE", 2);
        c = dhyVar3;
        dhy dhyVar4 = new dhy("DETECT_FRAGMENT_TAG_USAGE", 3);
        d = dhyVar4;
        dhy dhyVar5 = new dhy("DETECT_WRONG_NESTED_HIERARCHY", 4);
        e = dhyVar5;
        dhy dhyVar6 = new dhy("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f = dhyVar6;
        dhy dhyVar7 = new dhy("DETECT_SET_USER_VISIBLE_HINT", 6);
        g = dhyVar7;
        dhy dhyVar8 = new dhy("DETECT_TARGET_FRAGMENT_USAGE", 7);
        h = dhyVar8;
        dhy dhyVar9 = new dhy("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        i = dhyVar9;
        dhy[] dhyVarArr = {dhyVar, dhyVar2, dhyVar3, dhyVar4, dhyVar5, dhyVar6, dhyVar7, dhyVar8, dhyVar9};
        j = dhyVarArr;
        wcq.P(dhyVarArr);
    }

    private dhy(String str, int i2) {
    }

    public static dhy[] values() {
        return (dhy[]) j.clone();
    }
}

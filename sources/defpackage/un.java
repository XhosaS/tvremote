package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class un extends Enum {
    public static final un a;
    public static final un b;
    public static final un c;
    public static final un d;
    public static final un e;
    public static final un f;
    public static final un g;
    public static final un h;
    public static final un i;
    private static final /* synthetic */ un[] j;

    static {
        un unVar = new un("PENALTY_LOG", 0);
        a = unVar;
        un unVar2 = new un("PENALTY_DEATH", 1);
        b = unVar2;
        un unVar3 = new un("DETECT_FRAGMENT_REUSE", 2);
        c = unVar3;
        un unVar4 = new un("DETECT_FRAGMENT_TAG_USAGE", 3);
        d = unVar4;
        un unVar5 = new un("DETECT_WRONG_NESTED_HIERARCHY", 4);
        e = unVar5;
        un unVar6 = new un("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f = unVar6;
        un unVar7 = new un("DETECT_SET_USER_VISIBLE_HINT", 6);
        g = unVar7;
        un unVar8 = new un("DETECT_TARGET_FRAGMENT_USAGE", 7);
        h = unVar8;
        un unVar9 = new un("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        i = unVar9;
        un[] unVarArr = {unVar, unVar2, unVar3, unVar4, unVar5, unVar6, unVar7, unVar8, unVar9};
        j = unVarArr;
        dnx.aD(unVarArr);
    }

    private un(String str, int i2) {
        super(str, i2);
    }

    public static un[] values() {
        return (un[]) j.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class auw {
    public static final auw a;
    public static final auw b;
    public static final auw c;
    private static final /* synthetic */ auw[] d;

    static {
        auw auwVar = new auw("Hidden", 0);
        a = auwVar;
        auw auwVar2 = new auw("Expanded", 1);
        b = auwVar2;
        auw auwVar3 = new auw("PartiallyExpanded", 2);
        c = auwVar3;
        auw[] auwVarArr = {auwVar, auwVar2, auwVar3};
        d = auwVarArr;
        wcq.P(auwVarArr);
    }

    private auw(String str, int i) {
    }

    public static auw[] values() {
        return (auw[]) d.clone();
    }
}

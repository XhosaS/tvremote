package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class oe {
    public static final oe a;
    public static final oe b;
    public static final oe c;
    private static final /* synthetic */ oe[] d;

    static {
        oe oeVar = new oe("Default", 0);
        a = oeVar;
        oe oeVar2 = new oe("UserInput", 1);
        b = oeVar2;
        oe oeVar3 = new oe("PreventUserInput", 2);
        c = oeVar3;
        oe[] oeVarArr = {oeVar, oeVar2, oeVar3};
        d = oeVarArr;
        wcq.P(oeVarArr);
    }

    private oe(String str, int i) {
    }

    public static oe[] values() {
        return (oe[]) d.clone();
    }
}

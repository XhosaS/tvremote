package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yio {
    public static final yio a;
    public static final yio b;
    public static final yio c;
    private static final /* synthetic */ yio[] d;

    static {
        yio yioVar = new yio("COROUTINE_SUSPENDED", 0);
        a = yioVar;
        yio yioVar2 = new yio("UNDECIDED", 1);
        b = yioVar2;
        yio yioVar3 = new yio("RESUMED", 2);
        c = yioVar3;
        yio[] yioVarArr = {yioVar, yioVar2, yioVar3};
        d = yioVarArr;
        wcq.P(yioVarArr);
    }

    private yio(String str, int i) {
    }

    public static yio[] values() {
        return (yio[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class atv {
    public static final atv a;
    public static final atv b;
    public static final atv c;
    public static final atv d;
    public static final atv e;
    private static final /* synthetic */ atv[] f;

    static {
        atv atvVar = new atv("TopBar", 0);
        a = atvVar;
        atv atvVar2 = new atv("MainContent", 1);
        b = atvVar2;
        atv atvVar3 = new atv("Snackbar", 2);
        c = atvVar3;
        atv atvVar4 = new atv("Fab", 3);
        d = atvVar4;
        atv atvVar5 = new atv("BottomBar", 4);
        e = atvVar5;
        atv[] atvVarArr = {atvVar, atvVar2, atvVar3, atvVar4, atvVar5};
        f = atvVarArr;
        wcq.P(atvVarArr);
    }

    private atv(String str, int i) {
    }

    public static atv[] values() {
        return (atv[]) f.clone();
    }
}

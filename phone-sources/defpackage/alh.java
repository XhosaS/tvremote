package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alh {
    public static final alh a;
    public static final alh b;
    public static final alh c;
    private static final /* synthetic */ alh[] d;

    static {
        alh alhVar = new alh("None", 0);
        a = alhVar;
        alh alhVar2 = new alh("Cursor", 1);
        b = alhVar2;
        alh alhVar3 = new alh("Selection", 2);
        c = alhVar3;
        alh[] alhVarArr = {alhVar, alhVar2, alhVar3};
        d = alhVarArr;
        wcq.P(alhVarArr);
    }

    private alh(String str, int i) {
    }

    public static alh[] values() {
        return (alh[]) d.clone();
    }
}

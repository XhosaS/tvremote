package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class auz {
    public static final auz a;
    public static final auz b;
    private static final /* synthetic */ auz[] c;

    static {
        auz auzVar = new auz("THUMB", 0);
        a = auzVar;
        auz auzVar2 = new auz("TRACK", 1);
        b = auzVar2;
        auz[] auzVarArr = {auzVar, auzVar2};
        c = auzVarArr;
        wcq.P(auzVarArr);
    }

    private auz(String str, int i) {
    }

    public static auz[] values() {
        return (auz[]) c.clone();
    }
}

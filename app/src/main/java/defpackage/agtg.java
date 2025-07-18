package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agtg {
    public static final agtg a;
    public static final agtg b;
    public static final agtg c;
    private static final /* synthetic */ agtg[] d;

    static {
        agtg agtgVar = new agtg("COROUTINE_SUSPENDED", 0);
        a = agtgVar;
        agtg agtgVar2 = new agtg("UNDECIDED", 1);
        b = agtgVar2;
        agtg agtgVar3 = new agtg("RESUMED", 2);
        c = agtgVar3;
        agtg[] agtgVarArr = {agtgVar, agtgVar2, agtgVar3};
        d = agtgVarArr;
        agtw.a(agtgVarArr);
    }

    private agtg(String str, int i) {
    }

    public static agtg[] values() {
        return (agtg[]) d.clone();
    }
}

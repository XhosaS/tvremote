package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnf {
    public static final bnf a;
    public static final bnf b;
    public static final bnf c;
    private static final /* synthetic */ bnf[] d;

    static {
        bnf bnfVar = new bnf("DEFERRED", 0);
        a = bnfVar;
        bnf bnfVar2 = new bnf("IMMEDIATE", 1);
        b = bnfVar2;
        bnf bnfVar3 = new bnf("EXCLUSIVE", 2);
        c = bnfVar3;
        bnf[] bnfVarArr = {bnfVar, bnfVar2, bnfVar3};
        d = bnfVarArr;
        agtw.a(bnfVarArr);
    }

    private bnf(String str, int i) {
    }

    public static bnf[] values() {
        return (bnf[]) d.clone();
    }
}

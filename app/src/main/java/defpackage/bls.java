package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bls {
    public static final bls a;
    public static final bls b;
    public static final bls c;
    private static final /* synthetic */ bls[] d;

    static {
        bls blsVar = new bls("NO_OP", 0);
        a = blsVar;
        bls blsVar2 = new bls("ADD", 1);
        b = blsVar2;
        bls blsVar3 = new bls("REMOVE", 2);
        c = blsVar3;
        bls[] blsVarArr = {blsVar, blsVar2, blsVar3};
        d = blsVarArr;
        agtw.a(blsVarArr);
    }

    private bls(String str, int i) {
    }

    public static bls[] values() {
        return (bls[]) d.clone();
    }
}

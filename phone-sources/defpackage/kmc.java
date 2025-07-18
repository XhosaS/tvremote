package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmc {
    public static final kmc a;
    public static final kmc b;
    public static final kmc c;
    private static final /* synthetic */ kmc[] e;
    public final int d;

    static {
        kmc kmcVar = new kmc("BUY", 0, 1);
        a = kmcVar;
        kmc kmcVar2 = new kmc("RENT", 1, 2);
        b = kmcVar2;
        kmc kmcVar3 = new kmc("UNSPECIFIED", 2, 0);
        c = kmcVar3;
        kmc[] kmcVarArr = {kmcVar, kmcVar2, kmcVar3};
        e = kmcVarArr;
        wcq.P(kmcVarArr);
    }

    private kmc(String str, int i, int i2) {
        this.d = i2;
    }

    public static kmc[] values() {
        return (kmc[]) e.clone();
    }
}

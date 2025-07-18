package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrt {
    public static final qrt a;
    public static final qrt b;
    public static final qrt c;
    private static final /* synthetic */ qrt[] d;

    static {
        qrt qrtVar = new qrt("CLEARTEXT", 0);
        a = qrtVar;
        qrt qrtVar2 = new qrt("ENCRYPTED", 1);
        b = qrtVar2;
        qrt qrtVar3 = new qrt("PLACEHOLDER", 2);
        c = qrtVar3;
        qrt[] qrtVarArr = {qrtVar, qrtVar2, qrtVar3};
        d = qrtVarArr;
        wcq.P(qrtVarArr);
    }

    private qrt(String str, int i) {
    }

    public static qrt[] values() {
        return (qrt[]) d.clone();
    }
}

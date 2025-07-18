package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qfz {
    public static final qfz a;
    public static final qfz b;
    public static final qfz c;
    private static final /* synthetic */ qfz[] d;

    static {
        qfz qfzVar = new qfz("CLEARTEXT", 0);
        a = qfzVar;
        qfz qfzVar2 = new qfz("ENCRYPTED", 1);
        b = qfzVar2;
        qfz qfzVar3 = new qfz("PLACEHOLDER", 2);
        c = qfzVar3;
        qfz[] qfzVarArr = {qfzVar, qfzVar2, qfzVar3};
        d = qfzVarArr;
        wcq.P(qfzVarArr);
    }

    private qfz(String str, int i) {
    }

    public static qfz[] values() {
        return (qfz[]) d.clone();
    }
}

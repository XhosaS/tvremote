package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qoq {
    public static final qoq a;
    public static final qoq b;
    public static final qoq c;
    public static final qoq d;
    public static final qoq e;
    public static final qoq f;
    private static final /* synthetic */ qoq[] g;

    static {
        qoq qoqVar = new qoq("DEFAULT", 0);
        a = qoqVar;
        qoq qoqVar2 = new qoq("TV", 1);
        b = qoqVar2;
        qoq qoqVar3 = new qoq("WEARABLE", 2);
        c = qoqVar3;
        qoq qoqVar4 = new qoq("AUTOMOTIVE", 3);
        d = qoqVar4;
        qoq qoqVar5 = new qoq("BATTLESTAR", 4);
        e = qoqVar5;
        qoq qoqVar6 = new qoq("CHROME_OS", 5);
        f = qoqVar6;
        qoq[] qoqVarArr = {qoqVar, qoqVar2, qoqVar3, qoqVar4, qoqVar5, qoqVar6};
        g = qoqVarArr;
        wcq.P(qoqVarArr);
    }

    private qoq(String str, int i) {
    }

    public static qoq[] values() {
        return (qoq[]) g.clone();
    }
}

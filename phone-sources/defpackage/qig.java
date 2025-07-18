package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qig {
    public static final qig a;
    public static final qig b;
    public static final qig c;
    public static final qig d;
    public static final qig e;
    public static final qig f;
    private static final /* synthetic */ qig[] g;

    static {
        qig qigVar = new qig("PRODUCTION", 0);
        a = qigVar;
        qig qigVar2 = new qig("AUTOPUSH", 1);
        b = qigVar2;
        qig qigVar3 = new qig("AUTOPUSH_QUAL_PLAYGROUND", 2);
        c = qigVar3;
        qig qigVar4 = new qig("STAGING", 3);
        d = qigVar4;
        qig qigVar5 = new qig("STAGING_QUAL_QA", 4);
        e = qigVar5;
        qig qigVar6 = new qig("DEV", 5);
        f = qigVar6;
        qig[] qigVarArr = {qigVar, qigVar2, qigVar3, qigVar4, qigVar5, qigVar6};
        g = qigVarArr;
        wcq.P(qigVarArr);
    }

    private qig(String str, int i) {
    }

    public static qig[] values() {
        return (qig[]) g.clone();
    }
}

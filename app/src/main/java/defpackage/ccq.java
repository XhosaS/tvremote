package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccq {
    public static final ccq a;
    public static final ccq b;
    public static final ccq c;
    public static final ccq d;
    public static final ccq e;
    public static final ccq f;
    private static final /* synthetic */ ccq[] g;

    static {
        ccq ccqVar = new ccq("ENQUEUED", 0);
        a = ccqVar;
        ccq ccqVar2 = new ccq("RUNNING", 1);
        b = ccqVar2;
        ccq ccqVar3 = new ccq("SUCCEEDED", 2);
        c = ccqVar3;
        ccq ccqVar4 = new ccq("FAILED", 3);
        d = ccqVar4;
        ccq ccqVar5 = new ccq("BLOCKED", 4);
        e = ccqVar5;
        ccq ccqVar6 = new ccq("CANCELLED", 5);
        f = ccqVar6;
        ccq[] ccqVarArr = {ccqVar, ccqVar2, ccqVar3, ccqVar4, ccqVar5, ccqVar6};
        g = ccqVarArr;
        agtw.a(ccqVarArr);
    }

    private ccq(String str, int i) {
    }

    public static ccq[] values() {
        return (ccq[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}

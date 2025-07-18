package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrx {
    public static final qrx a;
    public static final qrx b;
    public static final qrx c;
    public static final qrx d;
    public static final qrx e;
    public static final qrx f;
    public static final qrx g;
    public static final qrx h;
    public static final qrx i;
    public static final qrx j;
    public static final qrx k;
    public static final qrx l;
    public static final qrx m;
    private static final /* synthetic */ qrx[] n;

    static {
        qrx qrxVar = new qrx("UNKNOWN", 0);
        a = qrxVar;
        qrx qrxVar2 = new qrx("INVALID_PAYLOAD", 1);
        b = qrxVar2;
        qrx qrxVar3 = new qrx("SILENT_NOTIFICATION", 2);
        c = qrxVar3;
        qrx qrxVar4 = new qrx("HANDLED_BY_APP", 3);
        d = qrxVar4;
        qrx qrxVar5 = new qrx("USER_SUPPRESSED", 4);
        e = qrxVar5;
        qrx qrxVar6 = new qrx("INVALID_TARGET_STATE", 5);
        f = qrxVar6;
        qrx qrxVar7 = new qrx("WORK_PROFILE", 6);
        g = qrxVar7;
        qrx qrxVar8 = new qrx("UNICORN_OR_GRIFFIN_ACCOUNT", 7);
        h = qrxVar8;
        qrx qrxVar9 = new qrx("CLIENT_COUNTERFACTUAL", 8);
        i = qrxVar9;
        qrx qrxVar10 = new qrx("SEARCH_DISCOVER_DISABLED", 9);
        j = qrxVar10;
        qrx qrxVar11 = new qrx("SEARCH_OUTSIDE_CONTEXT_FENCE", 10);
        k = qrxVar11;
        qrx qrxVar12 = new qrx("SEARCH_ACCOUNT_MISSING_OR_MISMATCH", 11);
        l = qrxVar12;
        qrx qrxVar13 = new qrx("OUT_OF_ORDER_UPDATE", 12);
        m = qrxVar13;
        qrx[] qrxVarArr = {qrxVar, qrxVar2, qrxVar3, qrxVar4, qrxVar5, qrxVar6, qrxVar7, qrxVar8, qrxVar9, qrxVar10, qrxVar11, qrxVar12, qrxVar13};
        n = qrxVarArr;
        wcq.P(qrxVarArr);
    }

    private qrx(String str, int i2) {
    }

    public static qrx[] values() {
        return (qrx[]) n.clone();
    }
}

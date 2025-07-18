package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otw {
    public static final otw a;
    public static final otw b;
    public static final otw c;
    public static final otw d;
    public static final otw e;
    public static final otw f;
    private static final /* synthetic */ otw[] g;

    static {
        otw otwVar = new otw("STATUS_USABLE", 0);
        a = otwVar;
        otw otwVar2 = new otw("STATUS_EXPIRED", 1);
        b = otwVar2;
        otw otwVar3 = new otw("STATUS_OUTPUT_NOT_ALLOWED", 2);
        c = otwVar3;
        otw otwVar4 = new otw("STATUS_PENDING", 3);
        d = otwVar4;
        otw otwVar5 = new otw("STATUS_INTERNAL_ERROR", 4);
        e = otwVar5;
        otw otwVar6 = new otw("STATUS_USABLE_IN_FUTURE", 5);
        f = otwVar6;
        otw[] otwVarArr = {otwVar, otwVar2, otwVar3, otwVar4, otwVar5, otwVar6};
        g = otwVarArr;
        wcq.P(otwVarArr);
    }

    private otw(String str, int i) {
    }

    public static otw[] values() {
        return (otw[]) g.clone();
    }
}

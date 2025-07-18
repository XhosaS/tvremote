package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ovz {
    public static final ovz a;
    public static final ovz b;
    public static final ovz c;
    public static final ovz d;
    public static final ovz e;
    private static final /* synthetic */ ovz[] g;
    public final String f;

    static {
        ovz ovzVar = new ovz("UNKNOWN", 0, "ukn");
        a = ovzVar;
        ovz ovzVar2 = new ovz("GTVM", 1, "gtvm");
        b = ovzVar2;
        ovz ovzVar3 = new ovz("LAUNCHERX", 2, "lx");
        c = ovzVar3;
        ovz ovzVar4 = new ovz("WATSON", 3, "wtn");
        d = ovzVar4;
        ovz ovzVar5 = new ovz("DEMO_APP", 4, "demo");
        e = ovzVar5;
        ovz[] ovzVarArr = {ovzVar, ovzVar2, ovzVar3, ovzVar4, ovzVar5};
        g = ovzVarArr;
        wcq.P(ovzVarArr);
    }

    private ovz(String str, int i, String str2) {
        this.f = str2;
    }

    public static ovz[] values() {
        return (ovz[]) g.clone();
    }
}

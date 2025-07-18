package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcu {
    public static final bcu a;
    public static final bcu b;
    public static final bcu c;
    public static final bcu d;
    public static final bcu e;
    public static final bcu f;
    private static final /* synthetic */ bcu[] g;

    static {
        bcu bcuVar = new bcu("ShutDown", 0);
        a = bcuVar;
        bcu bcuVar2 = new bcu("ShuttingDown", 1);
        b = bcuVar2;
        bcu bcuVar3 = new bcu("Inactive", 2);
        c = bcuVar3;
        bcu bcuVar4 = new bcu("InactivePendingWork", 3);
        d = bcuVar4;
        bcu bcuVar5 = new bcu("Idle", 4);
        e = bcuVar5;
        bcu bcuVar6 = new bcu("PendingWork", 5);
        f = bcuVar6;
        bcu[] bcuVarArr = {bcuVar, bcuVar2, bcuVar3, bcuVar4, bcuVar5, bcuVar6};
        g = bcuVarArr;
        wcq.P(bcuVarArr);
    }

    private bcu(String str, int i) {
    }

    public static bcu[] values() {
        return (bcu[]) g.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class irf {
    public static final irf a;
    public static final irf b;
    private static final /* synthetic */ irf[] c;

    static {
        irf irfVar = new irf("DEFAULT", 0);
        a = irfVar;
        irf irfVar2 = new irf("START_FROM_DSC", 1);
        b = irfVar2;
        irf[] irfVarArr = {irfVar, irfVar2};
        c = irfVarArr;
        agtw.a(irfVarArr);
    }

    private irf(String str, int i) {
    }

    public static irf[] values() {
        return (irf[]) c.clone();
    }
}

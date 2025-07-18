package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qga {
    public static final qga a;
    public static final qga b;
    public static final qga c;
    private static final /* synthetic */ qga[] d;

    static {
        qga qgaVar = new qga("INVALID", 0);
        a = qgaVar;
        qga qgaVar2 = new qga("SYSTEM_TRAY", 1);
        b = qgaVar2;
        qga qgaVar3 = new qga("IN_APP", 2);
        c = qgaVar3;
        qga[] qgaVarArr = {qgaVar, qgaVar2, qgaVar3};
        d = qgaVarArr;
        wcq.P(qgaVarArr);
    }

    private qga(String str, int i) {
    }

    public static qga[] values() {
        return (qga[]) d.clone();
    }
}

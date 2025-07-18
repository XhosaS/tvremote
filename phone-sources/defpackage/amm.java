package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amm {
    public static final amm a;
    public static final amm b;
    private static final /* synthetic */ amm[] c;

    static {
        amm ammVar = new amm("EditableText", 0);
        a = ammVar;
        amm ammVar2 = new amm("StaticText", 1);
        b = ammVar2;
        amm[] ammVarArr = {ammVar, ammVar2};
        c = ammVarArr;
        wcq.P(ammVarArr);
    }

    private amm(String str, int i) {
    }

    public static amm[] values() {
        return (amm[]) c.clone();
    }
}

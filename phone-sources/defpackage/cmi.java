package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmi {
    public static final cmi a;
    public static final cmi b;
    private static final /* synthetic */ cmi[] c;

    static {
        cmi cmiVar = new cmi("Ltr", 0);
        a = cmiVar;
        cmi cmiVar2 = new cmi("Rtl", 1);
        b = cmiVar2;
        cmi[] cmiVarArr = {cmiVar, cmiVar2};
        c = cmiVarArr;
        wcq.P(cmiVarArr);
    }

    private cmi(String str, int i) {
    }

    public static cmi[] values() {
        return (cmi[]) c.clone();
    }
}

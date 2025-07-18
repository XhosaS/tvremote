package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stp {
    public static final stp a;
    public static final stp b;
    private static final /* synthetic */ stp[] c;

    static {
        stp stpVar = new stp("PLATFORM", 0);
        a = stpVar;
        stp stpVar2 = new stp("SELF", 1);
        b = stpVar2;
        stp[] stpVarArr = {stpVar, stpVar2};
        c = stpVarArr;
        agtw.a(stpVarArr);
    }

    private stp(String str, int i) {
    }

    public static stp[] values() {
        return (stp[]) c.clone();
    }
}

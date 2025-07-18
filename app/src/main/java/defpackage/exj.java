package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class exj {
    public static final exj a;
    public static final exj b;
    public static final exj c;
    private static final /* synthetic */ exj[] d;

    static {
        exj exjVar = new exj("FINISH_ACTIVITY_AFTER_TALKING_DONE", 0);
        a = exjVar;
        exj exjVar2 = new exj("FINISH_ACTIVITY_NOW", 1);
        b = exjVar2;
        exj exjVar3 = new exj("NO_SUCCESS_ACTION", 2);
        c = exjVar3;
        exj[] exjVarArr = {exjVar, exjVar2, exjVar3};
        d = exjVarArr;
        agtw.a(exjVarArr);
    }

    private exj(String str, int i) {
    }

    public static exj[] values() {
        return (exj[]) d.clone();
    }
}

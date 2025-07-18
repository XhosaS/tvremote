package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class exk {
    public static final exk a;
    public static final exk b;
    private static final /* synthetic */ exk[] c;

    static {
        exk exkVar = new exk("CLOSE_DREAM", 0);
        a = exkVar;
        exk exkVar2 = new exk("DO_NOT_CHANGE_DREAM_STATE", 1);
        b = exkVar2;
        exk[] exkVarArr = {exkVar, exkVar2};
        c = exkVarArr;
        agtw.a(exkVarArr);
    }

    private exk(String str, int i) {
    }

    public static exk[] values() {
        return (exk[]) c.clone();
    }
}

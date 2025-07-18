package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cah {
    public static final cah a;
    public static final cah b;
    private static final /* synthetic */ cah[] c;

    static {
        cah cahVar = new cah("EXPONENTIAL", 0);
        a = cahVar;
        cah cahVar2 = new cah("LINEAR", 1);
        b = cahVar2;
        cah[] cahVarArr = {cahVar, cahVar2};
        c = cahVarArr;
        agtw.a(cahVarArr);
    }

    private cah(String str, int i) {
    }

    public static cah[] values() {
        return (cah[]) c.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class owl {
    public static final owl a;
    public static final owl b;
    public static final owl c;
    private static final /* synthetic */ owl[] e;
    public final String d;

    static {
        owl owlVar = new owl("UNKNOWN", 0, "ukn");
        a = owlVar;
        owl owlVar2 = new owl("TVOD", 1, "tvod");
        b = owlVar2;
        owl owlVar3 = new owl("TRAILER", 2, "tlr");
        c = owlVar3;
        owl[] owlVarArr = {owlVar, owlVar2, owlVar3};
        e = owlVarArr;
        wcq.P(owlVarArr);
    }

    private owl(String str, int i, String str2) {
        this.d = str2;
    }

    public static owl[] values() {
        return (owl[]) e.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqb implements vqa {
    public static final vqb a;
    public static final vqb b;
    private static final /* synthetic */ vqb[] c;

    static {
        vqb vqbVar = new vqb("TWO_ARG_STRING_ID_STORAGE_PERCENTAGE_USED", 0);
        a = vqbVar;
        vqb vqbVar2 = new vqb("TWO_ARG_STRING_ID_STORAGE_CAPACITY_USED", 1);
        b = vqbVar2;
        vqb[] vqbVarArr = {vqbVar, vqbVar2};
        c = vqbVarArr;
        wcq.P(vqbVarArr);
    }

    private vqb(String str, int i) {
    }

    public static vqb[] values() {
        return (vqb[]) c.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class caj {
    public static final caj a;
    public static final caj b;
    public static final caj c;
    private static final /* synthetic */ caj[] d;

    static {
        caj cajVar = new caj("ContinueTraversal", 0);
        a = cajVar;
        caj cajVar2 = new caj("SkipSubtreeAndContinueTraversal", 1);
        b = cajVar2;
        caj cajVar3 = new caj("CancelTraversal", 2);
        c = cajVar3;
        caj[] cajVarArr = {cajVar, cajVar2, cajVar3};
        d = cajVarArr;
        wcq.P(cajVarArr);
    }

    private caj(String str, int i) {
    }

    public static caj[] values() {
        return (caj[]) d.clone();
    }
}

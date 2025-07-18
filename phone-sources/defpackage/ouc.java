package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ouc {
    public static final ouc a;
    public static final ouc b;
    public static final ouc c;
    public static final ouc d;
    public static final ouc e;
    public static final ouc f;
    private static final /* synthetic */ ouc[] h;
    public final String g;

    static {
        ouc oucVar = new ouc("PROD", 0, "playmoviesdfe-pa.googleapis.com");
        a = oucVar;
        ouc oucVar2 = new ouc("AUTO_PUSH", 1, "autopush-playmoviesdfe-pa.sandbox.googleapis.com");
        b = oucVar2;
        ouc oucVar3 = new ouc("STAGING", 2, "staging-playmoviesdfe-pa.sandbox.googleapis.com");
        c = oucVar3;
        ouc oucVar4 = new ouc("QA", 3, "qa-playmoviesdfe-pa.sandbox.googleapis.com");
        d = oucVar4;
        ouc oucVar5 = new ouc("DOG_FOOD", 4, "dogfood-playmoviesdfe-pa.sandbox.googleapis.com");
        e = oucVar5;
        ouc oucVar6 = new ouc("FISH_FOOD", 5, "dev-playmoviesdfe-pa.sandbox.googleapis.com");
        f = oucVar6;
        ouc[] oucVarArr = {oucVar, oucVar2, oucVar3, oucVar4, oucVar5, oucVar6};
        h = oucVarArr;
        wcq.P(oucVarArr);
    }

    private ouc(String str, int i, String str2) {
        this.g = str2;
    }

    public static ouc[] values() {
        return (ouc[]) h.clone();
    }
}

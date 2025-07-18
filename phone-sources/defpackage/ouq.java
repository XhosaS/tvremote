package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ouq {
    public static final ouq a;
    public static final ouq b;
    public static final ouq c;
    public static final ouq d;
    public static final ouq e;
    public static final ouq f;
    public static final ouq g;
    private static final /* synthetic */ ouq[] h;

    static {
        ouq ouqVar = new ouq("TYPE_UNSPECIFIED", 0);
        a = ouqVar;
        ouq ouqVar2 = new ouq("MOVIE", 1);
        b = ouqVar2;
        ouq ouqVar3 = new ouq("SHOW", 2);
        c = ouqVar3;
        ouq ouqVar4 = new ouq("SEASON", 3);
        d = ouqVar4;
        ouq ouqVar5 = new ouq("EPISODE", 4);
        e = ouqVar5;
        ouq ouqVar6 = new ouq("TRAILER", 5);
        f = ouqVar6;
        ouq ouqVar7 = new ouq("UNRECOGNIZED", 6);
        g = ouqVar7;
        ouq[] ouqVarArr = {ouqVar, ouqVar2, ouqVar3, ouqVar4, ouqVar5, ouqVar6, ouqVar7};
        h = ouqVarArr;
        wcq.P(ouqVarArr);
    }

    private ouq(String str, int i) {
    }

    public static ouq[] values() {
        return (ouq[]) h.clone();
    }
}

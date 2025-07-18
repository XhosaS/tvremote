package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class geq {
    public static final geq a;
    public static final geq b;
    public static final geq c;
    private static final /* synthetic */ geq[] d;

    static {
        geq geqVar = new geq("NO_OP", 0);
        a = geqVar;
        geq geqVar2 = new geq("ADD", 1);
        b = geqVar2;
        geq geqVar3 = new geq("REMOVE", 2);
        c = geqVar3;
        geq[] geqVarArr = {geqVar, geqVar2, geqVar3};
        d = geqVarArr;
        wcq.P(geqVarArr);
    }

    private geq(String str, int i) {
    }

    public static geq[] values() {
        return (geq[]) d.clone();
    }
}

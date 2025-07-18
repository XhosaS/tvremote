package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfk {
    public static final gfk a;
    public static final gfk b;
    public static final gfk c;
    private static final /* synthetic */ gfk[] d;

    static {
        gfk gfkVar = new gfk("DEFERRED", 0);
        a = gfkVar;
        gfk gfkVar2 = new gfk("IMMEDIATE", 1);
        b = gfkVar2;
        gfk gfkVar3 = new gfk("EXCLUSIVE", 2);
        c = gfkVar3;
        gfk[] gfkVarArr = {gfkVar, gfkVar2, gfkVar3};
        d = gfkVarArr;
        wcq.P(gfkVarArr);
    }

    private gfk(String str, int i) {
    }

    public static gfk[] values() {
        return (gfk[]) d.clone();
    }
}

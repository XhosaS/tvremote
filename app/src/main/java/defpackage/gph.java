package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gph {
    public static final gph a;
    public static final gph b;
    public static final gph c;
    private static final /* synthetic */ gph[] e;
    public final ybv d;

    static {
        gph gphVar = new gph("AMATI", 0, ybv.AMATI_EXPERIENCE_TYPE);
        a = gphVar;
        gph gphVar2 = new gph("WATSON", 1, ybv.WATSON_EXPERIENCE_TYPE);
        b = gphVar2;
        gph gphVar3 = new gph("WATSON23", 2, ybv.WATSON_EXPERIENCE_TYPE);
        c = gphVar3;
        gph[] gphVarArr = {gphVar, gphVar2, gphVar3};
        e = gphVarArr;
        agtw.a(gphVarArr);
    }

    private gph(String str, int i, ybv ybvVar) {
        this.d = ybvVar;
    }

    public static gph[] values() {
        return (gph[]) e.clone();
    }
}

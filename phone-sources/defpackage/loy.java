package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class loy {
    public static final loy a;
    public static final loy b;
    public static final loy c;
    private static final /* synthetic */ loy[] d;

    static {
        loy loyVar = new loy("DISK", 0);
        a = loyVar;
        loy loyVar2 = new loy("MEMORY", 1);
        b = loyVar2;
        loy loyVar3 = new loy("NO_CACHE", 2);
        c = loyVar3;
        loy[] loyVarArr = {loyVar, loyVar2, loyVar3};
        d = loyVarArr;
        wcq.P(loyVarArr);
    }

    private loy(String str, int i) {
    }

    public static loy[] values() {
        return (loy[]) d.clone();
    }
}

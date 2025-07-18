package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class lx {
    public static final lx a;
    public static final lx b;
    public static final lx c;
    private static final /* synthetic */ lx[] d;

    static {
        lx lxVar = new lx("PreEnter", 0);
        a = lxVar;
        lx lxVar2 = new lx("Visible", 1);
        b = lxVar2;
        lx lxVar3 = new lx("PostExit", 2);
        c = lxVar3;
        lx[] lxVarArr = {lxVar, lxVar2, lxVar3};
        d = lxVarArr;
        wcq.P(lxVarArr);
    }

    private lx(String str, int i) {
    }

    public static lx[] values() {
        return (lx[]) d.clone();
    }
}

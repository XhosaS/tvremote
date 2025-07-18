package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvw {
    public static final gvw a;
    public static final gvw b;
    public static final gvw c;
    public static final gvw d;
    public static final gvw e;
    public static final gvw f;
    private static final /* synthetic */ gvw[] g;

    static {
        gvw gvwVar = new gvw("SUCCESS", 0);
        a = gvwVar;
        gvw gvwVar2 = new gvw("USER_RECOVERABLE_ERROR", 1);
        b = gvwVar2;
        gvw gvwVar3 = new gvw("GOOGLE_AUTH_EXCEPTION", 2);
        c = gvwVar3;
        gvw gvwVar4 = new gvw("IO_EXCEPTION", 3);
        d = gvwVar4;
        gvw gvwVar5 = new gvw("TIMEOUT", 4);
        e = gvwVar5;
        gvw gvwVar6 = new gvw("INTERRUPTED", 5);
        f = gvwVar6;
        gvw[] gvwVarArr = {gvwVar, gvwVar2, gvwVar3, gvwVar4, gvwVar5, gvwVar6};
        g = gvwVarArr;
        agtw.a(gvwVarArr);
    }

    private gvw(String str, int i) {
    }

    public static gvw[] values() {
        return (gvw[]) g.clone();
    }
}

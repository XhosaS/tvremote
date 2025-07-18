package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzn {
    public static final gzn a;
    public static final gzn b;
    public static final gzn c;
    public static final gzn d;
    private static final /* synthetic */ gzn[] g;
    public final boolean e;
    public final boolean f;

    static {
        gzn gznVar = new gzn("ENABLED", 0, true, true);
        a = gznVar;
        gzn gznVar2 = new gzn("READ_ONLY", 1, true, false);
        b = gznVar2;
        gzn gznVar3 = new gzn("WRITE_ONLY", 2, false, true);
        c = gznVar3;
        gzn gznVar4 = new gzn("DISABLED", 3, false, false);
        d = gznVar4;
        gzn[] gznVarArr = {gznVar, gznVar2, gznVar3, gznVar4};
        g = gznVarArr;
        wcq.P(gznVarArr);
    }

    private gzn(String str, int i, boolean z, boolean z2) {
        this.e = z;
        this.f = z2;
    }

    public static gzn[] values() {
        return (gzn[]) g.clone();
    }
}

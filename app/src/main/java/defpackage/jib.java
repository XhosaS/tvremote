package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jib {
    public static final jib a;
    public static final jib b;
    public static final jib c;
    public static final jib d;
    public static final jib e;
    public static final jib f;
    private static final /* synthetic */ jib[] g;

    static {
        jib jibVar = new jib("INITIALIZE", 0);
        a = jibVar;
        jib jibVar2 = new jib("DESTROY", 1);
        b = jibVar2;
        jib jibVar3 = new jib("INIT_FINISHED", 2);
        c = jibVar3;
        jib jibVar4 = new jib("CAST_ID_RETRIEVED", 3);
        d = jibVar4;
        jib jibVar5 = new jib("CAST_ID_RETRIEVAL_FAILED", 4);
        e = jibVar5;
        jib jibVar6 = new jib("TOKEN_REFRESHED", 5);
        f = jibVar6;
        jib[] jibVarArr = {jibVar, jibVar2, jibVar3, jibVar4, jibVar5, jibVar6};
        g = jibVarArr;
        agtw.a(jibVarArr);
    }

    private jib(String str, int i) {
    }

    public static jib[] values() {
        return (jib[]) g.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbm {
    public static final jbm a;
    public static final jbm b;
    public static final jbm c;
    public static final jbm d;
    private static final /* synthetic */ jbm[] e;

    static {
        jbm jbmVar = new jbm("WIFI", 0);
        a = jbmVar;
        jbm jbmVar2 = new jbm("CELLULAR", 1);
        b = jbmVar2;
        jbm jbmVar3 = new jbm("DISCONNECTED", 2);
        c = jbmVar3;
        jbm jbmVar4 = new jbm("UNKNOWN", 3);
        d = jbmVar4;
        jbm[] jbmVarArr = {jbmVar, jbmVar2, jbmVar3, jbmVar4};
        e = jbmVarArr;
        wcq.P(jbmVarArr);
    }

    private jbm(String str, int i) {
    }

    public static jbm[] values() {
        return (jbm[]) e.clone();
    }
}

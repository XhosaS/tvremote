package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbq {
    public static final gbq a;
    public static final gbq b;
    private static final /* synthetic */ gbq[] c;

    static {
        gbq gbqVar = new gbq("LAUNCH_INITIAL_REFRESH", 0);
        a = gbqVar;
        gbq gbqVar2 = new gbq("SKIP_INITIAL_REFRESH", 1);
        b = gbqVar2;
        gbq[] gbqVarArr = {gbqVar, gbqVar2};
        c = gbqVarArr;
        wcq.P(gbqVarArr);
    }

    private gbq(String str, int i) {
    }

    public static gbq[] values() {
        return (gbq[]) c.clone();
    }
}

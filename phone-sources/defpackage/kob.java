package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kob {
    public static final kob a;
    public static final kob b;
    public static final kob c;
    private static final /* synthetic */ kob[] e;
    public final yjz d;

    static {
        kob kobVar = new kob("NEXT_CLICK", 0, koa.b);
        a = kobVar;
        kob kobVar2 = new kob("PREVIOUS_CLICK", 1, koa.c);
        b = kobVar2;
        kob kobVar3 = new kob("DEFAULT", 2, koa.d);
        c = kobVar3;
        kob[] kobVarArr = {kobVar, kobVar2, kobVar3};
        e = kobVarArr;
        wcq.P(kobVarArr);
    }

    private kob(String str, int i, yjz yjzVar) {
        this.d = yjzVar;
    }

    public static kob[] values() {
        return (kob[]) e.clone();
    }
}

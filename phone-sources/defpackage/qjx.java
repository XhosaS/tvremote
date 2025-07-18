package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qjx {
    public static final qjx a;
    public static final qjx b;
    public static final qjx c;
    public static final qjx d;
    public static final qjx e;
    private static final /* synthetic */ qjx[] g;
    public final int f;

    static {
        qjx qjxVar = new qjx("UNKNOWN", 0, 0);
        a = qjxVar;
        qjx qjxVar2 = new qjx("SIGNED_IN", 1, 1);
        b = qjxVar2;
        qjx qjxVar3 = new qjx("SIGNED_OUT_ZWIEBACK", 2, 2);
        c = qjxVar3;
        qjx qjxVar4 = new qjx("SIGNED_OUT_YOUTUBE_VISITOR", 3, 3);
        d = qjxVar4;
        qjx qjxVar5 = new qjx("SIGNED_IN_FITBIT", 4, 4);
        e = qjxVar5;
        qjx[] qjxVarArr = {qjxVar, qjxVar2, qjxVar3, qjxVar4, qjxVar5};
        g = qjxVarArr;
        wcq.P(qjxVarArr);
    }

    private qjx(String str, int i, int i2) {
        this.f = i2;
    }

    public static qjx[] values() {
        return (qjx[]) g.clone();
    }
}

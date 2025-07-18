package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qel {
    public static final qel a;
    public static final qel b;
    public static final qel c;
    private static final /* synthetic */ qel[] d;

    static {
        qel qelVar = new qel("FCM", 0);
        a = qelVar;
        qel qelVar2 = new qel("FCM_AND_FETCH", 1);
        b = qelVar2;
        qel qelVar3 = new qel("FETCH_ONLY", 2);
        c = qelVar3;
        qel[] qelVarArr = {qelVar, qelVar2, qelVar3};
        d = qelVarArr;
        wcq.P(qelVarArr);
    }

    private qel(String str, int i) {
    }

    public static qel[] values() {
        return (qel[]) d.clone();
    }

    public final boolean a() {
        return this == a || this == b;
    }

    public final boolean b() {
        return this == c || this == b;
    }
}

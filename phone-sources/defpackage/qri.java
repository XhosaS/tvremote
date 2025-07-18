package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qri {
    public static final qri a;
    public static final qri b;
    public static final qri c;
    private static final /* synthetic */ qri[] d;

    static {
        qri qriVar = new qri("PRIORITY_UNKNOWN", 0);
        a = qriVar;
        qri qriVar2 = new qri("PRIORITY_NORMAL", 1);
        b = qriVar2;
        qri qriVar3 = new qri("PRIORITY_HIGH", 2);
        c = qriVar3;
        qri[] qriVarArr = {qriVar, qriVar2, qriVar3};
        d = qriVarArr;
        wcq.P(qriVarArr);
    }

    private qri(String str, int i) {
    }

    public static qri[] values() {
        return (qri[]) d.clone();
    }
}

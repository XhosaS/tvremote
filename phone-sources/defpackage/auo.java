package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class auo {
    public static final auo a;
    public static final auo b;
    private static final /* synthetic */ auo[] c;

    static {
        auo auoVar = new auo("Collapsed", 0);
        a = auoVar;
        auo auoVar2 = new auo("Expanded", 1);
        b = auoVar2;
        auo[] auoVarArr = {auoVar, auoVar2};
        c = auoVarArr;
        wcq.P(auoVarArr);
    }

    private auo(String str, int i) {
    }

    public static auo[] values() {
        return (auo[]) c.clone();
    }
}

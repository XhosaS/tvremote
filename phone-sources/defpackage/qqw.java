package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qqw {
    public static final qqw a;
    public static final qqw b;
    public static final qqw c;
    private static final /* synthetic */ qqw[] d;

    static {
        qqw qqwVar = new qqw("NOT_INTERCEPTED", 0);
        a = qqwVar;
        qqw qqwVar2 = new qqw("POSTPONED", 1);
        b = qqwVar2;
        qqw qqwVar3 = new qqw("DROP", 2);
        c = qqwVar3;
        qqw[] qqwVarArr = {qqwVar, qqwVar2, qqwVar3};
        d = qqwVarArr;
        wcq.P(qqwVarArr);
    }

    private qqw(String str, int i) {
    }

    public static qqw[] values() {
        return (qqw[]) d.clone();
    }
}

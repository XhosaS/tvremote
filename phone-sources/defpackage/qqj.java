package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qqj {
    public static final qqj a;
    public static final qqj b;
    private static final /* synthetic */ qqj[] d;
    public final int c;

    static {
        qqj qqjVar = new qqj("SYSTEM_TRAY", 0, 1);
        a = qqjVar;
        qqj qqjVar2 = new qqj("IN_APP", 1, 2);
        b = qqjVar2;
        qqj[] qqjVarArr = {qqjVar, qqjVar2};
        d = qqjVarArr;
        wcq.P(qqjVarArr);
    }

    private qqj(String str, int i, int i2) {
        this.c = i2;
    }

    public static qqj[] values() {
        return (qqj[]) d.clone();
    }
}

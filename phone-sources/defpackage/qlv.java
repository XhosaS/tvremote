package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qlv {
    public static final qlv a;
    public static final qlv b;
    public static final /* synthetic */ yja c;
    private static final /* synthetic */ qlv[] e;
    public final int d;

    static {
        qlv qlvVar = new qlv("SYSTEM_TRAY", 0, 1);
        a = qlvVar;
        qlv qlvVar2 = new qlv("INBOX", 1, 2);
        b = qlvVar2;
        qlv[] qlvVarArr = {qlvVar, qlvVar2};
        e = qlvVarArr;
        c = wcq.P(qlvVarArr);
    }

    private qlv(String str, int i, int i2) {
        this.d = i2;
    }

    public static qlv[] values() {
        return (qlv[]) e.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvq {
    public static final pvq a;
    public static final pvq b;
    private static final /* synthetic */ pvq[] c;

    static {
        pvq pvqVar = new pvq("SYSTEM_TRAY", 0);
        a = pvqVar;
        pvq pvqVar2 = new pvq("INBOX", 1);
        b = pvqVar2;
        pvq[] pvqVarArr = {pvqVar, pvqVar2};
        c = pvqVarArr;
        wcq.P(pvqVarArr);
    }

    private pvq(String str, int i) {
    }

    public static pvq[] values() {
        return (pvq[]) c.clone();
    }
}

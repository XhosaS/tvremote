package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yus {
    public static final yus a;
    public static final yus b;
    public static final yus c;
    private static final /* synthetic */ yus[] d;

    static {
        yus yusVar = new yus("START", 0);
        a = yusVar;
        yus yusVar2 = new yus("STOP", 1);
        b = yusVar2;
        yus yusVar3 = new yus("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = yusVar3;
        yus[] yusVarArr = {yusVar, yusVar2, yusVar3};
        d = yusVarArr;
        wcq.P(yusVarArr);
    }

    private yus(String str, int i) {
    }

    public static yus[] values() {
        return (yus[]) d.clone();
    }
}

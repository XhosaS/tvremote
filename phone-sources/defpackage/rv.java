package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class rv {
    public static final rv a;
    public static final rv b;
    public static final rv c;
    private static final /* synthetic */ rv[] d;

    static {
        rv rvVar = new rv("Default", 0);
        a = rvVar;
        rv rvVar2 = new rv("UserInput", 1);
        b = rvVar2;
        rv rvVar3 = new rv("PreventUserInput", 2);
        c = rvVar3;
        rv[] rvVarArr = {rvVar, rvVar2, rvVar3};
        d = rvVarArr;
        wcq.P(rvVarArr);
    }

    private rv(String str, int i) {
    }

    public static rv[] values() {
        return (rv[]) d.clone();
    }
}

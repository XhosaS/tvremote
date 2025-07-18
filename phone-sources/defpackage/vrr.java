package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrr {
    public static final vrr a;
    public static final vrr b;
    public static final /* synthetic */ yja c;
    private static final /* synthetic */ vrr[] d;

    static {
        vrr vrrVar = new vrr("DISMISS", 0);
        a = vrrVar;
        vrr vrrVar2 = new vrr("NO_DISMISS", 1);
        b = vrrVar2;
        vrr[] vrrVarArr = {vrrVar, vrrVar2};
        d = vrrVarArr;
        c = wcq.P(vrrVarArr);
    }

    private vrr(String str, int i) {
    }

    public static vrr[] values() {
        return (vrr[]) d.clone();
    }
}

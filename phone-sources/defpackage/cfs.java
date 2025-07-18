package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfs {
    public static final cfs a;
    public static final cfs b;
    public static final cfs c;
    private static final /* synthetic */ cfs[] d;

    static {
        cfs cfsVar = new cfs("On", 0);
        a = cfsVar;
        cfs cfsVar2 = new cfs("Off", 1);
        b = cfsVar2;
        cfs cfsVar3 = new cfs("Indeterminate", 2);
        c = cfsVar3;
        cfs[] cfsVarArr = {cfsVar, cfsVar2, cfsVar3};
        d = cfsVarArr;
        wcq.P(cfsVarArr);
    }

    private cfs(String str, int i) {
    }

    public static cfs[] values() {
        return (cfs[]) d.clone();
    }
}

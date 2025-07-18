package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amd {
    public static final amd a;
    public static final amd b;
    public static final amd c;
    public static final amd d;
    private static final /* synthetic */ amd[] e;

    static {
        amd amdVar = new amd("Up", 0);
        a = amdVar;
        amd amdVar2 = new amd("Drag", 1);
        b = amdVar2;
        amd amdVar3 = new amd("Timeout", 2);
        c = amdVar3;
        amd amdVar4 = new amd("Cancel", 3);
        d = amdVar4;
        amd[] amdVarArr = {amdVar, amdVar2, amdVar3, amdVar4};
        e = amdVarArr;
        wcq.P(amdVarArr);
    }

    private amd(String str, int i) {
    }

    public static amd[] values() {
        return (amd[]) e.clone();
    }
}

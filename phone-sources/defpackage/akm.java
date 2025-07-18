package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akm {
    public static final akm a;
    public static final akm b;
    public static final akm c;
    private static final /* synthetic */ akm[] d;

    static {
        akm akmVar = new akm("None", 0);
        a = akmVar;
        akm akmVar2 = new akm("Touch", 1);
        b = akmVar2;
        akm akmVar3 = new akm("Mouse", 2);
        c = akmVar3;
        akm[] akmVarArr = {akmVar, akmVar2, akmVar3};
        d = akmVarArr;
        wcq.P(akmVarArr);
    }

    private akm(String str, int i) {
    }

    public static akm[] values() {
        return (akm[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class djm {
    public static final djm a;
    public static final djm b;
    public static final djm c;
    private static final /* synthetic */ djm[] d;

    static {
        djm djmVar = new djm("Visible", 0);
        a = djmVar;
        djm djmVar2 = new djm("Invisible", 1);
        b = djmVar2;
        djm djmVar3 = new djm("Gone", 2);
        c = djmVar3;
        djm[] djmVarArr = {djmVar, djmVar2, djmVar3};
        d = djmVarArr;
        wcq.P(djmVarArr);
    }

    private djm(String str, int i) {
    }

    public static djm[] values() {
        return (djm[]) d.clone();
    }
}

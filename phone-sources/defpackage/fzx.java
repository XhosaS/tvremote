package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzx {
    public static final fzx a;
    public static final fzx b;
    public static final fzx c;
    private static final /* synthetic */ fzx[] d;

    static {
        fzx fzxVar = new fzx("REFRESH", 0);
        a = fzxVar;
        fzx fzxVar2 = new fzx("PREPEND", 1);
        b = fzxVar2;
        fzx fzxVar3 = new fzx("APPEND", 2);
        c = fzxVar3;
        fzx[] fzxVarArr = {fzxVar, fzxVar2, fzxVar3};
        d = fzxVarArr;
        wcq.P(fzxVarArr);
    }

    private fzx(String str, int i) {
    }

    public static fzx[] values() {
        return (fzx[]) d.clone();
    }
}

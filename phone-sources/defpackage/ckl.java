package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckl {
    public static final ckl a;
    public static final ckl b;
    public static final ckl c;
    public static final ckl d;
    private static final /* synthetic */ ckl[] e;

    static {
        ckl cklVar = new ckl("StartInput", 0);
        a = cklVar;
        ckl cklVar2 = new ckl("StopInput", 1);
        b = cklVar2;
        ckl cklVar3 = new ckl("ShowKeyboard", 2);
        c = cklVar3;
        ckl cklVar4 = new ckl("HideKeyboard", 3);
        d = cklVar4;
        ckl[] cklVarArr = {cklVar, cklVar2, cklVar3, cklVar4};
        e = cklVarArr;
        wcq.P(cklVarArr);
    }

    private ckl(String str, int i) {
    }

    public static ckl[] values() {
        return (ckl[]) e.clone();
    }
}

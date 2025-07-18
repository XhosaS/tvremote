package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctc {
    public static final ctc a;
    public static final ctc b;
    public static final ctc c;
    private static final /* synthetic */ ctc[] d;

    static {
        ctc ctcVar = new ctc("COROUTINE_SUSPENDED", 0);
        a = ctcVar;
        ctc ctcVar2 = new ctc("UNDECIDED", 1);
        b = ctcVar2;
        ctc ctcVar3 = new ctc("RESUMED", 2);
        c = ctcVar3;
        ctc[] ctcVarArr = {ctcVar, ctcVar2, ctcVar3};
        d = ctcVarArr;
        dnx.aD(ctcVarArr);
    }

    private ctc(String str, int i) {
    }

    public static ctc[] values() {
        return (ctc[]) d.clone();
    }
}

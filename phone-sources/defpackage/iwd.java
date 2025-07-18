package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwd {
    public static final iwd a;
    public static final iwd b;
    public static final iwd c;
    private static final /* synthetic */ iwd[] d;

    static {
        iwd iwdVar = new iwd("NONE", 0);
        a = iwdVar;
        iwd iwdVar2 = new iwd("VOICE", 1);
        b = iwdVar2;
        iwd iwdVar3 = new iwd("ASSISTANT", 2);
        c = iwdVar3;
        iwd[] iwdVarArr = {iwdVar, iwdVar2, iwdVar3};
        d = iwdVarArr;
        wcq.P(iwdVarArr);
    }

    private iwd(String str, int i) {
    }

    public static iwd[] values() {
        return (iwd[]) d.clone();
    }
}

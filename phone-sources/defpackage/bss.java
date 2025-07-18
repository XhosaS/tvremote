package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bss {
    public static final bss a;
    public static final bss b;
    public static final bss c;
    private static final /* synthetic */ bss[] d;

    static {
        bss bssVar = new bss("Initial", 0);
        a = bssVar;
        bss bssVar2 = new bss("Main", 1);
        b = bssVar2;
        bss bssVar3 = new bss("Final", 2);
        c = bssVar3;
        bss[] bssVarArr = {bssVar, bssVar2, bssVar3};
        d = bssVarArr;
        wcq.P(bssVarArr);
    }

    private bss(String str, int i) {
    }

    public static bss[] values() {
        return (bss[]) d.clone();
    }
}

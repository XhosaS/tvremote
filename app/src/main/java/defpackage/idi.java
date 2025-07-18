package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class idi {
    public static final idi a;
    public static final idi b;
    private static final /* synthetic */ idi[] c;

    static {
        idi idiVar = new idi("ASSISTANT_DISABLE", 0);
        a = idiVar;
        idi idiVar2 = new idi("ASSISTANT_ENABLE", 1);
        b = idiVar2;
        idi[] idiVarArr = {idiVar, idiVar2};
        c = idiVarArr;
        agtw.a(idiVarArr);
    }

    private idi(String str, int i) {
    }

    public static idi[] values() {
        return (idi[]) c.clone();
    }
}

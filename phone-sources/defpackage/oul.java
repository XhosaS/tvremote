package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oul {
    public static final oul a;
    public static final oul b;
    public static final oul c;
    public static final oul d;
    public static final oul e;
    private static final /* synthetic */ oul[] f;

    static {
        oul oulVar = new oul("TYPE_UNSPECIFIED", 0);
        a = oulVar;
        oul oulVar2 = new oul("FORCED_SUBTITLE", 1);
        b = oulVar2;
        oul oulVar3 = new oul("CLOSED_CAPTION", 2);
        c = oulVar3;
        oul oulVar4 = new oul("SUBTITLE", 3);
        d = oulVar4;
        oul oulVar5 = new oul("SDH", 4);
        e = oulVar5;
        oul[] oulVarArr = {oulVar, oulVar2, oulVar3, oulVar4, oulVar5};
        f = oulVarArr;
        wcq.P(oulVarArr);
    }

    private oul(String str, int i) {
    }

    public static oul[] values() {
        return (oul[]) f.clone();
    }
}

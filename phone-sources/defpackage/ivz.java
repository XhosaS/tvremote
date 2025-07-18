package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivz {
    public static final ivz a;
    public static final ivz b;
    private static final /* synthetic */ ivz[] c;

    static {
        ivz ivzVar = new ivz("WIFI", 0);
        a = ivzVar;
        ivz ivzVar2 = new ivz("BLUETOOTH", 1);
        b = ivzVar2;
        ivz[] ivzVarArr = {ivzVar, ivzVar2};
        c = ivzVarArr;
        wcq.P(ivzVarArr);
    }

    private ivz(String str, int i) {
    }

    public static ivz[] values() {
        return (ivz[]) c.clone();
    }
}

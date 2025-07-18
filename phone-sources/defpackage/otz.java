package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otz {
    public static final otz a;
    public static final otz b;
    public static final otz c;
    public static final otz d;
    public static final otz e;
    private static final /* synthetic */ otz[] f;

    static {
        otz otzVar = new otz("PURCHASE_ERROR", 0);
        a = otzVar;
        otz otzVar2 = new otz("STREAMING_POLICY_ERROR", 1);
        b = otzVar2;
        otz otzVar3 = new otz("OFFLINE_POLICY_ERROR", 2);
        c = otzVar3;
        otz otzVar4 = new otz("DRM_ERROR", 3);
        d = otzVar4;
        otz otzVar5 = new otz("UNSPECIFIED_ERROR", 4);
        e = otzVar5;
        otz[] otzVarArr = {otzVar, otzVar2, otzVar3, otzVar4, otzVar5};
        f = otzVarArr;
        wcq.P(otzVarArr);
    }

    private otz(String str, int i) {
    }

    public static otz[] values() {
        return (otz[]) f.clone();
    }
}

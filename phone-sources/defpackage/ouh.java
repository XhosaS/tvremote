package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ouh {
    public static final ouh a;
    public static final ouh b;
    public static final ouh c;
    public static final ouh d;
    private static final /* synthetic */ ouh[] e;

    static {
        ouh ouhVar = new ouh("UNDEFINED", 0);
        a = ouhVar;
        ouh ouhVar2 = new ouh("INITIALIZATION_ERROR", 1);
        b = ouhVar2;
        ouh ouhVar3 = new ouh("STREAM_FETCH_ERROR", 2);
        c = ouhVar3;
        ouh ouhVar4 = new ouh("DASH_MANIFEST_CONVERSION_ERROR", 3);
        d = ouhVar4;
        ouh[] ouhVarArr = {ouhVar, ouhVar2, ouhVar3, ouhVar4};
        e = ouhVarArr;
        wcq.P(ouhVarArr);
    }

    private ouh(String str, int i) {
    }

    public static ouh[] values() {
        return (ouh[]) e.clone();
    }
}

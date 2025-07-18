package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oub {
    public static final oub a;
    public static final oub b;
    public static final oub c;
    private static final /* synthetic */ oub[] d;

    static {
        oub oubVar = new oub("KEY_TYPE_STREAMING", 0);
        a = oubVar;
        oub oubVar2 = new oub("KEY_TYPE_OFFLINE", 1);
        b = oubVar2;
        oub oubVar3 = new oub("KEY_TYPE_RELEASE", 2);
        c = oubVar3;
        oub[] oubVarArr = {oubVar, oubVar2, oubVar3};
        d = oubVarArr;
        wcq.P(oubVarArr);
    }

    private oub(String str, int i) {
    }

    public static oub[] values() {
        return (oub[]) d.clone();
    }
}

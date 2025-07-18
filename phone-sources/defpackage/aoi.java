package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoi {
    public static final aoi a;
    public static final aoi b;
    private static final /* synthetic */ aoi[] c;

    static {
        aoi aoiVar = new aoi("Closed", 0);
        a = aoiVar;
        aoi aoiVar2 = new aoi("Open", 1);
        b = aoiVar2;
        aoi[] aoiVarArr = {aoiVar, aoiVar2};
        c = aoiVarArr;
        wcq.P(aoiVarArr);
    }

    private aoi(String str, int i) {
    }

    public static aoi[] values() {
        return (aoi[]) c.clone();
    }
}

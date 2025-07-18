package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayt {
    public static final ayt a;
    public static final ayt b;
    public static final ayt c;
    private static final /* synthetic */ ayt[] d;

    static {
        ayt aytVar = new ayt("Focused", 0);
        a = aytVar;
        ayt aytVar2 = new ayt("UnfocusedEmpty", 1);
        b = aytVar2;
        ayt aytVar3 = new ayt("UnfocusedNotEmpty", 2);
        c = aytVar3;
        ayt[] aytVarArr = {aytVar, aytVar2, aytVar3};
        d = aytVarArr;
        wcq.P(aytVarArr);
    }

    private ayt(String str, int i) {
    }

    public static ayt[] values() {
        return (ayt[]) d.clone();
    }
}

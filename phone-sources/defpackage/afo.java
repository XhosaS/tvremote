package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afo {
    public static final afo a;
    public static final afo b;
    public static final afo c;
    private static final /* synthetic */ afo[] d;

    static {
        afo afoVar = new afo("Cursor", 0);
        a = afoVar;
        afo afoVar2 = new afo("SelectionStart", 1);
        b = afoVar2;
        afo afoVar3 = new afo("SelectionEnd", 2);
        c = afoVar3;
        afo[] afoVarArr = {afoVar, afoVar2, afoVar3};
        d = afoVarArr;
        wcq.P(afoVarArr);
    }

    private afo(String str, int i) {
    }

    public static afo[] values() {
        return (afo[]) d.clone();
    }
}

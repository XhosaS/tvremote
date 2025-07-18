package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class xb {
    public static final xb a;
    public static final xb b;
    public static final xb c;
    public static final xb d;
    public static final xb e;
    private static final /* synthetic */ xb[] f;

    static {
        xb xbVar = new xb("DESTROYED", 0);
        a = xbVar;
        xb xbVar2 = new xb("INITIALIZED", 1);
        b = xbVar2;
        xb xbVar3 = new xb("CREATED", 2);
        c = xbVar3;
        xb xbVar4 = new xb("STARTED", 3);
        d = xbVar4;
        xb xbVar5 = new xb("RESUMED", 4);
        e = xbVar5;
        xb[] xbVarArr = {xbVar, xbVar2, xbVar3, xbVar4, xbVar5};
        f = xbVarArr;
        dnx.aD(xbVarArr);
    }

    private xb(String str, int i) {
    }

    public static xb[] values() {
        return (xb[]) f.clone();
    }

    public final boolean a(xb xbVar) {
        xbVar.getClass();
        return compareTo(xbVar) >= 0;
    }
}

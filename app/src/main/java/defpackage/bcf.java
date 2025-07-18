package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcf {
    public static final bcf a;
    public static final bcf b;
    public static final bcf c;
    public static final bcf d;
    public static final bcf e;
    private static final /* synthetic */ bcf[] f;

    static {
        bcf bcfVar = new bcf("DESTROYED", 0);
        a = bcfVar;
        bcf bcfVar2 = new bcf("INITIALIZED", 1);
        b = bcfVar2;
        bcf bcfVar3 = new bcf("CREATED", 2);
        c = bcfVar3;
        bcf bcfVar4 = new bcf("STARTED", 3);
        d = bcfVar4;
        bcf bcfVar5 = new bcf("RESUMED", 4);
        e = bcfVar5;
        bcf[] bcfVarArr = {bcfVar, bcfVar2, bcfVar3, bcfVar4, bcfVar5};
        f = bcfVarArr;
        agtw.a(bcfVarArr);
    }

    private bcf(String str, int i) {
    }

    public static bcf[] values() {
        return (bcf[]) f.clone();
    }

    public final boolean a(bcf bcfVar) {
        bcfVar.getClass();
        return compareTo(bcfVar) >= 0;
    }
}

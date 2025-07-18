package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class idj {
    public static final idj a;
    public static final idj b;
    public static final idj c;
    private static final /* synthetic */ idj[] d;

    static {
        idj idjVar = new idj("UDC_PERMISSION_UNKNOWN", 0);
        a = idjVar;
        idj idjVar2 = new idj("UDC_PERMISSION_GRANTED", 1);
        b = idjVar2;
        idj idjVar3 = new idj("UDC_PERMISSION_DENIED", 2);
        c = idjVar3;
        idj[] idjVarArr = {idjVar, idjVar2, idjVar3};
        d = idjVarArr;
        agtw.a(idjVarArr);
    }

    private idj(String str, int i) {
    }

    public static idj[] values() {
        return (idj[]) d.clone();
    }
}

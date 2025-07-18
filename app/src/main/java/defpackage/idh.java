package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class idh {
    public static final idh a;
    public static final idh b;
    public static final idh c;
    public static final idh d;
    private static final /* synthetic */ idh[] e;

    static {
        idh idhVar = new idh("UNKNOWN", 0);
        a = idhVar;
        idh idhVar2 = new idh("GRANTED", 1);
        b = idhVar2;
        idh idhVar3 = new idh("DENIED", 2);
        c = idhVar3;
        idh idhVar4 = new idh("DENIED_IN_OOBE", 3);
        d = idhVar4;
        idh[] idhVarArr = {idhVar, idhVar2, idhVar3, idhVar4};
        e = idhVarArr;
        agtw.a(idhVarArr);
    }

    private idh(String str, int i) {
    }

    public static idh[] values() {
        return (idh[]) e.clone();
    }
}

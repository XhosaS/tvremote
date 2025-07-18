package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmp {
    public static final bmp a;
    public static final bmp b;
    public static final bmp c;
    public static final bmp d;
    private static final /* synthetic */ bmp[] e;

    static {
        bmp bmpVar = new bmp("Active", 0);
        a = bmpVar;
        bmp bmpVar2 = new bmp("ActiveParent", 1);
        b = bmpVar2;
        bmp bmpVar3 = new bmp("Captured", 2);
        c = bmpVar3;
        bmp bmpVar4 = new bmp("Inactive", 3);
        d = bmpVar4;
        bmp[] bmpVarArr = {bmpVar, bmpVar2, bmpVar3, bmpVar4};
        e = bmpVarArr;
        wcq.P(bmpVarArr);
    }

    private bmp(String str, int i) {
    }

    public static bmp[] values() {
        return (bmp[]) e.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new yfu();
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new yfu();
            }
        }
        return true;
    }
}

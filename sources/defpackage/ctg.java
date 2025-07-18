package defpackage;

import j$.util.List;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctg extends csj implements Serializable, List, ctf {
    private final Enum[] a;

    public ctg(Enum[] enumArr) {
        this.a = enumArr;
    }

    private final Object writeReplace() {
        return new cth(this.a);
    }

    @Override // defpackage.csf
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.csf, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        r4.getClass();
        return dnx.aT(this.a, r4.ordinal()) == r4;
    }

    @Override // defpackage.csj, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        Enum[] enumArr = this.a;
        dnx.bc(i, enumArr.length);
        return enumArr[i];
    }

    @Override // defpackage.csj, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        r4.getClass();
        Enum[] enumArr = this.a;
        int iOrdinal = r4.ordinal();
        if (dnx.aT(enumArr, iOrdinal) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.csj, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        r2.getClass();
        return indexOf(r2);
    }
}

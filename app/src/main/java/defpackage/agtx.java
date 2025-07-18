package defpackage;

import j$.util.List;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agtx extends agqd implements Serializable, List, agtv {
    private final Enum[] b;

    public agtx(Enum[] enumArr) {
        this.b = enumArr;
    }

    private final Object writeReplace() {
        return new agty(this.b);
    }

    @Override // defpackage.agpx
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.agpx, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        r4.getClass();
        return ((Enum) agqj.l(this.b, r4.ordinal())) == r4;
    }

    @Override // defpackage.agqd, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        Enum[] enumArr = this.b;
        agqd.a.b(i, enumArr.length);
        return enumArr[i];
    }

    @Override // defpackage.agqd, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        r4.getClass();
        Enum[] enumArr = this.b;
        int iOrdinal = r4.ordinal();
        if (((Enum) agqj.l(enumArr, iOrdinal)) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.agqd, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        r2.getClass();
        return indexOf(r2);
    }
}

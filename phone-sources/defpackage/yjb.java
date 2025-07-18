package defpackage;

import j$.util.List;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yjb extends ygp implements Serializable, List, yja {
    private final Enum[] a;

    public yjb(Enum[] enumArr) {
        this.a = enumArr;
    }

    private final Object writeReplace() {
        return new yjc(this.a);
    }

    @Override // defpackage.ygk
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.ygk, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        r4.getClass();
        return yfm.aV(this.a, r4.ordinal()) == r4;
    }

    @Override // defpackage.ygp, java.util.List
    public final /* synthetic */ Object get(int i) {
        Enum[] enumArr = this.a;
        a.aA(i, enumArr.length);
        return enumArr[i];
    }

    @Override // defpackage.ygp, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        r4.getClass();
        Enum[] enumArr = this.a;
        int iOrdinal = r4.ordinal();
        if (yfm.aV(enumArr, iOrdinal) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.ygp, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        r2.getClass();
        return indexOf(r2);
    }
}

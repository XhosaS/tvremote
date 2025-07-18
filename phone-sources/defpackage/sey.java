package defpackage;

import java.util.AbstractList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sey extends AbstractList {
    public static final sey a = new sey(null, null, 0);
    public final String b;
    public final int c;
    private final sey d;

    public sey(sey seyVar, String str, int i) {
        this.d = seyVar;
        this.b = str;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.c)) {
            throw new IndexOutOfBoundsException();
        }
        if (i == i2 - 1) {
            return this.b;
        }
        sey seyVar = this.d;
        seyVar.getClass();
        return seyVar.get(i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof sey)) {
            return super.equals(obj);
        }
        sey seyVar = (sey) obj;
        if (this.c != seyVar.c) {
            return false;
        }
        String str = this.b;
        if (str == null ? seyVar.b != null : !str.equals(seyVar.b)) {
            return false;
        }
        sey seyVar2 = this.d;
        return seyVar2 != null ? seyVar2.equals(seyVar.d) : seyVar.d == null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        if (this.c == 0) {
            return 1;
        }
        return (this.d.hashCode() * 31) + this.b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}

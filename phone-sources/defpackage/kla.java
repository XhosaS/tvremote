package defpackage;

import java.util.AbstractList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kla extends AbstractList {
    public static final kla a = new kla(null, null, 0);
    public final String b;
    public final int c;
    private final kla d;

    public kla(kla klaVar, String str, int i) {
        this.d = klaVar;
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
        kla klaVar = this.d;
        klaVar.getClass();
        return klaVar.get(i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof kla)) {
            return super.equals(obj);
        }
        kla klaVar = (kla) obj;
        if (this.c != klaVar.c) {
            return false;
        }
        String str = this.b;
        if (str == null ? klaVar.b != null : !str.equals(klaVar.b)) {
            return false;
        }
        kla klaVar2 = this.d;
        return klaVar2 != null ? klaVar2.equals(klaVar.d) : klaVar.d == null;
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

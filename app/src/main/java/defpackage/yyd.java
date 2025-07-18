package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yyd extends yzq {
    private final transient EnumSet b;
    private transient int c;

    public yyd(EnumSet enumSet) {
        this.b = enumSet;
    }

    public static yzq a(EnumSet enumSet) {
        int size = enumSet.size();
        return size != 0 ? size != 1 ? new yyd(enumSet) : new zdd((Enum) zag.f(enumSet)) : zcp.b;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.yzq
    public final boolean c() {
        return true;
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof yyd) {
            collection = ((yyd) collection).b;
        }
        return this.b.containsAll(collection);
    }

    @Override // defpackage.yzq, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yyd) {
            obj = ((yyd) obj).b;
        }
        return this.b.equals(obj);
    }

    @Override // defpackage.yzq, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.c = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // defpackage.yzq, defpackage.yxy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final zdl iterator() {
        return zar.d(this.b.iterator());
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.b.toString();
    }

    @Override // defpackage.yzq, defpackage.yxy
    public Object writeReplace() {
        return new yyc(this.b);
    }
}

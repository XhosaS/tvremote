package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzn extends cab {
    private final transient EnumSet a;
    private transient int b;

    public bzn(EnumSet enumSet) {
        this.a = enumSet;
    }

    public static cab h(EnumSet enumSet) {
        int size = enumSet.size();
        return size != 0 ? size != 1 ? new bzn(enumSet) : new cbf((Enum) biu.l(enumSet)) : cbd.a;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.bzl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof bzn) {
            collection = ((bzn) collection).a;
        }
        return this.a.containsAll(collection);
    }

    @Override // defpackage.cab, defpackage.bzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final cbj listIterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        return it instanceof cbj ? (cbj) it : new caf(it);
    }

    @Override // defpackage.cab, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzn) {
            obj = ((bzn) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.bzl
    public final boolean f() {
        return false;
    }

    @Override // defpackage.cab, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.a.hashCode();
        this.b = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.cab
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.cab, defpackage.bzl
    public Object writeReplace() {
        return new bzm(this.a);
    }
}

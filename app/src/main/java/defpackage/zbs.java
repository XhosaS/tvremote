package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class zbs extends zdb {
    public abstract zbp a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof zbo) {
            zbo zboVar = (zbo) obj;
            if (zboVar.a() > 0 && a().a(zboVar.b()) == zboVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof zbo)) {
            return false;
        }
        zbo zboVar = (zbo) obj;
        Object objB = zboVar.b();
        int iA = zboVar.a();
        if (iA != 0) {
            return a().g(objB, iA);
        }
        return false;
    }
}

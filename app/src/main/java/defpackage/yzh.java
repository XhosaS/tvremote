package defpackage;

import com.google.common.collect.Sets;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yzh extends yzy {
    private static final long serialVersionUID = 0;
    final /* synthetic */ yzj b;

    public yzh(yzj yzjVar) {
        this.b = yzjVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // defpackage.yzy
    public final /* synthetic */ Object a(int i) {
        return this.b.p(i);
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof zbo) {
            zbo zboVar = (zbo) obj;
            if (zboVar.a() > 0 && this.b.a(zboVar.b()) == zboVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yzq, java.util.Collection, java.util.Set
    public final int hashCode() {
        return Sets.a(this.b.j());
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.i().size();
    }

    @Override // defpackage.yzy, defpackage.yzq, defpackage.yxy
    public Object writeReplace() {
        return new yzi(this.b);
    }
}

package defpackage;

import com.google.common.collect.Sets;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class yyt extends yzq {
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    public abstract yyr a();

    @Override // defpackage.yzq
    public final boolean c() {
        return false;
    }

    @Override // defpackage.yxy, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = a().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yzq, java.util.Collection, java.util.Set
    public final int hashCode() {
        return Sets.a(a().entrySet());
    }

    @Override // defpackage.yxy
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a().size();
    }

    @Override // defpackage.yzq, defpackage.yxy
    public Object writeReplace() {
        return new yys(a());
    }
}

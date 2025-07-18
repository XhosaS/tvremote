package defpackage;

import java.util.AbstractSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agqg extends AbstractSet implements Set {
    protected agqg() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}

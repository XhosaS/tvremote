package defpackage;

import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdk {
    public final Object a = new Object();
    public final HashSet b = new HashSet();

    public final HashSet a() {
        HashSet hashSet;
        synchronized (this.a) {
            hashSet = this.b;
        }
        return hashSet;
    }

    public final void b(Collection collection) {
        synchronized (this.a) {
            this.b.addAll(collection);
        }
    }
}

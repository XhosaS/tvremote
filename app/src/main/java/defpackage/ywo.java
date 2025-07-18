package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ywo {
    static boolean a(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}

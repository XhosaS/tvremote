package defpackage;

import java.lang.ref.SoftReference;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class meg extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return new SoftReference(new HashMap());
    }
}

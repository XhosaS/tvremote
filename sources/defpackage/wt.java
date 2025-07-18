package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class wt {
    final int a;
    final Method b;

    public wt(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt)) {
            return false;
        }
        wt wtVar = (wt) obj;
        return this.a == wtVar.a && this.b.getName().equals(wtVar.b.getName());
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}

package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class bbs {
    final int a;
    final Method b;

    public bbs(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbs)) {
            return false;
        }
        bbs bbsVar = (bbs) obj;
        return this.a == bbsVar.a && this.b.getName().equals(bbsVar.b.getName());
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}

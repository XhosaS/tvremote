package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class dut {
    final int a;
    final Method b;

    public dut(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dut)) {
            return false;
        }
        dut dutVar = (dut) obj;
        return this.a == dutVar.a && this.b.getName().equals(dutVar.b.getName());
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}

package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaw implements AutoCloseable {
    private final aaz a;
    private final aav b;

    public aaw(aaz aazVar, aav aavVar) {
        this.a = aazVar;
        this.b = aavVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        aaz aazVar = this.a;
        csl cslVar = aazVar.b;
        aav aavVar = this.b;
        cslVar.remove(aavVar);
        aazVar.c.remove(aavVar);
        List list = aazVar.a;
        if (list.contains(aavVar)) {
            aavVar.a();
            list.remove(aavVar);
        }
        aavVar.d.remove(this);
        ctj ctjVar = aavVar.c;
        if (ctjVar != null) {
            ctjVar.a();
        }
        aavVar.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaw)) {
            return false;
        }
        aaw aawVar = (aaw) obj;
        return dnx.aB(this.a, aawVar.a) && dnx.aB(this.b, aawVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}

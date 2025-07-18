package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tsc<A, B, C> extends tsg<A, C> implements Serializable {
    private static final long serialVersionUID = 0;
    final tsg a;
    final tsg b;

    public tsc(tsg tsgVar, tsg tsgVar2) {
        this.a = tsgVar;
        this.b = tsgVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tsg
    public final A correctedDoBackward(C c) {
        return (A) this.a.correctedDoBackward(this.b.correctedDoBackward(c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tsg
    public final C correctedDoForward(A a) {
        return (C) this.b.correctedDoForward(this.a.correctedDoForward(a));
    }

    @Override // defpackage.tsg
    protected final A doBackward(C c) {
        throw new AssertionError();
    }

    @Override // defpackage.tsg
    protected final C doForward(A a) {
        throw new AssertionError();
    }

    @Override // defpackage.tsg, defpackage.tsl
    public final boolean equals(Object obj) {
        if (obj instanceof tsc) {
            tsc tscVar = (tsc) obj;
            if (this.a.equals(tscVar.a) && this.b.equals(tscVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        tsg tsgVar = this.b;
        return this.a.toString() + ".andThen(" + tsgVar.toString() + ")";
    }
}

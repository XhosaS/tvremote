package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tsf<A, B> extends tsg<B, A> implements Serializable {
    private static final long serialVersionUID = 0;
    final tsg a;

    public tsf(tsg tsgVar) {
        this.a = tsgVar;
    }

    @Override // defpackage.tsg
    public final B correctedDoBackward(A a) {
        return (B) this.a.correctedDoForward(a);
    }

    @Override // defpackage.tsg
    public final A correctedDoForward(B b) {
        return (A) this.a.correctedDoBackward(b);
    }

    @Override // defpackage.tsg
    protected final B doBackward(A a) {
        throw new AssertionError();
    }

    @Override // defpackage.tsg
    protected final A doForward(B b) {
        throw new AssertionError();
    }

    @Override // defpackage.tsg, defpackage.tsl
    public final boolean equals(Object obj) {
        if (obj instanceof tsf) {
            return this.a.equals(((tsf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    @Override // defpackage.tsg
    public final tsg<A, B> reverse() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}

package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tsd<A, B> extends tsg<A, B> implements Serializable {
    private final tsl a;
    private final tsl b;

    public tsd(tsl tslVar, tsl tslVar2) {
        tslVar.getClass();
        this.a = tslVar;
        tslVar2.getClass();
        this.b = tslVar2;
    }

    @Override // defpackage.tsg
    protected final A doBackward(B b) {
        return (A) this.b.apply(b);
    }

    @Override // defpackage.tsg
    protected final B doForward(A a) {
        return (B) this.a.apply(a);
    }

    @Override // defpackage.tsg, defpackage.tsl
    public final boolean equals(Object obj) {
        if (obj instanceof tsd) {
            tsd tsdVar = (tsd) obj;
            if (this.a.equals(tsdVar.a) && this.b.equals(tsdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        tsl tslVar = this.b;
        return "Converter.from(" + this.a.toString() + ", " + tslVar.toString() + ")";
    }
}

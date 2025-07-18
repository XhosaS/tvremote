package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iax {
    public abstract int a();

    public final iax b() {
        if (this instanceof iau) {
            return (iau) this;
        }
        if (this instanceof iav) {
            return (iav) this;
        }
        if (this instanceof iaw) {
            return (iaw) this;
        }
        if (this instanceof iar) {
            throw new RuntimeException("cannot swap type for StoreResponse.Data");
        }
        throw new yfu();
    }

    public final Object c() {
        if (this instanceof iar) {
            return ((iar) this).a;
        }
        return null;
    }

    public final Object d() throws Throwable {
        if (this instanceof iar) {
            return ((iar) this).a;
        }
        if (!(this instanceof iau)) {
            toString();
            throw new NullPointerException("there is no data in ".concat(toString()));
        }
        iau iauVar = (iau) this;
        if (iauVar instanceof ias) {
            throw ((ias) iauVar).a;
        }
        if (!(iauVar instanceof iat)) {
            throw new yfu();
        }
        throw null;
    }
}

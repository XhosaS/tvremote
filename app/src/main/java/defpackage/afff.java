package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afff {
    public final affe a;
    public final Status b;

    public afff(affe affeVar, Status status) {
        affeVar.getClass();
        this.a = affeVar;
        status.getClass();
        this.b = status;
    }

    public static afff a(affe affeVar) {
        yqw.B(affeVar != affe.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new afff(affeVar, Status.OK);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afff)) {
            return false;
        }
        afff afffVar = (afff) obj;
        return this.a.equals(afffVar.a) && this.b.equals(afffVar.b);
    }

    public final int hashCode() {
        Status status = this.b;
        return status.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        Status status = this.b;
        if (status.e()) {
            return this.a.toString();
        }
        return this.a.toString() + "(" + status.toString() + ")";
    }
}

package defpackage;

import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afip {
    public final Status a;
    public final Object b;

    public afip(Object obj) {
        this.b = obj;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            afip afipVar = (afip) obj;
            if (yqs.a(this.a, afipVar.a) && yqs.a(this.b, afipVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        Object obj = this.b;
        if (obj != null) {
            yqq yqqVarB = yqr.b(this);
            yqqVarB.b("config", obj);
            return yqqVarB.toString();
        }
        yqq yqqVarB2 = yqr.b(this);
        yqqVarB2.b("error", this.a);
        return yqqVarB2.toString();
    }

    public afip(Status status) {
        this.b = null;
        this.a = status;
        yqw.F(!status.e(), "cannot use OK status: %s", status);
    }
}

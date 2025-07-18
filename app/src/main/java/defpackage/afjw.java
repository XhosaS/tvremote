package defpackage;

import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afjw {
    private final Status a;
    private final Object b;

    public afjw(Status status, Object obj) {
        this.a = status;
        this.b = obj;
    }

    public static afjw b(Status status) {
        status.getClass();
        afjw afjwVar = new afjw(status, null);
        yqw.F(!status.e(), "cannot use OK status: %s", status);
        return afjwVar;
    }

    public final Status a() {
        Status status = this.a;
        return status == null ? Status.OK : status;
    }

    public final Object c() {
        if (this.a == null) {
            return this.b;
        }
        throw new IllegalStateException("No value present.");
    }

    public final boolean d() {
        return this.a == null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afjw)) {
            return false;
        }
        afjw afjwVar = (afjw) obj;
        if (d() == afjwVar.d()) {
            return d() ? yqs.a(this.b, afjwVar.b) : yqs.a(this.a, afjwVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        Status status = this.a;
        if (status == null) {
            yqqVarB.b("value", this.b);
        } else {
            yqqVarB.b("error", status);
        }
        return yqqVarB.toString();
    }
}

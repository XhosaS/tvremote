package defpackage;

import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afhg {
    public static final afhg a = new afhg(null, Status.OK, false);
    public final afhj b;
    public final Status c;
    public final boolean d;
    private final afeu e = null;

    private afhg(afhj afhjVar, Status status, boolean z) {
        this.b = afhjVar;
        status.getClass();
        this.c = status;
        this.d = z;
    }

    public static afhg a(Status status) {
        yqw.B(!status.e(), "drop status shouldn't be OK");
        return new afhg(null, status, true);
    }

    public static afhg b(Status status) {
        yqw.B(!status.e(), "error status shouldn't be OK");
        return new afhg(null, status, false);
    }

    public static afhg d(afhj afhjVar) {
        return new afhg(afhjVar, Status.OK, false);
    }

    public final boolean c() {
        return (this.b == null && this.c.e()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afhg)) {
            return false;
        }
        afhg afhgVar = (afhg) obj;
        if (yqs.a(this.b, afhgVar.b) && yqs.a(this.c, afhgVar.c)) {
            afeu afeuVar = afhgVar.e;
            if (yqs.a(null, null) && this.d == afhgVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, null, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("subchannel", this.b);
        yqqVarB.b("streamTracerFactory", null);
        yqqVarB.b("status", this.c);
        yqqVarB.c("drop", String.valueOf(this.d));
        yqqVarB.b("authority-override", null);
        return yqqVarB.toString();
    }
}

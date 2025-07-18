package defpackage;

import io.grpc.Status;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class oxj implements owv {
    private static final zdy e = zdy.h("com/google/android/libraries/home/homegraph/StateAwareOperation");
    public final String a;
    public Status c;
    public Object d;
    private final Function g;
    private owj h;
    private Object i;
    private final Set f = new wg(0);
    public oxi b = oxi.RUNNING;

    public oxj(String str, owj owjVar, Function function) {
        this.a = str;
        this.h = owjVar;
        this.g = function;
    }

    private final void d(oxi oxiVar) {
        this.b = oxiVar;
        wf wfVar = new wf((wg) this.f);
        while (wfVar.hasNext()) {
            ((oxh) wfVar.next()).a(this);
        }
    }

    @Override // defpackage.owv
    public final void a() {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            d(oxi.CANCELED);
            this.h = null;
        }
    }

    public final void b(oxh oxhVar) {
        this.f.add(oxhVar);
    }

    public final void c(Status status, Object obj) {
        Object obj2;
        if (this.c != null) {
            ((zdv) ((zdv) e.c()).q("com/google/android/libraries/home/homegraph/StateAwareOperation", "handleResult", 139, "StateAwareOperation.java")).u("Can't handle more than one response");
        }
        this.c = status;
        this.d = obj;
        int iOrdinal = this.b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (this.b != oxi.PAUSED) {
                    ((zdv) e.a(pai.a).q("com/google/android/libraries/home/homegraph/StateAwareOperation", "enterStatePausedResponseReceived", 192, "StateAwareOperation.java")).x("Can't store a pending result for an operation in state: %s", this.b);
                    return;
                } else {
                    d(oxi.PAUSED_RESPONSE_RECEIVED);
                    return;
                }
            }
            if (iOrdinal == 3) {
                ((zdv) ((zdv) e.c()).q("com/google/android/libraries/home/homegraph/StateAwareOperation", "handleResult", 155, "StateAwareOperation.java")).u("Received a callback for an already completed operation");
                return;
            } else {
                if (iOrdinal != 4) {
                    ((zdv) e.a(pai.a).q("com/google/android/libraries/home/homegraph/StateAwareOperation", "handleResult", 158, "StateAwareOperation.java")).x("Unexpected state in gRPC completion: %s", this.b);
                    return;
                }
                return;
            }
        }
        oxi oxiVar = this.b;
        if (oxiVar != oxi.PAUSED_RESPONSE_RECEIVED && oxiVar != oxi.RUNNING) {
            ((zdv) e.a(pai.a).q("com/google/android/libraries/home/homegraph/StateAwareOperation", "enterStateCompleted", 215, "StateAwareOperation.java")).x("Can't complete operation in state: %s", this.b);
            return;
        }
        Status status2 = this.c;
        if (status2 == null) {
            ((zdv) e.a(pai.a).q("com/google/android/libraries/home/homegraph/StateAwareOperation", "enterStateCompleted", 220, "StateAwareOperation.java")).x("Status cannot be null when completing the operation. State: %s", this.b);
            return;
        }
        if (status2.e() && (obj2 = this.d) != null) {
            this.i = this.g.apply(obj2);
        }
        d(oxi.COMPLETED);
        owj owjVar = this.h;
        if (owjVar == null) {
            ((zdv) e.a(pai.a).q("com/google/android/libraries/home/homegraph/StateAwareOperation", "processCallback", 233, "StateAwareOperation.java")).u("Callback is null, stop processing.");
        } else {
            owjVar.a(this.c, this.i);
        }
    }
}

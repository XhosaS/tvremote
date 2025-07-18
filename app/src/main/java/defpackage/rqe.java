package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rqe extends rqg {
    public byte a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;

    @Override // defpackage.rqg
    public final rqh a() {
        if (this.a == 63) {
            return new rqf(this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.a & 1) == 0) {
            sb.append(" tiktokIntegrationEnabled");
        }
        if ((this.a & 2) == 0) {
            sb.append(" throwExceptionForEventsLoggedInFuture");
        }
        if ((this.a & 4) == 0) {
            sb.append(" throwExceptionForEventsLoggedInFutureInCollector");
        }
        if ((this.a & 8) == 0) {
            sb.append(" enableIndividualFlowEventsSending");
        }
        if ((this.a & 16) == 0) {
            sb.append(" loggerIdMatchingEnabled");
        }
        if ((this.a & 32) == 0) {
            sb.append(" throwExceptionForLoggerIdMismatch");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.rqg
    public final void b(boolean z) {
        this.d = z;
        this.a = (byte) (this.a | 8);
    }

    @Override // defpackage.rqg
    public final void c(boolean z) {
        this.e = z;
        this.a = (byte) (this.a | 16);
    }

    @Override // defpackage.rqg
    public final void d(boolean z) {
        this.c = z;
        this.a = (byte) (this.a | 2);
    }

    @Override // defpackage.rqg
    public final void e(boolean z) {
        this.b = z;
        this.a = (byte) (this.a | 1);
    }
}

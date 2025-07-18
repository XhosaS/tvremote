package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ojd extends olm {
    private boolean a;
    private int b;
    private yyk c;
    private abwf d;
    private boolean e;
    private boolean f;
    private boolean g;
    private byte h;

    @Override // defpackage.olm
    public final oln a() {
        yyk yykVar;
        abwf abwfVar;
        if (this.h == 63 && (yykVar = this.c) != null && (abwfVar = this.d) != null) {
            return new oje(this.a, this.b, yykVar, abwfVar, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.h & 1) == 0) {
            sb.append(" enableGellerSyncRetry");
        }
        if ((this.h & 2) == 0) {
            sb.append(" maximumRetryAttemptsCount");
        }
        if (this.c == null) {
            sb.append(" gellerRetryableErrorCodes");
        }
        if (this.d == null) {
            sb.append(" gellerSyncRetryInitialDelay");
        }
        if ((this.h & 4) == 0) {
            sb.append(" enableRetrySyncRequiresCharging");
        }
        if ((this.h & 8) == 0) {
            sb.append(" enableRetrySyncRequiresUnmeteredNetwork");
        }
        if ((this.h & 16) == 0) {
            sb.append(" enableRetrySyncRequiresDeviceIdle");
        }
        if ((this.h & 32) == 0) {
            sb.append(" disableGellerSyncRetryForZwieback");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.olm
    public final void b() {
        this.h = (byte) (this.h | 32);
    }

    @Override // defpackage.olm
    public final void c(boolean z) {
        this.a = z;
        this.h = (byte) (this.h | 1);
    }

    @Override // defpackage.olm
    public final void d() {
        this.e = true;
        this.h = (byte) (this.h | 4);
    }

    @Override // defpackage.olm
    public final void e() {
        this.g = true;
        this.h = (byte) (this.h | 16);
    }

    @Override // defpackage.olm
    public final void f() {
        this.f = true;
        this.h = (byte) (this.h | 8);
    }

    @Override // defpackage.olm
    public final void g(yyk yykVar) {
        if (yykVar == null) {
            throw new NullPointerException("Null gellerRetryableErrorCodes");
        }
        this.c = yykVar;
    }

    @Override // defpackage.olm
    public final void h(abwf abwfVar) {
        if (abwfVar == null) {
            throw new NullPointerException("Null gellerSyncRetryInitialDelay");
        }
        this.d = abwfVar;
    }

    @Override // defpackage.olm
    public final void i(int i) {
        this.b = i;
        this.h = (byte) (this.h | 2);
    }
}

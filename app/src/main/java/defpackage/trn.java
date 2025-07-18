package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class trn extends trr {
    private final int b;
    private final String c;

    /* JADX WARN: Illegal instructions before constructor call */
    public trn(int i, String str) {
        tra traVarB = trb.b();
        ((trc) traVarB).a = 7;
        traVarB.b(i);
        super(traVarB.a());
        this.b = i;
        this.c = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Error code from S3 gRPC = " + this.b + ", error message: " + this.c;
    }
}

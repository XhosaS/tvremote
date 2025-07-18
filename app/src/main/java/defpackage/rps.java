package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rps implements rqp {
    FLOW_TYPE_UNKNOWN(0),
    NONE(1),
    GELLER_CLEANUP(101);

    private final int e;

    rps(int i) {
        this.e = i;
    }

    @Override // defpackage.rqp
    public final int a() {
        return this.e;
    }
}

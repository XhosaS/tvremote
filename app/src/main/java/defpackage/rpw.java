package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum rpw implements rqp {
    FLOW_TYPE_UNKNOWN(0),
    NONE(1),
    MDD_INTERACTION(101);

    private final int e;

    rpw(int i) {
        this.e = i;
    }

    @Override // defpackage.rqp
    public final int a() {
        return this.e;
    }
}

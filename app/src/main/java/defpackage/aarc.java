package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aarc implements aalb {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    private final int f;

    aarc(int i) {
        this.f = i;
    }

    @Override // defpackage.aalb
    public final int a() {
        return this.f;
    }
}

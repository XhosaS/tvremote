package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aarb implements aalb {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    private final int e;

    aarb(int i) {
        this.e = i;
    }

    @Override // defpackage.aalb
    public final int a() {
        return this.e;
    }
}

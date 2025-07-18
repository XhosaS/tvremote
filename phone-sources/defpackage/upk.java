package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum upk implements umj {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    private final int e;

    upk(int i) {
        this.e = i;
    }

    @Override // defpackage.umj
    public final int a() {
        return this.e;
    }
}

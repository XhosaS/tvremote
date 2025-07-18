package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum wio implements vug {
    UNKNOWN_STATUS(0),
    PRIMETIME_ROLLOUT_ENABLED(1),
    REPLAY_ROLLOUT_ENABLED(2),
    GTV_APP_ENABLED(3);

    public final int e;

    wio(int i) {
        this.e = i;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}

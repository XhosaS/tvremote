package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum wdq implements vug {
    ERROR_TYPE_UNSPECIFIED(0),
    INITIALIZATION_ERROR(1),
    STREAM_FETCH_ERROR(2),
    DASH_MANIFEST_CONVERSION_ERROR(3),
    PLAY_COUNTRY_RPC_FAILURE_ERROR(4),
    PURCHASE_ERROR(5),
    STREAMING_POLICY_ERROR(6),
    OFFLINE_POLICY_ERROR(7),
    DRM_ERROR(8);

    public final int j;

    wdq(int i) {
        this.j = i;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}

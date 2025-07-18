package defpackage;

import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum hix {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);

    public static final ImmutableMap p;
    private final int r;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (hix hixVar : values()) {
            builder.put(Integer.valueOf(hixVar.r), hixVar);
        }
        p = builder.buildOrThrow();
    }

    hix(int i) {
        this.r = i;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum zsj implements abxf {
    UNKNOWN(0),
    GROUP_NOT_FOUND(1),
    NEW_BUILD_ID(2),
    NEW_VARIANT_ID(3),
    NEW_VERSION_NUMBER(4),
    DIFFERENT_FILES(5),
    DIFFERENT_STALE_LIFETIME(6),
    DIFFERENT_EXPIRATION_DATE(7),
    DIFFERENT_DOWNLOAD_CONDITIONS(8),
    DIFFERENT_ALLOWED_READERS(9),
    DIFFERENT_DOWNLOAD_POLICY(10),
    DIFFERENT_EXPERIMENT_INFO(11),
    DIFFERENT_CUSTOM_METADATA(12),
    UNRECOGNIZED(-1);

    private final int p;

    zsj(int i) {
        this.p = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.p;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}

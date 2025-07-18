package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vro implements vug {
    COLOR_UNSPECIFIED(0),
    ON_SURFACE(1),
    ON_SURFACE_VARIANT(2),
    ON_PRIMARY(3),
    PRIMARY(4),
    ERROR(5),
    YELLOW(6),
    ERROR_CONTAINER(7),
    ON_ERROR_CONTAINER(8),
    SURFACE_CONTAINER_LOWEST(9),
    SURFACE_CONTAINER(10),
    ON_ERROR(11),
    CRITICAL_ALERT_BACKGROUND_COLOR(12),
    STATIC_TERTIARY(13),
    SURFACE_VARIANT(14),
    PRIMARY_CONTAINER(15),
    UNRECOGNIZED(-1);

    private final int s;

    vro(int i) {
        this.s = i;
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.s);
    }
}

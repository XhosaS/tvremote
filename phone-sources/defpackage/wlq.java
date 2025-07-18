package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum wlq implements vug {
    COMPONENT_FILTER_UNSPECIFIED(0),
    EXCLUDE_DISLIKED_ENTITIES(1),
    EXCLUDE_NON_WATCHLISTED_ENTITIES(2),
    UNRECOGNIZED(-1);

    private final int f;

    wlq(int i) {
        this.f = i;
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}

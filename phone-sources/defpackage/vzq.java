package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum vzq implements vug {
    VIDEO_CAPABILITY_UNSPECIFIED(0),
    VIDEO_2D(1),
    VIDEO_3D(2),
    HDR_PQ(3),
    HDR_10(4),
    HDR_10_PLUS(8),
    HDR_DOLBY_VISION(7),
    IMMERSIVE(5),
    VR_DISALLOWED(6),
    UNRECOGNIZED(-1);

    private final int l;

    vzq(int i) {
        this.l = i;
    }

    @Override // defpackage.vug
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}

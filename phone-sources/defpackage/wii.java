package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum wii implements vug {
    UNKNOWN_ID(0),
    YOUTUBE_ID(1),
    FREEBASE_ID(2),
    EIDR_ID(3),
    SKYJAM_ID(4),
    DEPRECATED_PAGE_ID(5),
    COMMERCE_ID(6);

    public final int h;

    wii(int i2) {
        this.h = i2;
    }

    public static wii b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_ID;
            case 1:
                return YOUTUBE_ID;
            case 2:
                return FREEBASE_ID;
            case 3:
                return EIDR_ID;
            case 4:
                return SKYJAM_ID;
            case 5:
                return DEPRECATED_PAGE_ID;
            case 6:
                return COMMERCE_ID;
            default:
                return null;
        }
    }

    @Override // defpackage.vug
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}

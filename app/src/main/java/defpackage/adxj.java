package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adxj implements abxf {
    DEFAULT(0),
    MOVIE(1),
    TV_SHOW(2),
    PERSON(3),
    APP(4),
    VIDEO(5);

    public final int g;

    adxj(int i) {
        this.g = i;
    }

    public static adxj b(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return MOVIE;
        }
        if (i == 2) {
            return TV_SHOW;
        }
        if (i == 3) {
            return PERSON;
        }
        if (i == 4) {
            return APP;
        }
        if (i != 5) {
            return null;
        }
        return VIDEO;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}

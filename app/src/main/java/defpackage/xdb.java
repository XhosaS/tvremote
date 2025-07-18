package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum xdb implements abxf {
    ENTITY_DEFAULT(0),
    ENTITY_MOVIE(1),
    ENTITY_TV_SHOW(2),
    ENTITY_PERSON(3),
    ENTITY_APP(4),
    ENTITY_VIDEO(5);

    private final int h;

    xdb(int i) {
        this.h = i;
    }

    public static xdb b(int i) {
        if (i == 0) {
            return ENTITY_DEFAULT;
        }
        if (i == 1) {
            return ENTITY_MOVIE;
        }
        if (i == 2) {
            return ENTITY_TV_SHOW;
        }
        if (i == 3) {
            return ENTITY_PERSON;
        }
        if (i == 4) {
            return ENTITY_APP;
        }
        if (i != 5) {
            return null;
        }
        return ENTITY_VIDEO;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}

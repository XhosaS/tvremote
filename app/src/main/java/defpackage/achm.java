package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum achm implements abxf {
    UNKNOWN_REQUEST_REASON(0),
    PERIODIC(1),
    PUSH_UPDATES(2),
    ON_DEMAND(4),
    INITIALIZATION(6),
    DOWNLOAD_REQUIRED_CORPORA(7),
    INTEGRATION_TEST(8);

    public final int h;

    achm(int i2) {
        this.h = i2;
    }

    public static achm b(int i2) {
        if (i2 == 0) {
            return UNKNOWN_REQUEST_REASON;
        }
        if (i2 == 1) {
            return PERIODIC;
        }
        if (i2 == 2) {
            return PUSH_UPDATES;
        }
        if (i2 == 4) {
            return ON_DEMAND;
        }
        if (i2 == 6) {
            return INITIALIZATION;
        }
        if (i2 == 7) {
            return DOWNLOAD_REQUIRED_CORPORA;
        }
        if (i2 != 8) {
            return null;
        }
        return INTEGRATION_TEST;
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

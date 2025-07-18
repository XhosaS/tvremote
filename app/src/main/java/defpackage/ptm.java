package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ptm {
    NEW_FILE_KEY(0),
    ADD_DOWNLOAD_TRANSFORM(1),
    USE_CHECKSUM_ONLY(2);

    public final int d;

    ptm(int i) {
        this.d = i;
    }

    static ptm a(int i) {
        if (i == 0) {
            return NEW_FILE_KEY;
        }
        if (i == 1) {
            return ADD_DOWNLOAD_TRANSFORM;
        }
        if (i == 2) {
            return USE_CHECKSUM_ONLY;
        }
        throw new IllegalArgumentException(a.b(i, "Unknown MDD FileKey version:"));
    }
}

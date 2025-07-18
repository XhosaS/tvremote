package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehb extends efk {
    public ehb() {
    }

    public ehb(IOException iOException, int i) {
        super(iOException, i, 1);
    }

    public ehb(byte[] bArr) {
        super("HTTP request with non-empty body must set Content-Type", 1004, 1);
    }
}

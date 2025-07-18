package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkx extends IOException {
    private static final long serialVersionUID = 1;

    public hkx(String str, int i) {
        this(str, i, null);
    }

    public hkx(String str, int i, Throwable th) {
        super(str + ", status code: " + i, th);
    }
}

package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czu extends IOException {
    private static final long serialVersionUID = 1;

    public czu(String str, int i, Throwable th) {
        super(str + ", status code: " + i, th);
    }
}

package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezv extends IOException {
    public ezv(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + (th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : ""), th);
    }
}

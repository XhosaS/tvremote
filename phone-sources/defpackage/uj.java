package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uj extends CancellationException {
    public uj() {
        super(null);
    }

    public uj(byte[] bArr) {
        super("The press gesture was canceled.");
    }
}

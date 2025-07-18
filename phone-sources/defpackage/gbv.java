package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbv extends CancellationException {
    public final cb a;

    public gbv(cb cbVar) {
        super("Cancelled isolated runner");
        this.a = cbVar;
    }
}

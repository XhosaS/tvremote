package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugr implements uef {
    private final ugs a;
    private final Executor b;

    public ugr(ugs ugsVar, Executor executor) {
        this.a = ugsVar;
        this.b = executor;
    }

    @Override // defpackage.uef
    public final /* bridge */ /* synthetic */ Object a(uee ueeVar) throws IOException {
        if (ueeVar.b()) {
            throw new ufx("Transforms are not supported by this Opener: ".concat(String.valueOf(String.valueOf(ueeVar.e))));
        }
        if (ueeVar.a.i(ueeVar.e)) {
            throw new IOException(new IllegalArgumentException("Requested file download is already a directory."));
        }
        return new ugq(ueeVar, this.a, this.b);
    }
}

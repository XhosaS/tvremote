package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddy extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    ddy() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public ddy(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public ddy(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}

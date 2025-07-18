package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dos extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    dos() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public dos(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public dos(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}

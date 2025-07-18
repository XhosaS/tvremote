package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abar {
    @Deprecated
    public abar() {
    }

    public int a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public abstract abar b();

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final abau f() {
        if (this instanceof abau) {
            return (abau) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            abdz abdzVar = new abdz(stringWriter);
            abdzVar.f = 1;
            ((abcd) abdm.S).b(abdzVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}

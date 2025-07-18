package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbz implements Enumeration {
    private final czm a;
    private Object b = a();

    public dbz(byte[] bArr) {
        this.a = new czm(bArr, (byte[]) null);
    }

    private final Object a() {
        try {
            return this.a.f();
        } catch (IOException e) {
            throw new daa("malformed ASN.1: ".concat(e.toString()), e);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.b != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        Object obj = this.b;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.b = a();
        return obj;
    }
}

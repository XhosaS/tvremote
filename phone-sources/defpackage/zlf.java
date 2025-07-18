package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zlf implements Enumeration {
    private final zis a;
    private Object b = a();

    public zlf(byte[] bArr) {
        this.a = new zis(bArr, (byte[]) null);
    }

    private final Object a() {
        try {
            return this.a.f();
        } catch (IOException e) {
            throw new zjg("malformed ASN.1: ".concat(e.toString()), e);
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

package defpackage;

import java.io.IOException;
import java.security.Principal;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zpo extends zng implements Principal {
    public zpo(zlw zlwVar) {
        super(zlwVar.a);
    }

    @Override // java.security.Principal
    public final String getName() {
        return toString();
    }

    @Override // defpackage.zix, defpackage.zxn
    public final byte[] s() {
        try {
            return u();
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    public zpo(byte[] bArr) throws IOException {
        try {
            super(zjm.j(new zis(bArr).f()));
        } catch (IllegalArgumentException e) {
            throw new IOException("not an ASN.1 Sequence: ".concat(e.toString()));
        }
    }
}

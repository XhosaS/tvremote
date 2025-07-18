package defpackage;

import java.io.IOException;
import java.security.Principal;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgf extends ddz implements Principal {
    public dgf(dcp dcpVar) {
        super(dcpVar.a);
    }

    @Override // java.security.Principal
    public final String getName() {
        return toString();
    }

    @Override // defpackage.czr, defpackage.dof
    public final byte[] s() {
        try {
            return u();
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    public dgf(byte[] bArr) throws IOException {
        try {
            super(dag.j(new czm(bArr).f()));
        } catch (IllegalArgumentException e) {
            throw new IOException("not an ASN.1 Sequence: ".concat(e.toString()));
        }
    }
}

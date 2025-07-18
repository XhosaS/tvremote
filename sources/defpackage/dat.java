package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dat implements cyx {
    private dbb a;
    private final bda b;

    public dat(bda bdaVar) {
        this.b = bdaVar;
    }

    static das a(bda bdaVar) {
        dbb dbbVar = new dbb(bdaVar);
        return new das(dos.a(dbbVar), dbbVar.a);
    }

    @Override // defpackage.cyx
    public final int f() {
        return this.a.a;
    }

    @Override // defpackage.cyx
    public final InputStream g() {
        dbb dbbVar = new dbb(this.b);
        this.a = dbbVar;
        return dbbVar;
    }

    @Override // defpackage.dbx
    public final dab j() {
        return a(this.b);
    }

    @Override // defpackage.czb
    public final dab p() {
        try {
            return j();
        } catch (IOException e) {
            throw new daa("IOException converting stream to byte array: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}

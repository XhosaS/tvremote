package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class day implements czb, dbx {
    private final /* synthetic */ int a;
    private final bda b;

    public day(bda bdaVar, int i) {
        this.a = i;
        this.b = bdaVar;
    }

    static dax a(bda bdaVar) {
        return new dax(bdaVar.e());
    }

    static daw b(bda bdaVar) {
        return new daw(bdaVar.e());
    }

    static dbp c(bda bdaVar) throws czf {
        try {
            return new dbp(new dbs(bdaVar.e()));
        } catch (IllegalArgumentException e) {
            throw new czf(e.getMessage(), e);
        }
    }

    @Override // defpackage.dbx
    public final dab j() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? dbq.b(this.b.e()) : dbq.a(this.b.e()) : c(this.b) : b(this.b) : a(this.b);
    }

    @Override // defpackage.czb
    public final dab p() {
        int i = this.a;
        if (i == 0) {
            try {
                return j();
            } catch (IOException e) {
                throw new daa(e.getMessage(), e);
            }
        }
        if (i == 1) {
            try {
                return j();
            } catch (IOException e2) {
                throw new IllegalStateException(e2.getMessage());
            }
        }
        if (i == 2) {
            try {
                return j();
            } catch (IOException e3) {
                throw new daa("unable to get DER object", e3);
            } catch (IllegalArgumentException e4) {
                throw new daa("unable to get DER object", e4);
            }
        }
        if (i != 3) {
            try {
                return j();
            } catch (IOException e5) {
                throw new daa(e5.getMessage(), e5);
            }
        }
        try {
            return j();
        } catch (IOException e6) {
            throw new IllegalStateException(e6.getMessage());
        }
    }
}

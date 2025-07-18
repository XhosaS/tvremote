package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbi implements czy {
    private final /* synthetic */ int a;
    private final Object b;

    public dbi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    static dav a(bda bdaVar) {
        return new dav(dos.a(new dbc(bdaVar)), null);
    }

    @Override // defpackage.czy
    public final InputStream b() {
        return this.a != 0 ? new dbc((bda) this.b) : (InputStream) this.b;
    }

    @Override // defpackage.dbx
    public final dab j() {
        return this.a != 0 ? a((bda) this.b) : new dbh(((dbw) this.b).a());
    }

    @Override // defpackage.czb
    public final dab p() {
        if (this.a != 0) {
            try {
                return j();
            } catch (IOException e) {
                throw new daa("IOException converting stream to byte array: ".concat(String.valueOf(e.getMessage())), e);
            }
        }
        try {
            return j();
        } catch (IOException e2) {
            throw new daa("IOException converting stream to byte array: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }
}

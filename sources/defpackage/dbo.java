package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbo implements cyx {
    private final dbw a;
    private int b = 0;

    public dbo(dbw dbwVar) {
        this.a = dbwVar;
    }

    @Override // defpackage.cyx
    public final int f() {
        return this.b;
    }

    @Override // defpackage.cyx
    public final InputStream g() throws IOException {
        dbw dbwVar = this.a;
        int i = dbwVar.b;
        if (i <= 0) {
            throw new IllegalStateException("content octets cannot be empty");
        }
        int i2 = dbwVar.read();
        this.b = i2;
        if (i2 > 0) {
            if (i < 2) {
                throw new IllegalStateException("zero length data with non-zero pad bits");
            }
            if (i2 > 7) {
                throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
            }
        }
        return dbwVar;
    }

    @Override // defpackage.dbx
    public final dab j() {
        return cyw.h(this.a.a());
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

package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zku implements zid {
    private final zlc a;
    private int b = 0;

    public zku(zlc zlcVar) {
        this.a = zlcVar;
    }

    @Override // defpackage.zid
    public final int f() {
        return this.b;
    }

    @Override // defpackage.zid
    public final InputStream g() throws IOException {
        zlc zlcVar = this.a;
        int i = zlcVar.b;
        if (i <= 0) {
            throw new IllegalStateException("content octets cannot be empty");
        }
        int i2 = zlcVar.read();
        this.b = i2;
        if (i2 > 0) {
            if (i < 2) {
                throw new IllegalStateException("zero length data with non-zero pad bits");
            }
            if (i2 > 7) {
                throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
            }
        }
        return zlcVar;
    }

    @Override // defpackage.zld
    public final zjh j() {
        return zic.h(this.a.a());
    }

    @Override // defpackage.zih
    public final zjh p() {
        try {
            return j();
        } catch (IOException e) {
            throw new zjg("IOException converting stream to byte array: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}

package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cmh extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public cmh(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.a = true;
    }

    public cmh(String str) {
        super(str);
    }

    public cmh(IOException iOException, byte[] bArr) {
        super("Unable to parse map entry.", iOException);
    }
}

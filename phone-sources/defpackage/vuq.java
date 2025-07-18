package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vuq extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public vuq(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.a = true;
    }

    public vuq(String str) {
        super(str);
    }

    public vuq(IOException iOException, byte[] bArr) {
        super("Unable to parse map entry.", iOException);
    }
}

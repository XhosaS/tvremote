package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abxv extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public abxv(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public abxv(String str) {
        super(str);
    }

    public abxv(String str, IOException iOException) {
        super(str, iOException);
    }
}

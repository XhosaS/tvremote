package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class der extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public der(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.a = true;
    }

    public der(String str) {
        super(str);
    }
}

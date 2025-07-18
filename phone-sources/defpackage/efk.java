package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class efk extends eev {
    public final int b;

    public efk() {
        super(b(2008, 1));
        this.b = 1;
    }

    public static efk a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !sij.J(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new efi(iOException) : new efk(iOException, i2, i);
    }

    private static int b(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public efk(IOException iOException, int i, int i2) {
        super(iOException, b(i, i2));
        this.b = i2;
    }

    public efk(String str, int i, int i2) {
        super(str, b(i, i2));
        this.b = i2;
    }

    public efk(String str, IOException iOException, int i) {
        super(str, iOException, b(i, 1));
        this.b = 1;
    }
}

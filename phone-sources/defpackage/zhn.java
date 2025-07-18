package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zhn extends zgi {
    private final Socket a;

    public zhn(Socket socket) {
        this.a = socket;
    }

    @Override // defpackage.zgi
    protected final void a() throws IOException {
        try {
            this.a.close();
        } catch (AssertionError e) {
            if (!zhb.e(e)) {
                throw e;
            }
            Socket socket = this.a;
            Logger logger = zhb.a;
            Level level = Level.WARNING;
            Objects.toString(socket);
            logger.log(level, "Failed to close timed out socket ".concat(socket.toString()), (Throwable) e);
        } catch (Exception e2) {
            Socket socket2 = this.a;
            Logger logger2 = zhb.a;
            Level level2 = Level.WARNING;
            Objects.toString(socket2);
            logger2.log(level2, "Failed to close timed out socket ".concat(socket2.toString()), (Throwable) e2);
        }
    }

    @Override // defpackage.zgi
    protected final IOException d(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}

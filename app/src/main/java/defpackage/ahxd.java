package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ahxd {
    public static final /* synthetic */ int a = 0;

    static {
        Logger.getLogger("okio.Okio");
    }

    public static final ahxo a(Socket socket) throws IOException {
        socket.getClass();
        ahxp ahxpVar = new ahxp();
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        return new ahwu(ahxpVar, new ahxg(outputStream, ahxpVar));
    }

    public static final ahxq b(InputStream inputStream) {
        inputStream.getClass();
        return new ahxc(inputStream, new ahxs());
    }

    public static final ahxq c(Socket socket) throws IOException {
        socket.getClass();
        ahxp ahxpVar = new ahxp();
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        return new ahwv(ahxpVar, new ahxc(inputStream, ahxpVar));
    }
}

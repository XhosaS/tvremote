package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class zhb {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final zhm a(Socket socket) throws IOException {
        socket.getClass();
        zhn zhnVar = new zhn(socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        return new zgg(zhnVar, new zhd(outputStream, zhnVar));
    }

    public static final zhm b(File file, boolean z) {
        return new zhd(new FileOutputStream(file, z), new zhq());
    }

    public static final zho c(InputStream inputStream) {
        inputStream.getClass();
        return new zgy(inputStream, new zhq());
    }

    public static final zho d(Socket socket) throws IOException {
        socket.getClass();
        zhn zhnVar = new zhn(socket);
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        return new zgh(zhnVar, new zgy(inputStream, zhnVar));
    }

    public static final boolean e(AssertionError assertionError) {
        String message;
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !ylh.K(message, "getsockname failed", false)) ? false : true;
    }
}

package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.support.v7.appcompat.R;
import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tkc {
    private static final tui a = tui.l("com/google/android/tv/remote/support/core/TcpUtils");

    static void a(Socket socket, boolean z) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorFromSocket = ParcelFileDescriptor.fromSocket(socket);
            if (parcelFileDescriptorFromSocket == null) {
                ((tug) ((tug) a.g()).j("com/google/android/tv/remote/support/core/TcpUtils", "adjustKeepAlive", 44, "TcpUtils.java")).s("Unable to extract file descriptor for a socket");
                return;
            }
            try {
                try {
                    FileDescriptor fileDescriptor = parcelFileDescriptorFromSocket.getFileDescriptor();
                    if (z) {
                        Os.setsockoptInt(fileDescriptor, 6, 4, 5);
                        Os.setsockoptInt(fileDescriptor, 6, 5, 3);
                    } else {
                        Os.setsockoptInt(fileDescriptor, 6, 4, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                        Os.setsockoptInt(fileDescriptor, 6, 5, 10);
                    }
                    Os.setsockoptInt(fileDescriptor, 6, 6, 3);
                } catch (ErrnoException e) {
                    ((tug) ((tug) ((tug) a.g()).i(e)).j("com/google/android/tv/remote/support/core/TcpUtils", "adjustKeepAlive", 59, "TcpUtils.java")).s("Unable to configure keep-alive for a socket");
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        parcelFileDescriptorFromSocket.close();
                    } catch (IOException unused) {
                    }
                }
            } finally {
            }
        } catch (UncheckedIOException e2) {
            ((tug) ((tug) ((tug) a.g()).i(e2)).j("com/google/android/tv/remote/support/core/TcpUtils", "adjustKeepAlive", '(', "TcpUtils.java")).s("Unable to extract file descriptor for a socket");
        }
    }
}

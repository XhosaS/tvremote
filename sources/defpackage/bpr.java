package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.tv.remote.service.DiscoveryService;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpr extends Thread {
    public final Context a;
    public final SSLServerSocket b;
    public final bpx c;
    private final byj d;

    public bpr(Context context, SSLServerSocket sSLServerSocket, byj byjVar) {
        this.a = context;
        this.b = sSLServerSocket;
        this.d = byjVar;
        setName("TcpServer");
        Intent intent = new Intent(context, (Class<?>) DiscoveryService.class);
        bpx bpxVar = new bpx(1);
        this.c = bpxVar;
        context.bindService(intent, bpxVar, 1);
    }

    private static final boolean a(InetAddress inetAddress) {
        boolean z = true;
        if (inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress()) {
            ((cbs) ((cbs) bpt.a.e().g(btt.a)).j("com/google/android/tv/remote/service/TcpServer$AcceptorThread", "isLocal", 178, "TcpServer.java")).t("%s is local or loopback", inetAddress);
            return true;
        }
        try {
            if (NetworkInterface.getByInetAddress(inetAddress) == null) {
                z = false;
            }
            if (z) {
                ((cbs) ((cbs) bpt.a.e().g(btt.a)).j("com/google/android/tv/remote/service/TcpServer$AcceptorThread", "isLocal", 186, "TcpServer.java")).t("%s is own address", inetAddress);
            }
            return z;
        } catch (SocketException unused) {
            return false;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        cbt cbtVar = bpt.a;
        cbs cbsVar = (cbs) cbtVar.e().j("com/google/android/tv/remote/service/TcpServer$AcceptorThread", "run", 126, "TcpServer.java");
        SSLServerSocket sSLServerSocket = this.b;
        cbsVar.r("Listening on %d", sSLServerSocket.getLocalPort());
        while (true) {
            try {
                SSLSocket sSLSocket = (SSLSocket) sSLServerSocket.accept();
                InetAddress inetAddress = sSLSocket.getInetAddress();
                cch cchVarC = cbtVar.c();
                cck cckVar = btt.a;
                ((cbs) ((cbs) cchVarC.g(cckVar)).j("com/google/android/tv/remote/service/TcpServer$AcceptorThread", "run", 131, "TcpServer.java")).t("Knock knock %s", inetAddress.getHostAddress());
                if (a(inetAddress)) {
                    ((cbs) ((cbs) cbtVar.e().g(cckVar)).j("com/google/android/tv/remote/service/TcpServer$AcceptorThread", "run", 138, "TcpServer.java")).t("%s is local, ignoring connection", inetAddress.getHostAddress());
                    try {
                        sSLSocket.close();
                    } catch (IOException unused) {
                    }
                } else {
                    try {
                        sSLSocket.setKeepAlive(true);
                        sSLSocket.setTcpNoDelay(true);
                    } catch (SocketException e) {
                        ((cbs) ((cbs) ((cbs) bpt.a.g().g(btt.a)).i(e)).j("com/google/android/tv/remote/service/TcpServer$AcceptorThread", "run", 152, "TcpServer.java")).p("Failed to configure socket");
                    }
                    bpq bpqVar = new bpq(sSLSocket, this.d);
                    ((cbs) ((cbs) bpt.a.e().g(btt.a)).j("com/google/android/tv/remote/service/TcpServer$AcceptorThread", "run", 156, "TcpServer.java")).t("Client %s connecting", bpqVar);
                    bpqVar.start();
                }
            } catch (IOException unused2) {
                ((cbs) ((cbs) bpt.a.e().g(btt.a)).j("com/google/android/tv/remote/service/TcpServer$AcceptorThread", "run", 162, "TcpServer.java")).p("Server exiting");
                return;
            }
        }
    }
}

package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkg {
    public static final tui a = tui.l("com/google/android/tv/remote/support/core/TcpWakePortClient");
    public final Context b;
    public final Handler c;
    public InputStream d;
    public OutputStream e;
    public Thread f;
    public final tka g;
    private final InetAddress h;
    private final int i;
    private final String j;
    private final HandlerThread k;
    private final tig l;
    private Socket m;

    public tkg(Context context, InetAddress inetAddress, tig tigVar, String str, tka tkaVar) {
        this.b = context;
        this.h = inetAddress;
        this.j = inetAddress.getHostAddress();
        this.i = Integer.parseInt(str);
        this.g = tkaVar;
        HandlerThread handlerThread = new HandlerThread("ATVRemote.WakePortNetwork");
        this.k = handlerThread;
        handlerThread.start();
        this.c = new tke(this, handlerThread.getLooper());
        this.l = tigVar;
    }

    private final void c(Exception exc) {
        ((tug) ((tug) ((tug) a.g()).i(exc)).j("com/google/android/tv/remote/support/core/TcpWakePortClient", "onConnectFailed", 220, "TcpWakePortClient.java")).v("Failed to connect to %s", this.j);
        b();
    }

    public final void a() {
        tug tugVar = (tug) ((tug) a.e()).j("com/google/android/tv/remote/support/core/TcpWakePortClient", "connectImpl", 100, "TcpWakePortClient.java");
        InetAddress inetAddress = this.h;
        tugVar.v("Connecting to %s", inetAddress);
        try {
            tig tigVar = this.l;
            KeyManager[] keyManagerArrC = tigVar.c();
            tif tifVar = tigVar.a;
            if (keyManagerArrC.length == 0) {
                throw new IllegalStateException("No key managers");
            }
            SSLSocket sSLSocket = (SSLSocket) sir.g(keyManagerArrC, tifVar).createSocket(inetAddress, this.i);
            sir.h(sSLSocket);
            tkc.a(sSLSocket, false);
            sSLSocket.setKeepAlive(true);
            sSLSocket.setTcpNoDelay(true);
            sSLSocket.addHandshakeCompletedListener(new tkd(0));
            sSLSocket.startHandshake();
            this.m = sSLSocket;
            if (sSLSocket != null && sSLSocket.isConnected()) {
                tka tkaVar = this.g;
                ((tkb) tkaVar.b).f(tkaVar.a);
            }
            try {
                this.d = this.m.getInputStream();
                this.e = this.m.getOutputStream();
                Thread thread = new Thread(new tci(this, 16));
                this.f = thread;
                thread.start();
            } catch (IOException e) {
                c(e);
            }
        } catch (RuntimeException e2) {
            e = e2;
            c(e);
        } catch (GeneralSecurityException e3) {
            e = e3;
            c(e);
        } catch (SSLException e4) {
            ((tug) ((tug) a.g()).j("com/google/android/tv/remote/support/core/TcpWakePortClient", "onSslFailed", 214, "TcpWakePortClient.java")).B("SSL Handshake with %s failed: %s", this.j, e4.getMessage());
            b();
            ((tkb) this.g.b).h();
        } catch (IOException e5) {
            e = e5;
            c(e);
        }
    }

    public final void b() {
        ((tug) ((tug) a.e()).j("com/google/android/tv/remote/support/core/TcpWakePortClient", "disconnectImpl", 197, "TcpWakePortClient.java")).s("disconnectImpl");
        Socket socket = this.m;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }
}

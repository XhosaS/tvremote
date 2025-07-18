package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v7.appcompat.R;
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
public final class tjx {
    public static final tui a = tui.l("com/google/android/tv/remote/support/core/TcpClient");
    public final Context b;
    public final Handler c;
    public final String d;
    public String e;
    public boolean f;
    public Socket g;
    public InputStream h;
    public OutputStream i;
    public Thread j;
    public final tkm k;
    public final tka l;
    public final tjj m;
    private final InetAddress n;
    private final int o;
    private final String p;
    private final HandlerThread q;
    private final tig r;

    public tjx(Context context, InetAddress inetAddress, int i, tjj tjjVar, tig tigVar, String str, tkm tkmVar, tka tkaVar) {
        this.b = context;
        this.n = inetAddress;
        this.p = inetAddress.getHostAddress();
        this.o = i;
        this.k = tkmVar;
        this.l = tkaVar;
        HandlerThread handlerThread = new HandlerThread("ATVRemote.Network");
        this.q = handlerThread;
        handlerThread.start();
        this.c = new tjv(this, handlerThread.getLooper(), tjjVar);
        this.m = tjjVar;
        this.r = tigVar;
        this.d = str;
    }

    private final void e(Exception exc) {
        ((tug) ((tug) ((tug) a.g()).i(exc)).j("com/google/android/tv/remote/support/core/TcpClient", "onConnectFailed", 313, "TcpClient.java")).v("Failed to connect to %s", this.p);
        d(false);
        this.m.a(exc);
    }

    public final Boolean a() {
        tkm tkmVar = this.k;
        if (tkmVar instanceof tkx) {
            return ((tkx) tkmVar).d();
        }
        return false;
    }

    public final void b() {
        tug tugVar = (tug) ((tug) a.b()).j("com/google/android/tv/remote/support/core/TcpClient", "connectImpl", R.styleable.AppCompatTheme_windowFixedHeightMajor, "TcpClient.java");
        InetAddress inetAddress = this.n;
        tugVar.v("Connecting to %s", inetAddress);
        try {
            tig tigVar = this.r;
            KeyManager[] keyManagerArrC = tigVar.c();
            tif tifVar = tigVar.a;
            if (keyManagerArrC.length == 0) {
                throw new IllegalStateException("No key managers");
            }
            SSLSocket sSLSocket = (SSLSocket) sir.g(keyManagerArrC, tifVar).createSocket(inetAddress, this.o);
            sir.h(sSLSocket);
            tkc.a(sSLSocket, false);
            sSLSocket.setKeepAlive(true);
            sSLSocket.setTcpNoDelay(true);
            sSLSocket.addHandshakeCompletedListener(new tkd(1));
            sSLSocket.startHandshake();
            this.g = sSLSocket;
            try {
                this.h = sSLSocket.getInputStream();
                this.i = this.g.getOutputStream();
                Thread thread = new Thread(new tci(this, 12));
                this.j = thread;
                thread.start();
                this.m.b();
            } catch (IOException e) {
                e(e);
            }
        } catch (RuntimeException e2) {
            e = e2;
            e(e);
        } catch (GeneralSecurityException e3) {
            e = e3;
            e(e);
        } catch (SSLException e4) {
            ((tug) ((tug) a.g()).j("com/google/android/tv/remote/support/core/TcpClient", "onSslFailed", 307, "TcpClient.java")).B("SSL Handshake with %s failed: %s", this.p, e4.getMessage());
            d(false);
            ((tjz) this.m).c.h();
        } catch (IOException e5) {
            e = e5;
            e(e);
        }
    }

    public final void c() {
        ((tug) ((tug) a.b()).j("com/google/android/tv/remote/support/core/TcpClient", "disconnect", 241, "TcpClient.java")).s("disconnect");
        this.c.sendEmptyMessage(2);
    }

    public final void d(boolean z) {
        ((tug) ((tug) a.b()).j("com/google/android/tv/remote/support/core/TcpClient", "disconnectImpl", 282, "TcpClient.java")).v("disconnectImpl %b", Boolean.valueOf(z));
        if (!a().booleanValue()) {
            this.q.quit();
        }
        Socket socket = this.g;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
        if (z) {
            this.m.d();
        }
    }
}

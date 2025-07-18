package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpu extends buh implements bug {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/TcpWakePortClient");
    public final SSLSocket b;
    public final ExecutorService c;
    public OutputStream d;
    public final byj e;
    private final AtomicBoolean f = new AtomicBoolean();

    public bpu(SSLSocket sSLSocket, byj byjVar) {
        this.b = sSLSocket;
        this.e = byjVar;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.c = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new bid(this, 18));
        setName("Read#".concat(toString()));
        byjVar.b(this);
    }

    private final void f(boolean z) {
        if (this.f.getAndSet(true)) {
            return;
        }
        this.c.execute(new bpp(this, z, 2));
    }

    @Override // defpackage.buh
    protected final InputStream a() throws IOException {
        try {
            this.b.startHandshake();
            try {
                SSLSocket sSLSocket = this.b;
                InputStream inputStream = sSLSocket.getInputStream();
                this.d = sSLSocket.getOutputStream();
                this.e.a(this);
                return inputStream;
            } catch (IOException e) {
                ((cbs) ((cbs) a.f().i(e)).j("com/google/android/tv/remote/service/TcpWakePortClient", "prepareInputStream", 83, "TcpWakePortClient.java")).t("TcpWakePortClient unable to communicate with %s", this);
                f(false);
                return null;
            }
        } catch (SSLHandshakeException unused) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/TcpWakePortClient", "prepareInputStream", 68, "TcpWakePortClient.java")).t("Incoming connection for WakePortClient from unknown device %s", this);
            f(false);
            return null;
        } catch (IOException e2) {
            ((cbs) ((cbs) a.f().i(e2)).j("com/google/android/tv/remote/service/TcpWakePortClient", "prepareInputStream", 72, "TcpWakePortClient.java")).t("SSL handshake failed in tcpWakePortClient for %s", this);
            f(false);
            return null;
        }
    }

    @Override // defpackage.buh, defpackage.bug
    public final void b() {
        f(true);
    }

    @Override // defpackage.buh
    protected final void c(bux buxVar) {
        this.e.f(this, buxVar);
    }

    @Override // defpackage.bug
    public final void d(bvw bvwVar) {
        try {
            this.c.execute(new ame(this, bvwVar, 17));
        } catch (RejectedExecutionException e) {
            ((cbs) ((cbs) a.b().i(e)).j("com/google/android/tv/remote/service/TcpWakePortClient", "send", 116, "TcpWakePortClient.java")).p("TcpWakePortClient can't send command, network thread is shutdown");
        }
    }

    @Override // defpackage.bug
    public final int e() {
        return 2;
    }

    @Override // java.lang.Thread
    public final String toString() {
        Locale locale = Locale.ENGLISH;
        SSLSocket sSLSocket = this.b;
        return String.format(locale, "%s:%d", sSLSocket.getInetAddress().getHostAddress(), Integer.valueOf(sSLSocket.getPort()));
    }
}

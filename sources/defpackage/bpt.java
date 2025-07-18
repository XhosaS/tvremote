package defpackage;

import android.content.Context;
import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLServerSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpt {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/TcpServer");
    public final bps b;
    public bpr c;
    private final Context d;
    private final byj e;

    public bpt(Context context, buf bufVar, bsi bsiVar, byj byjVar, byj byjVar2) {
        this.d = bufVar;
        this.e = byjVar2;
        bps bpsVar = new bps(this, bsiVar, byjVar);
        this.b = bpsVar;
        bpsVar.execute(context);
        bufVar.k(new bid(this, 17));
    }

    public final void a(bty btyVar) {
        try {
            SSLServerSocket sSLServerSocket = (SSLServerSocket) aju.e(btyVar.a(), btyVar.b).createServerSocket(6466);
            aju.f(sSLServerSocket);
            bpr bprVar = new bpr(this.d, sSLServerSocket, this.e);
            this.c = bprVar;
            bprVar.start();
        } catch (IOException | GeneralSecurityException e) {
            ((cbs) ((cbs) a.f().i(e)).j("com/google/android/tv/remote/service/TcpServer", "createServer", 101, "TcpServer.java")).p("Failed to create server socket");
        }
    }
}

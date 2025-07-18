package defpackage;

import android.content.Context;
import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLServerSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpy {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/TcpWakePortServer");
    public final Context b;
    public final bpw c;
    public bpv d;
    public final byj e;

    public bpy(Context context, buf bufVar, bsi bsiVar, byj byjVar, byj byjVar2) {
        this.b = bufVar;
        this.e = byjVar2;
        bpw bpwVar = new bpw(this, bsiVar, byjVar);
        this.c = bpwVar;
        bpwVar.execute(context);
        bufVar.k(new bid(this, 19));
    }

    public final void a(bty btyVar) {
        try {
            SSLServerSocket sSLServerSocket = (SSLServerSocket) aju.e(btyVar.a(), btyVar.b).createServerSocket(6465);
            aju.f(sSLServerSocket);
            bpv bpvVar = new bpv(this, sSLServerSocket);
            this.d = bpvVar;
            bpvVar.start();
        } catch (IOException | GeneralSecurityException e) {
            ((cbs) ((cbs) a.f().i(e)).j("com/google/android/tv/remote/service/TcpWakePortServer", "createServer", 107, "TcpWakePortServer.java")).p("Failed to create wake port server socket");
        }
    }
}

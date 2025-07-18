package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.google.android.tv.remote.service.DiscoveryService;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpv extends Thread {
    public final SSLServerSocket a;
    public final bpx b;
    public final /* synthetic */ bpy c;

    public bpv(bpy bpyVar, SSLServerSocket sSLServerSocket) {
        this.c = bpyVar;
        this.a = sSLServerSocket;
        setName("TcpWakePortServer");
        Intent intent = new Intent(bpyVar.b, (Class<?>) DiscoveryService.class);
        bpx bpxVar = new bpx(0);
        this.b = bpxVar;
        bpyVar.b.bindService(intent, bpxVar, 1);
    }

    private static final boolean a(InetAddress inetAddress) {
        boolean z = true;
        if (inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress()) {
            ((cbs) ((cbs) bpy.a.e().g(btt.a)).j("com/google/android/tv/remote/service/TcpWakePortServer$AcceptorThread", "isLocal", 212, "TcpWakePortServer.java")).t("%s is local or loopback", inetAddress);
            return true;
        }
        try {
            if (NetworkInterface.getByInetAddress(inetAddress) == null) {
                z = false;
            }
            if (z) {
                ((cbs) ((cbs) bpy.a.e().g(btt.a)).j("com/google/android/tv/remote/service/TcpWakePortServer$AcceptorThread", "isLocal", 220, "TcpWakePortServer.java")).t("%s is own address", inetAddress);
            }
            return z;
        } catch (SocketException unused) {
            return false;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        PowerManager.LowPowerStandbyPortsLock lowPowerStandbyPortsLockNewLowPowerStandbyPortsLock;
        cbt cbtVar = bpy.a;
        cbs cbsVar = (cbs) cbtVar.e().j("com/google/android/tv/remote/service/TcpWakePortServer$AcceptorThread", "run", 127, "TcpWakePortServer.java");
        SSLServerSocket sSLServerSocket = this.a;
        cbsVar.r("Wake port Listening on %d", sSLServerSocket.getLocalPort());
        Context context = this.c.b;
        if (bov.a(context)) {
            lowPowerStandbyPortsLockNewLowPowerStandbyPortsLock = ((PowerManager) context.getSystemService(PowerManager.class)).newLowPowerStandbyPortsLock(bzs.q(new PowerManager.LowPowerStandbyPortDescription(6, 1, 6465)));
            lowPowerStandbyPortsLockNewLowPowerStandbyPortsLock.acquire();
        } else {
            lowPowerStandbyPortsLockNewLowPowerStandbyPortsLock = null;
        }
        while (true) {
            try {
                try {
                    SSLSocket sSLSocket = (SSLSocket) sSLServerSocket.accept();
                    InetAddress inetAddress = sSLSocket.getInetAddress();
                    ((cbs) cbtVar.e().j("com/google/android/tv/remote/service/TcpWakePortServer$AcceptorThread", "run", 146, "TcpWakePortServer.java")).t("Knock knock on wake port: %s", inetAddress.getHostAddress());
                    if (a(inetAddress)) {
                        ((cbs) ((cbs) cbtVar.e().g(btt.a)).j("com/google/android/tv/remote/service/TcpWakePortServer$AcceptorThread", "run", 153, "TcpWakePortServer.java")).t("%s is local, ignoring connection", inetAddress.getHostAddress());
                        try {
                            sSLSocket.close();
                        } catch (IOException unused) {
                        }
                    } else {
                        try {
                            sSLSocket.setKeepAlive(true);
                            sSLSocket.setTcpNoDelay(true);
                        } catch (SocketException e) {
                            ((cbs) ((cbs) ((cbs) bpy.a.g().g(btt.a)).i(e)).j("com/google/android/tv/remote/service/TcpWakePortServer$AcceptorThread", "run", 171, "TcpWakePortServer.java")).p("Failed to configure wake port socket");
                        }
                        bpy bpyVar = this.c;
                        bpu bpuVar = new bpu(sSLSocket, bpyVar.e);
                        cbt cbtVar2 = bpy.a;
                        ((cbs) cbtVar2.e().j("com/google/android/tv/remote/service/TcpWakePortServer$AcceptorThread", "run", 175, "TcpWakePortServer.java")).t("Client %s connecting", bpuVar);
                        bpuVar.start();
                        ((cbs) cbtVar2.e().j("com/google/android/tv/remote/service/TcpWakePortServer$AcceptorThread", "addWakeLock", 190, "TcpWakePortServer.java")).p("Adding wake lock");
                        PowerManager powerManager = (PowerManager) bpyVar.b.getSystemService(PowerManager.class);
                        if (powerManager != null) {
                            powerManager.newWakeLock(1, "atvremote:wakePort").acquire(30000L);
                        }
                    }
                } catch (IOException unused2) {
                    ((cbs) ((cbs) bpy.a.e().g(btt.a)).j("com/google/android/tv/remote/service/TcpWakePortServer$AcceptorThread", "run", 186, "TcpWakePortServer.java")).p("Wake Port Server exiting");
                    return;
                }
            } finally {
                if (lowPowerStandbyPortsLockNewLowPowerStandbyPortsLock != null) {
                    lowPowerStandbyPortsLockNewLowPowerStandbyPortsLock.release();
                }
            }
        }
    }
}

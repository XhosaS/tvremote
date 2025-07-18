package defpackage;

import android.bluetooth.BluetoothSocket;
import java.io.IOException;
import java.io.OutputStream;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bpp implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ buh b;
    private final /* synthetic */ int c;

    public /* synthetic */ bpp(buh buhVar, boolean z, int i) {
        this.c = i;
        this.b = buhVar;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bug, buh] */
    /* JADX WARN: Type inference failed for: r0v4, types: [bug, buh] */
    /* JADX WARN: Type inference failed for: r0v7, types: [bug, buh] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        BluetoothSocket bluetoothSocket;
        SSLSocket sSLSocket;
        int i = this.c;
        if (i == 0) {
            ?? r0 = this.b;
            try {
                SSLSocket sSLSocket2 = ((bpq) r0).b;
                try {
                    OutputStream outputStream = ((bpq) r0).d;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (sSLSocket2 != null) {
                        sSLSocket2.close();
                    }
                } finally {
                }
            } catch (IOException e) {
                ((cbs) ((cbs) bpq.a.g().i(e)).j("com/google/android/tv/remote/service/TcpClient", "disconnectInternal", 128, "TcpClient.java")).p("Failed to disconnect cleanly");
            }
            if (this.a) {
                ((bpq) r0).e.d(r0);
            } else {
                ((bpq) r0).e.c(r0);
            }
            ((bpq) r0).c.shutdownNow();
            return;
        }
        if (i != 1) {
            ?? r02 = this.b;
            try {
                sSLSocket = ((bpu) r02).b;
            } catch (IOException e2) {
                ((cbs) ((cbs) bpu.a.g().i(e2)).j("com/google/android/tv/remote/service/TcpWakePortClient", "disconnectInternal", 129, "TcpWakePortClient.java")).p("TcpWakePortClient failed to disconnect cleanly");
            }
            try {
                OutputStream outputStream2 = ((bpu) r02).d;
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                if (sSLSocket != null) {
                    sSLSocket.close();
                }
                if (this.a) {
                    ((bpu) r02).e.d(r02);
                } else {
                    ((bpu) r02).e.c(r02);
                }
                ((bpu) r02).c.shutdownNow();
                return;
            } finally {
            }
        }
        ?? r03 = this.b;
        try {
            bluetoothSocket = ((bms) r03).b;
        } catch (IOException e3) {
            ((cbs) ((cbs) bms.a.g().i(e3)).j("com/google/android/tv/remote/service/BluetoothClient", "disconnectInternal", 79, "BluetoothClient.java")).p("Failed to disconnect cleanly");
        }
        try {
            OutputStream outputStream3 = ((bms) r03).d;
            if (outputStream3 != null) {
                outputStream3.close();
            }
            if (bluetoothSocket != null) {
                bluetoothSocket.close();
            }
            if (this.a) {
                ((bms) r03).e.d(r03);
            } else {
                ((bms) r03).e.c(r03);
            }
            ((bms) r03).c.shutdownNow();
        } finally {
        }
    }
}

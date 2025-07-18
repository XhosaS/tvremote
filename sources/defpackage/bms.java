package defpackage;

import android.bluetooth.BluetoothSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bms extends buh implements bug {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/BluetoothClient");
    public final BluetoothSocket b;
    public final ExecutorService c;
    public OutputStream d;
    public final byj e;
    private final AtomicBoolean f = new AtomicBoolean();

    public bms(BluetoothSocket bluetoothSocket, byj byjVar) {
        this.b = bluetoothSocket;
        this.e = byjVar;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.c = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new bid(this, 5));
        setName("Read#".concat(toString()));
        byjVar.b(this);
    }

    private final void f(boolean z) {
        if (this.f.getAndSet(true)) {
            return;
        }
        this.c.execute(new bpp(this, z, 1));
    }

    @Override // defpackage.buh
    protected final InputStream a() throws IOException {
        try {
            BluetoothSocket bluetoothSocket = this.b;
            InputStream inputStream = bluetoothSocket.getInputStream();
            this.d = bluetoothSocket.getOutputStream();
            this.e.a(this);
            return inputStream;
        } catch (IOException unused) {
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
            this.c.execute(new ame(this, bvwVar, 11));
        } catch (RejectedExecutionException e) {
            ((cbs) ((cbs) a.b().i(e)).j("com/google/android/tv/remote/service/BluetoothClient", "send", 67, "BluetoothClient.java")).p("Cannot send command, network thread is shutdown");
        }
    }

    @Override // defpackage.bug
    public final int e() {
        return this.b.getConnectionType() == 3 ? 5 : 3;
    }

    @Override // java.lang.Thread
    public final String toString() {
        return this.b.getRemoteDevice().getAddress();
    }
}

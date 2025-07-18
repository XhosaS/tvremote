package defpackage;

import android.content.Context;
import android.os.Handler;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjn extends tjk {
    private final tjm e;

    public tjn(Context context, tkm tkmVar, zft zftVar, Handler handler) {
        super(context, tkmVar, zftVar, handler);
        tjm tjmVar = new tjm(tkmVar.a().getAuthority(), new tjj(this, zftVar, null));
        this.e = tjmVar;
        tui tuiVar = tjm.a;
        ((tug) ((tug) tuiVar.c()).j("com/google/android/tv/remote/support/core/BluetoothClient", "connect", 45, "BluetoothClient.java")).s("Connecting");
        tjmVar.e.c();
        if (tjmVar.c == null) {
            ((tug) ((tug) tuiVar.b()).j("com/google/android/tv/remote/support/core/BluetoothClient", "connect", 49, "BluetoothClient.java")).s("Bluetooth device not found, cannot connect");
            tjmVar.e.a(new IOException("Bluetooth device not found"));
            return;
        }
        ((tug) ((tug) tuiVar.b()).j("com/google/android/tv/remote/support/core/BluetoothClient", "connect", 54, "BluetoothClient.java")).v("%s starting RF comm", tjmVar.c.getAddress());
        try {
            tjl tjlVar = tjmVar.d;
            if (tjlVar.d.b.isDiscovering()) {
                tjlVar.d.b.cancelDiscovery();
            }
            tjlVar.a = tjlVar.d.c.createRfcommSocketToServiceRecord(tie.a);
            tjlVar.b = tjlVar.a.getOutputStream();
            tjlVar.c = tjlVar.a.getInputStream();
            tjmVar.d.start();
        } catch (IOException e) {
            tjmVar.e.a(e);
        }
    }

    @Override // defpackage.tjo
    public final void a() throws IOException {
        this.e.d.a();
    }

    @Override // defpackage.tjo
    public final void b(tms tmsVar) {
        tjl tjlVar = this.e.d;
        OutputStream outputStream = tjlVar.b;
        if (outputStream == null) {
            ((tug) ((tug) tjm.a.g()).j("com/google/android/tv/remote/support/core/BluetoothClient$ClientThread", "write", 146, "BluetoothClient.java")).s("Unable to write data before BT connection is established");
            return;
        }
        try {
            tmsVar.f(outputStream);
        } catch (IOException e) {
            ((tug) ((tug) ((tug) tjm.a.c()).i(e)).j("com/google/android/tv/remote/support/core/BluetoothClient$ClientThread", "write", (char) 152, "BluetoothClient.java")).s("Failed to send message");
            tjlVar.d.e.e(e);
        }
    }

    @Override // defpackage.tjo
    public final void d(String str) {
    }
}

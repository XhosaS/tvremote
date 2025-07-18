package defpackage;

import java.io.IOException;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agbb implements Runnable {
    final /* synthetic */ agbe a;

    public agbb(agbe agbeVar) {
        this.a = agbeVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            agbe agbeVar = this.a;
            ahxo ahxoVar = agbeVar.f;
            if (ahxoVar != null) {
                ahwx ahwxVar = agbeVar.b;
                long j = ahwxVar.b;
                if (j > 0) {
                    ahxoVar.fF(ahwxVar, j);
                }
            }
        } catch (IOException e) {
            this.a.c.e(e);
        }
        try {
            ahxo ahxoVar2 = this.a.f;
            if (ahxoVar2 != null) {
                ahxoVar2.close();
            }
        } catch (IOException e2) {
            this.a.c.e(e2);
        }
        try {
            Socket socket = this.a.g;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e3) {
            this.a.c.e(e3);
        }
    }
}

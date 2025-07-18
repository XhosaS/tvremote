package defpackage;

import android.bluetooth.BluetoothSocket;
import android.support.v7.appcompat.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjl extends Thread {
    public BluetoothSocket a;
    public OutputStream b;
    public InputStream c;
    final /* synthetic */ tjm d;

    public tjl(tjm tjmVar) {
        this.d = tjmVar;
    }

    final void a() throws IOException {
        try {
            this.b.close();
            this.c.close();
            this.a.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, vuc] */
    /* JADX WARN: Type inference failed for: r7v2, types: [vvs] */
    /* JADX WARN: Type inference failed for: r7v3, types: [vvy] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IOException {
        tnq tnqVar;
        try {
            this.a.connect();
            tjj tjjVar = this.d.e;
            tjjVar.b();
            while (true) {
                try {
                    try {
                        ((tug) ((tug) tjm.a.c()).j("com/google/android/tv/remote/support/core/BluetoothClient$ClientThread", "run", R.styleable.AppCompatTheme_windowFixedWidthMajor, "BluetoothClient.java")).s("Waiting on incoming data");
                        InputStream inputStream = this.c;
                        vtp vtpVar = vtp.a;
                        vvs vvsVar = vvs.a;
                        vtp vtpVar2 = vtp.a;
                        tnq tnqVar2 = tnq.a;
                        try {
                            int i = inputStream.read();
                            if (i == -1) {
                                tnqVar = null;
                            } else {
                                vte vteVarL = vte.L(new vse(inputStream, vte.J(i, inputStream)));
                                ?? O = tnqVar2.o();
                                try {
                                    ?? B = vvs.a.b(O);
                                    B.l(O, vtf.p(vteVarL), vtpVar2);
                                    B.g(O);
                                    try {
                                        vteVarL.z(0);
                                        tnqVar = O;
                                    } catch (vuq e) {
                                        throw e;
                                    }
                                } catch (vwf e2) {
                                    throw e2.a();
                                } catch (RuntimeException e3) {
                                    if (!(e3.getCause() instanceof vuq)) {
                                        throw e3;
                                    }
                                    throw ((vuq) e3.getCause());
                                } catch (vuq e4) {
                                    if (!e4.a) {
                                        throw e4;
                                    }
                                    throw new vuq(e4);
                                } catch (IOException e5) {
                                    if (!(e5.getCause() instanceof vuq)) {
                                        throw new vuq(e5);
                                    }
                                    throw ((vuq) e5.getCause());
                                }
                            }
                            vuc.B(tnqVar);
                            tnq tnqVar3 = tnqVar;
                            if (tnqVar3 == null) {
                                break;
                            } else {
                                tjjVar.f(tnqVar3);
                            }
                        } catch (vuq e6) {
                            if (!e6.a) {
                                throw e6;
                            }
                            throw new vuq(e6);
                        } catch (IOException e7) {
                            throw new vuq(e7);
                        }
                    } catch (IOException e8) {
                        ((tug) ((tug) tjm.a.g()).j("com/google/android/tv/remote/support/core/BluetoothClient$ClientThread", "run", 133, "BluetoothClient.java")).v("Communication error: %s", e8.getMessage());
                    }
                } catch (Throwable th) {
                    a();
                    throw th;
                }
            }
            a();
            ((tug) ((tug) tjm.a.b()).j("com/google/android/tv/remote/support/core/BluetoothClient$ClientThread", "run", 140, "BluetoothClient.java")).s("Disconnected");
            this.d.e.d();
        } catch (IOException e9) {
            this.d.e.a(e9);
        }
    }
}

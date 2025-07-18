package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import com.google.android.tv.remote.service.pairing.PairingCodeActivity;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blq {
    public final blu a;
    public String b;
    public String c;
    public bls d;
    protected boolean f;
    public bub h;
    protected final cmt i;
    protected final bzt j;
    public final dka k;
    private final Thread l;
    public int g = 1;
    public final BlockingQueue e = new LinkedBlockingQueue();

    public blq(dka dkaVar, cmt cmtVar) {
        this.k = dkaVar;
        this.i = cmtVar;
        this.j = new bzt(cmtVar.b, cmtVar.a, new byj(this, null), (char[]) null);
        blu bluVar = new blu();
        this.a = bluVar;
        bluVar.c = 3;
        Thread thread = new Thread(new Runnable() { // from class: blo
            @Override // java.lang.Runnable
            public final void run() throws cmh {
                clt cltVarP;
                blx blwVar;
                blq blqVar = this.a;
                blqVar.c("Starting reader");
                while (!blqVar.f) {
                    try {
                        try {
                            try {
                                try {
                                    Object obj = blqVar.k.b;
                                    cli cliVar = cli.a;
                                    cni cniVar = cni.a;
                                    cli cliVar2 = cli.a;
                                    bmh bmhVar = bmh.a;
                                    try {
                                        int i = ((InputStream) obj).read();
                                        if (i == -1) {
                                            cltVarP = null;
                                        } else {
                                            cky ckyVarK = cky.K(new ckc((InputStream) obj, cky.I(i, (InputStream) obj)));
                                            cltVarP = bmhVar.p();
                                            try {
                                                cno cnoVarB = cni.a.b(cltVarP);
                                                cnoVarB.l(cltVarP, ckz.p(ckyVarK), cliVar2);
                                                cnoVarB.g(cltVarP);
                                                try {
                                                    ckyVarK.z(0);
                                                } catch (cmh e) {
                                                    throw e;
                                                }
                                            } catch (cmh e2) {
                                                if (!e2.a) {
                                                    throw e2;
                                                }
                                                throw new cmh(e2);
                                            } catch (cnw e3) {
                                                throw e3.a();
                                            } catch (IOException e4) {
                                                if (!(e4.getCause() instanceof cmh)) {
                                                    throw new cmh(e4);
                                                }
                                                throw ((cmh) e4.getCause());
                                            } catch (RuntimeException e5) {
                                                if (!(e5.getCause() instanceof cmh)) {
                                                    throw e5;
                                                }
                                                throw ((cmh) e5.getCause());
                                            }
                                        }
                                        clt.B(cltVarP);
                                        bmh bmhVar2 = (bmh) cltVarP;
                                        if (bmhVar2 == null) {
                                            throw new IOException("Connection closed");
                                        }
                                        int i2 = bmhVar2.e;
                                        if (i2 < 2 || i2 > 9) {
                                            throw new blm(b.e(i2, "Incompatible protocol version: "));
                                        }
                                        int i3 = bmhVar2.f;
                                        int iD = apd.d(i3);
                                        if (iD != 0) {
                                            int i4 = 200;
                                            if (iD != 200) {
                                                int iD2 = apd.d(i3);
                                                if (iD2 != 0) {
                                                    i4 = iD2;
                                                }
                                                throw new blm("Non successful status: ".concat(Integer.toString(i4)));
                                            }
                                        }
                                        int i5 = bmhVar2.c;
                                        int i6 = i5 != 0 ? i5 != 20 ? i5 != 10 ? i5 != 11 ? i5 != 30 ? i5 != 31 ? i5 != 40 ? i5 != 41 ? 0 : 7 : 6 : 5 : 4 : 2 : 1 : 3 : 8;
                                        int i7 = i6 - 1;
                                        if (i6 == 0) {
                                            throw null;
                                        }
                                        switch (i7) {
                                            case 0:
                                                bmi bmiVar = i5 == 10 ? (bmi) bmhVar2.d : bmi.a;
                                                blwVar = new blw(bmiVar.c, bmiVar.d);
                                                break;
                                            case 1:
                                                blwVar = new blv((i5 == 11 ? (bmj) bmhVar2.d : bmj.a).c);
                                                break;
                                            case 2:
                                                bmg bmgVar = i5 == 20 ? (bmg) bmhVar2.d : bmg.a;
                                                blu bluVar2 = new blu();
                                                int iZ = ii.Z(bmgVar.e);
                                                if (iZ == 0) {
                                                    iZ = 1;
                                                }
                                                int i8 = iZ - 1;
                                                if (i8 == 1) {
                                                    bluVar2.c = 2;
                                                } else if (i8 == 2) {
                                                    bluVar2.c = 3;
                                                }
                                                Iterator it = bmgVar.c.iterator();
                                                while (it.hasNext()) {
                                                    bluVar2.a.add(dka.g((bmf) it.next()));
                                                }
                                                Iterator it2 = bmgVar.d.iterator();
                                                while (it2.hasNext()) {
                                                    bluVar2.a(dka.g((bmf) it2.next()));
                                                }
                                                blwVar = bluVar2;
                                                break;
                                            case 3:
                                                bmd bmdVar = i5 == 30 ? (bmd) bmhVar2.d : bmd.a;
                                                bmf bmfVar = bmdVar.c;
                                                if (bmfVar == null) {
                                                    bmfVar = bmf.a;
                                                }
                                                blt bltVarG = dka.g(bmfVar);
                                                int iZ2 = ii.Z(bmdVar.d);
                                                if (iZ2 == 0) {
                                                    iZ2 = 1;
                                                }
                                                int i9 = iZ2 - 1;
                                                blwVar = new bls(bltVarG, i9 != 1 ? i9 != 2 ? 1 : 3 : 2);
                                                break;
                                            case 4:
                                                if (i5 == 31) {
                                                } else {
                                                    bme bmeVar = bme.a;
                                                }
                                                blwVar = new blr();
                                                break;
                                            case 5:
                                                blwVar = new blz((i5 == 40 ? (bmk) bmhVar2.d : bmk.a).c.t());
                                                break;
                                            case 6:
                                                blwVar = new bly((i5 == 41 ? (bml) bmhVar2.d : bml.a).c.t());
                                                break;
                                            default:
                                                throw new IOException("Could not unparse message");
                                        }
                                        blqVar.c("Received: " + String.valueOf(blwVar.getClass()));
                                        blqVar.e.put(new blp(blwVar, null));
                                    } catch (cmh e6) {
                                        if (!e6.a) {
                                            throw e6;
                                        }
                                        throw new cmh(e6);
                                    } catch (IOException e7) {
                                        throw new cmh(e7);
                                    }
                                } catch (IOException e8) {
                                    blqVar.c("Exception while getting message: " + e8.toString());
                                    blqVar.e.put(new blp(new bll(e8)));
                                }
                            } catch (bll e9) {
                                blqVar.c("Exception while getting message: " + e9.toString());
                                blqVar.e.put(new blp(e9));
                            }
                        } catch (InterruptedException e10) {
                            blqVar.c("Interrupted: " + e10.toString());
                        }
                    } finally {
                        blqVar.c("Reader is done");
                    }
                }
            }
        });
        this.l = thread;
        thread.setName("PairingSession");
        thread.start();
    }

    private final blp i() throws bll {
        while (!this.f) {
            try {
                blp blpVar = (blp) this.e.poll(500L, TimeUnit.MILLISECONDS);
                if (blpVar != null) {
                    if (blpVar.a()) {
                        throw new bll(blpVar.b);
                    }
                    return blpVar;
                }
            } catch (InterruptedException unused) {
                return null;
            }
        }
        return null;
    }

    public final void a() throws bll, NoSuchAlgorithmException {
        String str;
        String str2;
        PowerManager powerManager;
        if (g() == 2) {
            new Thread(new bid(this, 3)).start();
            c("Waiting for secret from Listener or ...");
            throw new bll("Illegal state - no secret available: ".concat(String.valueOf(String.valueOf(i()))));
        }
        int i = this.d.a.a / 2;
        int i2 = i < 4 ? 1 : i >> 2;
        int i3 = i - i2;
        byte[] bArr = new byte[i3];
        try {
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
            c("Calling listener to display output...");
            bzt bztVar = this.j;
            byte[] bArrB = bztVar.b(bArr);
            int i4 = 0;
            bit.i(bArrB.length >= i2);
            byte[] bArr2 = new byte[i2 + i3];
            System.arraycopy(bArrB, 0, bArr2, 0, i2);
            System.arraycopy(bArr, 0, bArr2, i2, i3);
            bub bubVar = this.h;
            cbt cbtVar = buc.a;
            cch cchVarC = cbtVar.c();
            cck cckVar = btt.a;
            ((cbs) ((cbs) cchVarC.g(cckVar)).j("com/google/android/tv/remote/service/pairing/TcpPairingServer$1", "onPerformOutputDeviceRole", 242, "TcpPairingServer.java")).t("presentSecret %s", this.c);
            String lowerCase = bjz.b(bArr2).toLowerCase();
            int length = lowerCase.length();
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (awo.d(lowerCase.charAt(i4))) {
                    char[] charArray = lowerCase.toCharArray();
                    while (i4 < length) {
                        char c = charArray[i4];
                        if (awo.d(c)) {
                            charArray[i4] = (char) (c ^ ' ');
                        }
                        i4++;
                    }
                    lowerCase = String.valueOf(charArray);
                } else {
                    i4++;
                }
            }
            buc bucVar = (buc) bubVar.a;
            Context context = bucVar.b;
            String str3 = this.c;
            int i5 = bucVar.f;
            long j = bucVar.g;
            bsk bskVar = new bsk(this, 5);
            if (Build.VERSION.SDK_INT > 26 || (powerManager = (PowerManager) context.getSystemService(PowerManager.class)) == null) {
                str = "com/google/android/tv/remote/service/pairing/TcpPairingServer$1";
                str2 = "TcpPairingServer.java";
            } else {
                str = "com/google/android/tv/remote/service/pairing/TcpPairingServer$1";
                str2 = "TcpPairingServer.java";
                powerManager.newWakeLock(268435466, "atvremote:pairing").acquire(1500L);
            }
            btw btwVar = new btw();
            Bundle bundle = new Bundle();
            bundle.putString("code", lowerCase);
            bundle.putString("client_name", str3);
            bundle.putInt("failed", i5);
            bundle.putLong("cooldown_timeout", j);
            bundle.putBinder("cancellation", new bua(bskVar));
            bundle.putBinder("dismiss", btwVar);
            Intent intentAddFlags = new Intent(context, (Class<?>) PairingCodeActivity.class).putExtras(bundle).setPackage(context.getPackageName()).addFlags(268435456).addFlags(32768);
            if (!PairingCodeActivity.d()) {
                intentAddFlags.addFlags(1073741824);
            }
            context.startActivity(intentAddFlags);
            if (Build.VERSION.SDK_INT == 29) {
                intentAddFlags.removeFlags(32768);
                context.startActivity(intentAddFlags);
            }
            bucVar.i = new byj(btwVar);
            bucVar.f++;
            c("Waiting for Secret...");
            blz blzVar = (blz) h(7);
            byte[] bArrB2 = bztVar.b(bArr);
            byte[] bArr3 = blzVar.a;
            if (Arrays.equals(bArrB2, bArr3)) {
                bub bubVar2 = this.h;
                ((cbs) ((cbs) cbtVar.b().g(cckVar)).j(str, "onPairingSucceeded", 264, str2)).t("PairingSucceeded: %s", this.b);
                ((buc) bubVar2.a).c.c((Certificate) ((cmt) bubVar2.b).b);
                c("Sending SecretAck...");
                this.k.i(new bly(bArr3));
                return;
            }
            throw new blj("Inband secret did not match. Expected [" + bjz.b(bArrB2) + "], got [" + bjz.b(bArr3) + "]");
        } catch (NoSuchAlgorithmException e) {
            throw new bll(e);
        }
    }

    protected final void b(bln blnVar, String str) {
        if (this.h != null) {
            ((cbs) ((cbs) buc.a.b().g(btt.a)).j("com/google/android/tv/remote/service/pairing/TcpPairingServer$1", "onLogMessage", 232, "TcpPairingServer.java")).z("%s (%s)", str, blnVar);
        }
    }

    public final void c(String str) {
        b(bln.LOG_DEBUG, str);
    }

    public final void d(blx blxVar) {
        this.k.i(blxVar);
    }

    public final void e() {
        try {
            this.k.h(new Exception());
            cmt cmtVar = this.i;
            ((InputStream) cmtVar.d).close();
            ((OutputStream) cmtVar.c).close();
        } catch (IOException unused) {
        }
        this.f = true;
        this.l.interrupt();
    }

    public final void f(int i) {
        b(bln.LOG_INFO, "New state: ".concat(i != 2 ? i != 3 ? i != 4 ? i != 5 ? "STATE_FAILURE" : "STATE_SUCCESS" : "STATE_PAIRING" : "STATE_CONFIGURING" : "STATE_INITIALIZING"));
        this.g = i;
    }

    public final int g() {
        return this.d.b == 3 ? 2 : 3;
    }

    public final blx h(int i) throws bll {
        blp blpVarI = i();
        if (blpVarI == null || !blpVarI.b()) {
            throw new bll("Invalid state - expected polo message");
        }
        blx blxVar = blpVarI.a;
        int i2 = blxVar.d;
        if (i == i2) {
            return blxVar;
        }
        throw new bll("Unexpected message type: ".concat(aju.g(i2)));
    }
}

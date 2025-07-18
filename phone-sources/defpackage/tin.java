package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tin {
    public final tir a;
    public final String b;
    public tip c;
    protected boolean e;
    public final String g;
    protected final vvd h;
    public final ulo i;
    protected final rzy j;
    public zft k;
    private final Thread l;
    public int f = 1;
    public final BlockingQueue d = new LinkedBlockingQueue();

    public tin(ulo uloVar, vvd vvdVar, String str, String str2) {
        this.i = uloVar;
        this.h = vvdVar;
        this.j = new rzy(vvdVar.c, vvdVar.d, (char[]) null);
        tir tirVar = new tir();
        this.a = tirVar;
        tirVar.c = 2;
        Thread thread = new Thread(new Runnable() { // from class: til
            @Override // java.lang.Runnable
            public final void run() throws vuq {
                vuc vucVarO;
                tiu titVar;
                tin tinVar = this.a;
                while (!tinVar.e) {
                    try {
                        try {
                            try {
                                Object obj = tinVar.i.b;
                                vtp vtpVar = vtp.a;
                                vvs vvsVar = vvs.a;
                                vtp vtpVar2 = vtp.a;
                                tjd tjdVar = tjd.a;
                                try {
                                    int i = ((InputStream) obj).read();
                                    if (i == -1) {
                                        vucVarO = null;
                                    } else {
                                        vte vteVarL = vte.L(new vse((InputStream) obj, vte.J(i, (InputStream) obj)));
                                        vucVarO = tjdVar.o();
                                        try {
                                            vvy vvyVarB = vvs.a.b(vucVarO);
                                            vvyVarB.l(vucVarO, vtf.p(vteVarL), vtpVar2);
                                            vvyVarB.g(vucVarO);
                                            try {
                                                vteVarL.z(0);
                                            } catch (vuq e) {
                                                throw e;
                                            }
                                        } catch (vuq e2) {
                                            if (!e2.a) {
                                                throw e2;
                                            }
                                            throw new vuq(e2);
                                        } catch (IOException e3) {
                                            if (!(e3.getCause() instanceof vuq)) {
                                                throw new vuq(e3);
                                            }
                                            throw ((vuq) e3.getCause());
                                        } catch (vwf e4) {
                                            throw e4.a();
                                        } catch (RuntimeException e5) {
                                            if (!(e5.getCause() instanceof vuq)) {
                                                throw e5;
                                            }
                                            throw ((vuq) e5.getCause());
                                        }
                                    }
                                    vuc.B(vucVarO);
                                    tjd tjdVar2 = (tjd) vucVarO;
                                    if (tjdVar2 == null) {
                                        throw new IOException("Connection closed");
                                    }
                                    int i2 = tjdVar2.e;
                                    if (i2 < 2 || i2 > 9) {
                                        throw new tik(a.cf(i2, "Incompatible protocol version: "));
                                    }
                                    int i3 = tjdVar2.f;
                                    int iE = sir.e(i3);
                                    if (iE != 0) {
                                        int i4 = 200;
                                        if (iE != 200) {
                                            int iE2 = sir.e(i3);
                                            if (iE2 != 0) {
                                                i4 = iE2;
                                            }
                                            throw new tik("Non successful status: ".concat(Integer.toString(i4)));
                                        }
                                    }
                                    int i5 = tjdVar2.c;
                                    int i6 = i5 != 0 ? i5 != 20 ? i5 != 10 ? i5 != 11 ? i5 != 30 ? i5 != 31 ? i5 != 40 ? i5 != 41 ? 0 : 7 : 6 : 5 : 4 : 2 : 1 : 3 : 8;
                                    int i7 = i6 - 1;
                                    if (i6 == 0) {
                                        throw null;
                                    }
                                    switch (i7) {
                                        case 0:
                                            tje tjeVar = i5 == 10 ? (tje) tjdVar2.d : tje.a;
                                            titVar = new tit(tjeVar.c, tjeVar.d);
                                            break;
                                        case 1:
                                            titVar = new tis((i5 == 11 ? (tjf) tjdVar2.d : tjf.a).c);
                                            break;
                                        case 2:
                                            tjc tjcVar = i5 == 20 ? (tjc) tjdVar2.d : tjc.a;
                                            tir tirVar2 = new tir();
                                            int iBm = a.bm(tjcVar.e);
                                            if (iBm == 0) {
                                                iBm = 1;
                                            }
                                            int i8 = iBm - 1;
                                            if (i8 == 1) {
                                                tirVar2.c = 2;
                                            } else if (i8 == 2) {
                                                tirVar2.c = 3;
                                            }
                                            Iterator<E> it = tjcVar.c.iterator();
                                            while (it.hasNext()) {
                                                tirVar2.c(ulo.h((tjb) it.next()));
                                            }
                                            Iterator<E> it2 = tjcVar.d.iterator();
                                            while (it2.hasNext()) {
                                                tirVar2.b.add(ulo.h((tjb) it2.next()));
                                            }
                                            titVar = tirVar2;
                                            break;
                                        case 3:
                                            tiz tizVar = i5 == 30 ? (tiz) tjdVar2.d : tiz.a;
                                            tjb tjbVar = tizVar.c;
                                            if (tjbVar == null) {
                                                tjbVar = tjb.a;
                                            }
                                            tiq tiqVarH = ulo.h(tjbVar);
                                            int iBm2 = a.bm(tizVar.d);
                                            if (iBm2 == 0) {
                                                iBm2 = 1;
                                            }
                                            int i9 = iBm2 - 1;
                                            titVar = new tip(tiqVarH, i9 != 1 ? i9 != 2 ? 1 : 3 : 2);
                                            break;
                                        case 4:
                                            if (i5 == 31) {
                                            } else {
                                                tja tjaVar = tja.a;
                                            }
                                            titVar = new tio();
                                            break;
                                        case 5:
                                            titVar = new tiw((i5 == 40 ? (tjg) tjdVar2.d : tjg.a).c.w());
                                            break;
                                        case 6:
                                            titVar = new tiv((i5 == 41 ? (tjh) tjdVar2.d : tjh.a).c.w());
                                            break;
                                        default:
                                            throw new IOException("Could not unparse message");
                                    }
                                    String.valueOf(titVar.getClass());
                                    tinVar.d.put(new tim(titVar, null, null));
                                } catch (vuq e6) {
                                    if (!e6.a) {
                                        throw e6;
                                    }
                                    throw new vuq(e6);
                                } catch (IOException e7) {
                                    throw new vuq(e7);
                                }
                            } catch (tij e8) {
                                e8.toString();
                                tinVar.d.put(new tim(e8));
                                return;
                            }
                        } catch (IOException e9) {
                            e9.toString();
                            tinVar.d.put(new tim(new tij(e9)));
                            return;
                        }
                    } catch (InterruptedException e10) {
                        e10.toString();
                        return;
                    }
                }
            }
        });
        this.l = thread;
        thread.setName("PairingSession");
        thread.start();
        this.b = str;
        this.g = str2;
    }

    private final tim g() throws tij {
        while (!this.e) {
            try {
                tim timVar = (tim) this.d.poll(500L, TimeUnit.MILLISECONDS);
                if (timVar != null) {
                    if (timVar.a()) {
                        throw new tij(timVar.b);
                    }
                    return timVar;
                }
            } catch (InterruptedException unused) {
                return null;
            }
        }
        return null;
    }

    public final void a(tiq tiqVar) {
        if (this.f != 1) {
            throw new IllegalStateException("Cannot add encodings once session has been started.");
        }
        this.a.c(tiqVar);
    }

    public final void b() throws tij, NoSuchAlgorithmException {
        int i = 7;
        if (e()) {
            new Thread(new tci(this, i)).start();
            tim timVarG = g();
            if (timVarG == null || !timVarG.c()) {
                throw new tij("Illegal state - no secret available: ".concat(String.valueOf(String.valueOf(timVarG))));
            }
            byte[] bArr = timVarG.c;
            if (bArr == null) {
                throw new tij("Invalid secret.");
            }
            rzy rzyVar = this.j;
            try {
                byte[] bArrW = rzy.w(bArr);
                int length = bArr.length;
                int length2 = bArrW.length;
                sip.m(bArrW);
                sip.m(bArr);
                int i2 = length - length2;
                sip.m(rzyVar.v(i2, bArrW));
                if (Arrays.equals(bArr, rzyVar.v(i2, bArrW))) {
                    this.i.j(new tiw(this.j.u(rzy.w(bArr))));
                    return;
                }
            } catch (IllegalArgumentException unused) {
            }
            throw new tih("Secret failed local check.");
        }
        int i3 = this.c.a.a / 2;
        int i4 = i3 < 4 ? 1 : i3 >> 2;
        byte[] bArr2 = new byte[i3 - i4];
        try {
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr2);
            rzy rzyVar2 = this.j;
            rzyVar2.v(i4, bArr2);
            tiw tiwVar = (tiw) f(7);
            byte[] bArrU = rzyVar2.u(bArr2);
            byte[] bArr3 = tiwVar.a;
            if (Arrays.equals(bArrU, bArr3)) {
                throw new tij("Unable to store peer association");
            }
            throw new tih("Inband secret did not match. Expected [" + sip.m(bArrU) + "], got [" + sip.m(bArr3) + "]");
        } catch (NoSuchAlgorithmException e) {
            throw new tij(e);
        }
    }

    public final void c(tiu tiuVar) {
        this.i.j(tiuVar);
    }

    public final void d() throws IOException {
        try {
            this.i.i(new Exception());
            vvd vvdVar = this.h;
            ((InputStream) vvdVar.a).close();
            ((OutputStream) vvdVar.b).close();
        } catch (IOException unused) {
        }
        this.e = true;
        this.l.interrupt();
    }

    public final boolean e() {
        return this.c.b == 2;
    }

    public final tiu f(int i) throws tij {
        tim timVarG = g();
        if (timVarG == null || !timVarG.b()) {
            throw new tij("Invalid state - expected polo message");
        }
        tiu tiuVar = timVarG.a;
        int i2 = tiuVar.d;
        if (i == i2) {
            return tiuVar;
        }
        throw new tij("Unexpected message type: ".concat(sip.k(i2)));
    }
}

package defpackage;

import android.net.Uri;
import android.os.StrictMode;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slw implements smd {
    public final String a;
    public final uhp b;
    public final Executor c;
    public final tst d;
    public Object g;
    public boolean h;
    public final slf i;
    public final smg j;
    public final aafi l;
    public final skz e = new slv(this, 0);
    public final Object f = new Object();
    public final unx k = new unx();
    private final unx m = new unx();

    public slw(String str, uhp uhpVar, smg smgVar, Executor executor, aafi aafiVar, slf slfVar, tst tstVar) {
        new unx();
        this.g = null;
        this.a = str;
        this.b = sfy.D(uhpVar);
        this.j = smgVar;
        this.c = executor;
        this.l = aafiVar;
        this.i = slfVar;
        this.d = tstVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID.randomUUID().toString();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static uhp b(uhp uhpVar, Closeable closeable, Executor executor) {
        return sfy.N(uhpVar).a(new grz(closeable, uhpVar, 16), executor);
    }

    public static boolean d(IOException iOException) {
        return (iOException instanceof sjx) || (iOException.getCause() instanceof sjx);
    }

    private final Closeable j(Uri uri) {
        try {
            aafi aafiVar = this.l;
            skm skmVar = new skm(true, true);
            skmVar.a = true;
            return (Closeable) aafiVar.r(uri, skmVar);
        } catch (ske unused) {
            return null;
        }
    }

    @Override // defpackage.smd
    public final ufv a() {
        return new osv(this, 11);
    }

    public final Object c(Uri uri) throws IOException {
        InputStream inputStream;
        try {
            try {
                tql tqlVarJ = sss.j("Read " + this.a);
                try {
                    inputStream = (InputStream) this.l.r(uri, new skn(2));
                    try {
                        vvj vvjVarA = this.j.a(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        tqlVarJ.close();
                        return vvjVarA;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        tqlVarJ.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                aafi aafiVar = this.l;
                if (!aafiVar.u(uri)) {
                    return this.j.a;
                }
                inputStream = (InputStream) aafiVar.r(uri, new skn(2));
                try {
                    vvj vvjVarA2 = this.j.a(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return vvjVarA2;
                } finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                }
            }
        } catch (IOException e) {
            throw sik.B(this.l, uri, e, this.a);
        }
    }

    public final uhp e(uhp uhpVar) {
        uhp uhpVarB;
        slf slfVar = this.i;
        Integer num = (Integer) ((ttp) slfVar.f).a;
        if (num.intValue() < 0) {
            uhpVarB = uhl.a;
        } else {
            uhp uhpVar2 = this.b;
            ufw ufwVar = slfVar.c;
            ugk ugkVar = ugk.a;
            uhp uhpVarJ = ufn.j(uhpVar2, ufwVar, ugkVar);
            uhpVarB = sfy.P(uhpVar2, uhpVarJ).b(new sla(slfVar, uhpVar2, uhpVarJ, num, 0), ugkVar);
        }
        return ufn.j(uhpVarB, trc.c(new pap(this, uhpVar, 15, null)), ugk.a);
    }

    @Override // defpackage.smd
    public final String f() {
        return this.a;
    }

    public final Object g(Uri uri) throws IOException {
        Closeable closeableJ;
        synchronized (this.f) {
            Object obj = this.g;
            if (obj != null) {
                return obj;
            }
            try {
                closeableJ = j(uri);
            } catch (FileNotFoundException unused) {
                Object objC = c(uri);
                synchronized (this.f) {
                    if (this.h) {
                        objC = null;
                    } else {
                        this.g = objC;
                    }
                    if (objC != null) {
                        return objC;
                    }
                    closeableJ = j(uri);
                }
            }
            try {
                Object objC2 = c(uri);
                synchronized (this.f) {
                    if (closeableJ != null) {
                        this.g = objC2;
                        closeableJ.close();
                    }
                }
                return objC2;
            } catch (Throwable th) {
                if (closeableJ != null) {
                    try {
                        closeableJ.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // defpackage.smd
    public final uhp h(ufw ufwVar, Executor executor) {
        return this.k.e(trc.b(new pna(this, ufwVar, executor, 3)), this.c);
    }

    @Override // defpackage.smd
    public final uhp i() {
        synchronized (this.f) {
            Object obj = this.g;
            if (obj == null) {
                return sfy.D(this.m.e(trc.b(new osv(this, 12)), this.c));
            }
            return sfy.C(obj);
        }
    }
}

package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slk implements smd {
    public final String a;
    public final uhp b;
    public final Executor c;
    public final smg e;
    public final aafi g;
    private final tst h;
    public final skz d = new slv(this, 1);
    public final unx f = new unx();

    public slk(String str, uhp uhpVar, smg smgVar, Executor executor, aafi aafiVar, tst tstVar) {
        this.a = str;
        this.b = sfy.D(uhpVar);
        this.e = smgVar;
        this.c = executor;
        this.g = aafiVar;
        this.h = tstVar;
    }

    public static uhp b(uhp uhpVar, Closeable closeable) {
        return sfy.N(uhpVar).a(new grz(closeable, uhpVar, 15), ugk.a);
    }

    public static boolean g(IOException iOException) {
        return (iOException instanceof sjx) || (iOException.getCause() instanceof sjx);
    }

    @Override // defpackage.smd
    public final ufv a() {
        return new osv(this, 9);
    }

    public final uhp c(Uri uri, slj sljVar) {
        try {
            return sfy.C(e(uri));
        } catch (IOException e) {
            tst tstVar = this.h;
            return !tstVar.g() ? sfy.B(e) : g(e) ? sfy.B(e) : ufn.j(sljVar.a(e, (ulp) tstVar.c()), trc.c(new pap(this, uri, 14)), this.c);
        }
    }

    public final uhp d(uhp uhpVar) {
        return ufn.j(uhpVar, trc.c(new pbb(this, 19)), this.c);
    }

    public final vvj e(Uri uri) throws IOException {
        InputStream inputStream;
        try {
            try {
                tql tqlVarJ = sss.j("Read " + this.a);
                try {
                    inputStream = (InputStream) this.g.r(uri, new skn(2));
                    try {
                        vvj vvjVarA = this.e.a(inputStream);
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
                aafi aafiVar = this.g;
                if (!aafiVar.u(uri)) {
                    return this.e.a;
                }
                inputStream = (InputStream) aafiVar.r(uri, new skn(2));
                try {
                    vvj vvjVarA2 = this.e.a(inputStream);
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
            throw sik.B(this.g, uri, e, this.a);
        }
    }

    @Override // defpackage.smd
    public final String f() {
        return this.a;
    }

    @Override // defpackage.smd
    public final uhp h(ufw ufwVar, Executor executor) {
        return this.f.e(trc.b(new pna(this, ufwVar, executor, 2)), this.c);
    }

    @Override // defpackage.smd
    public final uhp i() {
        return sfy.D(sfy.G(trc.b(new osv(this, 10)), this.c));
    }
}

package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class xum implements ybt {
    public static final Logger t = Logger.getLogger(xum.class.getName());

    protected abstract xul c();

    @Override // defpackage.ybt
    public boolean p() {
        throw null;
    }

    protected abstract xzm q();

    @Override // defpackage.ybt
    public final void r() {
        xzm xzmVarQ;
        yby ybyVar;
        if (q().i || (ybyVar = (xzmVarQ = q()).b) == null || ybyVar.a() <= 0) {
            return;
        }
        xzmVarQ.b(false, true);
    }

    public final void s(int i) {
        xul xulVarC = c();
        synchronized (xulVarC.k) {
            xulVarC.n += i;
        }
    }

    @Override // defpackage.ybt
    public final void t() {
        xul xulVarC = c();
        xzi xziVar = xulVarC.m;
        xziVar.a = xulVarC;
        xulVarC.j = xziVar;
    }

    @Override // defpackage.ybt
    public final void u(int i) {
        xul xulVarC = c();
        xvy xvyVar = xulVarC.j;
        int i2 = yfl.a;
        xulVarC.e(new utl(xulVarC, i, 2, null));
    }

    @Override // defpackage.ybt
    public final void v(xqh xqhVar) {
        q().d = xqhVar;
    }

    @Override // defpackage.ybt
    public final void w(InputStream inputStream) throws IOException {
        int iA;
        try {
            if (!q().i) {
                xzm xzmVarQ = q();
                if (xzmVarQ.i) {
                    throw new IllegalStateException("Framer already closed");
                }
                xzmVarQ.j++;
                xzmVarQ.k++;
                xzmVarQ.l = 0L;
                ybs.c(xzmVarQ.h);
                xqh xqhVar = xzmVarQ.d;
                xqg xqgVar = xqf.a;
                try {
                    int iAvailable = inputStream.available();
                    int i = 0;
                    if (iAvailable != 0 && xqhVar != xqgVar) {
                        xzj xzjVar = new xzj(xzmVarQ);
                        try {
                            iA = xzm.a(inputStream, xzjVar);
                            xzjVar.close();
                            int i2 = xzmVarQ.a;
                            if (i2 >= 0 && iA > i2) {
                                throw new xtn(xtk.h.e(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iA), Integer.valueOf(xzmVarQ.a))));
                            }
                            xzmVarQ.c(xzjVar, true);
                        } catch (Throwable th) {
                            xzjVar.close();
                            throw th;
                        }
                    } else if (iAvailable != -1) {
                        xzmVarQ.l = iAvailable;
                        int i3 = xzmVarQ.a;
                        if (i3 >= 0 && iAvailable > i3) {
                            throw new xtn(xtk.h.e(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iAvailable), Integer.valueOf(xzmVarQ.a))));
                        }
                        ByteBuffer byteBuffer = xzmVarQ.f;
                        byteBuffer.clear();
                        byteBuffer.put((byte) 0).putInt(iAvailable);
                        xzmVarQ.c = iAvailable + 5;
                        xzmVarQ.d(byteBuffer.array(), 0, byteBuffer.position());
                        iA = xzm.a(inputStream, xzmVarQ.e);
                    } else {
                        xzj xzjVar2 = new xzj(xzmVarQ);
                        iA = xzm.a(inputStream, xzjVar2);
                        xzmVarQ.c(xzjVar2, false);
                    }
                    if (iAvailable != -1 && iA != iAvailable) {
                        throw new xtn(xtk.j.e(String.format("Message length inaccurate %s != %s", Integer.valueOf(iA), Integer.valueOf(iAvailable))));
                    }
                    ybs ybsVar = xzmVarQ.h;
                    ybs.c(ybsVar);
                    long j = xzmVarQ.l;
                    while (true) {
                        ykn[] yknVarArr = ybsVar.b;
                        if (i >= yknVarArr.length) {
                            break;
                        }
                        yknVarArr[i].c(j);
                        i++;
                    }
                    ybs.c(ybsVar);
                } catch (IOException e) {
                    throw new xtn(xtk.j.e("Failed to frame message").d(e));
                } catch (xtn e2) {
                    throw e2;
                } catch (RuntimeException e3) {
                    throw new xtn(xtk.j.e("Failed to frame message").d(e3));
                }
            }
        } finally {
            xxc.g(inputStream);
        }
    }
}

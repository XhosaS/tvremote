package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfy {
    public static final byte[] a = {42};
    public static final List b = yfm.p("*");
    public static final zfy c = new zfy();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final CountDownLatch e = new CountDownLatch(1);
    public byte[] f;
    public byte[] g;

    public final List a(String str) {
        List listAn = ylh.an(str, String.valueOf(new char[]{'.'}[0]));
        return yks.e(yfm.W(listAn), "") ? yfm.ak(listAn, ykn.j(listAn.size() - 1, 0)) : listAn;
    }

    public final void b() {
        ylf ylfVar;
        ylf ylfVar2;
        InputStream resourceAsStream;
        CountDownLatch countDownLatch;
        boolean z = false;
        while (true) {
            try {
                try {
                    try {
                        ylfVar = new ylf();
                        ylfVar2 = new ylf();
                        resourceAsStream = zfy.class.getResourceAsStream("publicsuffixes.gz");
                        break;
                    } catch (InterruptedIOException unused) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        zfo.b.k("Failed to read public suffix list", 5, e);
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                this.e.countDown();
                throw th;
            }
        }
        if (resourceAsStream == null) {
            countDownLatch = this.e;
        } else {
            zhi zhiVar = new zhi(new zgw(zhb.c(resourceAsStream)));
            try {
                ylfVar.a = zhiVar.F(zhiVar.f());
                ylfVar2.a = zhiVar.F(zhiVar.f());
                wef.v(zhiVar, null);
                synchronized (this) {
                    Object obj = ylfVar.a;
                    obj.getClass();
                    this.f = (byte[]) obj;
                    Object obj2 = ylfVar2.a;
                    obj2.getClass();
                    this.g = (byte[]) obj2;
                }
                countDownLatch = this.e;
            } finally {
            }
        }
        countDownLatch.countDown();
    }
}

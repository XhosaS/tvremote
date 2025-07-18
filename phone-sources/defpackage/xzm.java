package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xzm {
    public yby b;
    public int c;
    public final ybz g;
    public final ybs h;
    public boolean i;
    public int j;
    public long l;
    private final xzl m;
    public int a = -1;
    public xqh d = xqf.a;
    public final xzk e = new xzk(this);
    public final ByteBuffer f = ByteBuffer.allocate(5);
    public int k = -1;

    public xzm(xzl xzlVar, ybz ybzVar, ybs ybsVar) {
        this.m = xzlVar;
        this.g = ybzVar;
        this.h = ybsVar;
    }

    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        yeo yeoVar = (yeo) inputStream;
        vvj vvjVar = yeoVar.a;
        if (vvjVar != null) {
            int iL = vvjVar.l();
            yeoVar.a.g(outputStream);
            yeoVar.a = null;
            return iL;
        }
        ByteArrayInputStream byteArrayInputStream = yeoVar.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        vtp vtpVar = yer.a;
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i2 = (int) j;
                yeoVar.c = null;
                return i2;
            }
            outputStream.write(bArr, 0, i);
            j += i;
        }
    }

    public final void b(boolean z, boolean z2) {
        yby ybyVar = this.b;
        this.b = null;
        this.m.i(ybyVar, z, z2, this.j);
        this.j = 0;
    }

    public final void c(xzj xzjVar, boolean z) {
        List list = xzjVar.a;
        Iterator it = list.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((yby) it.next()).a();
        }
        int i = this.a;
        if (i >= 0 && iA > i) {
            throw new xtn(xtk.h.e(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iA), Integer.valueOf(this.a))));
        }
        ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(iA);
        yby ybyVarA = this.g.a(5);
        ybyVarA.d(byteBuffer.array(), 0, byteBuffer.position());
        if (iA == 0) {
            this.b = ybyVarA;
            return;
        }
        xzl xzlVar = this.m;
        xzlVar.i(ybyVarA, false, false, this.j - 1);
        this.j = 1;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            xzlVar.i((yby) list.get(i2), false, false, 0);
        }
        this.b = (yby) list.get(list.size() - 1);
        this.l = iA;
    }

    public final void d(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            yby ybyVar = this.b;
            if (ybyVar != null && ybyVar.b() == 0) {
                b(false, false);
            }
            if (this.b == null) {
                sij.x(this.c > 0, "knownLengthPendingAllocation reached 0");
                yby ybyVarA = this.g.a(this.c);
                this.b = ybyVarA;
                int i3 = this.c;
                this.c = i3 - Math.min(i3, ybyVarA.b());
            }
            int iMin = Math.min(i2, this.b.b());
            this.b.d(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }
}

package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ueb extends ugc {
    public static final /* synthetic */ int a = 0;
    private final List b;

    public ueb(InputStream inputStream, List list) {
        super(inputStream);
        this.b = list;
        ugg.a(inputStream != null, "Input was null", new Object[0]);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((uhr) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = this.in.read();
        if (i != -1) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((uhr) it.next()).a();
            }
        }
        return i;
    }

    @Override // defpackage.ugc, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.in.read(bArr);
        if (i != -1) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((uhr) it.next()).a();
            }
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.in.read(bArr, i, i2);
        if (i3 != -1) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((uhr) it.next()).a();
            }
        }
        return i3;
    }
}

package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sjn extends skj {
    public static final /* synthetic */ int a = 0;
    private final List b;

    public sjn(OutputStream outputStream, List list) {
        super(outputStream);
        this.b = list;
        sij.c(true, "Output was null", new Object[0]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((skw) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.out.write(i);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((skw) it.next()).a();
        }
    }

    @Override // defpackage.skj, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        for (skw skwVar : this.b) {
            int length = bArr.length;
            skwVar.a();
        }
    }

    @Override // defpackage.skj, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((skw) it.next()).a();
        }
    }
}

package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bel extends bfa {
    public static final /* synthetic */ int a = 0;
    private final List b;

    public bel(OutputStream outputStream, List list) {
        super(outputStream);
        this.b = list;
        tk.f(true, "Output was null", new Object[0]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((bfl) it.next()).close();
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
            ((bfl) it.next()).a();
        }
    }

    @Override // defpackage.bfa, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        for (bfl bflVar : this.b) {
            int length = bArr.length;
            bflVar.a();
        }
    }

    @Override // defpackage.bfa, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((bfl) it.next()).a();
        }
    }
}

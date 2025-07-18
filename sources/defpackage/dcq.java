package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcq {
    public Object a;
    public Object b;

    public dcq(byte[] bArr) {
    }

    public final void a(List list) {
        OutputStream outputStream = (OutputStream) biu.k(list);
        if (outputStream instanceof bey) {
            this.b = (bey) outputStream;
            this.a = (OutputStream) list.get(0);
        }
    }

    public final void b() throws IOException {
        if (this.b == null) {
            throw new bew("Cannot sync underlying stream");
        }
        ((OutputStream) this.a).flush();
        ((bey) this.b).a.getFD().sync();
    }

    public dcq() {
        this(dct.N);
    }

    public dcq(dcr dcrVar) {
        this.b = new Vector();
        this.a = dcrVar;
    }
}

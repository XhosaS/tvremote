package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ufd {
    private OutputStream a;
    private ufw b;

    public final void a(List list) {
        Closeable closeable = (OutputStream) zag.e(list);
        if (closeable instanceof ufw) {
            this.b = (ufw) closeable;
            this.a = (OutputStream) list.get(0);
        }
    }

    public final void b() throws IOException {
        if (this.b == null) {
            throw new ufx("Cannot sync underlying stream");
        }
        this.a.flush();
        this.b.b();
    }
}

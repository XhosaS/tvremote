package defpackage;

import android.content.Context;
import com.google.common.collect.Iterables;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uri {
    private static uri c;
    public Object a;
    public Object b;

    public uri() {
    }

    public static synchronized uri b() {
        if (c == null) {
            c = new uri(null);
        }
        return c;
    }

    public final boolean a(Context context) {
        if (this.b == null) {
            this.b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        ((Boolean) this.b).booleanValue();
        return ((Boolean) this.b).booleanValue();
    }

    public final void c(List list) {
        Closeable closeable = (OutputStream) Iterables.getLast(list);
        if (closeable instanceof skd) {
            this.a = (skd) closeable;
            this.b = (OutputStream) list.get(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, skd] */
    public final void d() throws IOException {
        if (this.a == null) {
            throw new ske("Cannot sync underlying stream");
        }
        ((OutputStream) this.b).flush();
        this.a.b();
    }

    private uri(byte[] bArr) {
        this.b = null;
        this.a = null;
    }
}

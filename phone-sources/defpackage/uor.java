package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uor implements Closeable {
    public final URL a;
    public volatile Future b;
    public onz c;

    private uor(URL url) {
        this.a = url;
    }

    public static uor a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new uor(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: ".concat(String.valueOf(str)));
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.cancel(true);
    }
}

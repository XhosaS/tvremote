package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import com.google.android.tv.remote.service.AudioStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface jnr {
    IBinder a(String str);

    ParcelFileDescriptor b(Uri uri);

    void c(jno jnoVar);

    void d();

    void e(String str);

    void f(String str);

    void g(Bundle bundle);

    void h(jno jnoVar);

    void i(String str);

    boolean j(AudioStream audioStream);

    boolean k();

    boolean l();

    boolean m();

    boolean n();
}

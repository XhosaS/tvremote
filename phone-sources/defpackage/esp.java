package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface esp {
    int a();

    int b(MediaCodec.BufferInfo bufferInfo);

    MediaFormat c();

    ByteBuffer e(int i);

    ByteBuffer f(int i);

    void g();

    void h();

    void i();

    void j(int i, long j);

    void k(Surface surface);

    void l(Bundle bundle);

    void m(int i);

    void n(fbj fbjVar, Handler handler);

    void o(int i, int i2, long j, int i3);

    void p(int i, ehg ehgVar, long j, int i2);

    void q(int i);

    void r(pku pkuVar);
}

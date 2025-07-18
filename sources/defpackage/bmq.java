package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.tv.remote.service.AutoValue_AudioStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmq {
    public ParcelFileDescriptor a;
    public bod b;
    private int c;
    private int d;
    private int e;
    private int f;
    private byte g;

    public final bmr a() {
        if (this.g == 15) {
            return new AutoValue_AudioStream(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" channelCount");
        }
        if ((this.g & 2) == 0) {
            sb.append(" bitsPerSample");
        }
        if ((this.g & 4) == 0) {
            sb.append(" sampleRate");
        }
        if ((this.g & 8) == 0) {
            sb.append(" interactionModel");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.d = i;
        this.g = (byte) (this.g | 2);
    }

    public final void c(int i) {
        this.c = i;
        this.g = (byte) (this.g | 1);
    }

    public final void d(int i) {
        this.f = i;
        this.g = (byte) (this.g | 8);
    }

    public final void e(int i) {
        this.e = i;
        this.g = (byte) (this.g | 4);
    }
}

package defpackage;

import android.os.Trace;
import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zyg implements AutoCloseable {
    private final /* synthetic */ int a;

    public zyg(String str, int i, byte[] bArr) {
        this.a = i;
        Trace.beginSection(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.a != 0) {
            Trace.endSection();
        } else {
            Trace.endSection();
        }
    }

    public zyg(String str, int i) {
        this.a = i;
        Trace.beginSection(str.length() > 127 ? String.valueOf(str.substring(0, R.styleable.AppCompatTheme_windowMinWidthMajor)).concat("...") : str);
    }
}

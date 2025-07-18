package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class zlh extends InputStream implements InputStreamRetargetInterface {
    protected final InputStream c;
    public final int d;

    public zlh(InputStream inputStream, int i) {
        this.c = inputStream;
        this.d = i;
    }

    protected final void b() {
        InputStream inputStream = this.c;
        if (inputStream instanceof zle) {
            ((zle) inputStream).a(true);
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

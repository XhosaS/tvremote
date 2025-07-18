package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htm extends hvh {
    final int a;
    public Bitmap b;
    private final Handler c;
    private final long d;

    public htm(Handler handler, int i, long j) {
        this.c = handler;
        this.a = i;
        this.d = j;
    }

    @Override // defpackage.hvm
    public final void a(Drawable drawable) {
        this.b = null;
    }

    @Override // defpackage.hvm
    public final /* bridge */ /* synthetic */ void b(Object obj, hvv hvvVar) {
        this.b = (Bitmap) obj;
        Handler handler = this.c;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.d);
    }
}

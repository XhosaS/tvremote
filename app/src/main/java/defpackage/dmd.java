package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
class dmd extends dow {
    final int a;
    public Bitmap b;
    private final Handler d;
    private final long e;

    public dmd(Handler handler, int i, long j) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.d = handler;
        this.a = i;
        this.e = j;
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void b(Object obj, dpm dpmVar) {
        this.b = (Bitmap) obj;
        Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.e);
    }

    @Override // defpackage.dpf
    public final void c(Drawable drawable) {
        this.b = null;
    }
}

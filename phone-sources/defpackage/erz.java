package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erz extends ehm {
    public Bitmap a;
    final /* synthetic */ erv b;

    public erz() {
        throw null;
    }

    @Override // defpackage.ehm, defpackage.ehe
    public final void clear() {
        this.a = null;
        super.clear();
    }

    @Override // defpackage.ehm
    public final void release() {
        this.b.o(this);
    }

    public erz(erv ervVar) {
        this.b = ervVar;
    }
}

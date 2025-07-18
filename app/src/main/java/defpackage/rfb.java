package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rfb extends ContentObserver {
    public rfb() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        rgi.b.incrementAndGet();
    }
}

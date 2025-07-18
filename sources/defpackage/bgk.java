package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgk extends ContentObserver {
    final /* synthetic */ bgt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgk(bgt bgtVar, Handler handler) {
        super(handler);
        this.a = bgtVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.i();
    }
}

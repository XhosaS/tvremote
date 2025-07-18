package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
class arg extends ContentObserver {
    final /* synthetic */ ari a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arg(ari ariVar, Handler handler) {
        super(handler);
        this.a = ariVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.a();
    }
}

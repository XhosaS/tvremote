package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ceb extends ContentObserver {
    final /* synthetic */ yrz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceb(yrz yrzVar, Handler handler) {
        super(handler);
        this.a = yrzVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.b(ygi.a);
    }
}

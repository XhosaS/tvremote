package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class elo extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    final /* synthetic */ elq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elo(elq elqVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = elqVar;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        elq elqVar = this.c;
        elqVar.a(elm.f(elqVar.a, elqVar.g, elqVar.i));
    }
}

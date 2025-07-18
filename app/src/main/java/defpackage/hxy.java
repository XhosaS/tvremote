package defpackage;

import android.database.ContentObserver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxy extends ContentObserver {
    final /* synthetic */ hxz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxy(hxz hxzVar) {
        super(null);
        this.a = hxzVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        super.onChange(z, uri);
        hxz hxzVar = this.a;
        ahal.e(hxzVar.c, null, 0, new hxx(hxzVar, null), 3);
    }
}

package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class daf extends ContentObserver {
    final /* synthetic */ dah a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daf(dah dahVar) {
        super(new Handler());
        this.a = dahVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.onContentChanged();
    }
}

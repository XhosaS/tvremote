package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rwk extends ContentObserver {
    final /* synthetic */ rwl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwk(rwl rwlVar) {
        super(null);
        this.a = rwlVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.c();
    }
}

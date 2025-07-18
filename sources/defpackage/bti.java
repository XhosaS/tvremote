package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bti extends ContentObserver {
    final /* synthetic */ buf a;
    final /* synthetic */ btj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bti(btj btjVar, buf bufVar) {
        super(null);
        this.a = bufVar;
        this.b = btjVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.b.a(atg.o(this.a));
    }
}

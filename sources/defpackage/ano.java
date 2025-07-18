package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ano extends ContentObserver {
    final /* synthetic */ anq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ano(anq anqVar) {
        super(null);
        this.a = anqVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.a.set(true);
    }
}

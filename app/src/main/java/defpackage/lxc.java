package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
class lxc extends ContentObserver {
    final /* synthetic */ lxe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxc(lxe lxeVar) {
        super(null);
        this.a = lxeVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.a.set(true);
    }
}

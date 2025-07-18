package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class opg extends ContentObserver {
    final /* synthetic */ opj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opg(opj opjVar) {
        super(null);
        this.a = opjVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.a.set(true);
    }
}

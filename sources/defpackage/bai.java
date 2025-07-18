package defpackage;

import android.database.ContentObserver;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bai extends ContentObserver {
    final /* synthetic */ baj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bai(baj bajVar) {
        super(null);
        this.a = bajVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        baj bajVar = this.a;
        synchronized (bajVar.f) {
            bajVar.g = null;
            bba.e();
        }
        synchronized (bajVar) {
            Iterator it = bajVar.h.iterator();
            while (it.hasNext()) {
                ((bak) it.next()).a();
            }
        }
    }
}

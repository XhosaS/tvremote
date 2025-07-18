package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sle extends BroadcastReceiver {
    public final uic a = new uic();
    public final Set b;
    public final Object c;

    public sle(Set set) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new Object();
        hashSet.addAll(set);
        a();
    }

    private final void a() {
        synchronized (this.c) {
            if (this.b.isEmpty()) {
                this.a.b((Object) null);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String strE = sij.E(intent.getPackage());
        synchronized (this.c) {
            this.b.remove(strE);
        }
        a();
    }
}

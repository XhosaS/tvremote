package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyc {
    public final IntentFilter a;
    final BroadcastReceiver b;
    public boolean c;
    boolean d;

    public dyc(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.a = intentFilter;
        this.b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.b);
        sb.append(" filter=");
        sb.append(this.a);
        if (this.d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}

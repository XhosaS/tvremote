package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpf extends BroadcastReceiver {
    final /* synthetic */ fph a;

    public fpf(fph fphVar) {
        this.a = fphVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
            ((dxc) this.a.d.a).n(keyEvent);
        }
    }
}

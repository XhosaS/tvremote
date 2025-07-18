package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lit extends BroadcastReceiver {
    private final List a = new ArrayList();

    public lit(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
        intentFilter.setPriority(100);
        czi.f(context, this, intentFilter, 4);
    }

    private final synchronized eu d() {
        for (eu euVar : this.a) {
            if (((en) euVar.c).a.isActive()) {
                return euVar;
            }
        }
        return null;
    }

    public final synchronized void a(eu euVar) {
        List list = this.a;
        if (list.isEmpty() || list.get(0) != euVar) {
            list.remove(euVar);
            list.add(0, euVar);
        }
    }

    public final synchronized void b(eu euVar) {
        this.a.remove(euVar);
    }

    public final synchronized void c(eu euVar) {
        a(euVar);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        eu euVarD = d();
        if (euVarD != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent.getAction() != 0) {
                int keyCode = keyEvent.getKeyCode();
                Object obj = euVarD.b;
                if (keyCode != 85) {
                    if (keyCode == 86) {
                        ((eu) obj).m().c();
                        return;
                    }
                    if (keyCode == 126) {
                        ((eu) obj).m().b();
                        return;
                    } else if (keyCode != 127) {
                        krd.f("Unrecognized event: ".concat(String.valueOf(String.valueOf(keyEvent))));
                        return;
                    } else {
                        ((eu) obj).m().a();
                        return;
                    }
                }
                eu euVar = (eu) obj;
                ey eyVarN = euVar.n();
                if (eyVarN != null) {
                    int i = eyVarN.a;
                    if (i == 2) {
                        euVar.m().b();
                    } else {
                        if (i != 3) {
                            return;
                        }
                        euVar.m().a();
                    }
                }
            }
        }
    }
}

package defpackage;

import android.content.Intent;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mjq extends em {
    final /* synthetic */ mjr e;

    public mjq(mjr mjrVar) {
        this.e = mjrVar;
    }

    @Override // defpackage.em
    public final void b() {
        this.e.c.q();
    }

    @Override // defpackage.em
    public final void c() {
        this.e.c.r();
    }

    @Override // defpackage.em
    public final void e(long j) {
        krd.e("onSeekTo() called");
        mjw mjwVar = this.e.c.d;
        if (mjwVar == null) {
            krd.c("No active remote!");
        } else {
            String str = mjwVar.c().a;
            mjwVar.y((int) j);
        }
    }

    @Override // defpackage.em
    public final boolean i(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null || keyEvent.getAction() != 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 126) {
            c();
            return true;
        }
        if (keyCode != 127) {
            return false;
        }
        b();
        return true;
    }

    @Override // defpackage.em
    public final void k(String str) {
        if ("BACK_30S".equals(str)) {
            this.e.c.u();
        } else if ("DISCONNECT".equals(str)) {
            this.e.c.o();
        }
    }
}

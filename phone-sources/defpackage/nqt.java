package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nqt extends em {
    final /* synthetic */ nqv e;

    public nqt(nqv nqvVar) {
        this.e = nqvVar;
    }

    private final void l(long j) {
        nqj nqjVar = this.e.j;
        if (nqjVar == null) {
            return;
        }
        m(Math.min(nqjVar.d(), Math.max(0L, nqjVar.c() + j)));
    }

    private final void m(long j) {
        nqj nqjVar = this.e.j;
        if (nqjVar == null) {
            return;
        }
        nqjVar.F(new nlm(j));
    }

    @Override // defpackage.em
    public final void b() {
        nsf nsfVar = nqv.a;
        nsf.e();
        nqj nqjVar = this.e.j;
        if (nqjVar != null) {
            nqjVar.n();
        }
    }

    @Override // defpackage.em
    public final void c() {
        nsf nsfVar = nqv.a;
        nsf.e();
        nqj nqjVar = this.e.j;
        if (nqjVar != null) {
            nqjVar.n();
        }
    }

    @Override // defpackage.em
    public final void e(long j) {
        nsf nsfVar = nqv.a;
        nsf.e();
        m(j);
    }

    @Override // defpackage.em
    public final void f() {
        nsf nsfVar = nqv.a;
        nsf.e();
        nqj nqjVar = this.e.j;
        if (nqjVar != null) {
            nqjVar.C();
        }
    }

    @Override // defpackage.em
    public final void g() {
        nsf nsfVar = nqv.a;
        nsf.e();
        nqj nqjVar = this.e.j;
        if (nqjVar != null) {
            nqjVar.D();
        }
    }

    @Override // defpackage.em
    public final boolean i(Intent intent) {
        nqj nqjVar;
        nsf nsfVar = nqv.a;
        nsf.e();
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (nqjVar = this.e.j) == null) {
            return true;
        }
        nqjVar.n();
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.em
    public final void k(String str) {
        nsf nsfVar = nqv.a;
        nsf.e();
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    l(-this.e.f.d);
                    return;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    nnm nnmVar = this.e.e;
                    if (nnmVar != null) {
                        nnmVar.d(true);
                        return;
                    }
                    return;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    nnm nnmVar2 = this.e.e;
                    if (nnmVar2 != null) {
                        nnmVar2.d(false);
                        return;
                    }
                    return;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    l(this.e.f.d);
                    return;
                }
                break;
        }
        Intent intent = new Intent(str);
        nqv nqvVar = this.e;
        intent.setComponent(nqvVar.g);
        int i = Build.VERSION.SDK_INT;
        Context context = nqvVar.b;
        if (i < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }
}

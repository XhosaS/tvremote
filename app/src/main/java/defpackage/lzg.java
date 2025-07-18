package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
class lzg implements gvj {
    final /* synthetic */ lzk a;
    final /* synthetic */ int b;
    final /* synthetic */ lzr c;

    public lzg(lzk lzkVar, lzr lzrVar, int i) {
        this.c = lzrVar;
        this.b = i;
        this.a = lzkVar;
    }

    @Override // defpackage.gvj
    public final void a(gvw gvwVar) {
        this.a.o(gvwVar, this.c, this.b);
    }

    @Override // defpackage.gvj
    public final void b(Intent intent) {
        ((zdv) ((zdv) lzl.a.d()).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$4", "onRecoverableError", 444, "AssistantSettingsServicePeer.java")).u("Check auth getting recoverable error. Will return consent not possible, instead of launching the intent.");
        try {
            this.a.n(this.c, this.b);
        } catch (RemoteException e) {
            ((zdv) ((zdv) ((zdv) lzl.a.c()).p(e)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$4", "onRecoverableError", (char) 450, "AssistantSettingsServicePeer.java")).u("Callback Failed.");
        }
    }

    @Override // defpackage.gvj
    public final void c() {
        zdy zdyVar = lzl.a;
        lzf lzfVar = new lzf(this, this.c, this.b);
        try {
            lzl lzlVar = this.a.b;
            iax iaxVar = lzlVar.d;
            Account accountC = lzlVar.h.c();
            yme ymeVarD = iaxVar.d(kcx.b);
            ymd ymdVar = new ymd();
            ymdVar.B(ymeVarD);
            if ((ymdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ymdVar.y();
            }
            yme ymeVar = (yme) ymdVar.b;
            ymeVar.b |= 128;
            ymeVar.h = true;
            iaxVar.m(accountC, (yme) ymdVar.v(), lzfVar, "AssistantSettings");
        } catch (PackageManager.NameNotFoundException e) {
            ((zdv) ((zdv) ((zdv) lzl.a.c()).p(e)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$4", "onSuccess", (char) 502, "AssistantSettingsServicePeer.java")).u("Callback Failed.");
            try {
                this.a.n(this.c, this.b);
            } catch (RemoteException unused) {
                ((zdv) ((zdv) ((zdv) lzl.a.c()).p(e)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$4", "onSuccess", (char) 506, "AssistantSettingsServicePeer.java")).u("Callback Failed.");
            }
        }
    }
}

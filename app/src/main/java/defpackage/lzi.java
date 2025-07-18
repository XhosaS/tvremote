package defpackage;

import android.accounts.Account;
import android.os.RemoteException;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
class lzi implements zxe {
    final /* synthetic */ Account a;
    final /* synthetic */ lzk b;
    final /* synthetic */ lzo c;

    public lzi(lzk lzkVar, Account account, lzo lzoVar) {
        this.a = account;
        this.c = lzoVar;
        this.b = lzkVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) lzl.a.c()).p(th)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$6", "onFailure", (char) 664, "AssistantSettingsServicePeer.java")).u("Error receiving UpdateSettingsUiResponse.");
        try {
            this.c.e("", 2);
        } catch (RemoteException e) {
            ((zdv) ((zdv) ((zdv) lzl.a.d()).p(e)).q("com/google/android/katniss/setting/AssistantSettingsServicePeer$1$6", "onFailure", (char) 668, "AssistantSettingsServicePeer.java")).u("Error sending error back to client");
        }
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Optional) obj).isEmpty()) {
            return;
        }
        lzk lzkVar = this.b;
        Account account = this.a;
        lzo lzoVar = this.c;
        yme ymeVar = yme.a;
        ymd ymdVar = new ymd();
        if ((ymdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymdVar.y();
        }
        yme ymeVar2 = (yme) ymdVar.b;
        ymeVar2.b |= 512;
        ymeVar2.i = true;
        lzkVar.b.d.m(account, (yme) ymdVar.v(), new lzj(lzoVar), "AssistantSettings");
    }
}

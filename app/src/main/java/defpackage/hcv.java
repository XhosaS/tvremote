package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcv implements hcq {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/providers/slice/AssistantBroadcastDataHelperImpl");
    public final iax b;
    public final ContentResolver c;
    public final ahbt d;
    public final fsv e;
    public hcx f;
    private final gtu g;

    public hcv(iax iaxVar, ContentResolver contentResolver, ahbt ahbtVar, fsv fsvVar, gtu gtuVar) {
        iaxVar.getClass();
        ahbtVar.getClass();
        gtuVar.getClass();
        this.b = iaxVar;
        this.c = contentResolver;
        this.d = ahbtVar;
        this.e = fsvVar;
        this.g = gtuVar;
    }

    @Override // defpackage.hcq
    public final hcx a() {
        return this.f;
    }

    @Override // defpackage.hcq
    public final void b() {
        this.f = null;
    }

    @Override // defpackage.hcq
    public final void c(boolean z) {
        Account accountC = this.g.c();
        if (accountC == null) {
            return;
        }
        ahal.e(this.d, null, 0, new hcs(this, accountC, z, null), 3);
    }

    @Override // defpackage.hcq
    public final void d() {
        Account accountC = this.g.c();
        hcu hcuVar = new hcu(this, accountC);
        yme ymeVar = yme.a;
        ymd ymdVar = new ymd();
        if ((ymdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ymdVar.y();
        }
        iax iaxVar = this.b;
        yme ymeVar2 = (yme) ymdVar.b;
        ymeVar2.d |= 32;
        ymeVar2.m = true;
        abxd abxdVarV = ymdVar.v();
        abxdVarV.getClass();
        iaxVar.m(accountC, (yme) abxdVarV, hcuVar, "BroadcastDataHelper");
        this.f = new hcx(true);
    }
}

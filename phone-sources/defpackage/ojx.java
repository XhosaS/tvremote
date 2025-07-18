package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ojx extends oju {
    final /* synthetic */ kwy a;

    public ojx(kwy kwyVar) {
        this.a = kwyVar;
    }

    @Override // defpackage.oju
    public final void b(Status status, okc okcVar) {
        if (!status.b()) {
            ocv.aS(status, null, this.a);
            return;
        }
        int i = okcVar.c;
        int i2 = okb.a;
        int i3 = 1;
        if (i != 1) {
            i3 = 2;
            if (i != 2) {
                i3 = i != 3 ? 0 : 3;
            }
        }
        ocv.aS(status, new DeviceContactsSyncSetting(i3, i3 == 3 ? new Account(okcVar.a, "com.google") : null), this.a);
    }
}

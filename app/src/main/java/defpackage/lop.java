package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;

/* compiled from: PG */
/* loaded from: classes.dex */
class lop extends lof {
    final /* synthetic */ lvj a;

    public lop(lvj lvjVar) {
        this.a = lvjVar;
    }

    @Override // defpackage.lof, defpackage.loi
    public final void d(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
        if (!status.c()) {
            kid.a(status, null, this.a);
            return;
        }
        int i = backupAndSyncOptInState.c;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = i != 3 ? 0 : 3;
            }
        }
        kid.a(status, new DeviceContactsSyncSetting(i2, i2 == 3 ? new Account(backupAndSyncOptInState.a, "com.google") : null), this.a);
    }
}

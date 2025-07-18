package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idz {
    public final void a(iax iaxVar, int i, Account account, boolean z, String str, zxe zxeVar) {
        iaxVar.getClass();
        if (i == 0) {
            throw null;
        }
        account.getClass();
        zdy zdyVar = iep.b;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/setup/AssistantDataSharingConsentActivityPeer$Companion", "updateDscBitToAssistantSettings", 833, "AssistantDataSharingConsentActivityPeer.kt")).F("#updateDscBitToAssistantSettings(dsc=%s, account type=%s)", i != 1 ? i != 2 ? i != 3 ? "DATA_SHARING_CONSENT_DENIED_FROM_OOBE" : "DATA_SHARING_CONSENT_DENIED" : "DATA_SHARING_CONSENT_GRANTED" : "UNKNOWN_DATA_SHARING_CONSENT", account.type);
        if (str == null || str.length() == 0) {
            ((zdv) zdyVar.c().q("com/google/android/apps/tvsearch/setup/AssistantDataSharingConsentActivityPeer$Companion", "updateDscBitToAssistantSettings", 839, "AssistantDataSharingConsentActivityPeer.kt")).u("device id is empty.");
            return;
        }
        ymg ymgVarA = z ? ird.a(i, true, str) : ird.a(i, false, null);
        idy idyVar = new idy(zxeVar);
        ymgVarA.getClass();
        iaxVar.o(account, ymgVarA, idyVar, "AssistantDscActivity");
    }
}

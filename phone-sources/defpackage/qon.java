package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qon implements qol {
    public static final tvn a = tvn.n("GnpSdk");
    public final Context b;

    public qon(Context context) {
        this.b = context;
    }

    public final Set a() throws Exception {
        Context context = this.b;
        qtl.C(context, "android.permission.GET_ACCOUNTS");
        a.l().s("Try to retrieve accounts list from Accounts ContentProvider.");
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.getClass();
        ContentProviderClient contentProviderClientAcquireContentProviderClient = contentResolver.acquireContentProviderClient("com.google.android.gms.auth.accounts");
        try {
            if (contentProviderClientAcquireContentProviderClient == null) {
                throw new qok();
            }
            try {
                Set setAq = null;
                Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("get_accounts", "com.google", null);
                if (bundleCall == null) {
                    throw new IllegalStateException("Received null bundle when fetching device accounts via GMS Core.");
                }
                if (ctk.b()) {
                    Account[] accountArr = (Account[]) bundleCall.getParcelableArray("accounts", Account.class);
                    if (accountArr != null) {
                        setAq = yfm.aZ(accountArr);
                    }
                } else {
                    Parcelable[] parcelableArray = bundleCall.getParcelableArray("accounts");
                    if (parcelableArray != null) {
                        ArrayList arrayList = new ArrayList(parcelableArray.length);
                        for (Parcelable parcelable : parcelableArray) {
                            parcelable.getClass();
                            arrayList.add((Account) parcelable);
                        }
                        setAq = yfm.aq(arrayList);
                    }
                }
                if (setAq == null) {
                    setAq = yhd.a;
                }
                return setAq;
            } catch (Exception e) {
                throw new qok(e);
            }
        } finally {
            contentProviderClientAcquireContentProviderClient.close();
        }
    }
}

package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.geller.portable.callbacks.GellerStorageOperationsCallback;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class onw implements GellerStorageOperationsCallback {
    public static final zdy a = zdy.h("com/google/android/libraries/geller/portable/GellerStorageOperationsCallbackImpl");
    public final Geller b;
    private final zyg c;

    public onw(Geller geller, zyg zygVar) {
        this.b = geller;
        this.c = zygVar;
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerStorageOperationsCallback
    public final void onDeletion(final String str, final byte[] bArr) {
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/geller/portable/GellerStorageOperationsCallbackImpl", "onDeletion", 34, "GellerStorageOperationsCallbackImpl.java")).u("Scheduling deletion propagation for Geller data.");
        try {
            this.c.submit(wyo.h(new Runnable() { // from class: onv
                @Override // java.lang.Runnable
                public final void run() {
                    ((zdv) ((zdv) onw.a.b()).q("com/google/android/libraries/geller/portable/GellerStorageOperationsCallbackImpl", "performDeletionPropagation", 49, "GellerStorageOperationsCallbackImpl.java")).u("Performing deletion propagation for Geller data.");
                    String str2 = str;
                    byte[] bArr2 = bArr;
                    Geller geller = this.a.b;
                    try {
                        geller.nativePropagateDeletion(geller.a(), geller.e.a(str2), bArr2);
                    } catch (GellerException e) {
                        ((zdv) ((zdv) ((zdv) Geller.a.d()).p(e)).q("com/google/android/libraries/geller/portable/Geller", "propagateDeletion", (char) 1786, "Geller.java")).u("propagateDeletion call failed.");
                    }
                    GellerDatabase gellerDatabaseB = geller.e.b(str2);
                    if (gellerDatabaseB == null) {
                        ((zdv) ((zdv) Geller.a.d()).q("com/google/android/libraries/geller/portable/Geller", "propagateDeletion", 1791, "Geller.java")).u("The GellerDatabase is null, skipping setting DELETION_PROCESSED status.");
                    } else {
                        gellerDatabaseB.setDeletionProcessed(bArr2);
                    }
                }
            }));
        } catch (RejectedExecutionException e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/geller/portable/GellerStorageOperationsCallbackImpl", "onDeletion", '*', "GellerStorageOperationsCallbackImpl.java")).u("Failed to schedule deletion propagation task.");
        }
    }
}

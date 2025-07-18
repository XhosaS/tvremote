package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.home.auth.AuthRecoveryActivity;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oul implements Runnable {
    final /* synthetic */ oum a;
    private final oui b;
    private final ouj c;
    private final Account d;
    private int e;

    public oul(oum oumVar, oui ouiVar, ouj oujVar, Account account) {
        this.a = oumVar;
        this.b = ouiVar;
        this.c = oujVar;
        this.d = account;
    }

    private final void a() {
        aeqv aeqvVar = aeqv.a;
        int iA = (int) aeqvVar.eV().a();
        long jC = aeqvVar.eV().c();
        if (this.e >= iA) {
            ((zdv) oum.a.d().q("com/google/android/libraries/home/auth/AuthServiceRequestRunnerImpl$TokenFetchRunnable", "retry", 193, "AuthServiceRequestRunnerImpl.kt")).v("Failed to get auth token, giving up after %d attempts", this.e);
            this.c.a(this.b, "Failed to get auth token");
        } else {
            long jA = paj.a(jC * (1 << r0));
            ((zdv) oum.a.b().q("com/google/android/libraries/home/auth/AuthServiceRequestRunnerImpl$TokenFetchRunnable", "retry", 189, "AuthServiceRequestRunnerImpl.kt")).z("Failed to get auth token, retrying %d of %d", this.e, iA);
            this.a.c.schedule(this, jA, TimeUnit.MILLISECONDS).getClass();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        oui ouiVar = this.b;
        ouiVar.getClass().getSimpleName();
        this.e++;
        try {
            String strB = ouiVar.b();
            String strA = strB == null ? null : this.a.e.a(this.d, strB);
            if (strA == null) {
                this.c.a(ouiVar, "Null auth token");
            } else {
                ouiVar.e(strA);
                this.c.b(ouiVar);
            }
        } catch (UserRecoverableAuthException e) {
            oum oumVar = this.a;
            if (oumVar.d) {
                this.c.a(this.b, "User cancelled recovery flow (UserRecoverableAuthException)");
                return;
            }
            zdy zdyVar = oum.a;
            ((zdv) ((zdv) zdyVar.d()).p(e).q("com/google/android/libraries/home/auth/AuthServiceRequestRunnerImpl$TokenFetchRunnable", "handleUserRecoverableAuthException", ModuleDescriptor.MODULE_VERSION, "AuthServiceRequestRunnerImpl.kt")).u("Could not get token but may be recovered by user.");
            oug ougVar = oumVar.b;
            if (e.a() == null) {
                ((zdv) ((zdv) zdyVar.d()).p(e).q("com/google/android/libraries/home/auth/AuthServiceRequestRunnerImpl$TokenFetchRunnable", "handleUserRecoverableAuthException", 166, "AuthServiceRequestRunnerImpl.kt")).u("Failed to start auth recovery (malformed exception?), retrying");
            } else {
                Context context = ougVar.a;
                Intent intent = new Intent(context, (Class<?>) AuthRecoveryActivity.class);
                intent.putExtra("userRecoveryIntent", e.a());
                intent.addFlags(268435456);
                context.startActivity(intent);
                ouh ouhVar = oumVar.f;
                ouhVar.b = new CountDownLatch(1);
                while (true) {
                    long jB = aeqv.a.eV().b();
                    ((zdv) ouh.a.d().q("com/google/android/libraries/home/auth/AuthRecoveryWaiterImpl", "await", 21, "AuthRecoveryWaiterImpl.kt")).w("Waiting %d seconds for auth recovery...", jB);
                    try {
                        countDownLatch = ouhVar.b;
                    } catch (InterruptedException e2) {
                        ((zdv) ((zdv) ouh.a.c()).p(e2).q("com/google/android/libraries/home/auth/AuthRecoveryWaiterImpl", "await", 27, "AuthRecoveryWaiterImpl.kt")).u("Wait for auth recovery interrupted.");
                    }
                    if (countDownLatch != null && countDownLatch.await(jB, TimeUnit.SECONDS)) {
                        break;
                    }
                }
                ((zdv) ((zdv) oum.a.d()).p(e).q("com/google/android/libraries/home/auth/AuthServiceRequestRunnerImpl$TokenFetchRunnable", "handleUserRecoverableAuthException", 161, "AuthServiceRequestRunnerImpl.kt")).u("Auth recovery wait complete, retrying");
            }
            a();
        } catch (IOException e3) {
            ((zdv) ((zdv) oum.a.d()).p(e3).q("com/google/android/libraries/home/auth/AuthServiceRequestRunnerImpl$TokenFetchRunnable", "handleIOException", 138, "AuthServiceRequestRunnerImpl.kt")).u("Could not get token due to network or server error");
            a();
        } catch (jwj e4) {
            ((zdv) ((zdv) oum.a.d()).p(e4).q("com/google/android/libraries/home/auth/AuthServiceRequestRunnerImpl$TokenFetchRunnable", "handleGoogleAuthException", 176, "AuthServiceRequestRunnerImpl.kt")).u("Could not get token, unrecoverable error.");
            this.c.a(this.b, "Failed to get auth token (GoogleAuthException)");
        }
    }
}

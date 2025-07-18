package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ldx extends AsyncTask {
    public final Activity a;
    public final Account b;
    public final ldu c;
    public final boolean d;
    final /* synthetic */ ldy e;
    private Intent f;
    private Exception g;

    public ldx(ldy ldyVar, Activity activity, Account account, ldu lduVar, boolean z) {
        this.e = ldyVar;
        this.a = activity;
        this.b = account;
        this.c = lduVar;
        this.d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.google.android.gms.auth.UserRecoverableAuthException] */
    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Intent intent;
        synchronized (this) {
            ldy ldyVar = this.e;
            Account account = this.b;
            String strY = ldyVar.y(account);
            if (strY != null) {
                return strY;
            }
            try {
                try {
                    try {
                        Context context = ldyVar.g;
                        TokenData tokenDataB = new nim(context).b(context, account, ((xlo) ldyVar.h.b()).g());
                        String str = tokenDataB.b;
                        if (str != null) {
                            ldyVar.A(account, tokenDataB);
                            return str;
                        }
                    } catch (UserRecoverableAuthException e) {
                        e = e;
                        if (this.a != null) {
                            Intent intent2 = e.b;
                            if (intent2 == null) {
                                int iOrdinal = e.c.ordinal();
                                if (iOrdinal == 0) {
                                    Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
                                } else if (iOrdinal == 1) {
                                    Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
                                }
                                intent = null;
                            } else {
                                intent = new Intent(intent2);
                            }
                            this.f = intent;
                        } else {
                            this.g = e;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        this.g = e;
                    }
                } catch (nhm e3) {
                    this.g = e3;
                }
            } catch (IOException e4) {
                e = e4;
                this.e.j = SystemClock.elapsedRealtime();
                this.g = e;
                return null;
            }
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Activity activity;
        String str = (String) obj;
        ldu lduVar = this.c;
        if ((lduVar instanceof lee) && ((lee) lduVar).a) {
            return;
        }
        ieg iegVarA = ksn.a(this.b.name);
        if (str != null) {
            lduVar.G(iegVarA, str);
            return;
        }
        if (this.d && this.f != null && (activity = this.a) != null) {
            ldy ldyVar = this.e;
            ldx ldxVar = ldyVar.i;
            ldyVar.i = this;
            if (ldxVar != null) {
                ldxVar.c.I(iegVarA);
            }
            activity.startActivityForResult(this.f, 904);
            return;
        }
        Exception exc = this.g;
        if (exc instanceof nhm) {
            krd.c("GetToken error: GmsCore unavailable (" + ((nhm) exc).a + ")");
            lduVar.I(iegVarA);
            return;
        }
        if (exc != null) {
            krd.c("GetToken error: ".concat(String.valueOf(exc.getClass().getSimpleName())));
            lduVar.H(iegVarA, this.g);
        } else {
            krd.c("GetToken error: could not get token and no exception");
            lduVar.I(iegVarA);
        }
    }
}

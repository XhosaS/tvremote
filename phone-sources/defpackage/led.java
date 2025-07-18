package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class led implements ids {
    public final ldv a;
    private final ieh b;
    private final Activity c;
    private final idr d;
    private mfc e;
    private lee f;
    private mfc g;
    private ieg h = ieg.a;

    public led(Activity activity, ldv ldvVar, ieh iehVar) {
        this.c = activity;
        ldvVar.getClass();
        this.a = ldvVar;
        this.b = iehVar;
        this.d = new idz(0);
    }

    private final void i(ieg iegVar, ldu lduVar) {
        this.d.c(2);
        this.h = ieg.a;
        lee leeVar = new lee(lduVar);
        this.f = leeVar;
        this.a.o(iegVar, this.c, leeVar);
    }

    public final int a() {
        return ((Integer) this.d.a()).intValue();
    }

    public final void b() {
        mfc mfcVar = this.e;
        if (mfcVar != null) {
            mfcVar.a();
            this.e = null;
        }
    }

    public final void c() {
        lee leeVar = this.f;
        if (leeVar != null) {
            leeVar.a = true;
            this.f = null;
        }
    }

    public final void d(ieg iegVar, Throwable th, ldu lduVar) {
        if (th == null) {
            i(iegVar, lduVar);
            return;
        }
        if (!(th instanceof OperationCanceledException)) {
            this.d.c(5);
            return;
        }
        ieg iegVar2 = (ieg) this.b.a();
        if (!iegVar2.m() || iegVar2.equals(this.h)) {
            this.d.c(4);
        } else {
            i(iegVar2, lduVar);
        }
    }

    public final void e(idy idyVar) {
        this.d.c(1);
        this.e = new mfc(idyVar);
        if (ActivityManager.isUserAMonkey()) {
            this.e.c(ieg.b(new OperationCanceledException()));
            return;
        }
        mfc mfcVar = this.g;
        if (mfcVar != null) {
            mfcVar.c(ieg.b(new OperationCanceledException()));
        }
        this.g = this.e;
        Activity activity = this.c;
        Bundle bundle = new Bundle();
        bundle.putBoolean("allowSkip", false);
        ArrayList arrayList = new ArrayList();
        ldv ldvVar = this.a;
        ieh iehVar = this.b;
        Account[] accountArrU = ldvVar.u();
        Account accountB = ldvVar.b((ieg) iehVar.a());
        String strL = ldvVar.l();
        Collections.addAll(arrayList, accountArrU);
        activity.startActivityForResult(AccountManager.newChooseAccountIntent(accountB, arrayList, new String[]{ldvVar.k()}, true, null, strL, null, bundle), 903);
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        this.d.ea(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        this.d.ee(iejVar);
    }

    public final void f(ksn ksnVar, ldu lduVar) {
        i(ieg.f(ksnVar), lduVar);
    }

    public final boolean g(int i, int i2, Intent intent) {
        ldv ldvVar = this.a;
        if (ldvVar.x(i, i2)) {
            return true;
        }
        if (i != 903 || this.g == null) {
            return false;
        }
        if (i2 == -1 && intent != null) {
            ieg iegVarA = ksn.a(intent.getStringExtra("authAccount"));
            if (iegVarA.m()) {
                ksn ksnVar = (ksn) iegVarA.g();
                if (ldvVar.s(ksnVar)) {
                    ldvVar.p(ksnVar);
                    this.g.c(iegVarA);
                    this.g = null;
                    return true;
                }
            }
        }
        this.g.c(ieg.b(new OperationCanceledException()));
        this.g = null;
        return true;
    }
}

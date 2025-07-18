package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class njq extends ifk implements IInterface {
    private final /* synthetic */ int a;
    private final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njq(hjj hjjVar, int i) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
        this.a = i;
        this.b = hjjVar;
    }

    private final void a() throws PackageManager.NameNotFoundException {
        AppOpsManager appOpsManager;
        int callingUid = Binder.getCallingUid();
        Context context = (Context) this.b;
        try {
            appOpsManager = (AppOpsManager) ((Context) oda.b(context).a).getSystemService("appops");
        } catch (PackageManager.NameNotFoundException | SecurityException unused) {
        }
        if (appOpsManager == null) {
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        }
        appOpsManager.checkPackage(callingUid, "com.google.android.gms");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
        nwc nwcVarA = nwc.a(context);
        if (packageInfo != null) {
            if (nwc.b(packageInfo, false)) {
                return;
            }
            if (nwc.b(packageInfo, true)) {
                if (nwb.d(nwcVarA.c)) {
                    return;
                } else {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                }
            }
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) throws PackageManager.NameNotFoundException {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i != 2) {
                    return false;
                }
                ((nzt) this.b).b(new okv(2));
                return true;
            }
            if (i != 1) {
                return false;
            }
            int i3 = parcel.readInt();
            ifl.b(parcel);
            ((hjj) this.b).a(Integer.valueOf(i3));
            return true;
        }
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            a();
            njp.a((Context) this.b).b();
            return true;
        }
        a();
        Context context = (Context) this.b;
        nju njuVarC = nju.c(context);
        GoogleSignInAccount googleSignInAccountA = njuVarC.a();
        GoogleSignInOptions googleSignInOptionsB = GoogleSignInOptions.e;
        if (googleSignInAccountA != null) {
            googleSignInOptionsB = njuVarC.b();
        }
        ocv.aF(googleSignInOptionsB);
        njd njdVar = new njd(context, googleSignInOptionsB);
        if (googleSignInAccountA == null) {
            nwu nwuVar = njdVar.C;
            Context context2 = njdVar.w;
            int iA = njdVar.a();
            njn.a.c("Signing out");
            njn.a(context2);
            if (iA == 3) {
                nxc nxcVar = Status.a;
                BasePendingResult oacVar = new oac(nwuVar);
                oacVar.q(nxcVar);
                basePendingResult = oacVar;
            } else {
                njj njjVar = new njj(nwuVar);
                nwuVar.b(njjVar);
                basePendingResult = njjVar;
            }
            ocv.aH(basePendingResult);
            return true;
        }
        nwu nwuVar2 = njdVar.C;
        Context context3 = njdVar.w;
        int iA2 = njdVar.a();
        njn.a.c("Revoking access");
        String strD = nju.c(context3).d("refreshToken");
        njn.a(context3);
        if (iA2 == 3) {
            int i4 = njf.b;
            if (strD == null) {
                Status status = new Status(4);
                ocv.au(!status.b(), "Status code must not be SUCCESS");
                BasePendingResult nwyVar = new nwy(status);
                nwyVar.q(status);
                basePendingResult2 = nwyVar;
            } else {
                njf njfVar = new njf(strD);
                new Thread(njfVar).start();
                basePendingResult2 = njfVar.a;
            }
        } else {
            njl njlVar = new njl(nwuVar2);
            nwuVar2.b(njlVar);
            basePendingResult2 = njlVar;
        }
        ocv.aH(basePendingResult2);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njq(Context context, int i) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njq(nzt nztVar, int i) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
        this.a = i;
        this.b = nztVar;
    }
}

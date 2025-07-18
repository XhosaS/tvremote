package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwc {
    public static volatile Set a;
    public static volatile Set b;
    private static nwc e;
    public final Context c;
    public volatile String d;

    public nwc(Context context) {
        this.c = context.getApplicationContext();
    }

    public static nwc a(Context context) {
        ocv.aF(context);
        synchronized (nwc.class) {
            if (e == null) {
                nvu.b(context);
                e = new nwc(context);
            }
        }
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static final boolean b(PackageInfo packageInfo, boolean z) {
        ImmutableList immutableListOf;
        if (packageInfo == null) {
            return false;
        }
        if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        try {
            ImmutableList immutableList = z ? nvt.b : nvt.a;
            int i = oco.a;
            if (Build.VERSION.SDK_INT < 28) {
                byte[] byteArray = null;
                if (packageInfo.signatures != null && packageInfo.signatures.length == 1) {
                    byteArray = packageInfo.signatures[0].toByteArray();
                }
                immutableListOf = byteArray != null ? ImmutableList.of(byteArray) : ImmutableList.of();
            } else {
                a.ab(Build.VERSION.SDK_INT >= 28);
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    immutableListOf = ImmutableList.of();
                } else {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                        builder.add((ImmutableList.Builder) signature.toByteArray());
                    }
                    immutableListOf = builder.build();
                }
            }
            if (immutableListOf.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            UnmodifiableIterator it = immutableListOf.reverse().iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                Iterator<E> it2 = immutableList.iterator();
                while (it2.hasNext()) {
                    if (Arrays.equals(bArr, (byte[]) it2.next())) {
                        return true;
                    }
                }
            }
            return false;
        } catch (IllegalArgumentException unused) {
            return (z ? c(packageInfo, nvt.c) : c(packageInfo, nvt.c[0])) != null;
        }
    }

    private static obp c(PackageInfo packageInfo, obp... obpVarArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            nvr nvrVar = new nvr(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < obpVarArr.length; i++) {
                if (obpVarArr[i].equals(nvrVar)) {
                    return obpVarArr[i];
                }
            }
        }
        return null;
    }
}

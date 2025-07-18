package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.view.WindowManager;
import com.google.android.katniss.R;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iri implements irh {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/share/SetupUtilsImpl");
    private final gtu b;
    private final idl c;
    private boolean d;

    public iri(gtu gtuVar, idl idlVar) {
        gtuVar.getClass();
        idlVar.getClass();
        this.b = gtuVar;
        this.c = idlVar;
    }

    @Override // defpackage.irh
    public final Account a(Intent intent) {
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null && agvy.c("com.google", extras.getString("accountType"))) {
            String string = extras.getString("authAccount");
            if (!TextUtils.isEmpty(string)) {
                for (Account account : this.b.n()) {
                    if (agvy.c(string, account.name)) {
                        return account;
                    }
                }
            }
        }
        ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/share/SetupUtilsImpl", "retrieveSetupAccount", 126, "SetupUtilsImpl.kt")).u("Can't retrieve setup account from Intent, fallback to KAM.");
        return this.c.c();
    }

    @Override // defpackage.irh
    public final Drawable b(Context context) {
        int iWidth;
        int iHeight;
        uvl uvlVar;
        uvo[] uvoVarArr;
        uvo[] uvoVarArr2;
        int iA = urs.a(R.attr.colorSecondary, context);
        int iArgb = Color.argb(20, Color.red(iA), Color.green(iA), Color.blue(iA));
        int iA2 = urs.a(android.R.attr.colorBackground, context);
        int iRgb = Color.rgb(Color.red(iA2), Color.green(iA2), Color.blue(iA2));
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            ((zdv) ((zdv) urs.a.d()).q("com/google/android/libraries/tv/setupwraith/gm3/background/Gtvm3BackgroundScrimFactory", "createBackgroundDrawable", 52, "Gtvm3BackgroundScrimFactory.java")).u("WindowManager is null. Defaulting bounds to 0.");
            iHeight = 0;
            iWidth = 0;
        } else if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            iWidth = bounds.width();
            iHeight = bounds.height();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            iWidth = i;
            iHeight = i2;
        }
        uva uvaVar = uva.a;
        uuz uuzVar = new uuz();
        if ((uuzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uuzVar.y();
        }
        ((uva) uuzVar.b).b = 0;
        if ((uuzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uuzVar.y();
        }
        ((uva) uuzVar.b).c = 0;
        if ((uuzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uuzVar.y();
        }
        ((uva) uuzVar.b).d = iWidth;
        if ((uuzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uuzVar.y();
        }
        ((uva) uuzVar.b).e = 0;
        if ((uuzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uuzVar.y();
        }
        ((uva) uuzVar.b).f = iArgb;
        if ((uuzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uuzVar.y();
        }
        ((uva) uuzVar.b).g = 0;
        if ((uuzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uuzVar.y();
        }
        ((uva) uuzVar.b).h = iHeight;
        if ((uuzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uuzVar.y();
        }
        ((uva) uuzVar.b).i = iA2;
        if ((uuzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uuzVar.y();
        }
        ((uva) uuzVar.b).n = iRgb;
        if ((uuzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uuzVar.y();
        }
        ((uva) uuzVar.b).m = 1.0f;
        if ((uuzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uuzVar.y();
        }
        ((uva) uuzVar.b).q = false;
        if ((uuzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uuzVar.y();
        }
        ((uva) uuzVar.b).r = false;
        if ((uuzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uuzVar.y();
        }
        ((uva) uuzVar.b).p = false;
        if ((uuzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uuzVar.y();
        }
        ((uva) uuzVar.b).s = false;
        uva uvaVar2 = (uva) uuzVar.v();
        uvn uvnVar = uvn.a;
        uvm uvmVar = new uvm();
        uve uveVar = uve.a;
        uvd uvdVar = new uvd();
        if ((uvdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uvdVar.y();
        }
        uve uveVar2 = (uve) uvdVar.b;
        uvaVar2.getClass();
        uveVar2.d = uvaVar2;
        uveVar2.c = 1;
        if ((uvmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            uvmVar.y();
        }
        uvn uvnVar2 = (uvn) uvmVar.b;
        uve uveVar3 = (uve) uvdVar.v();
        uveVar3.getClass();
        abxs abxsVar = uvnVar2.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            uvnVar2.b = abxsVar.d(size + size);
        }
        uvnVar2.b.add(uveVar3);
        uvn uvnVar3 = (uvn) uvmVar.v();
        LruCache lruCache = new LruCache(16);
        Context applicationContext = context.getApplicationContext();
        if (uvnVar3.b.size() <= 0 || (((uve) uvnVar3.b.get(0)).b & 1) == 0) {
            uvlVar = null;
        } else {
            uvlVar = ((uve) uvnVar3.b.get(0)).e;
            if (uvlVar == null) {
                uvlVar = uvl.a;
            }
        }
        uvc uvcVar = uvlVar != null ? (uvc) uvj.a((uve) uvnVar3.b.get(0), applicationContext, lruCache) : null;
        int i3 = uvcVar != null ? 1 : 0;
        int size2 = uvnVar3.b.size() - i3;
        if (size2 == 0) {
            uvoVarArr2 = new uvo[0];
        } else {
            uvo uvoVarA = uvj.a((uve) uvnVar3.b.get(i3), applicationContext, lruCache);
            if (!uvoVarA.e() || uvoVarA.d()) {
                uvoVarArr = new uvo[size2];
            } else {
                uvoVarArr = new uvo[size2 + 1];
                uvoVarArr[size2] = uvg.g(applicationContext.getResources());
            }
            uvoVarArr[0] = uvoVarA;
            for (int i4 = 1; i4 < size2; i4++) {
                uvoVarArr[i4] = uvj.a((uve) uvnVar3.b.get(i4 + i3), applicationContext, lruCache);
            }
            uvoVarArr2 = uvoVarArr;
        }
        return ((uvoVarArr2.length == 1 && uvcVar == null) ? uvoVarArr2[0] : uvcVar == null ? new uvf(uvoVarArr2) : new uvi(uvoVarArr2, uvcVar, uvlVar)).b();
    }

    @Override // defpackage.irh
    public final ycg c(idh idhVar) {
        if (idhVar == null) {
            return null;
        }
        int iOrdinal = idhVar.ordinal();
        if (iOrdinal == 0) {
            return ycg.DATA_SHARING_CONSENT_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return ycg.DATA_SHARING_CONSENT_GRANTED;
        }
        if (iOrdinal == 2) {
            return ycg.DATA_SHARING_CONSENT_DENIED;
        }
        if (iOrdinal == 3) {
            return ycg.DATA_SHARING_CONSENT_DENIED_FROM_OOBE;
        }
        throw new agpg();
    }

    @Override // defpackage.irh
    public final String d(PackageManager packageManager, String str) {
        byte[] bArrDigest;
        packageManager.getClass();
        try {
            if (str == null) {
                ((zdv) a.d().q("com/google/android/apps/tvsearch/setup/share/SetupUtilsImpl", "getHexSignature", 71, "SetupUtilsImpl.kt")).u("Invalid package name.");
                return null;
            }
            Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
            if (signatureArr == null || signatureArr.length == 0 || (bArrDigest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray())) == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String str2 = String.format("%1$02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                str2.getClass();
                sb.append(str2);
            }
            return sb.toString();
        } catch (Exception e) {
            if ((e instanceof PackageManager.NameNotFoundException) || (e instanceof NoSuchAlgorithmException)) {
                ((zdv) ((zdv) a.d()).p(e).q("com/google/android/apps/tvsearch/setup/share/SetupUtilsImpl", "getHexSignature", 86, "SetupUtilsImpl.kt")).x("Fail to get the signature of package: %s", str);
                return null;
            }
        }
    }

    @Override // defpackage.irh
    public final void e(Intent intent) {
        Bundle extras;
        String string = null;
        if (intent != null && (extras = intent.getExtras()) != null) {
            string = extras.getString("tv_setup_theme", "");
        }
        this.d = agvy.c(string, "gtv_2_0");
    }

    @Override // defpackage.irh
    public final boolean f(Intent intent, String str) {
        Bundle extras;
        return (intent == null || (extras = intent.getExtras()) == null || !extras.getBoolean(str, false)) ? false : true;
    }

    @Override // defpackage.irh
    public final boolean g() {
        return this.d;
    }

    @Override // defpackage.irh
    public final boolean h(String str, Collection collection) {
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (agvy.c((String) it.next(), agyv.i(str).toString())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.irh
    public final int i(idj idjVar) {
        if (idjVar == null) {
            return 0;
        }
        int iOrdinal = idjVar.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? 0 : 3;
        }
        return 2;
    }
}

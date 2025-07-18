package defpackage;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.PowerManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdb implements jcy {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/voice/hotword/HotwordUtilsImpl");
    public final vrs a;
    private final agow c;
    private final PackageManager d;
    private final PowerManager e;
    private final agow f;
    private Boolean g;
    private final int h;

    public jdb(vrs vrsVar, gph gphVar, agow agowVar, PackageManager packageManager, PowerManager powerManager, agow agowVar2) {
        agowVar.getClass();
        powerManager.getClass();
        agowVar2.getClass();
        this.a = vrsVar;
        this.c = agowVar;
        this.d = packageManager;
        this.e = powerManager;
        this.f = agowVar2;
        this.h = gphVar == gph.a ? ((Boolean) agowVar.a()).booleanValue() ? 1 : 4 : 0;
    }

    @Override // defpackage.jcy
    public final int a() {
        return this.h;
    }

    @Override // defpackage.jcy
    public final boolean b() {
        synchronized (this) {
            Boolean bool = this.g;
            if (bool != null) {
                return bool.booleanValue();
            }
            String authority = jcx.a.getAuthority();
            boolean z = (authority != null ? this.d.resolveContentProvider(authority, 0) : null) != null;
            this.g = Boolean.valueOf(z);
            return z;
        }
    }

    @Override // defpackage.jcy
    public final boolean c() {
        if (Build.VERSION.SDK_INT < 34) {
            return true;
        }
        PowerManager powerManager = this.e;
        boolean zIsExemptFromLowPowerStandby = powerManager.isExemptFromLowPowerStandby();
        boolean zIsAllowedInLowPowerStandby = powerManager.isAllowedInLowPowerStandby("com.android.lowpowerstandby.HARDWARE_HOTWORD_DETECTION");
        ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/hotword/HotwordUtilsImpl", "isHardwareHotwordAllowedInEnergyMode", 116, "HotwordUtilsImpl.kt")).H("Checking for LowPowerStandby, isKatnissExempt=%b, isHardwareHotwordAllowed=%b", zIsExemptFromLowPowerStandby, zIsAllowedInLowPowerStandby);
        return zIsExemptFromLowPowerStandby && zIsAllowedInLowPowerStandby;
    }

    @Override // defpackage.jcy
    public final boolean d() {
        if (!b()) {
            return true;
        }
        Boolean bool = (Boolean) agqq.o((List) ahak.a(agtf.a, new jda(this, null)));
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    @Override // defpackage.jcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            r6 = this;
            java.lang.reflect.Method r0 = defpackage.udy.a
            r0 = 0
            r1 = 1
            java.lang.reflect.Method r2 = defpackage.udy.a     // Catch: java.lang.Exception -> L26
            if (r2 == 0) goto L2e
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L26
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L26
            java.lang.String r5 = "ro.product.first_api_level"
            r4[r0] = r5     // Catch: java.lang.Exception -> L26
            r4[r1] = r3     // Catch: java.lang.Exception -> L26
            r3 = 0
            java.lang.Object r2 = r2.invoke(r3, r4)     // Catch: java.lang.Exception -> L26
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L26
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L26
            r3 = 34
            if (r2 >= r3) goto L46
            goto L2e
        L26:
            r2 = move-exception
            java.lang.String r3 = "SystemProperties"
            java.lang.String r4 = "get error"
            android.util.Log.e(r3, r4, r2)
        L2e:
            agow r2 = r6.f
            java.lang.Object r2 = r2.a()
            acfo r2 = (defpackage.acfo) r2
            abxs r2 = r2.b
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r3 = r3.toLanguageTag()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L47
        L46:
            return r1
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdb.e():boolean");
    }

    @Override // defpackage.jcy
    public final boolean f(boolean z) {
        if (Build.VERSION.SDK_INT < 34) {
            return true;
        }
        PowerManager powerManager = this.e;
        boolean zIsExemptFromLowPowerStandby = powerManager.isExemptFromLowPowerStandby();
        boolean zIsAllowedInLowPowerStandby = powerManager.isAllowedInLowPowerStandby("com.android.lowpowerstandby.SOFTWARE_HOTWORD_DETECTION");
        ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/hotword/HotwordUtilsImpl", "isSoftwareHotwordAllowedInEnergyMode", 138, "HotwordUtilsImpl.kt")).H("Checking for LowPowerStandby, isKatnissExempt=%b, isSoftwareHotwordAllowed=%b", zIsExemptFromLowPowerStandby, zIsAllowedInLowPowerStandby);
        return z && zIsExemptFromLowPowerStandby && zIsAllowedInLowPowerStandby;
    }
}

package com.google.android.libraries.mediahome.providers.video;

import android.text.TextUtils;
import defpackage.prz;
import defpackage.uvl;
import defpackage.vve;
import defpackage.xcw;
import defpackage.xdc;
import defpackage.xdg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VideoProvider extends prz {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.prz
    protected final long a() {
        String callingPackage = getCallingPackage();
        if (TextUtils.isEmpty(callingPackage)) {
            return 0L;
        }
        uvl uvlVarB = xdc.a.get().b(d());
        int iIntValue = uvlVarB.b;
        callingPackage.getClass();
        if (uvlVarB.c.containsKey(callingPackage)) {
            callingPackage.getClass();
            vve vveVar = uvlVarB.c;
            if (vveVar.containsKey(callingPackage)) {
                iIntValue = ((Integer) vveVar.get(callingPackage)).intValue();
            }
        }
        return iIntValue;
    }

    @Override // defpackage.prz
    protected final long b() {
        return xdc.a.get().a(d());
    }

    @Override // defpackage.prz
    protected final long c() {
        return xdg.a.get().a(d());
    }

    @Override // defpackage.prz
    protected final void f() {
        String callingPackage = getCallingPackage();
        if (TextUtils.isEmpty(callingPackage) || !xcw.a(d()).b.contains(callingPackage)) {
            throw new SecurityException("The application is not allowed to use the provider");
        }
    }

    @Override // defpackage.prz
    protected final boolean g() {
        String callingPackage = getCallingPackage();
        if (TextUtils.isEmpty(callingPackage)) {
            return false;
        }
        return xcw.a.get().a(d()).b.contains(callingPackage);
    }
}

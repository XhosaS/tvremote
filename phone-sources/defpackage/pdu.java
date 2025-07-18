package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.common.collect.ImmutableExtensionsKt;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pdu implements qjl {
    public static final boolean a;
    private static final tvn b = tvn.n("GnpSdk");
    private static final Map c;
    private final owz d;
    private final oxp e;
    private final Context f;
    private final qei g;
    private final String h;
    private final long i;
    private final long j;

    static {
        boolean z = false;
        Map mapH = yfm.h(new yfw(33, yfm.p(uvu.ANDROID_POST_NOTIFICATIONS)), new yfw(23, yfm.s(uvu.ANDROID_CAMERA, uvu.ANDROID_ACCESS_FINE_LOCATION)));
        c = mapH;
        Set setKeySet = mapH.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (qtl.D(((Number) it.next()).intValue())) {
                    z = true;
                    break;
                }
            }
        }
        a = z;
    }

    public pdu(owz owzVar, oxp oxpVar, Context context, qei qeiVar) {
        owzVar.getClass();
        oxpVar.getClass();
        qeiVar.getClass();
        this.d = owzVar;
        this.e = oxpVar;
        this.f = context;
        this.g = qeiVar;
        this.h = "GK_PERMISSIONS_STATE_LOGGING";
        this.i = TimeUnit.DAYS.toMillis(1L);
        this.j = TimeUnit.HOURS.toMillis(1L);
    }

    @Override // defpackage.qjl
    public final int a() {
        return 14;
    }

    @Override // defpackage.qjl
    public final long b() {
        return this.i;
    }

    @Override // defpackage.qjl
    public final Long c() {
        return Long.valueOf(this.j);
    }

    @Override // defpackage.qjl
    public final Object d(Bundle bundle, yih yihVar) {
        b.l().s("Executing PermissionsStateLoggingJob");
        Map map = c;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            yfm.I(arrayList, !qtl.D(((Number) entry.getKey()).intValue()) ? yhb.a : (List) entry.getValue());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ykn.j(yfm.e(yfm.z(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            linkedHashMap.put(obj, qtl.C(this.f, osk.A((uvu) obj)) ? uvt.ANDROID_PERMISSION_STATE_AUTHORIZED : uvt.ANDROID_PERMISSION_STATE_DENIED);
        }
        ImmutableMap immutableMap = ImmutableExtensionsKt.toImmutableMap(linkedHashMap);
        if (!immutableMap.isEmpty()) {
            oxp oxpVar = this.e;
            List listA = this.d.a();
            listA.getClass();
            qei qeiVar = this.g;
            ImmutableList immutableList = ImmutableExtensionsKt.toImmutableList((Collection) listA);
            String str = qeiVar.a;
            str.getClass();
            oxpVar.b(immutableMap, immutableList, str);
        }
        return new qdn(ygi.a);
    }

    @Override // defpackage.qjl
    public final String e() {
        return this.h;
    }

    @Override // defpackage.qjl
    public final boolean f() {
        return true;
    }

    @Override // defpackage.qjl
    public final boolean g() {
        return false;
    }

    @Override // defpackage.qjl
    public final int h() {
        return 2;
    }

    @Override // defpackage.qjl
    public final int i() {
        return 1;
    }
}

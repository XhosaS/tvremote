package defpackage;

import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvg extends agtu implements agvb {
    final /* synthetic */ fvi a;
    final /* synthetic */ fxg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvg(fvi fviVar, fxg fxgVar, agsw agswVar) {
        super(2, agswVar);
        this.a = fviVar;
        this.b = fxgVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fvg) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        ((zdv) fvi.a.b().q("com/google/android/apps/tvsearch/datastore/user/migrations/AppsSearchDisabledMigration$migrate$1", "invokeSuspend", 71, "AppsSearchDisabledMigration.kt")).u("Migrating data to PDS");
        SharedPreferences sharedPreferences = this.a.b.getSharedPreferences("com.google.android.katniss.setting", 0);
        fxg fxgVarA = this.b;
        if (fxgVarA == null) {
            fxg fxgVar = fxg.a;
            fxgVarA = fxh.a(new fxc());
        }
        fxc fxcVar = new fxc();
        fxcVar.B(fxgVarA);
        for (String str : sharedPreferences.getAll().keySet()) {
            str.getClass();
            if (str.startsWith("search_disabled_packages:")) {
                String strSubstring = str.substring(25);
                strSubstring.getClass();
                Set<String> stringSet = sharedPreferences.getStringSet(str, agrf.a);
                fxh.b(fxcVar);
                Object objH = fxh.b(fxcVar).get(strSubstring);
                if (objH == null) {
                    fxe fxeVar = fxe.a;
                    objH = fxi.h(new fxd());
                }
                fxd fxdVar = new fxd();
                fxdVar.B((fxe) objH);
                fvv fvvVarA = fxi.a(fxdVar);
                fvr fvrVar = new fvr();
                fvrVar.B(fvvVarA);
                if (stringSet != null) {
                    for (String str2 : stringSet) {
                        fvw.b(fvrVar);
                        str2.getClass();
                        Object objA = fvw.b(fvrVar).get(str2);
                        if (objA == null) {
                            fvu fvuVar = fvu.a;
                            objA = fvx.a(new fvt());
                        }
                        fvt fvtVar = new fvt();
                        fvtVar.B((fvu) objA);
                        if ((fvtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            fvtVar.y();
                        }
                        ((fvu) fvtVar.b).b = true;
                        fvw.c(str2, fvx.a(fvtVar), fvrVar);
                    }
                }
                fvv fvvVarA2 = fvw.a(fvrVar);
                if ((fxdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    fxdVar.y();
                }
                fxe fxeVar2 = (fxe) fxdVar.b;
                fxeVar2.d = fvvVarA2;
                fxeVar2.b |= 1;
                fxh.f(strSubstring, fxi.h(fxdVar), fxcVar);
            }
        }
        return fxh.a(fxcVar);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fvg(this.a, this.b, agswVar);
    }
}

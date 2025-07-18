package defpackage;

import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvn extends agtu implements agvb {
    final /* synthetic */ fxg a;
    final /* synthetic */ fvp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvn(fxg fxgVar, fvp fvpVar, agsw agswVar) {
        super(2, agswVar);
        this.a = fxgVar;
        this.b = fvpVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fvn) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        fxg fxgVarA = this.a;
        if (fxgVarA == null) {
            fxg fxgVar = fxg.a;
            fxgVarA = fxh.a(new fxc());
        }
        SharedPreferences sharedPreferences = this.b.b.getSharedPreferences("com.google.android.katniss.setting", 0);
        fxc fxcVar = new fxc();
        fxcVar.B(fxgVarA);
        for (String str : sharedPreferences.getAll().keySet()) {
            if (agvy.c(str, "fcm_settings_updated_accounts")) {
                Set<String> set = agrf.a;
                Set<String> stringSet = sharedPreferences.getStringSet(str, set);
                if (stringSet != null) {
                    set = stringSet;
                }
                for (String str2 : set) {
                    fxh.b(fxcVar);
                    str2.getClass();
                    Object objH = fxh.b(fxcVar).get(str2);
                    if (objH == null) {
                        fxe fxeVar = fxe.a;
                        objH = fxi.h(new fxd());
                    }
                    fxd fxdVar = new fxd();
                    fxdVar.B((fxe) objH);
                    fwi fwiVarD = fxi.d(fxdVar);
                    fwh fwhVar = new fwh();
                    fwhVar.B(fwiVarD);
                    if ((fwhVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fwhVar.y();
                    }
                    fwi fwiVar = (fwi) fwhVar.b;
                    fwi fwiVar2 = fwi.a;
                    fwiVar.c = true;
                    fwi fwiVarA = fwj.a(fwhVar);
                    if ((fxdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fxdVar.y();
                    }
                    fxe fxeVar2 = (fxe) fxdVar.b;
                    fxeVar2.i = fwiVarA;
                    fxeVar2.b |= 16;
                    fxh.f(str2, fxi.h(fxdVar), fxcVar);
                }
            } else {
                str.getClass();
                if (str.startsWith("home_graph_id_")) {
                    String strSubstring = str.substring(14);
                    strSubstring.getClass();
                    String string = sharedPreferences.getString(str, "");
                    String str3 = string != null ? string : "";
                    fxh.b(fxcVar);
                    Object objH2 = fxh.b(fxcVar).get(strSubstring);
                    if (objH2 == null) {
                        fxe fxeVar3 = fxe.a;
                        objH2 = fxi.h(new fxd());
                    }
                    fxd fxdVar2 = new fxd();
                    fxdVar2.B((fxe) objH2);
                    fwi fwiVarD2 = fxi.d(fxdVar2);
                    fwh fwhVar2 = new fwh();
                    fwhVar2.B(fwiVarD2);
                    fwj.b(str3, fwhVar2);
                    fwi fwiVarA2 = fwj.a(fwhVar2);
                    if ((Integer.MIN_VALUE & fxdVar2.b.memoizedSerializedSize) == 0) {
                        fxdVar2.y();
                    }
                    fxe fxeVar4 = (fxe) fxdVar2.b;
                    fxeVar4.i = fwiVarA2;
                    fxeVar4.b |= 16;
                    fxh.f(strSubstring, fxi.h(fxdVar2), fxcVar);
                }
            }
        }
        return fxh.a(fxcVar);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fvn(this.a, this.b, agswVar);
    }
}

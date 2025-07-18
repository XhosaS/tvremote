package defpackage;

import android.content.Context;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvl implements ulk {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/datastore/user/migrations/DscMigrationBuilder");
    private final Context b;
    private final zyh c;

    public fvl(Context context, zyh zyhVar) {
        context.getClass();
        zyhVar.getClass();
        this.b = context;
        this.c = zyhVar;
    }

    public final uje a() {
        ulj uljVarD = ulm.d(this.b, this.c);
        uljVarD.c = "com.google.android.katniss.setting";
        uljVarD.c("dsc_granted_accounts", "dsc_denied_accounts", "dsc_denied_in_OOBE_accounts", "netflix_dsc_denied_count");
        uljVarD.d(true);
        uljVarD.e(this);
        return uljVarD.a();
    }

    @Override // defpackage.ulk
    public final /* bridge */ /* synthetic */ MessageLite b(ull ullVar, MessageLite messageLite) throws JSONException {
        fxg fxgVarA = (fxg) messageLite;
        ((zdv) a.b().q("com/google/android/apps/tvsearch/datastore/user/migrations/DscMigrationBuilder", "migrate", 56, "DscMigrationBuilder.kt")).u("Migrating data to PDS");
        if (fxgVarA == null) {
            fxg fxgVar = fxg.a;
            fxgVarA = fxh.a(new fxc());
        }
        fxc fxcVar = new fxc();
        fxcVar.B(fxgVarA);
        agrf agrfVar = agrf.a;
        for (String str : ullVar.c("dsc_granted_accounts", agrfVar)) {
            fxh.b(fxcVar);
            str.getClass();
            Object objH = fxh.b(fxcVar).get(str);
            if (objH == null) {
                fxe fxeVar = fxe.a;
                objH = fxi.h(new fxd());
            }
            fxd fxdVar = new fxd();
            fxdVar.B((fxe) objH);
            fwf fwfVarC = fxi.c(fxdVar);
            fwd fwdVar = new fwd();
            fwdVar.B(fwfVarC);
            fwg.b(fwe.DSC_GRANTED, fwdVar);
            fwf fwfVarA = fwg.a(fwdVar);
            if ((Integer.MIN_VALUE & fxdVar.b.memoizedSerializedSize) == 0) {
                fxdVar.y();
            }
            fxe fxeVar2 = (fxe) fxdVar.b;
            fxeVar2.g = fwfVarA;
            fxeVar2.b |= 8;
            fxh.f(str, fxi.h(fxdVar), fxcVar);
        }
        for (String str2 : ullVar.c("dsc_denied_accounts", agrfVar)) {
            fxh.b(fxcVar);
            str2.getClass();
            Object objH2 = fxh.b(fxcVar).get(str2);
            if (objH2 == null) {
                fxe fxeVar3 = fxe.a;
                objH2 = fxi.h(new fxd());
            }
            fxd fxdVar2 = new fxd();
            fxdVar2.B((fxe) objH2);
            fwf fwfVarC2 = fxi.c(fxdVar2);
            fwd fwdVar2 = new fwd();
            fwdVar2.B(fwfVarC2);
            fwg.b(fwe.DSC_DENIED, fwdVar2);
            fwf fwfVarA2 = fwg.a(fwdVar2);
            if ((fxdVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                fxdVar2.y();
            }
            fxe fxeVar4 = (fxe) fxdVar2.b;
            fxeVar4.g = fwfVarA2;
            fxeVar4.b |= 8;
            fxh.f(str2, fxi.h(fxdVar2), fxcVar);
        }
        for (String str3 : ullVar.c("dsc_denied_in_OOBE_accounts", agrfVar)) {
            fxh.b(fxcVar);
            str3.getClass();
            Object objH3 = fxh.b(fxcVar).get(str3);
            if (objH3 == null) {
                fxe fxeVar5 = fxe.a;
                objH3 = fxi.h(new fxd());
            }
            fxd fxdVar3 = new fxd();
            fxdVar3.B((fxe) objH3);
            fwf fwfVarC3 = fxi.c(fxdVar3);
            fwd fwdVar3 = new fwd();
            fwdVar3.B(fwfVarC3);
            fwg.b(fwe.DSC_DENIED_IN_OOBE, fwdVar3);
            fwf fwfVarA3 = fwg.a(fwdVar3);
            if ((fxdVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                fxdVar3.y();
            }
            fxe fxeVar6 = (fxe) fxdVar3.b;
            fxeVar6.g = fwfVarA3;
            fxeVar6.b |= 8;
            fxh.f(str3, fxi.h(fxdVar3), fxcVar);
        }
        String strB = ullVar.b("netflix_dsc_denied_count", new JSONObject().toString());
        strB.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject(strB);
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            obj.getClass();
            linkedHashMap.put(next, (Integer) obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            fxh.b(fxcVar);
            Object objH4 = fxh.b(fxcVar).get(str4);
            if (objH4 == null) {
                fxe fxeVar7 = fxe.a;
                objH4 = fxi.h(new fxd());
            }
            fxd fxdVar4 = new fxd();
            fxdVar4.B((fxe) objH4);
            fwf fwfVarC4 = fxi.c(fxdVar4);
            fwd fwdVar4 = new fwd();
            fwdVar4.B(fwfVarC4);
            if ((fwdVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                fwdVar4.y();
            }
            fwf fwfVar = (fwf) fwdVar4.b;
            fwf fwfVar2 = fwf.a;
            fwfVar.d = iIntValue;
            fwf fwfVarA4 = fwg.a(fwdVar4);
            if ((fxdVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                fxdVar4.y();
            }
            fxe fxeVar8 = (fxe) fxdVar4.b;
            fxeVar8.g = fwfVarA4;
            fxeVar8.b |= 8;
            fxh.f(str4, fxi.h(fxdVar4), fxcVar);
        }
        return fxh.a(fxcVar);
    }
}

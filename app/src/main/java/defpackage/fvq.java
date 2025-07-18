package defpackage;

import android.content.Context;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvq implements ulk {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/datastore/user/migrations/UdcMigrationBuilder");
    private final Context b;
    private final zyh c;

    public fvq(Context context, zyh zyhVar) {
        context.getClass();
        zyhVar.getClass();
        this.b = context;
        this.c = zyhVar;
    }

    public final uje a() {
        ulj uljVarD = ulm.d(this.b, this.c);
        uljVarD.c = "com.google.android.katniss.setting";
        uljVarD.c("udc_permission_granted_accounts", "udc_permission_denied_accounts", "udc_permission_unknown_accounts");
        uljVarD.d(true);
        uljVarD.e(this);
        return uljVarD.a();
    }

    @Override // defpackage.ulk
    public final /* synthetic */ MessageLite b(ull ullVar, MessageLite messageLite) {
        fxg fxgVarA = (fxg) messageLite;
        ((zdv) a.b().q("com/google/android/apps/tvsearch/datastore/user/migrations/UdcMigrationBuilder", "migrate", 55, "UdcMigrationBuilder.kt")).u("Migrating data to PDS");
        if (fxgVarA == null) {
            fxg fxgVar = fxg.a;
            fxgVarA = fxh.a(new fxc());
        }
        fxc fxcVar = new fxc();
        fxcVar.B(fxgVarA);
        agrf agrfVar = agrf.a;
        for (String str : ullVar.c("udc_permission_granted_accounts", agrfVar)) {
            fxh.b(fxcVar);
            str.getClass();
            Object objH = fxh.b(fxcVar).get(str);
            if (objH == null) {
                fxe fxeVar = fxe.a;
                objH = fxi.h(new fxd());
            }
            fxd fxdVar = new fxd();
            fxdVar.B((fxe) objH);
            fxa fxaVarG = fxi.g(fxdVar);
            fwz fwzVar = new fwz();
            fwzVar.B(fxaVarG);
            fxb.b(3, fwzVar);
            fxa fxaVarA = fxb.a(fwzVar);
            if ((Integer.MIN_VALUE & fxdVar.b.memoizedSerializedSize) == 0) {
                fxdVar.y();
            }
            fxe fxeVar2 = (fxe) fxdVar.b;
            fxeVar2.q = fxaVarA;
            fxeVar2.b |= 1024;
            fxh.f(str, fxi.h(fxdVar), fxcVar);
        }
        for (String str2 : ullVar.c("udc_permission_denied_accounts", agrfVar)) {
            fxh.b(fxcVar);
            str2.getClass();
            Object objH2 = fxh.b(fxcVar).get(str2);
            if (objH2 == null) {
                fxe fxeVar3 = fxe.a;
                objH2 = fxi.h(new fxd());
            }
            fxd fxdVar2 = new fxd();
            fxdVar2.B((fxe) objH2);
            fxa fxaVarG2 = fxi.g(fxdVar2);
            fwz fwzVar2 = new fwz();
            fwzVar2.B(fxaVarG2);
            fxb.b(4, fwzVar2);
            fxa fxaVarA2 = fxb.a(fwzVar2);
            if ((fxdVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                fxdVar2.y();
            }
            fxe fxeVar4 = (fxe) fxdVar2.b;
            fxeVar4.q = fxaVarA2;
            fxeVar4.b |= 1024;
            fxh.f(str2, fxi.h(fxdVar2), fxcVar);
        }
        for (String str3 : ullVar.c("udc_permission_unknown_accounts", agrfVar)) {
            fxh.b(fxcVar);
            str3.getClass();
            Object objH3 = fxh.b(fxcVar).get(str3);
            if (objH3 == null) {
                fxe fxeVar5 = fxe.a;
                objH3 = fxi.h(new fxd());
            }
            fxd fxdVar3 = new fxd();
            fxdVar3.B((fxe) objH3);
            fxa fxaVarG3 = fxi.g(fxdVar3);
            fwz fwzVar3 = new fwz();
            fwzVar3.B(fxaVarG3);
            fxb.b(5, fwzVar3);
            fxa fxaVarA3 = fxb.a(fwzVar3);
            if ((fxdVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                fxdVar3.y();
            }
            fxe fxeVar6 = (fxe) fxdVar3.b;
            fxeVar6.q = fxaVarA3;
            fxeVar6.b |= 1024;
            fxh.f(str3, fxi.h(fxdVar3), fxcVar);
        }
        return fxh.a(fxcVar);
    }
}

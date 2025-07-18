package defpackage;

import android.content.Context;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmo implements ulk {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/datastore/device/migrations/FcmDataMigrationBuilder");
    private final Context b;
    private final zyh c;

    public fmo(Context context, zyh zyhVar) {
        context.getClass();
        zyhVar.getClass();
        this.b = context;
        this.c = zyhVar;
    }

    public final uje a() {
        ulj uljVarD = ulm.d(this.b, this.c);
        uljVarD.c = "com.google.android.katniss.setting";
        uljVarD.c("app_registered_gcm", "gcm_registration_id");
        uljVarD.d(false);
        uljVarD.e(this);
        return uljVarD.a();
    }

    @Override // defpackage.ulk
    public final /* synthetic */ MessageLite b(ull ullVar, MessageLite messageLite) {
        fnp fnpVarC = (fnp) messageLite;
        ((zdv) a.b().q("com/google/android/apps/tvsearch/datastore/device/migrations/FcmDataMigrationBuilder", "migrate", 51, "FcmDataMigrationBuilder.kt")).u("Migrating data to PDS");
        if (fnpVarC == null) {
            fnp fnpVar = fnp.a;
            fnpVarC = fnq.c(new fno());
        }
        fno fnoVar = new fno();
        fnoVar.B(fnpVarC);
        fnz fnzVarE = fnq.e(fnoVar);
        fny fnyVar = new fny();
        fnyVar.B(fnzVarE);
        boolean zD = ullVar.d("app_registered_gcm", ((fnz) fnyVar.b).c);
        if ((fnyVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fnyVar.y();
        }
        fnz fnzVar = (fnz) fnyVar.b;
        fnzVar.c = zD;
        String str = fnzVar.b;
        str.getClass();
        String strB = ullVar.b("gcm_registration_id", str);
        strB.getClass();
        foa.b(strB, fnyVar);
        fnz fnzVarA = foa.a(fnyVar);
        if ((fnoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fnoVar.y();
        }
        fnp fnpVar2 = (fnp) fnoVar.b;
        fnpVar2.g = fnzVarA;
        fnpVar2.b |= 16;
        return fnq.c(fnoVar);
    }
}

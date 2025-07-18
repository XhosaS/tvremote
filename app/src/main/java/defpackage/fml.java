package defpackage;

import android.content.Context;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fml implements ulk {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/datastore/device/migrations/CastDataMigrationBuilder");
    private final Context b;
    private final zyh c;

    public fml(Context context, zyh zyhVar) {
        context.getClass();
        zyhVar.getClass();
        this.b = context;
        this.c = zyhVar;
    }

    public final uje a() {
        ulj uljVarD = ulm.d(this.b, this.c);
        uljVarD.c = "CastServiceInfo_PREFS";
        uljVarD.c("CastServiceInfo/cloud_device_id", "CastServiceInfo/certificate");
        uljVarD.d(true);
        uljVarD.e(this);
        return uljVarD.a();
    }

    @Override // defpackage.ulk
    public final /* synthetic */ MessageLite b(ull ullVar, MessageLite messageLite) {
        fnp fnpVarC = (fnp) messageLite;
        ((zdv) a.b().q("com/google/android/apps/tvsearch/datastore/device/migrations/CastDataMigrationBuilder", "migrate", 53, "CastDataMigrationBuilder.kt")).u("Migrating data to PDS");
        if (fnpVarC == null) {
            fnp fnpVar = fnp.a;
            fnpVarC = fnq.c(new fno());
        }
        fno fnoVar = new fno();
        fnoVar.B(fnpVarC);
        fnm fnmVarB = fnq.b(fnoVar);
        fnl fnlVar = new fnl();
        fnlVar.B(fnmVarB);
        String strB = ullVar.b("CastServiceInfo/cloud_device_id", "");
        strB.getClass();
        if ((fnlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fnlVar.y();
        }
        fnm fnmVar = (fnm) fnlVar.b;
        fnm fnmVar2 = fnm.a;
        fnmVar.b = strB;
        String strB2 = ullVar.b("CastServiceInfo/certificate", "");
        strB2.getClass();
        if ((fnlVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fnlVar.y();
        }
        ((fnm) fnlVar.b).c = strB2;
        fnm fnmVarA = fnn.a(fnlVar);
        if ((fnoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fnoVar.y();
        }
        fnp fnpVar2 = (fnp) fnoVar.b;
        fnpVar2.e = fnmVarA;
        fnpVar2.b |= 4;
        return fnq.c(fnoVar);
    }
}

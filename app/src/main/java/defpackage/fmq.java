package defpackage;

import android.content.Context;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmq implements ulk {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/datastore/device/migrations/LinkTokenMigrationBuilder");
    private final Context b;
    private final zyh c;

    public fmq(Context context, zyh zyhVar) {
        context.getClass();
        zyhVar.getClass();
        this.b = context;
        this.c = zyhVar;
    }

    public final uje a() {
        ulj uljVarD = ulm.d(this.b, this.c);
        uljVarD.c = "com.google.android.katniss.setting";
        uljVarD.c("link_token");
        uljVarD.d(false);
        uljVarD.e(this);
        return uljVarD.a();
    }

    @Override // defpackage.ulk
    public final /* synthetic */ MessageLite b(ull ullVar, MessageLite messageLite) {
        fnp fnpVarC = (fnp) messageLite;
        ((zdv) a.b().q("com/google/android/apps/tvsearch/datastore/device/migrations/LinkTokenMigrationBuilder", "migrate", 48, "LinkTokenMigrationBuilder.kt")).u("Migrating data to PDS");
        if (fnpVarC == null) {
            fnp fnpVar = fnp.a;
            fnpVarC = fnq.c(new fno());
        }
        fno fnoVar = new fno();
        fnoVar.B(fnpVarC);
        fnm fnmVarB = fnq.b(fnoVar);
        fnl fnlVar = new fnl();
        fnlVar.B(fnmVarB);
        String strB = ullVar.b("link_token", "");
        strB.getClass();
        fnn.b(strB, fnlVar);
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

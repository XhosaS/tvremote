package defpackage;

import android.content.Context;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fve implements ulk {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/datastore/user/migrations/AccountNameMigrationBuilder");
    private final Context b;
    private final agow c;
    private final zyh d;
    private final agow e;

    public fve(Context context, agow agowVar, zyh zyhVar, agow agowVar2) {
        context.getClass();
        agowVar.getClass();
        zyhVar.getClass();
        agowVar2.getClass();
        this.b = context;
        this.c = agowVar;
        this.d = zyhVar;
        this.e = agowVar2;
    }

    public final uje a() {
        ulj uljVarD = ulm.d(this.b, this.d);
        uljVarD.c = "com.google.android.katniss.setting";
        uljVarD.c("search_account");
        uljVarD.d(!((Boolean) this.c.a()).booleanValue());
        uljVarD.e(this);
        return uljVarD.a();
    }

    @Override // defpackage.ulk
    public final /* synthetic */ MessageLite b(ull ullVar, MessageLite messageLite) {
        fxg fxgVarA = (fxg) messageLite;
        ((zdv) a.b().q("com/google/android/apps/tvsearch/datastore/user/migrations/AccountNameMigrationBuilder", "migrate", 60, "AccountNameMigrationBuilder.kt")).u("Migrating data to PDS");
        if (fxgVarA == null) {
            fxg fxgVar = fxg.a;
            fxgVarA = fxh.a(new fxc());
        }
        String strB = ullVar.b("search_account", "");
        fxc fxcVar = new fxc();
        fxcVar.B(fxgVarA);
        if (!((Boolean) this.c.a()).booleanValue()) {
            if (fxh.c(fxcVar).length() > 0) {
                ((ghr) this.e.a()).b();
            }
            strB.getClass();
            fxh.d(strB, fxcVar);
        } else if (fxh.c(fxcVar).length() == 0) {
            strB.getClass();
            fxh.d(strB, fxcVar);
        }
        return fxh.a(fxcVar);
    }
}

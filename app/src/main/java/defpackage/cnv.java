package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnv extends agtu implements agvb {
    int a;
    final /* synthetic */ cbv b;
    final /* synthetic */ cld c;
    final /* synthetic */ cbg d;
    final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnv(cbv cbvVar, cld cldVar, cbg cbgVar, Context context, agsw agswVar) {
        super(2, agswVar);
        this.b = cbvVar;
        this.c = cldVar;
        this.d = cbgVar;
        this.e = context;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnv) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            cbv cbvVar = this.b;
            zyd zydVarA = cbvVar.a();
            this.a = 1;
            obj = cgm.a(zydVarA, cbvVar, this);
            if (obj != agtgVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        final cbf cbfVar = (cbf) obj;
        if (cbfVar == null) {
            throw new IllegalStateException("Worker was marked important (" + this.c.e + ") but did not provide ForegroundInfo");
        }
        cbx.c().a(cnw.a, "Updating notification for ".concat(String.valueOf(this.c.e)));
        cbg cbgVar = this.d;
        final Context context = this.e;
        final UUID uuid = this.b.b.a;
        final cny cnyVar = (cny) cbgVar;
        zyd zydVarA2 = cbp.a(cnyVar.c.a, "setForegroundAsync", new agum() { // from class: cnx
            @Override // defpackage.agum
            public final Object a() {
                UUID uuid2 = uuid;
                cny cnyVar2 = cnyVar;
                cle cleVar = cnyVar2.b;
                String string = uuid2.toString();
                cld cldVarC = cleVar.c(string);
                if (cldVarC == null || cldVarC.d.a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                Context context2 = context;
                cbf cbfVar2 = cbfVar;
                cnyVar2.a.e(string, cbfVar2);
                ckp ckpVarA = cmk.a(cldVarC);
                int i2 = cjl.k;
                Intent intent = new Intent(context2, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_NOTIFY");
                intent.putExtra("KEY_NOTIFICATION_ID", cbfVar2.a);
                intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", cbfVar2.b);
                intent.putExtra("KEY_NOTIFICATION", cbfVar2.c);
                intent.putExtra("KEY_WORKSPEC_ID", ckpVarA.a);
                intent.putExtra("KEY_GENERATION", ckpVarA.b);
                context2.startService(intent);
                return null;
            }
        });
        this.a = 2;
        Object objA = xw.a(zydVarA2, this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new cnv(this.b, this.c, this.d, this.e, agswVar);
    }
}

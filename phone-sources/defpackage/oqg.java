package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqg {
    public final oqj a;
    public final ImmutableSet b;
    private final tst c = tst.h(null);

    public oqg(oqf oqfVar) {
        this.a = oqfVar.a;
        this.b = oqfVar.b.build();
    }

    public static tst a(Class cls) {
        try {
            return tst.i((oqk) cls.getDeclaredConstructor(null).newInstance(null));
        } catch (ReflectiveOperationException unused) {
            return trk.a;
        }
    }

    static /* synthetic */ ImmutableMap c() {
        return ImmutableMap.of(ngl.DO_NOTHING, oqu.class, ngl.FILE_DELETION, oqx.class, ngl.EXEC_SQL_FIX, oqv.class, ngl.SEND_BROADCAST, oqz.class, ngl.PROCESS_RESTART, oqy.class, ngl.SHARED_PREFERENCES_DELETION, ora.class, ngl.COMPONENT_ENABLED_SETTING_FIX, oqt.class, ngl.START_SERVICE, orb.class);
    }

    public final ImmutableMap b() {
        tst tstVar = this.c;
        return tstVar.g() ? new ImmutableMap.Builder().putAll(c()).putAll((Map) ((ttm) tstVar.c()).get()).buildOrThrow() : c();
    }

    public final void d(Context context, ngl nglVar, ngj ngjVar) {
        Log.e("AppDoctor", "Failed on fix: " + nglVar.a());
        vtw vtwVarM = ngk.a.m();
        String packageName = context.getPackageName();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ngk ngkVar = (ngk) vucVar;
        packageName.getClass();
        ngkVar.b |= 1;
        ngkVar.c = packageName;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ngk ngkVar2 = (ngk) vtwVarM.b;
        ngkVar2.g = ngjVar.a();
        ngkVar2.b |= 16;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ngk ngkVar3 = (ngk) vtwVarM.b;
        ngkVar3.f = a.aJ(6);
        ngkVar3.b |= 8;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        oqj oqjVar = this.a;
        ngk ngkVar4 = (ngk) vtwVarM.b;
        ngkVar4.e = nglVar.a();
        ngkVar4.b |= 4;
        oqjVar.a((ngk) vtwVarM.r());
    }

    public final void e(Context context, ngz ngzVar, ngj ngjVar) {
        ngl nglVarB;
        if (ngzVar != null) {
            nglVarB = ngl.b(ngzVar.b);
            if (nglVarB == null) {
                nglVarB = ngl.UNRECOGNIZED;
            }
        } else {
            nglVarB = ngl.UNSPECIFIED_FIX;
        }
        d(context, nglVarB, ngjVar);
    }

    public final void f(Context context, ngl nglVar, ngj ngjVar) {
        vtw vtwVarM = ngk.a.m();
        String packageName = context.getPackageName();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ngk ngkVar = (ngk) vucVar;
        packageName.getClass();
        ngkVar.b |= 1;
        ngkVar.c = packageName;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ngk ngkVar2 = (ngk) vtwVarM.b;
        ngkVar2.g = ngjVar.a();
        ngkVar2.b |= 16;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ngk ngkVar3 = (ngk) vtwVarM.b;
        ngkVar3.f = a.aJ(5);
        ngkVar3.b |= 8;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        oqj oqjVar = this.a;
        ngk ngkVar4 = (ngk) vtwVarM.b;
        ngkVar4.e = nglVar.a();
        ngkVar4.b |= 4;
        oqjVar.a((ngk) vtwVarM.r());
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, uhp] */
    public final boolean g(Context context, ngj ngjVar) {
        List<ngz> listOf;
        ngl nglVarB;
        if (osk.h(context)) {
            oqo oqoVar = new oqo();
            oqoVar.b = context;
            oqoVar.a = ngjVar;
            oqoVar.c = this.a;
            oqp oqpVarA = oqoVar.a();
            try {
                oqh oqhVar = new oqh(context);
                try {
                    oxe oxeVar = new oxe(new uoo(this, oqhVar, oqpVarA));
                    ImmutableMap immutableMapB = b();
                    Bundle bundleCall = oqhVar.b.call("get_fixes", null, oqhVar.a());
                    if (bundleCall == null) {
                        Log.e("AppDoctorProviderClient", "Failed to get config from AppDoctorProvider.");
                        listOf = ImmutableList.of();
                    } else {
                        byte[] byteArray = bundleCall.getByteArray("com.google.android.gms.common.appdoctor.teledoctorconfig");
                        if (byteArray == null) {
                            Log.e("AppDoctorProviderClient", "TeleDoctor Config empty");
                            listOf = ImmutableList.of();
                        } else {
                            try {
                                vtp vtpVar = vtp.a;
                                vvs vvsVar = vvs.a;
                                vuc vucVarP = vuc.p(nha.a, byteArray, 0, byteArray.length, vtp.a);
                                vuc.B(vucVarP);
                                listOf = ((nha) vucVarP).b;
                            } catch (vuq e) {
                                Log.e("AppDoctorProviderClient", "Failed to parse TeleDoctorConfig.", e);
                                listOf = ImmutableList.of();
                            }
                        }
                    }
                    for (ngz ngzVar : listOf) {
                        ngl nglVarB2 = ngl.b(ngzVar.b);
                        if (nglVarB2 == null) {
                            nglVarB2 = ngl.UNRECOGNIZED;
                        }
                        if (immutableMapB.containsKey(nglVarB2)) {
                            ngl nglVarB3 = ngl.b(ngzVar.b);
                            if (nglVarB3 == null) {
                                nglVarB3 = ngl.UNRECOGNIZED;
                            }
                            tst tstVarA = a((Class) immutableMapB.get(nglVarB3));
                            if (tstVarA.g()) {
                                String str = ngzVar.d;
                                ngl nglVarB4 = ngl.b(ngzVar.b);
                                if (nglVarB4 == null) {
                                    nglVarB4 = ngl.UNRECOGNIZED;
                                }
                                ngy ngyVar = ngzVar.c;
                                if (ngyVar == null) {
                                    ngyVar = ngy.a;
                                }
                                oqk oqkVar = (oqk) tstVarA.c();
                                ngy ngyVar2 = ngyVar;
                                oxeVar.c(new oqn(str, nglVarB4, ngyVar2, oqkVar, oqn.a));
                            } else {
                                e(oqpVarA.b, ngzVar, oqpVarA.a);
                            }
                        } else {
                            Context context2 = oqpVarA.b;
                            ngj ngjVar2 = oqpVarA.a;
                            if (ngzVar != null) {
                                nglVarB = ngl.b(ngzVar.b);
                                if (nglVarB == null) {
                                    nglVarB = ngl.UNRECOGNIZED;
                                }
                            } else {
                                nglVarB = ngl.UNSPECIFIED_FIX;
                            }
                            f(context2, nglVarB, ngjVar2);
                        }
                    }
                    xqr xqrVarI = oxeVar.i(oqpVarA);
                    try {
                        xqrVarI.b.get();
                        boolean z = xqrVarI.a;
                        oqhVar.close();
                        return z;
                    } catch (InterruptedException | RuntimeException | ExecutionException unused) {
                        e(context, ngz.a, ngjVar);
                        oqhVar.close();
                    }
                } finally {
                }
            } catch (RemoteException | RuntimeException unused2) {
                e(context, ngz.a, ngjVar);
            }
        }
        return false;
    }
}

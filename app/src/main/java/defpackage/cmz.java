package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmz {
    public static final ccf a(final UUID uuid, final cfq cfqVar) {
        uuid.getClass();
        cam camVar = cfqVar.d.j;
        cnp cnpVar = cfqVar.m.a;
        cnpVar.getClass();
        return ccj.a(camVar, "CancelWorkById", cnpVar, new agum() { // from class: cmy
            @Override // defpackage.agum
            public final Object a() {
                final cfq cfqVar2 = cfqVar;
                WorkDatabase workDatabase = cfqVar2.e;
                workDatabase.getClass();
                final UUID uuid2 = uuid;
                workDatabase.p(new Runnable() { // from class: cmx
                    @Override // java.lang.Runnable
                    public final void run() {
                        String string = uuid2.toString();
                        string.getClass();
                        cmz.b(cfqVar2, string);
                    }
                });
                cmz.d(cfqVar2);
                return agpu.a;
            }
        });
    }

    public static final void b(cfq cfqVar, String str) {
        cgk cgkVarA;
        WorkDatabase workDatabase = cfqVar.e;
        workDatabase.getClass();
        cle cleVarD = workDatabase.D();
        cjo cjoVarX = workDatabase.x();
        List listE = agqq.e(str);
        while (!listE.isEmpty()) {
            String str2 = (String) agqq.j(listE);
            ccq ccqVarB = cleVarD.b(str2);
            if (ccqVarB != ccq.c && ccqVarB != ccq.d) {
                cleVarD.A(str2);
            }
            listE.addAll(cjoVarX.a(str2));
        }
        cdy cdyVar = cfqVar.g;
        cdyVar.getClass();
        synchronized (cdyVar.g) {
            cbx.c().a(cdy.a, a.j(str, "Processor cancelling "));
            cdyVar.e.add(str);
            cgkVarA = cdyVar.a(str);
        }
        cdy.f(str, cgkVarA, 1);
        Iterator it = cfqVar.f.iterator();
        while (it.hasNext()) {
            ((cea) it.next()).b(str);
        }
    }

    public static final void c(final String str, final cfq cfqVar) {
        str.getClass();
        final WorkDatabase workDatabase = cfqVar.e;
        workDatabase.getClass();
        workDatabase.p(new Runnable() { // from class: cmt
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = workDatabase.D().i(str).iterator();
                while (it.hasNext()) {
                    cmz.b(cfqVar, (String) it.next());
                }
            }
        });
    }

    public static final void d(cfq cfqVar) {
        ced.a(cfqVar.d, cfqVar.e, cfqVar.f);
    }
}

package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmi extends agtu implements agvb {
    final /* synthetic */ fmk a;
    final /* synthetic */ fnp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmi(fmk fmkVar, fnp fnpVar, agsw agswVar) {
        super(2, agswVar);
        this.a = fmkVar;
        this.b = fnpVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fmi) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        ((zdv) fmk.a.b().q("com/google/android/apps/tvsearch/datastore/device/migrations/AppContextDataMigration$migrate$1", "invokeSuspend", 68, "AppContextDataMigration.kt")).u("Migrating data to PDS");
        SharedPreferences sharedPreferences = this.a.b.getSharedPreferences("com.google.android.katniss.app.context", 0);
        fnp fnpVarC = this.b;
        if (fnpVarC == null) {
            fnp fnpVar = fnp.a;
            fnpVarC = fnq.c(new fno());
        }
        fno fnoVar = new fno();
        fnoVar.B(fnpVarC);
        fnd fndVarA = fnq.a(fnoVar);
        fmv fmvVar = new fmv();
        fmvVar.B(fndVarA);
        for (String str : sharedPreferences.getAll().keySet()) {
            str.getClass();
            if (str.startsWith("in_app_query_routing_token:")) {
                String strJ = agyv.j(str, "in_app_query_routing_token:");
                String string = sharedPreferences.getString(str, "");
                if (strJ.length() > 0 && string != null && string.length() != 0) {
                    fne.b(fmvVar);
                    Object objB = fne.b(fmvVar).get(strJ);
                    if (objB == null) {
                        fnc fncVar = fnc.a;
                        objB = fng.b(new fmz());
                    }
                    fmz fmzVar = new fmz();
                    fmzVar.B((fnc) objB);
                    fnb fnbVarA = fng.a(fmzVar);
                    fna fnaVar = new fna();
                    fnaVar.B(fnbVarA);
                    fnh.d(string, fnaVar);
                    fnb fnbVarA2 = fnh.a(fnaVar);
                    if ((Integer.MIN_VALUE & fmzVar.b.memoizedSerializedSize) == 0) {
                        fmzVar.y();
                    }
                    fnc fncVar2 = (fnc) fmzVar.b;
                    fncVar2.c = fnbVarA2;
                    fncVar2.b |= 1;
                    fne.f(strJ, fng.b(fmzVar), fmvVar);
                }
            } else if (str.startsWith("global_query_routing_token:")) {
                String strJ2 = agyv.j(str, "global_query_routing_token:");
                String string2 = sharedPreferences.getString(str, "");
                if (strJ2.length() > 0 && string2 != null && string2.length() != 0) {
                    fne.b(fmvVar);
                    Object objB2 = fne.b(fmvVar).get(strJ2);
                    if (objB2 == null) {
                        fnc fncVar3 = fnc.a;
                        objB2 = fng.b(new fmz());
                    }
                    fmz fmzVar2 = new fmz();
                    fmzVar2.B((fnc) objB2);
                    fnb fnbVarA3 = fng.a(fmzVar2);
                    fna fnaVar2 = new fna();
                    fnaVar2.B(fnbVarA3);
                    fnh.b(string2, fnaVar2);
                    fnb fnbVarA4 = fnh.a(fnaVar2);
                    if ((Integer.MIN_VALUE & fmzVar2.b.memoizedSerializedSize) == 0) {
                        fmzVar2.y();
                    }
                    fnc fncVar4 = (fnc) fmzVar2.b;
                    fncVar4.c = fnbVarA4;
                    fncVar4.b |= 1;
                    fne.f(strJ2, fng.b(fmzVar2), fmvVar);
                }
            } else if (str.startsWith("global_query_routing_token_cipher_iv:")) {
                String strJ3 = agyv.j(str, "global_query_routing_token_cipher_iv:");
                String string3 = sharedPreferences.getString(str, "");
                if (strJ3.length() > 0 && string3 != null && string3.length() != 0) {
                    fne.b(fmvVar);
                    Object objB3 = fne.b(fmvVar).get(strJ3);
                    if (objB3 == null) {
                        fnc fncVar5 = fnc.a;
                        objB3 = fng.b(new fmz());
                    }
                    fmz fmzVar3 = new fmz();
                    fmzVar3.B((fnc) objB3);
                    fnb fnbVarA5 = fng.a(fmzVar3);
                    fna fnaVar3 = new fna();
                    fnaVar3.B(fnbVarA5);
                    fnh.c(string3, fnaVar3);
                    fnb fnbVarA6 = fnh.a(fnaVar3);
                    if ((Integer.MIN_VALUE & fmzVar3.b.memoizedSerializedSize) == 0) {
                        fmzVar3.y();
                    }
                    fnc fncVar6 = (fnc) fmzVar3.b;
                    fncVar6.c = fnbVarA6;
                    fncVar6.b |= 1;
                    fne.f(strJ3, fng.b(fmzVar3), fmvVar);
                }
            }
        }
        fnd fndVarA2 = fne.a(fmvVar);
        if ((fnoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            fnoVar.y();
        }
        fnp fnpVar2 = (fnp) fnoVar.b;
        fnpVar2.c = fndVarA2;
        fnpVar2.b |= 1;
        return fnq.c(fnoVar);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fmi(this.a, this.b, agswVar);
    }
}

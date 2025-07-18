package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pye implements pxy {
    private final Context a;
    private final pkn b;
    private final yqt c;
    private final phg d;

    public pye(Context context, pkn pknVar, yqt yqtVar, phg phgVar) {
        this.a = context;
        this.b = pknVar;
        this.c = yqtVar;
        this.d = phgVar;
    }

    @Override // defpackage.pxy
    public final zyd a() {
        qer.a(this.a, "gms_icing_mdd_shared_files", this.c).edit().clear().commit();
        return zxy.a;
    }

    @Override // defpackage.pxy
    public final zyd c() {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        SharedPreferences sharedPreferencesA = qer.a(context, "gms_icing_mdd_shared_files", this.c);
        SharedPreferences.Editor editorEdit = null;
        for (String str : sharedPreferencesA.getAll().keySet()) {
            try {
                arrayList.add(qeq.a(str, context, this.b));
            } catch (qep e) {
                qce.f(e, "Failed to deserialize newFileKey:".concat(String.valueOf(str)));
                pkn pknVar = this.b;
                yrl.c("|").g(str).size();
                pknVar.a();
                if (editorEdit == null) {
                    editorEdit = sharedPreferencesA.edit();
                }
                editorEdit.remove(str);
            }
        }
        if (editorEdit != null) {
            editorEdit.commit();
        }
        return zxn.h(arrayList);
    }

    @Override // defpackage.pxy
    public final zyd d() {
        boolean z;
        abyy abwxVar;
        Context context;
        pkn pknVar;
        boolean z2;
        abyy abyyVar;
        Context context2 = this.a;
        boolean z3 = false;
        if (!ptn.b(context2)) {
            int i = qce.a;
            Context context3 = this.a;
            ptn.d(context3);
            ptn.c(context3, ptm.a(this.d.h()));
            return zxn.h(false);
        }
        ptm ptmVarA = ptm.a(this.d.h());
        pkn pknVar2 = this.b;
        ptm ptmVarA2 = ptn.a(context2, pknVar2);
        int i2 = ptmVarA.d;
        int i3 = ptmVarA2.d;
        int i4 = 1;
        if (i2 == i3) {
            z3 = true;
        } else if (i2 < i3) {
            qce.e("%s Cannot migrate back from value %s to %s. Clear everything!", "SharedFilesMetadata", ptmVarA2, ptmVarA);
            new Exception("Downgraded file key from " + String.valueOf(ptmVarA2) + " to " + String.valueOf(ptmVarA) + ".");
            pknVar2.a();
            ptn.c(context2, ptmVarA);
        } else {
            int i5 = i3 + 1;
            while (i5 <= i2) {
                try {
                    ptm ptmVarA3 = ptm.a(i5);
                    int iOrdinal = ptmVarA3.ordinal();
                    if (iOrdinal == i4) {
                        z = z3;
                        int i6 = qce.a;
                        SharedPreferences sharedPreferencesA = qer.a(context2, "gms_icing_mdd_shared_files", this.c);
                        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
                        for (String str : sharedPreferencesA.getAll().keySet()) {
                            try {
                                pjf pjfVarA = qeq.a(str, context2, pknVar2);
                                pjj pjjVar = pjj.a;
                                abyy abyyVar2 = pjj.b;
                                if (abyyVar2 == null) {
                                    synchronized (pjj.class) {
                                        abwxVar = pjj.b;
                                        if (abwxVar == null) {
                                            abwxVar = new abwx(pjj.a);
                                            pjj.b = abwxVar;
                                        }
                                    }
                                    abyyVar2 = abwxVar;
                                }
                                pjj pjjVar2 = (pjj) qer.c(sharedPreferencesA, str, abyyVar2);
                                if (pjjVar2 == null) {
                                    qce.c("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                    editorEdit.remove(str);
                                } else {
                                    editorEdit.remove(str);
                                    qer.f(editorEdit, qeq.d(pjfVarA), pjjVar2);
                                }
                            } catch (qep unused) {
                                qce.d("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str);
                                this.b.a();
                                editorEdit.remove(str);
                            }
                        }
                        if (!editorEdit.commit()) {
                            qce.b("Failed to commit migration metadata to disk");
                            pkn pknVar3 = this.b;
                            new Exception("Migrate to DownloadTransform failed.");
                            pknVar3.a();
                            context = this.a;
                            pknVar = this.b;
                            if (ptn.a(context, pknVar).d != ptmVarA.d) {
                                qce.b(a.o(ptmVarA, "Failed to commit migration version to disk. Fail to set target version to ", "."));
                                new Exception(a.o(ptmVarA, "Fail to set target version ", "."));
                                pknVar.a();
                            }
                            z3 = z;
                        }
                        ptn.c(this.a, ptm.a(i5));
                        i5++;
                        z3 = z;
                        i4 = 1;
                    } else {
                        if (iOrdinal != 2) {
                            throw new UnsupportedOperationException("Upgrade to version " + ptmVarA3.name() + "not supported!");
                        }
                        int i7 = qce.a;
                        Context context4 = this.a;
                        SharedPreferences sharedPreferencesA2 = qer.a(context4, "gms_icing_mdd_shared_files", this.c);
                        SharedPreferences.Editor editorEdit2 = sharedPreferencesA2.edit();
                        for (String str2 : sharedPreferencesA2.getAll().keySet()) {
                            try {
                                pjf pjfVarA2 = qeq.a(str2, context4, this.b);
                                pjj pjjVar3 = pjj.a;
                                abyy abyyVar3 = pjj.b;
                                if (abyyVar3 == null) {
                                    synchronized (pjj.class) {
                                        abyyVar = pjj.b;
                                        if (abyyVar == null) {
                                            z2 = z3;
                                            abwx abwxVar2 = new abwx(pjj.a);
                                            pjj.b = abwxVar2;
                                            abyyVar = abwxVar2;
                                        } else {
                                            z2 = z3;
                                        }
                                    }
                                    abyyVar3 = abyyVar;
                                } else {
                                    z2 = z3;
                                }
                                pjj pjjVar4 = (pjj) qer.c(sharedPreferencesA2, str2, abyyVar3);
                                if (pjjVar4 == null) {
                                    qce.c("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                    editorEdit2.remove(str2);
                                } else {
                                    editorEdit2.remove(str2);
                                    qer.f(editorEdit2, qeq.c(pjfVarA2), pjjVar4);
                                }
                            } catch (qep unused2) {
                                z2 = z3;
                                qce.d("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str2);
                                this.b.a();
                                editorEdit2.remove(str2);
                            }
                            z3 = z2;
                        }
                        z = z3;
                        if (!editorEdit2.commit()) {
                            qce.b("Failed to commit migration metadata to disk");
                            pkn pknVar4 = this.b;
                            new Exception("Migrate to ChecksumOnly failed.");
                            pknVar4.a();
                            context = this.a;
                            pknVar = this.b;
                            if (ptn.a(context, pknVar).d != ptmVarA.d && !ptn.c(context, ptmVarA)) {
                                qce.b(a.o(ptmVarA, "Failed to commit migration version to disk. Fail to set target version to ", "."));
                                new Exception(a.o(ptmVarA, "Fail to set target version ", "."));
                                pknVar.a();
                            }
                            z3 = z;
                        }
                        ptn.c(this.a, ptm.a(i5));
                        i5++;
                        z3 = z;
                        i4 = 1;
                    }
                } finally {
                    Context context5 = this.a;
                    pkn pknVar5 = this.b;
                    if (ptn.a(context5, pknVar5).d != ptmVarA.d && !ptn.c(context5, ptmVarA)) {
                        qce.b(a.o(ptmVarA, "Failed to commit migration version to disk. Fail to set target version to ", "."));
                        new Exception(a.o(ptmVarA, "Fail to set target version ", "."));
                        pknVar5.a();
                    }
                }
            }
            z3 = true;
        }
        return zxn.h(Boolean.valueOf(z3));
    }

    @Override // defpackage.pxy
    public final zyd e(final pjf pjfVar) {
        zyd zydVarF = f(new zdd(pjfVar));
        yqi yqiVar = new yqi() { // from class: pyd
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return (pjj) ((yyr) obj).get(pjfVar);
            }
        };
        return zuz.g(zydVarF, wyo.a(yqiVar), zwk.a);
    }

    @Override // defpackage.pxy
    public final zyd f(yzq yzqVar) {
        Context context = this.a;
        SharedPreferences sharedPreferencesA = qer.a(context, "gms_icing_mdd_shared_files", this.c);
        yyn yynVar = new yyn(4);
        zdl it = yzqVar.iterator();
        while (it.hasNext()) {
            pjf pjfVar = (pjf) it.next();
            String strB = qeq.b(pjfVar, context, this.b);
            pjj pjjVar = pjj.a;
            abyy abwxVar = pjj.b;
            if (abwxVar == null) {
                synchronized (pjj.class) {
                    abwxVar = pjj.b;
                    if (abwxVar == null) {
                        abwxVar = new abwx(pjj.a);
                        pjj.b = abwxVar;
                    }
                }
            }
            pjj pjjVar2 = (pjj) qer.c(sharedPreferencesA, strB, abwxVar);
            if (pjjVar2 != null) {
                yynVar.c(pjfVar, pjjVar2);
            }
        }
        return zxn.h(yynVar.a(false));
    }

    @Override // defpackage.pxy
    public final zyd g(pjf pjfVar) {
        Context context = this.a;
        yqt yqtVar = this.c;
        return zxn.h(Boolean.valueOf(qer.g(qer.a(context, "gms_icing_mdd_shared_files", yqtVar), qeq.b(pjfVar, context, this.b))));
    }

    @Override // defpackage.pxy
    public final zyd h(pjf pjfVar, pjj pjjVar) {
        Context context = this.a;
        yqt yqtVar = this.c;
        return zxn.h(Boolean.valueOf(qer.h(qer.a(context, "gms_icing_mdd_shared_files", yqtVar), qeq.b(pjfVar, context, this.b), pjjVar)));
    }
}

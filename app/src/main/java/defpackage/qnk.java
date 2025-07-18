package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$ApiNotConnectedException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$DeveloperErrorException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader$MdiException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qnk {
    public final qgw a;
    public final yqt b;
    public final String c;
    private final qlo d;

    public qnk(Context context, qgw qgwVar, qlo qloVar, yqt yqtVar) {
        this.a = qgwVar;
        this.d = qloVar;
        this.b = yqtVar;
        this.c = context.getPackageName();
    }

    final zyd a(final yqi yqiVar) {
        zyd zydVarA = this.d.a();
        zvi zviVar = new zvi() { // from class: qnj
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final List list = (List) obj;
                final ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    final qnk qnkVar = this.a;
                    if (!it.hasNext()) {
                        return xab.a(arrayList).a(new Callable() { // from class: qni
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r7v0 */
                            /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r7v9 */
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                boolean z;
                                boolean z2;
                                abla ablaVar;
                                qll qllVar;
                                int i;
                                List list2 = list;
                                int size = list2.size();
                                yyf yyfVarG = yyk.g(size);
                                qnk qnkVar2 = qnkVar;
                                ?? r7 = 0;
                                int i2 = 0;
                                while (i2 < size) {
                                    List list3 = arrayList;
                                    qlt qltVarM = qlv.m();
                                    qltVarM.b(((Account) list2.get(i2)).name);
                                    zyd zydVar = (zyd) list3.get(i2);
                                    yqw.L(zydVar.isDone());
                                    try {
                                        try {
                                            int i3 = zxt.a;
                                            int i4 = zxs.a;
                                            Iterator it2 = zxr.b.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    yqw.F(!RuntimeException.class.isAssignableFrom(MdiOwnersLoader$MdiException.class), "Futures.getChecked exception type (%s) must not be a RuntimeException", MdiOwnersLoader$MdiException.class);
                                                    try {
                                                        zxt.a(MdiOwnersLoader$MdiException.class, new Exception());
                                                        z2 = true;
                                                    } catch (Throwable unused) {
                                                        z2 = r7;
                                                    }
                                                    yqw.F(z2, "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", MdiOwnersLoader$MdiException.class);
                                                    Set set = zxr.b;
                                                    if (set.size() > 1000) {
                                                        set.clear();
                                                    }
                                                    set.add(new WeakReference(MdiOwnersLoader$MdiException.class));
                                                } else if (MdiOwnersLoader$MdiException.class.equals(((WeakReference) it2.next()).get())) {
                                                    break;
                                                }
                                            }
                                            try {
                                                ablaVar = (abla) zydVar.get();
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                                throw zxt.a(MdiOwnersLoader$MdiException.class, e);
                                            } catch (ExecutionException e2) {
                                                Throwable cause = e2.getCause();
                                                if (cause instanceof Error) {
                                                    throw new zwm((Error) cause);
                                                }
                                                if (cause instanceof RuntimeException) {
                                                    throw new zzd(cause);
                                                }
                                                throw zxt.a(MdiOwnersLoader$MdiException.class, cause);
                                            }
                                        } catch (MdiOwnersLoader$MdiException | zzd e3) {
                                            Throwable cause2 = e3.getCause();
                                            String strA = qjs.a(cause2);
                                            kej kejVar = (kej) qjs.b(cause2, kej.class);
                                            if (kejVar != null) {
                                                int i5 = kejVar.a.f;
                                                strA = a.b(i5, "ApiException-");
                                                if (i5 == 17) {
                                                    throw new ExecutionException(new MdiNotAvailableException$ApiNotConnectedException(cause2));
                                                }
                                                if (i5 == 10) {
                                                    throw new ExecutionException(new MdiNotAvailableException$DeveloperErrorException(cause2));
                                                }
                                            }
                                            z = false;
                                            Log.w("OneGoogle", String.format("Failed to load profile data. exception: %s", strA));
                                            ((qku) ((yqz) qnkVar2.b).a).b(strA, qnkVar2.c);
                                        }
                                        if (ablaVar == null) {
                                            qltVarM.i(r7);
                                            ((qku) ((yqz) qnkVar2.b).a).b("Absent", qnkVar2.c);
                                        } else if (ablaVar.b.size() <= 0) {
                                            Log.w("OneGoogle", "GetPeopleResponse contains no persons");
                                            ((qku) ((yqz) qnkVar2.b).a).b("NoPerson", qnkVar2.c);
                                        } else {
                                            vew vewVar = ((ablc) ablaVar.b.get(r7)).b;
                                            if (vewVar == null) {
                                                vewVar = vew.a;
                                            }
                                            if (vewVar.b.size() > 0) {
                                                vff vffVar = (vff) vewVar.b.get(r7);
                                                ((qll) qltVarM).d = vffVar.c;
                                                abxj abxjVar = vffVar.d;
                                                abxk abxkVar = vff.a;
                                                qltVarM.h(new abxl(abxjVar, abxkVar).contains(vfa.GOOGLE_ONE_USER));
                                                ((qll) qltVarM).h = true != new abxl(vffVar.d, abxkVar).contains(vfa.GOOGLE_FAMILY_CHILD_USER) ? 3 : 2;
                                                ((qll) qltVarM).g = true != new abxl(vffVar.d, abxkVar).contains(vfa.GOOGLE_APPS_USER) ? 3 : 2;
                                            }
                                            if (vewVar.c.size() > 0) {
                                                veu veuVar = (veu) vewVar.c.get(0);
                                                int i6 = veuVar.b;
                                                ((qll) qltVarM).a = (i6 & 2) != 0 ? veuVar.c : null;
                                                ((qll) qltVarM).b = (i6 & 64) != 0 ? veuVar.d : null;
                                                ((qll) qltVarM).c = (i6 & 128) != 0 ? veuVar.e : null;
                                            }
                                            vfc vfcVarA = qix.a(ablaVar);
                                            if (vfcVarA != null) {
                                                if (vfcVarA.e) {
                                                    ((qll) qltVarM).f = vfcVarA.d;
                                                } else {
                                                    ((qll) qltVarM).e = vfcVarA.d;
                                                }
                                            }
                                            if (vewVar.e.size() == 1) {
                                                int iA = veq.a(((ves) vewVar.e.get(0)).b);
                                                if (iA == 0 || iA == 1) {
                                                    ((qll) qltVarM).i = 1;
                                                } else {
                                                    if (iA != 2) {
                                                        i = 4;
                                                        if (iA != 4) {
                                                            qllVar = (qll) qltVarM;
                                                        } else {
                                                            qllVar = (qll) qltVarM;
                                                            i = 3;
                                                        }
                                                    } else {
                                                        qllVar = (qll) qltVarM;
                                                        i = 2;
                                                    }
                                                    qllVar.i = i;
                                                }
                                            }
                                            ((qku) ((yqz) qnkVar2.b).a).b("OK", qnkVar2.c);
                                            z = false;
                                            yyfVarG.g(qltVarM.a());
                                            i2++;
                                            r7 = z;
                                        }
                                        z = r7;
                                        yyfVarG.g(qltVarM.a());
                                        i2++;
                                        r7 = z;
                                    } catch (Throwable th) {
                                        ((qku) ((yqz) qnkVar2.b).a).b("OK", qnkVar2.c);
                                        throw th;
                                    }
                                }
                                return yyfVarG.f();
                            }
                        }, zwk.a);
                    }
                    arrayList.add((zyd) yqiVar.apply(qnkVar.a.a((Account) it.next())));
                }
            }
        };
        return zuz.h(zydVarA, wyo.c(zviVar), zwk.a);
    }
}
